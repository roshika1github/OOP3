import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double measurement = sc.nextDouble();

        System.out.println("Enter the value in meters:");
        double valueInmeters = sc.nextDouble();

        Measurement measurement=new Measurement (valueInmeters)
        System.out.println("Enter value in centimeter:"+sc.getCm()+"Cm");
        System.out.println("Enter value in kilometer:"+sc.getKm()+"km");
        System.out.println("Enter value in millimeter:"+sc.getMm()+"Mm");
        System.out.println("Enter value in decimeter:"+sc.getDm()+"Dm");

        sc.close();

    }
}




