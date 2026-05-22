import java.util.Scanner;
class Arithmetic 
{
    public static void main(String args[])
    {
        int a,b;
        System.out.print("Enter two numbers");
        Scanner obj = new Scanner(System.in);
        a=obj.nextInt();// nextInt is a method  of scanner class to input integer value we can call it by only scanner class object
        b=obj.nextInt();
        System.out.println("ADDITION="+(a+b));
        System.out.println("SUBTRACTION="+(a-b));
        System.out.println("MULTIPLICATION="+(a*b));
        System.out.println("DIVISION="+(a/b));
    }
}
    

