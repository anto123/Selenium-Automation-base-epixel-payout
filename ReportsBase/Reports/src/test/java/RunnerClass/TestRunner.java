package RunnerClass;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BrowserLaunch.InitiatedBrowser;
import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;
import pageObjectModel.AdminSideReport;
import pageObjectModel.UserSideReports;

public class TestRunner extends InitiatedBrowser {

	@BeforeMethod
	public void launch() {
		InitiatedBrowser.setItUp("admin");
	}

//	@Test(priority = 1)
//	
//	public void userreports() {
//		UserSideReports user=new UserSideReports();
//		//InitiatedBrowser.setItUp("base");
//		user.login("user123");
//		user.myAccount();
//		user.secondAccount();
//		user.TeamPerformance();
//		user.ecommerceOrder();
//		user.enrolmentOrders();
//	}
	
	@Test(priority = 1)
	public void adminreports() {
		AdminSideReport user2=new AdminSideReport();
		user2.login("userguide-business-admin");
		user2.businessOverview();
		user2.businessReport();
		user2.businessReportSecond();
		user2.teamPerformance();
		user2.ecommerceOrder();
		user2.enrolmentOrders();
	}
}
