public class variables {   
                                      //variables ----------->1]static    2]instance    3]local
int a=200;                       //instance var(we need to create object to access it 
static int b=10;               //static
static final int Y=1;          //constant in java

public static void show(int y)            // y is a local variable
{
    int x=2;                             //x is locl variable
    int sum=x+y;
    System.out.println("sum is "+sum);
}
public static void main(String args[])
{
    int y=8;
    System.out.println(b);
    System.out.println(Y);
    show(y);
    variables obj=new variables(); //to access instance var
    variables obj2=new variables();
   obj.a=60;
    System.out.println(obj.a);
    System.out.println(obj2.a);
}
}


