
import java.util.Scanner;
public class Main//Declaração da classe
{
    public static void main(String[] args) {
        Scanner bofao = new Scanner(System.in);
        System.out.println("Digite a primeira nota!");
        double nota1 = bofao.nextDouble();
        System.out.println("Digite a segunda nota!");
        double nota2 = bofao.nextDouble();
        System.out.println("Digite a terceira nota!");
        double nota3 = bofao.nextDouble();
        System.out.println("Digite a quarta nota!");
        double nota4 = bofao.nextDouble()
        double media = calcMedia(nota1, nota2, nota3, nota4);
        if(aprovado(media) == true){
                                    
            System.out.println("O aluno foi aprovado com média "+media);
        }
        else{//Senão
            System.out.println("O aluno foi reprovado com média "+media);
        }
    }
 
    public static double calcMedia(double a, double b, double c, double d){
        return (a+b+c+d)/4;
    }
    
            return true;
        }
        else{
            return false;
        }
    }
}