package com.paymoney.main;

import java.util.*;
import com.paymoney.service.*;

public class DriverClass {

	public static Scanner scanner = new Scanner(System.in);
	public static void main(String args[]) {
		// System.out.println("Please enter the number of Transactions:");
		System.out.println("Enter the size of Transactions Array:");
		int numberOfTransactions = scanner.nextInt();

		int[] transactionsArray = new int[numberOfTransactions];
		for(int i=0;i<numberOfTransactions;i++){
			System.out.println("Please enter Transaction "+i+" :");
			transactionsArray[i] = scanner.nextInt();
		}

		System.out.println("Enter the value of target:");
		int target = scanner.nextInt();
		TargetValidator targetValidator = new TargetValidator();
		System.out.println(targetValidator.validateTarget(transactionsArray,target));



	}
}
