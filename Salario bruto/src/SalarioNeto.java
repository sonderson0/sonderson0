
import javax.swing.JOptionPane;


public class SalarioNeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cedula,vinculacion,porcentaje,Impuesto,salarioBruto,salarioNeto;
        String mensaje;
        
        //Guarda la cedula
        cedula = Integer.parseInt(JOptionPane.showInputDialog("digite su cedula por favor"));
        salarioBruto = Integer.parseInt(JOptionPane.showInputDialog("Digite el salario básico del empleado"));
        vinculacion = Integer.parseInt(JOptionPane.showInputDialog("Digite el año de su vinculación a la empresa"));
        
        if((salarioBruto > 1200000) && (vinculacion > 1990)){
            //Se descuenta un 8% de su salario
            mensaje = "Se descuenta un 8% de tu salario";
            porcentaje = 8;
        }else if((salarioBruto < 550000) || (vinculacion == 1990)){
            mensaje = "Se descuenta un 2% de tu salario";
            porcentaje = 2;
        }else{
            mensaje = "Se descuenta un 5% de descuento";
            porcentaje = 5;
        }
        
        Impuesto = (salarioBruto * porcentaje) / 100;
        salarioNeto = salarioBruto - Impuesto;
        
        JOptionPane.showMessageDialog(null, " "+mensaje+" \n Nro cedula: "+cedula+"\n Salario Neto: "+salarioNeto);
    
    }
}
