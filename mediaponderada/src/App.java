import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        double nota1, nota2, peso1, peso2, mediaPonderada;

        System.out.print("Digite a nota da prova 1: ");
        nota1 = teclado.nextDouble();

        System.out.print("Digite a nota da prova 2: ");
        nota2 = teclado.nextDouble();

        System.out.print("Digite o peso da nota 1: ");
        peso1 = teclado.nextDouble();

        System.out.print("Digite o peso da nota 2: ");
        peso2 = teclado.nextDouble();

        mediaPonderada = (nota1 * peso1 + nota2 * peso2) / peso1 + peso2;
        
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Peso 1: " + peso1);
        System.out.println("Peso 2: " + peso2);
        System.out.println("Média Ponderada: " + mediaPonderada);

        teclado.close();

    }
}
