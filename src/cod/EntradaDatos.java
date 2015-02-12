
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
     * introducir número por pantalla o por cuadrado.
     * @param num si num=0, introduces por pantalla, si numn=1, introduces por cuadrado.
     * @return op devuelve un número.
     */
    public static int introducir(int num){
        Scanner dato=new Scanner(System.in);
        int op=0;
               
        switch(num){
            case 0: op=dato.nextInt();
                System.out.println(op);
                break;
            case 1: op=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
                JOptionPane.showMessageDialog(null, op);
                break;
            default: op=0;
                break;
                       
        }
        return op;
    }
}
