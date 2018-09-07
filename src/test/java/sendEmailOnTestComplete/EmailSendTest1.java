package sendEmailOnTestComplete;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.apache.commons.mail.EmailException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class EmailSendTest1 {
	@Test
	public void f() {
		int a = 90;
		int b = 100;
		Assert.assertEquals(a, b);
		System.out.println("===== Test Complete =====");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("===== Starting the Test =====");
	}

	@AfterMethod
	public void afterClass(ITestResult result) {
		try {
			if(result.getStatus() == ITestResult.FAILURE) {
				SendEmail.sendEmail();
				System.out.println("Test failed and Email sent.");
			}
		} catch (EmailException e) {
			e.printStackTrace();
		}
	}

}
