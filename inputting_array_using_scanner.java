import java.util.Scanner;
public class input_aaray_by_scanner {
    public static void main(String args[])
    {
   
    Scanner obj=new Scanner(System.in);
    int size=obj.nextInt();
    int arr[]=new int[size];
    int i;
    for(i=0;i<size;i++)
      {
          Scanner sc2=new Scanner(System.in);
          arr[i]=sc2.nextInt();    
      }    
      System.out.println("the given array is :");
      for(i=0;i<size;i++)
      {
        System.out.println(arr[i]);
      }
}
}
