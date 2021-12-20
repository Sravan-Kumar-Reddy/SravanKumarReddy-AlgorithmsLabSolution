package com.minimum.denominations.main;
import java.util.Scanner;

import com.minimum.denominations.service.*;

public class DriverClass {
  public static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args) {

    System.out.println("Enter the size of currenct denominations:");
		int numberOfDenominations = scanner.nextInt();

		int[] denominationsArray = new int[numberOfDenominations];
		for(int i=0;i<numberOfDenominations;i++){
			System.out.println("Please enter denomination "+i+" :");
      int denominationValue = scanner.nextInt();
      if(denominationValue<=0){
        System.out.println("Denomination cannot be 0 or negative");
        i--;
        continue;
      }
			denominationsArray[i] = denominationValue;
		}
    MergeSort mergeSort = new MergeSort();
    mergeSort.applyMergeSort(denominationsArray, 0, denominationsArray.length-1);


    System.out.println("Denominations Entered: ");
    System.out.print("[");
    for (int i=0;i<denominationsArray.length ;i++ ) {
      System.out.print(denominationsArray[i]+ " ");
    }
    System.out.print("]");
    System.out.println();
    System.out.println("Enter the Amount you want to play:");
		int amountToPay = scanner.nextInt();
    System.out.println("");
    MinimumDenomTransaction minimumDenomTransaction = new MinimumDenomTransaction();
    minimumDenomTransaction.noteCounter(denominationsArray,amountToPay);

  }
}
