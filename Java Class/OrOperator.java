class OrOperator {

public static void main(String[] args) {

java.util.Scanner Sc = new java.util.Scanner(System.in);
System.out.println("Enter the Number");

int a = Sc.nextInt();
//OR operator = Any one of the  conditions are true
   if(a%2==0 || a%4==0) 
       {
         System.out.println("Number is Even");
       }
else {
        System.out.println("Number is Odd");
  }

}
}
       
        
