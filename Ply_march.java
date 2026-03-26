package Playwrt;

// write a code to upload resume 

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Ply_march {

	public static void main(String[] args) {
		// Path to the resume file inside the project
		String uploadPath = Paths.get("/home/quastech/Documents/resume.txt").toAbsolutePath().toString();

		try (Playwright playwright = Playwright.create()) {
			Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
			Page page = browser.newPage();

			// Navigate to a simple file-upload demo page
			page.navigate("https://the-internet.herokuapp.com/upload");

			// Set the file input to the resume file and submit the form
			page.setInputFiles("input#file-upload", uploadPath);
			page.click("input#file-submit");

			// Wait for the result and print confirmation
			page.waitForSelector("h3");
			String result = page.locator("h3").textContent();
			System.out.println("Upload result: " + result);
			String uploadedFileName = page.locator("#uploaded-files").textContent();
			System.out.println("Uploaded filename: " + uploadedFileName);

			browser.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
//github login