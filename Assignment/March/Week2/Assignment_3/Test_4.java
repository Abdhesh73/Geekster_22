import java.util.*;
class Test_4

{
  public static void main(String adf[]){

  

Scanner sc= new Scanner(System.in);

System.out.println("Enter week Day number like  1 to 7 ");

int week= sc.nextInt();


switch(week)
    {
        case 1: 
           System.out.println("Monday");
            break;
        case 2: 
           System.out.println("Tuesday");
            break;
        case 3: 
            System.out.println("Wednesday");
            break;
        case 4: 
           System.out.println("Thursday");
            break;
        case 5: 
            System.out.println("Friday");
            break;
        case 6: 
            System.out.println("Saturday");
            break;
        case 7: 
            System.out.println("Sunday");
            break;
        default: 
            System.out.println("Invalid input! Please enter week number between 1-7.");

}
}


}