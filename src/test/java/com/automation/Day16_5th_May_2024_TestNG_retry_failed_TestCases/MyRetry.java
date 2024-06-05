package com.automation.Day16_5th_May_2024_TestNG_retry_failed_TestCases;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyRetry implements IRetryAnalyzer {

	  private int retryCount = 0;
	  private static final int maxRetryCount = 5;

	  @Override
	  public boolean retry(ITestResult result) {
	    if (retryCount < maxRetryCount) {
	      retryCount++;
	      return true;
	    }
	    return false;
	  }
	}