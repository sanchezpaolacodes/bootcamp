import java.util.Scanner;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao processo seletivo");
        System.out.println("Digite sua pretensao salarial:");
        double pretensaosalarial = scanner.nextDouble();

        analisarSalarioDoCandidato(pretensaosalarial);
    }
    public static void analisarSalarioDoCandidato(double pretensaoSalarial){
        double salarioBase = 9000;
        if(salarioBase > pretensaoSalarial){
            System.out.println("Em breve entraremos em contato");
        } else if (salarioBase == pretensaoSalarial) {
            System.out.println("Em breve entraremos em contato para informar nossa contra proposta");
        } else{
            System.out.println("Agradecemos pelo interesse, iremos analisar os demais candidatos");
        }
    }
}
