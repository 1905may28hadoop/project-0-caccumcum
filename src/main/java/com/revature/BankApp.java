package com.revature;

import com.revature.controller.AccountMenu;
import com.revature.controller.Login;
import com.revature.model.BankUser;
import com.revature.model.UserAccount;
import com.revature.repository.*;
import com.revature.util.ConnectionUtil;

import java.util.Scanner;

/**
 * Create an instance of your controller and launch your application.
 * 
 * Try not to have any logic at all on this class.
 */
public class BankApp {

	public static void main(String[] args) {

/*
		AccountDAO accountDAO = new AccountDAOImpl();
		System.out.println(accountDAO.getBalanceByAccNumer(1));
		System.out.println(accountDAO.getAccounts());
*/
		UserAccountDAO userAccountDAO = new UserAccountDAOImpl();
		System.out.println(userAccountDAO.getUserAccount());
		System.out.println(userAccountDAO.getAccByUserID(2));
/*


		BankUserDAO bankUser =new BankUserDAOImpl();
		System.out.println(bankUser.getUser());
		System.out.println(bankUser.getUserByID(1).getEmail());
		System.out.println(bankUser.getUserByID(1).getPassWord());
*/

//get input from user
		System.out.println("Welcome to Adam;)Peter Bank!");
		System.out.println("Have Account ? " +
				"\n (1) to access your account : " +
				"\n(2) to register a new account: " +
				"\n(3) to update your account: " +
				"\n(4) to delete account: " +
				"\n (0) to stop" );


		//Scan input from user
		Scanner scanner = new Scanner (System.in);
		String input = scanner.nextLine();
		System.out.println("your choicee is: "+input);
		Login check = new Login();


		if(input.equals("0")){
			System.out.println("Thank you for stop by!");

		}else if (input.equals("1")) {
			System.out.println("Time to swing around your account");

			String userName, password;
			System.out.println("Please enter your username: ");
			userName = scanner.nextLine();
			System.out.println("Please enter your password: ");
			password = scanner.nextLine();

			while (check.accountAccess(userName, password) == true) {
				System.out.println("====log in Successful===== ;)" +
						"\n Hare are transactions' options for you:" +
						"\n (B) to view account balance." +
						"\n (D) to deposit" +
						"\n (W) to Withdraw");
				String input2 = scanner.nextLine().toLowerCase();
				AccountMenu option = new AccountMenu();

				if (input2.equals("b")) {
					System.out.println("Your Balance is: " + option.AccountBalance(userName));

				} else if (input2.equals("d")) {
					option.deposit();
				} else if (input2.equals("w")) {
					option.withdraw();
				} else {
					System.out.println("Thank you for Banking with us!");
				}

				break;
			}
		}else if (input.equals("2")){
			System.out.println("sorry! the feature is in develop process");
		}
	}
}
