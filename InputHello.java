import java.util.Scanner;

public class InputHello {
    public static void main(String[] args) {
        Scanner kenalan = new Scanner(System.in);
        System.out.print("Siapa namanya? ");
        String nama = kenalan.nextLine();
        System.out.print("Dimana rumahnya? ");
        String rumah = kenalan.nextLine();
        System.out.print("Haloo " + nama + " dari "+ rumah);

    }
}
