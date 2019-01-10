package com.crm.qa.base;

public interface IAutoConst {
	// this is a interface here only we are declaring the final variable . implements all the details need to craete a class
     String GECKO_KEY="webdriver.gecko.driver";
     String GECKO_PATH=".drivers/geckodriver.exe";
     String CHROME_KEY="webdriver.chrome.driver";
     String CHROME_PATH=".drivers/chromedriver.exe";
     String SCREENSHOT_PATH="./screenshots/";
     String EXCEL_PATH="/testdata/inputdata.xlsx";
     String CONFIG_PATH="./config.properties";

}
