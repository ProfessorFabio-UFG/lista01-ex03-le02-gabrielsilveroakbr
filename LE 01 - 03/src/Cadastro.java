import java.util.Scanner;
public class Cadastro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //com isso a gente responder a questão 2.2 e 2.3 ao mesmo tempo
        int a = 0;
        System.out.println("Quanto moradores quer adicionar? ");
        a = sc.nextInt();
        sc.nextLine();
        Morador[] moradores = new Morador[a];
        String nome;
        String cpf;
        String celular;
        String dt_nascimento;
        String sexo;
        String bloco;
        int ap;
        int cod_acesso;
        for (int i = 0; i < a; i++) {
            System.out.println("Cadastro de morador: " + (i+a));
            System.out.println("Nome: ");
            nome = sc.nextLine();
            System.out.println("Cpf: ");
            cpf = sc.nextLine();
            System.out.println("Celular: ");
            celular = sc.nextLine();
            System.out.println("Data de Nascimento: ");
            dt_nascimento = sc.nextLine();
            System.out.println("Sexo: ");
            sexo = sc.nextLine();
            System.out.println("Bloco: ");
            bloco = sc.nextLine();
            System.out.println("Apartamento: ");
            ap = sc.nextInt();
            sc.nextLine();
            System.out.println("Codigo Acesso: ");
            cod_acesso = sc.nextInt();
            moradores[i] = new Morador(nome,cpf,celular,dt_nascimento,sexo,bloco,ap,cod_acesso);
            sc.nextLine();
            System.out.println(moradores[i]);
        }
    }
}