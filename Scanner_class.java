import java.util.Scanner;           //scanner class is used to take input and present under java.util package 
public class scanner {
     public static void main(String[] args) {
        System.out.print("enter ypur name:");
        Scanner sc=new Scanner(System.in);                  //sc is an object of scanner class
        String name=sc.nextLine();

         System.out.println(name);
     }
}
