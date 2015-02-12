
package cod;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class EntradaDatos {
    
    public int introducir(int num){
        Scanner dato=new Scanner(System.in);
        int op=0;
               
        switch(num){
            case 0: op=dato.nextInt();
                System.out.println(op);
            case 1: op=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
                JOptionPane.showMessageDialog(null, op);
        }
        return op;
    }
}
