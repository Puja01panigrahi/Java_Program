class SwitchCase3 {

public static void main(String [] args) {

java.util.Scanner Sc = new java.util.Scanner(System.in);
System.out.println("Enter the Month");
int Months= Sc.nextInt();

switch(Months)
{
  case 1:
  case 2:
  case 3:
System.out.println("Summer Season");
break;

  case 4:
  case 5:
  case 6:
System.out.println("Winter Season");
break;

  case 7:
  case 8:
  case 9:
System.out.println("Rainy Season");
break;

default : 
 System.out.println("Invalid Input");

}

}

}

