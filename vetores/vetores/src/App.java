import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nome = leia.nextLine();

        System.out.printf("O seu nome e: %s \n", nome);

        leia.close();
    }
}
