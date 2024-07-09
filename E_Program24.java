//24.Write a Program to Calculate the Gross Salary of an Employee in Java
import java.util.*;
class E_Program24{
    public static void main(String args[])
    {
         Scanner Sc = new Scanner(System.in);

         System.out.print("ENTER THE BASIC SALARY : ");
         float Basic_salary = Sc.nextFloat();
         
         System.out.print("ENTER HOUSE RENT ALLOWANCE : ");
         float H_Rent = Sc.nextFloat();
         
         System.out.print("ENTER TRANSPORT ALLOWANCE : ");
         float T_Allowance = Sc.nextFloat();

         System.out.print("ENTER PROVIDENT FUND : ");
         float Provident_Fund = Sc.nextFloat();

         System.out.print("ENTER BONUS : ");
         float Bonus = Sc.nextFloat();

         float GrossSalary = Basic_salary + H_Rent + T_Allowance + Provident_Fund +Bonus;
         System.out.println("----------------------------------");
         System.out.println("GROSS SALARY : "+ GrossSalary);

    } 
}