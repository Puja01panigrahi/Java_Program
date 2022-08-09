class NestedIf {

public static void main (String [] args) {

java.util.Scanner Sc = new java.util.Scanner(System.in);
System.out.println("Enter the Number");

int Num = Sc.nextInt();

if(Num%2==0)
 {
     if (Num%5==0)
        {
           System.out.println("Number is divisible by 2 and 5");
        }
    else
       {
          System.out.println("Number is divisible by only 2 ");
        }
}
else  {
System.out.println("Number is not divisible by only  2 and 5 ");
}


}

}