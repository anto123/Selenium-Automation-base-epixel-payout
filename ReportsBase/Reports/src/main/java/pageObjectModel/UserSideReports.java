package pageObjectModel;

import org.openqa.selenium.WebDriver;

public class UserSideReports {
	WebDriver driver;

	public static void selectAccept() {
		if (Webelements.isDisplay(Locators.close)) {
			Webelements.click(Locators.close);
		}
	}

	public void login(String username) {
		selectAccept();
		Webelements.wait(1000);
		Webelements.click(Locators.userName);
		Webelements.send(Locators.userName, username);
		Webelements.send(Locators.passWord, "As@12345");
		Webelements.click(Locators.signup);
	}

	public static void logout() {
		Webelements.click(Locators.dashboard);
		Webelements.click(Locators.userPic);
		Webelements.click(Locators.logout);
	}

	// Incative user card update details
	public static void UpdateCardDetailDisplay() {
		if (Webelements.isDisplay(Locators.cardUpdate)) {
			Webelements.click(Locators.cardUpdate);
			Webelements.click(Locators.yesOption);
		} else {
			System.out.println("not displayed");
		}
	}

	public static void myAccount() {
		Webelements.click(Locators.dashboard);
		Webelements.wait(1000);
		// UpdateCardDetailDisplay();
		Webelements.click(Locators.reportPage);
		Webelements.wait(3000);
		Webelements.click(Locators.SalesOverviewOption);
		Webelements.click(Locators.overallDropClick);
		Webelements.click(Locators.dropdownOverall);
		Webelements.wait(500);
		Webelements.click(Locators.actionDropClick);
		Webelements.click(Locators.dropdownAction);
		Webelements.wait(500);
		Webelements.click(Locators.filterDropClick);
		Webelements.click(Locators.userInput);
//			Webelements.click(Locators.fromDate);
		// Webelements.click(Locators.toDate);

		// Bonus History
		Webelements.click(Locators.reportPage);
		Webelements.wait(3000);
		Webelements.click(Locators.bonusHistory);
		Webelements.click(Locators.overallDropClick);
		Webelements.click(Locators.dropdownoversec);
		Webelements.wait(500);
		Webelements.click(Locators.actionDropClick);
		Webelements.click(Locators.dropFilter);
		Webelements.click(Locators.Selectcategorydropdown);
		Webelements.selectDropDownOption("category", "Admin Fund Deposit"); // Select Category, Admin Fund Deduction,
																			// Admin Fund Deposit, Admin Fund
																			// Modification Deposit, Modified Binary
																			// Bonus, Modified Binary Matching Bonus,
																			// Binary Matching Bonus, Binary Bonus,
																			// Coupon Charge, Enrollment Sale, External
																			// Wallet Transaction Charge, Fund Deposit
																			// Charge, Fund Deposit, Internal Wallet
																			// Transaction Charge, Modified Level Bonus,
																			// Modified Level Matching Bonus, Level
																			// Matching Bonus, Level Bonus, Modified LMS
																			// Bonus,LMS Bonus, Order Refund, Package
																			// Upgrade Sale, Modified Pool Bonus,
																			// Modified Pool Matching Bonus, Pool
																			// Matching Bonus, Pool Bonus, Modified Rank
																			// Reward Bonus, Modified Rank Reward
																			// Matching Bonus, Rank Reward Matching
																			// Bonus, Rank Reward Bonus, Redeem Wallet,
																			// <option value="RENEWAL SALE">Renewal
																			// Sale</option>, Modified Retail Profit
																			// Bonus, Modified Retail Profit Matching
																			// Bonus, Retail Profit Matching Bonus,
																			// Retail Profit Bonus, Modified Reward
																			// Point Bonus, Modified Reward Point
																			// Matching Bonus, Reward Point Matching
																			// Bonus, Reward Point Bonus, Sale, Modified
																			// Sponsor Bonus, Modified Sponsor Matching
																			// Bonus, Sponsor Matching Bonus,Sponsor
																			// Bonus, Withdrawal Charges Refunded,
																			// Withdrawal Charges
		Webelements.click(Locators.Selectcategorydropdown);
		Webelements.click(Locators.inputData);
		Webelements.wait(700);
		// Active payout
		Webelements.click(Locators.reportPage);
		Webelements.wait(3000);
		Webelements.click(Locators.PayoutHistory);
		Webelements.click(Locators.overallDropClick);
		Webelements.click(Locators.commissionWallet);
		Webelements.wait(700);
		Webelements.click(Locators.overallDropClick);
		Webelements.click(Locators.purchaseWallet);
		Webelements.wait(700);
		Webelements.click(Locators.overallDropClick);
		Webelements.click(Locators.rewardWallet);
		Webelements.wait(700);
		Webelements.click(Locators.overallDropClick);
		Webelements.click(Locators.dividendWallet);
		Webelements.wait(500);
		Webelements.click(Locators.activePayout);
		Webelements.wait(500);
		Webelements.click(Locators.allList);
		Webelements.wait(500);
		Webelements.click(Locators.actionDropClick);
		Webelements.wait(500);
//			Webelements.wait(300);
		Webelements.send(Locators.fromDate, "21/10/2023");
		Webelements.click(Locators.fromDate);
		Webelements.wait(500);
		Webelements.send(Locators.toDate, "21/10/2023");
		Webelements.click(Locators.toDate);
		Webelements.wait(500);
		Webelements.click(Locators.searchButton);
		Webelements.wait(1000);
		Webelements.click(Locators.reportPage);
		Webelements.wait(1000);
		Webelements.click(Locators.packageUpgradeHistory);
		Webelements.wait(1000);
		Webelements.click(Locators.reportPage);
		Webelements.wait(500);
		Webelements.click(Locators.modifyEarningHistory);
		Webelements.wait(500);
		Webelements.click(Locators.overallDropClick);
		Webelements.click(Locators.commissionWallet);
		Webelements.wait(700);
		Webelements.click(Locators.overallDropClick);
		Webelements.click(Locators.purchaseWallet);
		Webelements.wait(700);
		Webelements.click(Locators.overallDropClick);
		Webelements.click(Locators.rewardWallet);
		Webelements.wait(700);
		Webelements.click(Locators.overallDropClick);
		Webelements.click(Locators.dividendWallet);
		Webelements.wait(500);
		// Webelements.click(Locators.actionDropClick);
		Webelements.click(Locators.dropFilter);
		Webelements.click(Locators.Selectcategorydropdown);
		Webelements.selectDropDownOption("category", "Admin Fund Deposit"); // Select Category, Admin Fund Deduction,
																			// Admin Fund Deposit, Admin Fund
																			// Modification Deposit, Modified Binary
																			// Bonus, Modified Binary Matching Bonus,
																			// Binary Matching Bonus, Binary Bonus,
																			// Coupon Charge, Enrollment Sale, External
																			// Wallet Transaction Charge, Fund Deposit
																			// Charge, Fund Deposit, Internal Wallet
																			// Transaction Charge, Modified Level Bonus,
																			// Modified Level Matching Bonus, Level
																			// Matching Bonus, Level Bonus, Modified LMS
																			// Bonus,LMS Bonus, Order Refund, Package
																			// Upgrade Sale, Modified Pool Bonus,
																			// Modified Pool Matching Bonus, Pool
																			// Matching Bonus, Pool Bonus, Modified Rank
																			// Reward Bonus, Modified Rank Reward
																			// Matching Bonus, Rank Reward Matching
																			// Bonus, Rank Reward Bonus, Redeem Wallet,
																			// <option value="RENEWAL SALE">Renewal
																			// Sale</option>, Modified Retail Profit
																			// Bonus, Modified Retail Profit Matching
																			// Bonus, Retail Profit Matching Bonus,
																			// Retail Profit Bonus, Modified Reward
																			// Point Bonus, Modified Reward Point
																			// Matching Bonus, Reward Point Matching
																			// Bonus, Reward Point Bonus, Sale, Modified
																			// Sponsor Bonus, Modified Sponsor Matching
																			// Bonus, Sponsor Matching Bonus,Sponsor
																			// Bonus, Withdrawal Charges Refunded,
																			// Withdrawal Charges
		Webelements.click(Locators.Selectcategorydropdown);
		Webelements.wait(1000);
		Webelements.click(Locators.reportPage);
		Webelements.click(Locators.rankRewardHistory);
	}

	public static void secondAccount() {
		Webelements.click(Locators.reportPage);
		Webelements.click(Locators.failedCommissionLog);
		Webelements.click(Locators.failedAllLog);
		Webelements.click(Locators.failedRetailLog);
		Webelements.click(Locators.failedRewardLog);
		Webelements.click(Locators.failedPoolLog);
		Webelements.click(Locators.failedLevelLog);
		Webelements.click(Locators.failedBinaryLog);
		Webelements.click(Locators.failedBreakawayLog);
		Webelements.click(Locators.failedDemoLog);
		Webelements.click(Locators.failedRankLog);
		Webelements.click(Locators.failedSponsorLog);
		Webelements.click(Locators.failedRetailMatchLog);
		Webelements.click(Locators.failedrewardMatchLog);
		Webelements.click(Locators.failedPoolMatchLog);
		Webelements.click(Locators.failedLevelmatchLog);
		Webelements.click(Locators.failedBinaryMatchLog);
		Webelements.click(Locators.failedBreakawaymatchLog);
		Webelements.click(Locators.failedDemoMatchLog);
		Webelements.click(Locators.failedRankMatchAllLog);
		Webelements.click(Locators.failedSponsorMatchAllLog);
		Webelements.click(Locators.overallDropClick);
		Webelements.click(Locators.inputData);
		Webelements.wait(500);
		Webelements.click(Locators.reportPage);
		Webelements.click(Locators.renewalHistory);
		Webelements.click(Locators.overallDropClick);
		Webelements.wait(1500);
		Webelements.click(Locators.dropdownoversec);
		Webelements.wait(500);
		Webelements.click(Locators.actionDropClick);
		Webelements.wait(500);
		Webelements.click(Locators.reportPage);
		Webelements.click(Locators.rankHistory);
		Webelements.click(Locators.rankDropdown);
		Webelements.click(Locators.rankChoose);
		Webelements.wait(200);
        Webelements.click(Locators.rankDropdown);
        Webelements.click(Locators.payRank);
        Webelements.click(Locators.reportPage);
        Webelements.wait(300);
        Webelements.click(Locators.rankLog);
        Webelements.click(Locators.overallDropClick);
		Webelements.click(Locators.rankChoose);
		Webelements.wait(200);
        Webelements.click(Locators.rankDropdown);
        Webelements.click(Locators.payRank);
        Webelements.wait(500);
        Webelements.click(Locators.actionDropClick);
        Webelements.wait(300);
        Webelements.click(Locators.reportPage);
        Webelements.click(Locators.fundDepositHistory);
        Webelements.wait(500);
		Webelements.click(Locators.overallDropClick);
		Webelements.click(Locators.commissionWallet);
		Webelements.wait(700);
		Webelements.click(Locators.overallDropClick);
		Webelements.click(Locators.purchaseWallet);
		Webelements.wait(700);
		Webelements.click(Locators.overallDropClick);
		Webelements.click(Locators.rewardWallet);
		Webelements.wait(700);
		Webelements.click(Locators.overallDropClick);
		Webelements.click(Locators.dividendWallet);
		Webelements.wait(500);
		Webelements.click(Locators.reportPage);
		Webelements.wait(300);
        Webelements.click(Locators.p2pTransferHistory);
        Webelements.wait(500);
		Webelements.click(Locators.overallDropClick);
		Webelements.click(Locators.commissionWallet);
		Webelements.wait(700);
		Webelements.click(Locators.overallDropClick);
		Webelements.click(Locators.purchaseWallet);
		Webelements.wait(700);
		Webelements.click(Locators.overallDropClick);
		Webelements.click(Locators.rewardWallet);
		Webelements.wait(700);
		Webelements.click(Locators.overallDropClick);
		Webelements.click(Locators.dividendWallet);
		Webelements.wait(800);
		Webelements.click(Locators.reportPage);
		Webelements.wait(500);
		Webelements.click(Locators.carryHistory);
		Webelements.click(Locators.overallDropClick);
		Webelements.wait(500);
		Webelements.click(Locators.dropdownOverall);
		Webelements.click(Locators.actionDropClick);
		Webelements.wait(500);
	}
		public static void TeamPerformance() {
			//Team Performance
			Webelements.wait(1500);
			Webelements.click(Locators.reportPage);
			Webelements.click(Locators.rankOverview);
			Webelements.click(Locators.downlineMember);
			Webelements.click(Locators.downlineDrop);
			Webelements.wait(700);
			Webelements.click(Locators.downlineMember);
			Webelements.click(Locators.referDrop);
			Webelements.click(Locators.backArrow);
			Webelements.click(Locators.rankDropdown);
			Webelements.click(Locators.rankChoose);
			Webelements.wait(200);
	        Webelements.click(Locators.rankDropdown);
	    	Webelements.wait(200);
	        Webelements.click(Locators.payRank);
	        Webelements.wait(500);
	        Webelements.click(Locators.reportPage);
	        Webelements.click(Locators.teamSalesOverview);
	        Webelements.click(Locators.downlineMember);
			Webelements.click(Locators.downlineDrop);
			Webelements.wait(700);
			Webelements.click(Locators.downlineMember);
			Webelements.click(Locators.referDrop);
			Webelements.click(Locators.backArrow);
			Webelements.wait(500);
		    Webelements.click(Locators.reportPage);
		    Webelements.wait(700);
		    Webelements.click(Locators.packageOverview);
		    Webelements.click(Locators.downlineMember);
			Webelements.click(Locators.downlineDrop);
			Webelements.wait(700);
			Webelements.click(Locators.downlineMember);
			Webelements.click(Locators.referDrop);
			Webelements.click(Locators.backArrow);
			Webelements.wait(500);
		    Webelements.click(Locators.reportPage);
	        Webelements.click(Locators.earningsOverview);
	        Webelements.click(Locators.downlineMember);
			Webelements.click(Locators.downlineDrop);
			Webelements.wait(700);
			Webelements.click(Locators.downlineMember);
			Webelements.click(Locators.referDrop);
			Webelements.click(Locators.backArrow);
			Webelements.wait(500);
		    Webelements.click(Locators.reportPage);
		    Webelements.click(Locators.joiningHistory);
		    Webelements.click(Locators.downlineMember);
			Webelements.click(Locators.downlineDrop);
			Webelements.wait(700);
			Webelements.click(Locators.downlineMember);
			Webelements.click(Locators.referDrop);
			Webelements.click(Locators.backArrow);
			Webelements.wait(500);
		    Webelements.click(Locators.reportPage);
		    Webelements.click(Locators.salesHistory);
		    Webelements.click(Locators.overallDropClick);
		    Webelements.click(Locators.dropdownOverall);
		    Webelements.wait(500);
		    Webelements.click(Locators.downlineTeamSale);
		    Webelements.click(Locators.downlineDropSale);
		}
		    //E-commerce order
		    public static void ecommerceOrder() {
		    	
		    	Webelements.wait(1000);
		    	Webelements.click(Locators.reportPage);
		    	Webelements.click(Locators.ecommerceMyOrder);
		    	Webelements.click(Locators.overallDropClick);
			    Webelements.click(Locators.dropdownOverall);
			    Webelements.wait(500);
			   // Webelements.click(Locators.allOrders);
			   Webelements.click(Locators.reportPage);
			   Webelements.wait(700);
			   Webelements.click(Locators.ecommerceMycart);
			   Webelements.click(Locators.ecommerceUserPic);
			   Webelements.click(Locators.ecommerceDashboard);
			   Webelements.wait(700);
			   Webelements.click(Locators.reportPage);
			   Webelements.click(Locators.ecommerceSubscribe);
			   }
		    public static void enrolmentOrders() {
		    	//enrolment order
		    	Webelements.wait(700);
		    	Webelements.click(Locators.reportPage);
		    	Webelements.click(Locators.membershipOrder);
		    	Webelements.click(Locators.enrlAllOrders);
		    	Webelements.click(Locators.pendingPaymentOrders);
		    	Webelements.wait(500);
		    	Webelements.click(Locators.enrlAllOrders);
		    	Webelements.click(Locators.pendingFulfillmentOrders);
		    	Webelements.wait(500);
		    	Webelements.click(Locators.enrlAllOrders);
		    	Webelements.click(Locators.fulfilledOrders);
		    	Webelements.wait(500);
		    	Webelements.click(Locators.enrlAllOrders);
		    	Webelements.click(Locators.declinedOrders);
		    	Webelements.wait(500);
		    	Webelements.click(Locators.enrlAllOrders);
		    	Webelements.click(Locators.Orders);
		    	Webelements.wait(300);
		    	Webelements.click(Locators.reportPage);
		    	Webelements.wait(700);
		    	Webelements.click(Locators.packageSubscription);
		    	Webelements.wait(500);
		    	Webelements.click(Locators.dashboard);
		    	System.out.println("Report page successfully verified");
		    	
		    }
		}
		
	

