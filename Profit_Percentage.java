import java.util.Scanner;
public class ProfitPercentage
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double CP=sc.nextDouble();
        double SP=sc.nextDouble();
        double profit=SP-CP;
        double percentage=((profit*100)/CP);
        System.out.printf("%.2f",percentage);
    }
}