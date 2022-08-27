package primos;

import javax.swing.JOptionPane;

public class Primos {

    public static void main(String[] args) {
usaFor();
    }

    public static void usaFor() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
        for(int i = 0; i <= n; i++){
            int d = 0;
            for(int j = i;j > 0; j--){
            
  
                if (i % j == 0) {
                    d++;
                }
              
            }
            if (d == 2) {
                System.out.println(i);
            }
        }
    }
}

