# digital-buss-pass-
Digitization of bus pass system
//user page
package buffer;
import java.lang.Math;

import java.util.*;

import java.util.Random;

import java.time.format.DateTimeFormatter;

import java.time.LocalDateTime;

class Login {

//user login or sign-in

static String a_num;

static String ph_num;

public Login() {

//hashmap to store the credentials of users

HashMap<String,String> map=new HashMap<String,String>();

map.put("6654", "9511824289");

map.put("6655", "9511824290");

map.put("6656", "9511824291");

System.out.println("1)login"+"\n"+"2)signin");

int opt;

Scanner sc=new Scanner(System.in);

opt=sc.nextInt();

//user details

switch(opt) {

case 1:

System.out.println("enter your aadhar number:");

sc.nextLine();

a_num=sc.nextLine();

if(map.containsKey(a_num)==true) {

System.out.println("You have logged in Successfully!!");

}

else {

System.out.println("incorrect credentials");

}

break;

case 2:

System.out.println("enter your aadhar number:");

sc.nextLine();

a_num=sc.nextLine();

System.out.println("enter your phone number:");

ph_num=sc.nextLine();

map.put(a_num,ph_num);

System.out.println("========log in to your account========");

System.out.println("enter your aadhar number:");

a_num=sc.nextLine();

if(map.containsKey(a_num)==true) {

System.out.println("You have logged in Successfully!!");

}

else {

System.out.println("incorrect credentials");

break;

}

} }

private String name;

private String num;

private String password;

// BinarySearchTree.java

public class BinarySearchTree{

private String name;

private String num;

private String password;

private Node root;

private class Node{

private Login user;

private Node left;

private Node right;

public Node(Login user){

this.user=user;

}

}

public void insert(Login user){

root=insert(root,user);

}

private Node insert (Node node, Login user) {

if(node==null){

return new Node(user);

}

if (user.a_num.compareTo(node.user.a_num)<0)

{

node.left=insert(node.left,user);

}

else

{

node.right=insert(node.right,user);

}

return node;

}

public Login search(String email){

Node node= search(root,email);

if(node==null){

return null;

}

return node.user;

}

private Node search(Node node,String num)

{

if(node==null||num.equals(node.user.a_num))

return node;

if(num.compareTo(node.user.a_num)<0)

{

return search(node.left,num);

}

else

{

return search(node.right,num);

}

}

}

}

//display of stops and calculation of fare

class Fare {

public Fare() {

System.out.println("WELCOME!!!\nE-Buss Pass\n");

System.out.println("BUS STOP POINTS");

//stops display in linked list

LinkedList<String> points=new LinkedList<String>();

points.add("123. NDA gate");

points.add("\n124. Uttam nagar");

points.add("\n125. Ganapati Matha");

points.add("\n126. Warje");

points.add("\n127. Karvenagar");

points.add("\n128. Kothrud stand");

points.add("\n129. karve putla");

points.add("\n130. Manpa");

points.add("\n131. Pune station");

points.add("\n132. SNDT");

points.add("\n133. Symbiosis");

points.add("\n134. Chaturshrungi");

points.add("\n135. Bremen chowk");

points.add("\n136. Aundh");

points.add("\n137. Hadpsar");

points.add("\n138. Hinjewadi-phase 1");

points.add("\n139. Chinchwad gaon");

points.add("\n140. Wagholi\n");

//print linked list

for(int i=0;i<points.size();i++) {

System.out.println(points.get(i));

}

Scanner sc=new Scanner(System.in);

System.out.print("\nEnter your starting point number: ");

int ch1=sc.nextInt();

System.out.print("Enter your ending point number: ");

int ch2=sc.nextInt();

System.out.print("\nCalculate Fare: 1-yes 0-no : ");

int opt1=sc.nextInt();

if(opt1==1) {

int diff=Math.abs(ch1-ch2);

double fare=diff*5*2*22*0.5;

System.out.println("Fare: "+fare);

}

System.out.print("\nProceed to payment? 1-yes 0-no: ");

int opt2=sc.nextInt();

}

}

class PaymentDetails{

public void getDetails() {

System.out.print("\nChoose payment option:\n1.Card Payment\n2.Cash ");

Scanner sc1=new Scanner(System.in);

int opt1=sc1.nextInt();

if(opt1==1) {

System.out.println("\nEnter your card details: ");

System.out.print("\ncard number: ");

long cardnum=sc1.nextLong();

System.out.print("Expiry date: ");

int date=sc1.nextInt();

if(date>1300) {

System.out.print("Enter correct expiry date: ");

int date1=sc1.nextInt();

}

System.out.print("CVV: ");

int cvv=sc1.nextInt();

}

}

}

//payment details

class CreditCardPayment extends PaymentDetails{

public void Payment(){

System.out.println("\nPayment processing.....\nDo not refresh.....");

System.out.println("PAID");}

void date() {

DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

LocalDateTime now = LocalDateTime.now();

System.out.println("your pass is valid from "+dtf.format(now));

System.out.println("Your pass will be valid for 30 days from "+dtf.format(now.plusDays(30)));

}}

//generating OTP

class OTPgeneration{

OTPgeneration(){

String generatedOTP ;

generatedOTP= generateOTP();
}


public String generateOTP() {

//Generate 4-digit OTP

int otp = (int) (Math.random() * 10000);

return Integer.toString(otp);


}

}


//main class


public class compile_1 {

	public static void main(String[] args) {
		Login obj1= new Login();

		Fare obj2=new Fare();

		CreditCardPayment cc= new CreditCardPayment();

		cc.getDetails();

		cc.Payment();

		cc.date();

		OTPgeneration obj3=new OTPgeneration ();
	}
}
		
//conductor page
    import java.util.Scanner;


public class calender extends OTPgeneration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		//array to validate the number of days

		int arr[]=new int[22];

		int count=22;

		for(int i=0;i<22;i++) {

		arr[i]=count;

		count--;

		}

		int k=1;

		int passes=22;

		calender cal=new calender();

		String generatedOTP="k";

		for(int i=0;i<22;i++) {

		OTPgeneration t=new OTPgeneration();

		String so= t.generateOTP();

		System.out.println("\n\nOTP is "+so);

		System.out.println("Enter code: ");

		//generatedOTP=sc.next();

		//System.out.print("\nEnter code: ");

		int code=sc.nextInt();

		// System.out.print("client"+generatedOTP);

		//if(so.compareTo(generatedOTP)==0) {

		//System.out.print(so);

		if(generatedOTP=="k") {

		for(int j=0;j<30;j++) {

		if(passes>0) {

		passes--;

		System.out.printf("\nDay %d ,passes left: %d",k,passes);

		k++;

		break;

		}
		else if(generatedOTP=="0") {
		for(int m=0;m<30;m++) {
		}
		}
		else {

		System.out.println("No passess left ");

		}

		}

	}

		}
	}
}
