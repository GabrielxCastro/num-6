import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double r, area;

        System.out.println("Digite o raio");
        r = sc.nextDouble();

        area = Math.PI*Math.pow(r, 2);

        System.out.println("a area é " + area);
    }
}
