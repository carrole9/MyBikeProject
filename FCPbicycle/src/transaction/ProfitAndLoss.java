package transaction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

import main.Database;

public class ProfitAndLoss {

	     
		  private ArrayList<PurchasingTransaction>purchasingTransactions= new ArrayList<PurchasingTransaction>();
		  private ArrayList<SalesTransaction>salesTransactions= new ArrayList<SalesTransaction>();
		  private double totalSalesTransactionValue;
		  private double totalPurchasingTransactionValue;
		  private boolean profitMaking;
		
            public ProfitAndLoss(Database data,double totalTransactionValue,boolean profitMaking) {
			this.profitMaking = profitMaking;
			this.totalSalesTransactionValue = totalSalesTransactionValue;
			this.totalPurchasingTransactionValue = totalPurchasingTransactionValue;
			Collections.copy(salesTransactions,data.getSalesTransactions());
			Collections.copy(purchasingTransactions,data.getPurchasingTransactions());
			
			 
			
		}


	public boolean isProfitMaking() {
		return profitMaking;
	}


	public void setProfitMaking(boolean profitMaking) {
		this.profitMaking = profitMaking;
	}


	public double getSalesTransactionValue() {
		return totalSalesTransactionValue;
	}


	public void setSalesTransactionValue(double totalSalesTransactionValue) {
		this.totalSalesTransactionValue = totalSalesTransactionValue;
	}
	
	public double getPurchasingTransactionValue() {
		return totalPurchasingTransactionValue;
	}


	public void setPurchasingTransactionValue(double totalPurchasingTransactionValue) {
		this.totalPurchasingTransactionValue = totalPurchasingTransactionValue;
	}
	
	
	public void calculateSalesTransactionValue(){
		double salestotalValue=0;
		for(SalesTransaction salesTransaction: salesTransactions){
			salestotalValue=salestotalValue + salesTransaction.getTransactionCost();
		
		}setSalesTransactionValue(salestotalValue);
	}
	
	
	public void calculatePurchasingTransactionValue(){
		double purchasingtotalValue=0;;
		for(PurchasingTransaction puchasingTransaction: purchasingTransactions){
			 purchasingtotalValue= purchasingtotalValue + puchasingTransaction.getTransactionCost();
		
		}setPurchasingTransactionValue( purchasingtotalValue);
	}
	
	public void profitOrLoss(){
		double result;
		result = totalSalesTransactionValue-totalPurchasingTransactionValue;
		if(result > 0){
			setProfitMaking(true);
		}
		else if(result < 0){
			setProfitMaking(false);
		}
	}
  
	public void display() {
		if(profitMaking==true){
			System.out.println("The company is making a profit");
			System.out.println("The companies profit is: €" + getSalesTransactionValue());
		}else if(profitMaking==false){
			System.out.println("The company is making a loss");
			System.out.println("The companies loss is: -€" + getPurchasingTransactionValue());
			
		}
	}


}
