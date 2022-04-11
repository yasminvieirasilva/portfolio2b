package yasmin;

import javax.swing.JOptionPane;


public class Yasmin {

    public static void main(String[] args) {
       String nome = JOptionPane.showInputDialog("Digite seu nome");
       JOptionPane.showMessageDialog(null, "Bem vindo, "+  nome);
       String idade = JOptionPane.showInputDialog("digite a sua idade");
       String msg = "Que legal " +nome+", você tem " +idade+ " anos";
       JOptionPane.showMessageDialog(null,msg);
       String r1 = JOptionPane.showInputDialog("Qual o contrario de papelada");
       if(r1.equals("pavestida")){
          JOptionPane.showMessageDialog(null,"Acertou");
       }
       else{ 
           JOptionPane.showMessageDialog(null,"Errou");
       }
       String poder = JOptionPane.showInputDialog("Qual poder você gostaria de ter?");
       String pd = "Nossa que demais " +nome; 
       JOptionPane.showMessageDialog(null,pd);
       String coraline = JOptionPane.showInputDialog("No filme Coraline e o Mundo Secreto qual o nome da outra mãe da Coraline?");
       if(coraline.equals("Bela Dama")||coraline.equals("bela dama")){
           JOptionPane.showMessageDialog(null,"Acertou");
       }
       else{
           JOptionPane.showMessageDialog(null,"Errado");
       }
    }
    
}

