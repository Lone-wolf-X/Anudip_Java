import java.util.Scanner;
class CalBonus{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = sc.nextInt();

        System.out.println("Enter Salary: ");
        double Salary = sc.nextDouble();


        double result = (year>20 )
                                ? (Salary*0.2)
                            : (Salary*0.1);

        System.out.println(result);
    }

};