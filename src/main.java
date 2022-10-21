import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number;
        int ns;
        int nsnumb;
        System.out.println("В какой системе счисления число?");
        nsnumb = Integer.parseInt(sc.nextLine());
        System.out.println("Введите число: ");
        number = Long.parseLong(sc.nextLine(), nsnumb);
        System.out.println("Введите систему счисления: ");
        ns = sc.nextInt();
        System.out.println("Полученное число " + Long.toString(number, ns));

        }
    }

