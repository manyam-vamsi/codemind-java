import java.util.Scanner;
public class LossPercentage
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double CP=sc.nextDouble();
        double SP=sc.nextDouble();
        double loss=CP-SP;
        double percentage=((loss*100)/CP);
        System.out.printf("%.2f",percentage);
    }
}