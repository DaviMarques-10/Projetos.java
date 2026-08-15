import java.util.Scanner;
  class Cofr {
  int senha = 1234;
  int y = 3;

  void checarSenha() {
    System.out.println("Coloque sua senha:");
    while(y > 0) {
    Scanner teclado = new Scanner(System.in);
    int r = teclado.nextInt();
    if(senha == r){
    System.out.println("senha correta");
    break;
     }else{
     System.out.println("senha incorreta");
     }
    y--;
    System.out.println("Voce tem " + (y) + " tentativas");
    }
   }
  }

 public class Cofre {
   public static void main(String[] args) {
   Cofr c1 = new Cofr();
   c1.checarSenha();
  }
 }
