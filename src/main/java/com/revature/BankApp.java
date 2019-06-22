package com.revature;

import com.revature.model.BankUser;
import com.revature.repository.AccountDAO;
import com.revature.repository.AccountDAOImpl;
import com.revature.repository.BankUserDAO;
import com.revature.repository.BankUserDAOImpl;
import com.revature.util.ConnectionUtil;

/**
 * Create an instance of your controller and launch your application.
 * 
 * Try not to have any logic at all on this class.
 */
public class BankApp {

	public static void main(String[] args) {


		AccountDAO accountDAO = new AccountDAOImpl();
		System.out.println(accountDAO.getAccountByNumer(1));

		BankUserDAO bankUser =new BankUserDAOImpl();
		System.out.println(bankUser.getUser());
		System.out.println(bankUser.getUserByID(1).getEmail());
		System.out.println(bankUser.getUserByID(1).getPassWord());
	}
}
