import java.util.Scanner;

public class LAB8_3 {
    public static void main(String[] args) {
        int month;

        Scanner in=new Scanner(System.in);
        System.out.println("enter the number of month");
        month=in.nextInt();
        switch (month){
            case 1 :
                System.out.println("31 days");
                break;
            case 2:
                System.out.println("28 days");
                break;
            case 3 :
                System.out.println("30 days");
                break;
            case 4 :
                System.out.println("31 days");
                break;
            case 5 :
                System.out.println("30 days");
                break;
            case 6 :
                System.out.println("31 days");
                break;
            case 7 :
                System.out.println("30 days");
                break;
            case 8 :
                System.out.println("31 days");
                break;
            case 9 :
                System.out.println("30 days");
                break;
            case 10 :
                System.out.println("31 days");
                break;
            case 11 :
                System.out.println("30 days");
                break;
            case 12 :
                System.out.println("31 days");
                break;
            default:
                System.out.println("Invalid Input ");
                break;

        }

    }
}
