import java.util.Scanner;
class LeapYear{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = sc.nextInt();

        System.out.println("Your Entered year: "+year);

        String result = ( (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) )
                                ? year + " is a leap year."
                            : year + " is not a leap year.";
        
        System.out.println(result);
    }

};