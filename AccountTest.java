import java.util.Scanner;

public class AccountTest 
{

    public static void main(String[] args) {
     
        Scanner input = new Scanner (System.in);

        Account myAccount = new Account(); //cria um objeto Acccount e o atribui em myAccount

        System.out.printf("Initial name is: %s%n%n", myAccount.getName()); //exibe o valor inicial do nome (null)

        System.out.println("Please enter the name: "); //solicita e le o nome
        String theName = input.nextLine(); //le uma linha de texto
        myAccount.setName(theName); //insere theName em Account
        System.out.println(); //gera saida de uma linha em branco

        System.out.printf ("Name in objetc myAccount is: %n%s%n", myAccount.getName()); //exibe o armazenamento no objeto myAccount


        input.close();

 }


}
