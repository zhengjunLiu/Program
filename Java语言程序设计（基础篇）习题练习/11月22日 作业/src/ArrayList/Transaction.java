package ArrayList;

import java.util.Date;

import javax.xml.crypto.Data;

import org.omg.PortableServer.ID_ASSIGNMENT_POLICY_ID;

public class Transaction {
	
	public Date getDate() {
		return date;
	}
	public char getType() {
		return type;
	}
	public void setType(char type) {
		this.type = type;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	private  char type;
	private  Date date;
	private  double amount;
	private  double balance;
	private  String description;
	public Transaction(char type1,Date date1,double amount1, double balance1,String description1){
		type=type1;
		date=date1;
		amount=amount1;
		balance=balance1;
		description=description1;
		
		
		}
public String toString(){
  if(type=='W')	return "取款\n"+ "取款金额:"+ amount+"\n剩余金额"+balance+"\n时间"+date.toString();
  if(type=='D')return "存款\n"+ "存款款金额:"+ amount+"\n剩余金额"+balance+"\n时间"+date.toString();
  return null;
}
}
