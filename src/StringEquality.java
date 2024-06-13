import java.util.Scanner;

public class StringEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um nome: ");
        String nome = scanner.nextLine();
        
        if (nome.equals("Moe")) {
            System.out.println("Voce e o rei do rock and roll");
        } else {
            System.out.println("Voce nao e o rei");
        }
    }
}