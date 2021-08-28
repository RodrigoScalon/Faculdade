import java.util.Scanner;
public class caroUni {
    
    String nome, dia, destino, hora, localEncontro;
    int x;

    public caroUni(String nome, String dia, String destino, String hora, String localEncontro){

        this.nome = nome;
        this.dia = dia;
        this.destino = destino;
        this.hora = hora;
        this.localEncontro = localEncontro;

    }
    public void caroUni(){
    Scanner input = new Scanner(System.in); 

    System.out.printf ("O motorista %s na %s vai estar a caminho da %s!%n", this.nome, this.dia, this.destino);
    System.out.println("Deseja aceitar essa carona? (1)SIM e (2) NÃO");
    x=input.nextInt();
    
               while (x !=1 && x !=2) {
                System.out.printf("Digite uma opção válida!");
                x=input.nextInt();
               }       
               if (x==1) {
                System.out.printf ("Encontre-o às %s no %s!%n", this.hora, this.localEncontro);
               } 
               else {
                System.out.println("Aguarde mais caronas disponíveis na sua região!");
               } 

    input.close();
    
    }
}
