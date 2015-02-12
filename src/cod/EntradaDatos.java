
package cod;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class EntradaDatos {
    
    public int introducir(int num){
        Scanner dato=new Scanner(System.in);
        int op;
        op=Integer.parseInt(JOptionPane.showInputDialog("*******MENU*****\n")
                                                        +"0 para introducir por pantalla\n"
                                                        +"1 para introducir en cuadrado");        
        switch(op){
            case 0: num=dato.nextInt();
                System.out.println(num);
            case 1: num=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
                JOptionPane.showMessageDialog(null, num);
        }
        return num;
    }
}
