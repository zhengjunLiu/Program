package ArrayList;
import java.util.*;
public class Account {

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public double getAnnualInterestRate() {
	return annualInterestRate;
}
public void setAnnualInterestRate(double annualInterestRate) {
	this.annualInterestRate = annualInterestRate;
}
public Date getDate() {
	return date;
}
private int id=0;
private ArrayList transactions;
public ArrayList getTransactions() {
	return transactions;
}
public void setTransactions(ArrayList transactions) {
	this.transactions = transactions;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public void setDate(Date date) {
	this.date = date;
}
private double  balance=0;
private double annualInterestRate=0;
private  Date date;
private String name="null";
public Account(){
	date=new Date();
	transactions=new ArrayList();
}
public Account(String name1,int a,double b,double c){
	name=name1;
	id=a;
	balance=b;
	annualInterestRate=c;
	date=new Date();
	transactions=new ArrayList();
}
public double getMonthlyInterestRate(){
	return annualInterestRate/12;
}
public void withDraw(double money){
	balance=balance-money;
	Transaction a=new Transaction('D',date,money,balance,"取钱");
	transactions.add(a);
	
}
public void deposit(double money){
	balance=balance+money;
	Transaction a=new Transaction('W',date,money,balance,"存钱");
	transactions.add(a);
}
public String toString(){
	
return "姓名:"+name+"\n利率"+annualInterestRate;
		}
public static void main(String[] args) {
	Account a=new Account("George",1122,1000,0.015);
	a.withDraw(30);
	a.withDraw(40);
    a.withDraw(50);
    a.deposit(5);
    a.deposit(4);
    a.deposit(2);
  
    for(int i=0;i<a.getTransactions().size();i++){
    	  System.out.println(a.toString());
    	  System.out.println(a.getTransactions().get(i).toString());
    	  
    }
}
}
