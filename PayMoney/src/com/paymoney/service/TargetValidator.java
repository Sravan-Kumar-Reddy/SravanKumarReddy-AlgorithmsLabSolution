package com.paymoney.service;

public class TargetValidator {
  public String validateTarget(int[] transactionsArray,int target){
    int transactionSum=0;
    for (int i=0;i<transactionsArray.length;i++ ) {
      transactionSum += transactionsArray[i];
      if(transactionSum>=target){
        return "Target achieved after Transaction "+(i+1);
      }else if(i == transactionsArray.length){
        return "Target can not be achieved with the given Transactions";
      }
    }
  return "Target can not be achieved with the given Transactions";
  }
}
