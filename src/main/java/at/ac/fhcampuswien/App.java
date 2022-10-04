package at.ac.fhcampuswien;
import java.util.Scanner;
public class App {

    //todo Task 1
    public void sayHelloWorld(){
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals(){
        int sum;
        char a = 'Z';
        int b = 0xface;
        int c = 10;
        long d= 80L;
        float e = 44e-1f;
        float f = 5.5f;
        double g = 8.88e1;
        double h = 99.9;

        sum = a+b+c+(int)d+(int)e+(int)f+(int)g+(int)h;
        System.out.println(sum);

    }

    //todo Task 4
    public void addTwoNumbers(){

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int sum = a+b;

        System.out.println(sum);
    }

    //todo Task 5
    public void swapTwoNumbers(){

        Scanner input = new Scanner(System.in);

        System.out.println("Before Swap:");
        System.out.print("x: ");
        int x = input.nextInt();
        System.out.print("y: ");
        int y = input.nextInt();

        x = x - y;
        //System.out.println("x:" + x);
        y = x + y;
        //System.out.println("y:" + y);
        x = y - x;
        //System.out.println("x:" + x);

        System.out.println("After Swap:");
        System.out.println("x: " + x);
        System.out.println("y: " + y);

    }

    //todo Task 6
    public void compareTwoNumbers() {

        Scanner input = new Scanner(System.in);

        System.out.print("n1: ");
        int n1 = input.nextInt();
        System.out.print("n2: ");
        int n2 = input.nextInt();

        if (n1 > n2)
        {
            System.out.println("n1 > n2");
        }

        if (n2 > n1)
        {
            System.out.println("n2 > n1");
        }

        if (n1 == n2)
        {
            System.out.println("n1 == n2");
        }

    }

    //todo Task 7
    public void ratingSalesPerson(){

        Scanner input = new Scanner(System.in);

       // int end = 3;
       // for(int i = 0; i < end; ++i)
       // {
            System.out.print("Enter annual Revenue: ");
            int rev = input.nextInt();

            if (rev < 0 || rev >= 100000) {
                System.out.println("Invalid Revenue");
            }

            if (rev >= 0 && rev < 20000) {
                System.out.println("Poor Sales Revenue");
            }

            if (rev >= 20000 && rev < 50000) {
                System.out.println("Average Sales Revenue");
            }

            if (rev >= 50000 && rev < 80000) {
                System.out.println("Good Sales Revenue");
            }

            if (rev >= 80000 && rev < 100000) {
                System.out.println("Excellent Sales Revenue");
            }
        //}
    }

    //todo Task 8
    public void getCommissionRate(){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter CommissionClass: ");
        int commClass = input.nextInt();

        switch(commClass)
        {
            case 1:
                System.out.println("Your Commission Rate was set to 0.01");
                break;
            case 2:
                System.out.println("Your Commission Rate was set to 0.02");
                break;
            case 3:
                System.out.println("Your Commission Rate was set to 0.03");
                break;
            case 4:
                System.out.println("Your Commission Rate was set to 0.04");
                break;
            default:
                System.out.println("Your Commission Rate was set to 0.0");
        }
    }

    //todo Task 9
    public void leapyear(){

        Scanner input = new Scanner(System.in);
        System.out.print("Year: ");
        int year = input.nextInt();
        boolean leapyear;

        if (year % 4 == 0)
        {
            if (year % 100 == 0)
            {
                leapyear = year % 400 == 0;
            }
            else
                leapyear = true;
        }

        else
            leapyear = false;

        if (leapyear)
            System.out.println("Leapyear");
        else
            System.out.println("Not a Leapyear");
        /*int rest4 = year % 4;
        int rest400 = year % 400;
        int rest100 = year % 100;

        if ((rest4 == 0) && (rest400 == 0) && ((rest100 == 0) && (rest400 == 0)))
        {
            System.out.println("Leapyear");
        }

        if (rest400 == 0)
        {
            System.out.println("Leapyear");
        }

        if ((rest100 == 0) && (rest400 != 0));
        {
            System.out.println("Not a Leapyear");
        }

        else
        {
            System.out.println("Not a Leapyear");
        }*/
    }

    //todo Task 10
    public void transposedNumbers(){
        Scanner input = new Scanner(System.in);
        System.out.print("Number: ");
        int number = input.nextInt();
        int reversed;
        int a, b, c;

            a = number % 10;
            //System.out.println(a);

            b = (number / 10) % 10;
            //System.out.println(b);

            c = number / 100;
            //System.out.println(c);

            reversed = a*100 + b*10 + c;
            System.out.println(reversed);

    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}