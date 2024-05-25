import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        //Exibir as mensagens para o nosso usuário e obter pela scanner os valores digitados no terminal
        System.out.println("Por favor, digite seu nome completo!");
        String nome = scanner.next();
        String sobrenome = scanner.next();

        System.out.println("Digite o número da agência.");
        String agencia = scanner.next();

        System.out.println("Agora digite o número da sua conta.");
        int conta = scanner.nextInt();

        System.out.println("Qual o valor de depósito?");
        double saldo = scanner.nextDouble();

        //Exibir a mensagem conta criada
        System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo de R$ " + saldo + " já está disponível para saque.");
    }
}
