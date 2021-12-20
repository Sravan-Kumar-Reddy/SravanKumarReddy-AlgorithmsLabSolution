package com.minimum.denominations.service;

public class MinimumDenomTransaction {

	public void noteCounter(int[] denominationsArray,int transactionAmount){
		int[] denominationArrayForTransaction = new int[denominationsArray.length];
		int i= denominationsArray.length-1;
		try {
			while(i>=0){
					denominationArrayForTransaction[i] = transactionAmount/denominationsArray[i];
					transactionAmount = transactionAmount%denominationsArray[i];
					i--;
			}
		}catch (ArithmeticException e) {
			System.out.println(e+" 0 denomination is invalid");
		}
		for (int j=0;j<denominationArrayForTransaction.length ;j++ ) {
			// System.out.println("Denomination of "+denominationsArray[j]+" : "+denominationArrayForTransaction[j]+ " ");
			System.out.println(denominationsArray[j]+" : "+denominationArrayForTransaction[j]);
		}

		if(transactionAmount>0){
			System.out.println("Amount = "+transactionAmount+" can not be provided with the given denominations");
		}

	}
}
