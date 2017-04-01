package org.nishad.server;

import java.util.ArrayList;

public class BApplication {
	

	public static ArrayList<BDatabase> bankArraylist=new ArrayList<BDatabase>();
	   
	public BApplication(){
	
	     	BDatabase bInfo=new BDatabase();
			bInfo.setaccNumber("1");
			bInfo.setPassword("0");
			bInfo.setaccBalance(100);
			bankArraylist.add(bInfo);
			
			bInfo=new BDatabase();
			bInfo.setaccNumber("2");
			bInfo.setPassword("0");
			bInfo.setaccBalance(300);
			bankArraylist.add(bInfo);
			
			bInfo=new BDatabase();
			bInfo.setaccNumber("3");
			bInfo.setPassword("0");
			bInfo.setaccBalance(400);
			bankArraylist.add(bInfo);
				
	}
	
	/* to deposite the money*/
    public String Deposit(String ac,String pas,int am){
    	BDatabase bd=new BDatabase();
    	bd.setaccNumber(ac);
    	bd.setPassword(pas);
    	int balance=0;
    	if(validate(bd)){
			for(int i=0;i<bankArraylist.size();i++){
				if(bankArraylist.get(i).getaccNumber().equals(ac)){
					balance=bankArraylist.get(i).getaccBalance();
					balance=balance+am;
					bankArraylist.get(i).setaccBalance(balance);
					return "Successfully deposited Of Account"+ac+" Amount :"+balance;
				}
			}
		}
    
    	return "Wrong credentials";
    }
    
    /* To validate whether account number and password are correct or not */
    
    public boolean validate(BDatabase bd){
    	
    	for(int i=0;i<bankArraylist.size();i++){
    		BDatabase bData=new BDatabase();
    		if(bankArraylist.get(i).getaccNumber().equals(bd.getaccNumber())){
    			bData=bankArraylist.get(i);
    			if(bData.password.equals(bd.getPassword()))
    			{
    				return true;
    			}
    		}
    	}
    	return false;
    }
    
    /* to withdraw the money */
    public String Withdraw(String ac,String pas,int am){
    	BDatabase bd=new BDatabase();
    	bd.setaccNumber(ac);
    	bd.setPassword(pas);
    	int balance=0;
    	if(validate(bd)){
			for(int i=0;i<bankArraylist.size();i++){
				if(bankArraylist.get(i).getaccNumber().equals(ac)){
					balance=bankArraylist.get(i).getaccBalance();
					balance=balance-am;
					bankArraylist.get(i).setaccBalance(balance);
					return "Successfully WithDraw Of Account"+ac+" Amount :"+balance;
				}
			}
		}
    
    	return "Invalid information";
    }
    
    /* To check the account status */
    public String Summary(String ac,String pas){
    	BDatabase bd=new BDatabase();
    	bd.setaccNumber(ac);
    	bd.setPassword(pas);
    	int balance=0;
    	if(validate(bd)){
			for(int i=0;i<bankArraylist.size();i++){
				if(bankArraylist.get(i).getaccNumber().equals(ac)){
					balance=bankArraylist.get(i).getaccBalance();
					bankArraylist.get(i).setaccBalance(balance);
					return "Summary Of Account"+ac+" Amount :"+balance;
				}
			}
		}
       	return "Invalid information";
    }
    
    


}
