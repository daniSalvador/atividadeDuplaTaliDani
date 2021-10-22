package View;

// Crie um sistema de cadastro de Produtos e Categorias.
//_  O Produto deve possuir Categoria como atributo.
//_  O sistema deve utilizar o padrão de arquitetura MVC
//_  Os modelos devem possuir um id e outros atributos públicos de sua escolha.
//_  As controllers devem possuir os quatro métodos de CRUD e deve utilizar um ArrayList
// privado para manter os dados. (Utilize o conceito de Generics nas Controllers)
//_  A view deve testar as operações de CRUD para cada controller.
//_  A view deve possuir um menu para que o usuário escolha as opções de CRUD.

import Controller.CategoriaController;
import Controller.ProdutoController;
import Model.Categoria;
import Model.Produto;
import java.util.Scanner;

public class Main {
    private static ProdutoController proController = new ProdutoController();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        CategoriaController catController = new CategoriaController();


        boolean resposta = true;
        char resposta_continua = 's';
        do {
            Escolha();
            System.out.println("Digite S para continuar e N para sair: ");
            resposta_continua = sc.nextLine().charAt(0);
            if (resposta_continua == 'n') {
                resposta = false;
            }
            else if (resposta_continua != 's'){
                System.out.println("Opção invalida! Digite novamente!");
            }
        }while (resposta);

    }
    public static String mensagem(String mensagem){
        System.out.println(mensagem);
        Scanner sc = new Scanner(System.in);
        String infoProduto = sc.nextLine();
        return infoProduto;
    }
    public static int Menu(){
        System.out.println("============CADASTRO DE PRODUTOS==================");
        System.out.println("|1|LISTAR   |2|CADASTRAR  |3|ATUALIZAR  |4|DELETAR");
        System.out.println("--------------------------------------------------");
        System.out.println("ECOLHA A OPÇÃO DESEJADA: ");
        Scanner sc = new Scanner(System.in);
        int opcao = sc.nextInt();
        sc.nextLine();
        return opcao;

    }
    public static void Cadastro(){
        Produto pro = new Produto();
        pro.id = mensagem("ID: ");
        pro.pao = mensagem("PAO: ");
        pro.bebida = mensagem("BEBIDA: ");
        pro.carne = mensagem("CARNE: ");
        pro.categoria.id = mensagem("ID: ");
        pro.categoria.higiene = mensagem("HIGIENE: ");
        pro.categoria.alimento = mensagem("ALIMENTO: ");
        pro.categoria.frios = mensagem("FRIOS: ");
        proController.create(pro);
    }
    public static void Update(){
        Produto pro = new Produto();
        pro.id = mensagem("ID: ");
        pro.pao = mensagem("PAO: ");
        pro.bebida = mensagem("BEBIDA: ");
        pro.carne = mensagem("CARNE: ");
        pro.categoria.id = mensagem("ID: ");
        pro.categoria.higiene = mensagem("HIGIENE: ");
        pro.categoria.alimento = mensagem("ALIMENTO: ");
        pro.categoria.frios = mensagem("FRIOS: ");
        proController.update(pro);
    }

    public static void Delete(){
        Produto pro = new Produto();
        pro.id = mensagem("Digite o ID do produto: ");
        proController.delete(pro);
    }
    public static void Listar(){
        System.out.println(proController.read());
    }
    public static void Escolha(){
            int opcao = Menu();
            switch (opcao) {
                case 1:
                    System.out.println("-------------LISTAR-----------");
                    Listar();
                    break;
                case 2:
                    System.out.println("------------CADASTRAR---------");
                    Cadastro();
                    break;
                case 3:
                    System.out.println("------------ATUALIZAR---------");
                    Update();
                    break;
                case 4:
                    System.out.println("------------DELETE------------");
                    Delete();
                    break;
            }

    }


}