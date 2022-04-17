public class wrapper_class {
 
    public static void main(String args[])
    { 
                                                        //example---1  unboxing               obj------------------>primitive
                                                        //   int d;
                                                        //   String s="2000";
                                                      //   d= Integer.parseInt(s);
                                                      //  System.out.println(d); 
 
                                                         //example----2   unboxing
                                                        //     float x;
                                                        //     String str="3.89";
                                                        //    x= Float.parseFloat(str);
                                                        //    x++;
                                                        //    System.out.println(x); 

     
//autoboxing           int-------->Integer
int x=100;

        Integer j;
       j=Integer.valueOf(x);
        //or Integer ab=x;
            System.out.println(j);  
    }
}
