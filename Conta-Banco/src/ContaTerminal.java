import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe scanner
        //Exibir as mensagens para o nosso usuário
        //Ober pela scanner os valores digitados no terminal
        //Exibir a mensagem conta criada 

                Scanner scanner = new Scanner(System.in);

                System.out.println("Por favor, digite o número da Agência !");
                int agencia = scanner.nextInt();

                System.out.println("Digite o numero da conta");
                int numero = scanner.nextInt();

                System.out.println("Digite o seu nome");
                String nomeCliente = scanner.next();

                System.out.println("Por favor, Digite o saldo da conta");
                double saldo = scanner.nextDouble();

                System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero +" e seu saldo " + saldo + " já está disponível para saque.");
                
                scanner.close();
    }
}
