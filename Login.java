 import java.util.Scanner;

 class Usuario {
 private String nome;
 private int senha;

  boolean entrarNome;
  public void setNome(String nome) {
   if(nome.length() <= 10) {
    this.nome = nome;
    System.out.println("Nome valido!");
    entrarNome = true;
    }else {
    System.out.println("O nome deve ter menos de 10 caracteres");
    return;
   }
  }
  public String getNome(){
   return nome;
  }
  boolean entrarSenha;
  public void setSenha(int senha) {
  if(senha <= 9999 && senha >= 1000) {
   this.senha = senha;
   System.out.println("Senha valida!");
   entrarSenha = true;
  }else{
   System.out.println("A senha deve ter 4 digitos");
   return;
  }
 }
  public int getSenha(){
   return senha;
 }

  public void fazerLogin() {
   Scanner teclado = new Scanner(System.in);
   System.out.println("Quer entrar na sua conta ou criar uma?\n1-Criar uma conta\n2-Entrar na conta");
   int login = teclado.nextInt();
   if(login == 2) {
    while((nome == null) || (senha == 0)) {
     System.out.println("Voce deve ter um login");
     break;
     }
   boolean x;
   x = false;
   if(entrarSenha == true && entrarNome == true) {
    if(x == false) {
    System.out.println("Ok, iniciaremos o processo de login");
    teclado.nextLine();
    System.out.println("Coloque seu nome");
    String entrarContaNome = teclado.nextLine();
    if(entrarContaNome.equals(nome)){
      System.out.println("Nome correto");
      x = true;
     }else{
      System.out.println("Nome incorreto");
      }
     }
      boolean y;
      y = false;
      if(y == false) {
      System.out.println("Coloque sua senha");
      int entrarContaSenha = teclado.nextInt();
      if(entrarContaSenha == senha) {
      System.out.println("Senha correta");
      y = true;
      }else{
      System.out.println("Senha incorreta");
      }
     }
     if(y == true && x == true) {
      System.out.println("Acesso liberado");
     }
    }
   }
    if(login == 1) {
     if(entrarNome == true && entrarSenha == true) {
      System.out.println("Voce ja tem uma conta");
    }else{
     System.out.println("Vamos criar uma conta para vc");
     System.out.println("Escreva seu nome");
     String fzrNome = teclado.nextLine();
     teclado.nextLine();
     System.out.println("Agora vamos fazer sua senha");
     setNome(fzrNome);
     int fzrSenha = teclado.nextInt();
     setSenha(fzrSenha);
    }
   }
  }
 }
  public class Login{
  public static void main(String[] args) {
   Usuario u1 = new Usuario();
   Scanner teclado = new Scanner(System.in);
   System.out.println("Digite seu nome");
   String nome = teclado.nextLine();
   System.out.println("Digite sua senha");
   int senha = teclado.nextInt();
   u1.setNome(nome);
   u1.getNome();
   u1.setSenha(senha);
   u1.getSenha();
   if(nome != null && senha != 0) {
    System.out.println("CONTA CRIADA! APROVEITE!");
   }
   u1.fazerLogin();
  }
 }

