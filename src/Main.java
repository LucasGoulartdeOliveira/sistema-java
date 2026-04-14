import model.Produto;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Produto> lista = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Aplicar desconto");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    sc.nextLine();

                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Preço: ");
                    double preco = sc.nextDouble();

                    System.out.print("Quantidade: ");
                    int qtd = sc.nextInt();

                    sc.nextLine();
                    System.out.print("Categoria: ");
                    String cat = sc.nextLine();

                    Produto p = new Produto(nome, preco, qtd, cat);
                    lista.add(p);

                    System.out.println("Produto cadastrado!");
                    break;

                case 2:
                    for (Produto prod : lista) {
                        System.out.println("\n" + prod);
                    }
                    break;

                case 3:
                    System.out.print("Índice do produto: ");
                    int i = sc.nextInt();

                    System.out.print("Desconto (%): ");
                    double d = sc.nextDouble();

                    if (i >= 0 && i < lista.size()) {
                        lista.get(i).aplicarDesconto(d);
                        System.out.println("Desconto aplicado!");
                    } else {
                        System.out.println("Produto inválido!");
                    }
                    break;
            }

        } while (opcao != 0);

        sc.close();
    }
}