import java.util.Scanner;

public class ContaTerminal{
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

System.out.println("Por favor, digite o número da Agência: ");
String agencia = teclado.nextLine();

System.out.println("Por favor, digite o número da conta:");
int numeroConta = teclado.nextInt();

System.out.println("Por favor, digite o nome do titular da conta: ");
String nomeTitular = teclado.nextLine();
teclado.nextLine();

System.out.println("Por favor, digite o saldo da conta: ");
double saldo = teclado.nextDouble();

System.out.println("Olá, " + nomeTitular + "obrigado por criar uma conta em nosso branco, sua agência é " + agencia + " e o número da sua conta é " + numeroConta + ". e Seu saldo R$ " + saldo + " já está disponive para saque");
}
}