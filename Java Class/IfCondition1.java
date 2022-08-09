class IfCondition1 {

public static void main (String[] args) {

java.util.Scanner Sc = new java.util.Scanner(System.in);
 System.out.println("Enter 1st Number");
int a = Sc.nextInt();

System.out.println("Enter 2nd Number");
int b = Sc.nextInt();

if (a>b) {
System.out.println("a is greater than b");
} 

else if (a < b) {
System.out.println("a is lesser than b");
} 

else if (a==b) {
System.out.println("a is equal to b");
} 

}

}