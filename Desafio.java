import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {

        System.out.println("Desafio Curso Git!");

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = sc.next();

        System.out.print("Digite o seu sobrenome: ");
        String sobreNome = sc.next();

        System.out.println("Bem vindo ao curso de git " + nome + " " + sobreNome + "!");

        sc.close();
    }
}