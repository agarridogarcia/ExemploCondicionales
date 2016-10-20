
package exempocondicionalessimples;

import javax.swing.JOptionPane;


public class ExempoCondicionalesSimples {

   
    public static void main(String[] args) {
        int a=Integer.parseInt(JOptionPane.showInputDialog("número"));
        int b=Integer.parseInt(JOptionPane.showInputDialog("número"));
        Metodos simple= new Metodos();
        //simple.comparar(a, b);
        //simple.compararDoble(a, b);
        // simple.compararAnidado(a, b);
        simple.comparaOperador(a, b);
    }
        
    
    
}
