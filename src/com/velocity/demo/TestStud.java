package com.velocity.demo;

import java.util.List;
import java.util.Scanner;

public class TestStud {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		stud s=new stud();
		studimpl si=new studimpl();
		int rno;
		String name;
		boolean result;
		System.out.println("1.insert stud");
		System.out.println("2.delete stud");
		System.out.println("3.search stud");
		System.out.println("4.display stud");
		System.out.println("5.update stud");
		System.out.println("6.Exit");
		int ch=1;
		while(ch!=0) {
			System.out.println("enter ur choice");
			ch=sc.nextInt();
			switch(ch) {
				case 1:
					System.out.println("enter stud rno");
					rno=sc.nextInt();
					sc.nextLine();
					System.out.println("enter stud name");
					name=sc.nextLine();
					s.setRno(rno);
					s.setName(name);
					result=si.insertstud(s);
					if(result==true) {
						System.out.println("stud added");
					}
					else {
						System.out.println("stud not added");
					}
				break;
				
				case 2:
					
					System.out.println("enter rno to delete the stud");
					rno=sc.nextInt();
					s.setRno(rno);
					result=si.deletestud(rno);
					if(result==true) {
						System.out.println("deleted");
					}
					else {
						System.out.println("not deleted");
					}
					
				break;
				
				case 3:
					System.out.println("enter rno for search");
					rno=sc.nextInt();
					si.searchstud(rno);
					
					
				break;
				
				case 4:
					System.out.println("stud details are");
					List<stud> list=si.displaystud();
					for(stud st:list) {
						System.out.println(st);
					}
				break;
				case 5:
					System.out.println("enter stud rno which is updated");
					rno=sc.nextInt();
					System.out.println("enter stud name for update");
					sc.nextLine();
					name=sc.nextLine();
					s.setRno(rno);
					s.setName(name);
					result=si.updatestud(s);
					if(result==true) {
						System.out.println("update successfully");
					}
					else {
						System.out.println("not updated");
					}
				break;
				case 6:
					System.exit(0);
				break;
				default:
					System.out.println("invalid choice");
			}
		
		}		
	}

}
