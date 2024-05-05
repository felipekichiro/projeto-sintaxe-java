package ContaBanco;

        //TODO: conhecer e importar a classe Scanner;

        // Exibir as mensagens para o nosso usuário;

        // Obter pela scanner os valores digitados no terminal;

        //Exibir a mensagem da conta criada;


        import java.util.Scanner;

        public class ContaTerminal {
                
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                
            // Solicitando e lendo os dados da conta bancária
                System.out.println("Por favor, digite o número da Agência:");
                    String agencia = scanner.nextLine();
                
                System.out.println("Por favor, digite o número da Conta:");
                    int numero = scanner.nextInt();
                    scanner.nextLine(); 
                
                System.out.println("Por favor, digite o nome do Cliente:");
                    String nomeCliente = scanner.nextLine();
                
                System.out.println("Por favor, digite o saldo da Conta:");
                    double saldo = scanner.nextDouble();
                
            // Exibindo mensagem com os dados da conta
                System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
                
                        
                    scanner.close();
            
            }
        }