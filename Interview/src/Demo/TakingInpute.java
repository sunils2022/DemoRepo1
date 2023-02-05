package Demo;

import java.util.Scanner;
public class TakingInpute{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter name");
String name=sc.nextLine();
System.out.println("Enter mo number");
long mobile=sc.nextLong();
System.out.println("Enter gender");
char gender=sc.next().charAt(0);
System.out.println(name+mobile+gender);
System.out.println("Congratulation you register successfully ");
}

}
