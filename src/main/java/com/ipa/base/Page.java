package com.ipa.base;

import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LoggerContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.ipa.utilities.ExcelReader;

public class Page {

	public static WebDriver driver;
	public static ExtentReports extent = new ExtentReports();
	public static ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
	public static ExtentTest test;
	public static Logger log = LogManager.getLogger();
	public static ExcelReader excel = new ExcelReader(System.getProperty("user.dir") + "\\src\\test\\resources\\testdata\\testdata.xlsx");
	public static String browser;
	public static Date d = new Date();
	public static TopMenu topMenu;
	
	
	
	public static void initConfiguration() {
		
		System.setProperty("current.date", d.toString().replace(":", "_").replace(" ", "_"));
		
		LoggerContext context = (LoggerContext) LogManager.getContext(false);
		File file = new File(".\\src\\test\\resources\\properties\\log4j2.properties");
		context.setConfigLocation(file.toURI());
		
		if(Constants.browser.equals("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\geckodriver.exe");
			driver = new FirefoxDriver();
			log.debug("Launching Firefox!");
			
		} else if(Constants.browser.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\chromedriver.exe");
			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("profile.default_content_setting_values.notifications", 2);
			prefs.put("credentials_enable_service", false);
			prefs.put("profile.password_manager_enabled", false);
			ChromeOptions options = new ChromeOptions();
			options.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
			options.setExperimentalOption("prefs", prefs);
			options.addArguments("--disable-extensions");
			options.addArguments("--disable-infobars");
			driver = new ChromeDriver(options);
			log.debug("Launching Chrome!");
			
		} else if(Constants.browser.equals("opera")) {
			
			System.setProperty("webdriver.opera.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\operadriver.exe");
			driver = new OperaDriver();
			log.debug("Launching Opera!");
			
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Constants.implicit_wait, TimeUnit.SECONDS);
		driver.get(Constants.testsiteurl);
		topMenu = new TopMenu();
		
		
		
	}
	
	
	
	
	
	
	public static void quitBrowser() {
		
		
		driver.quit();
		
	}
	
	
	
}
