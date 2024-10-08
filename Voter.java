import java.util.Scanner;
class Voter{
    public static void main(String[] args)
    {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter Your age: ");
        int year = x.nextInt();

        System.out.println("Your age is "+year);

        String result = (year>=18) ? ("You are eligible for vote") : ("You are not eligible for vote");
        System.out.println(result);
    }
}