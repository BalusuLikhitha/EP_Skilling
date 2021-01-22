package com.klu.Main;
import java.util.Scanner;
import java.sql.SQLException;

import com.klu.Bean.StudentBean;
import com.klu.crud.StudentCRUD;

public class StudentMain {
	public static void main(String args[]) throws Exception{
	Scanner s=new Scanner(System.in);
	  StudentBean sb=new StudentBean();
	  StudentCRUD sc=new StudentCRUD();
	  System.out.println("1.INSERT");
	  System.out.println("2.DELETE");
	  System.out.println("3.UPDATE");
	  System.out.println("4.DISPLAY");
	  System.out.println("5.EXIT");
	                System.out.println("Enter choice");
	  int ch=s.nextInt();
	  switch(ch) {
	    case 1:
	      System.out.println("ENTER REGNO,NAME,EMAIL");
	      int regno=s.nextInt();
	      String name=s.next();
	      String email=s.next();
	        sb.setRegno(regno);
	                      sb.setName(name);
	                      sb.setEmail(email);
	      int num=sc.StudentInsert(sb);
	      if(num>0)
	      {
	        System.out.println("Insertion successful");
	      }
	      else
	      {
	        System.out.println("Insertion unsuccessful");
	      }
	      break;
	    case 2:
	      int n=sc.Sdelete();
	      if(n>0)
	      {
	        System.out.println("Deletion successful");
	      }
	      else
	      {
	        System.out.println("Deletion unsuccessfull");
	      }
	                    break;
	    case 3:
	      int g=sc.Supdate();
	      if(g>0)
	      {
	        System.out.println("Updation successful");
	      }
	      else
	      {
	        System.out.println("Updation unsuccessfull");
	      }
	      break;
	    case 4:
	      sc.Sdisplay();
	      break;
	    case 5:
	      System.out.println("Thank you");
	      System.exit(0);
	    default:
	      System.out.println(" Please enter correct choice number from above list");
	  }
	}
}
