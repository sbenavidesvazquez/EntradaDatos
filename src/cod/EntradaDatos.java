
package cod;

import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 * Esta clase es una librería para subir a github en el cual te hara introducir por pantalla o por cuadrado.
 * @author sbenavidesvazquez
 * @version 0.1
 */

public class EntradaDatos {
    /**
     * 
     * @param num
     * @return op
     */
    public int introducir(int num){
        Scanner dato=new Scanner(System.in);
        int op=0;
               
        switch(num){
            case 0: op=dato.nextInt();
                System.out.println(op);
            case 1: op=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
                JOptionPane.showMessageDialog(null, op);
            default: op=0;
                       
        }
        return op;
    }
}
