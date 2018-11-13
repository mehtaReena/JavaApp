package Demo;

import java.util.*;


import java.lang.*;
import java.text.*;
import java.math.*;

class Solution  { 
private static final String TEXT =  "I am a {0} account with {1,number,#}units of {2} currency";


public static void main(String args[] ) throws Exception {

    List<BankAccount> accounts = new ArrayList<BankAccount>();
    accounts.add(new SavingsAccount("USD",3));//Savings
    accounts.add(new SavingsAccount("EUR",2));//Savings
    accounts.add(new CheckingAccount("HUF",100));//Checking
    accounts.add(new CheckingAccount("COP",10000));//Checking
    accounts.add(new BrokerageAccount("GBP",2));//Brokerage
    accounts.add(new BrokerageAccount("INR",600));//Brokerage

    accounts.stream().forEach(
                                account -> System.out.println(
                                    MessageFormat.format(TEXT,
                                        new Object[]{

                                        
                                        	    account.getAccountType().getName(),//make this work
                                        		account.getUnits(),//make this work
                                        		account.getCurrency()//make this work
                                                       })));
}

}


class BankAccount {
	Integer units;
	String currency;
	String name;
	
	
	public Integer getUnits() {
		return units;
	}


	public BankAccount getAccountType() {
			
		return this;
	}


	@Override
	public String toString() {
		return "BankAccount [units=" + units + ", currency=" + currency + ", name=" + name + "]";
	}


	public void setUnits(Integer units) {
		this.units = units;
	}


	public String getCurrency() {
		return currency;
	}


	public void setCurrency(String currency) {
		this.currency = currency;
	}

	

	
	

	


	

	public String getName() {
		
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public BankAccount() {
		
	}
	
	
	
	
}



class SavingsAccount extends BankAccount{
	
	 
	
	
	public SavingsAccount(String string, int i) {
		super.name="Saving";
		super.currency=string;
		super.units=i;
		
          
          
	}

	public SavingsAccount() {
		// TODO Auto-generated constructor stub
	}

	
}


class CheckingAccount extends BankAccount{

	public CheckingAccount(String string, int i) {
			
		   super.name="Checking";
			super.currency=string;
			super.units=i;
	}

	public CheckingAccount() {
		// TODO Auto-generated constructor stub
	}

	
	
}


class BrokerageAccount extends BankAccount{
     
	public BrokerageAccount(String string, int i) {
		super.name="Brokerage";
		super.currency=string;
		super.units=i;
		
	}

	public BrokerageAccount() {
		// TODO Auto-generated constructor stub
	}

	
	
}
	
	
