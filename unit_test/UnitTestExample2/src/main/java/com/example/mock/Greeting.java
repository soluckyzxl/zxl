package com.example.mock;

import java.util.Scanner;

import com.example.db.DBHelper;

/**
 * This Greeting class has dependency to DBHelper.
 */
public class Greeting {
	private DBHelper dbh = null;
	
	public Greeting(DBHelper dbh) {
		this.dbh = dbh;
	}
	
	public String greetById(String user_id) {
		String sUserName = dbh.getUserNameById(user_id);
		return "Good day! " + sUserName + ".";
	}
	public String Taste() {
		System.out.println("请输入你要查询的食物味道,退出请输入exit");
		while(true) {
			Scanner scanner=new Scanner(System.in);
			int a=0;
			String b=scanner.next();
			if(b.equals("apple")) {
				a=1;
			}
			else if(b.equals("pepper")) {
				a=2;
			}
			else if(b.equals("lemon")) {
				a=3;
			}
			else if(b.equals("balsam pear")) {
				a=4;
			}
			else if(b.equals("exit")) {
				System.out.println("see you！");
				break;
			}
			else{
				System.out.println("输入有误，请重新输入！");
			}
				if(a==1) {
					System.out.println(b+" "+"is sweet!");
				}
				if(a==2) {
					System.out.println(b+" "+"is spicy!");
				}
				if(a==3) {
					System.out.println(b+" "+"is sour!");
				}
				if(a==4) {
					System.out.println(b+" "+"is bitter!");
				}
		}
		return null;
	}
}

