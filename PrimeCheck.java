import java.util.Scanner;
class PrimeCheck
{
    public static void main(String arg[])
    {
        System.out.println("Enter a Number :");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        boolean isPrime=true;
        if(n==2)
        {
            System.out.println(n+" is Prime");
        }
        else
        {
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
              isPrime=false;
            }   
        }

        if(isPrime==true)
        {
            System.out.println(n+" is prime");
        }
        else
        {
            System.out.println(n+" is not prime");
        }
        }    
    }
}