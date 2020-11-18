package prestamobanco;
import javax.swing.JOptionPane;

public class Prestamobanco {

   
    public static void main(String[] args) {
       
        String nombre,apellido;
        int dni,sueldomensual,cuotas,prestamo,montocuotas;
        cuotas=0;
        boolean otorgado = false;
         
        
        nombre = JOptionPane.showInputDialog("Ingresar nombre:  ");
        apellido=JOptionPane.showInputDialog("Ingresar apellido:  ");
        dni = Integer.parseInt(JOptionPane.showInputDialog("Ingresar dni:"));
        sueldomensual = Integer.parseInt(JOptionPane.showInputDialog("Ingresar sueldo mensual:"));
        prestamo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto solicitado: "));
        cuotas = Integer.parseInt(JOptionPane.showInputDialog("Ingresar cuota:"));
        
        
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de cuotas"));

            while (cuotas==0)
            if (opcion > 0 && opcion <= 12) {
                cuotas = opcion;
            } else {
                JOptionPane.showMessageDialog(null, "Las cuotas deben estar comprendida entre 1 y 12 \nVuelva a intertarlo");
            }

        
         if (prestamo>200000){
            JOptionPane.showMessageDialog(null, "El banco solo puede dar hasta 200000 pesos disculpe");
            }
          
          if (200000 < (sueldomensual * 12)) {

            int montoPrestamo = sueldomensual * 10;
            if (prestamo <= montoPrestamo) {

                montocuotas = prestamo / cuotas;
                otorgado = true;

                datosUsuario(nombre,apellido, dni, sueldomensual);
                datosPrestamo(prestamo, montocuotas, cuotas);
                validaOtorgado(otorgado);
            }
        
             } else {
            otorgado = false;
            validaOtorgado(otorgado);

        }

    }
    
    public static void datosUsuario(String nombre,String apellido,int dni,int sueldomensual){
            System.out.println("==========BANCO BBVA=================");
            System.out.println("Cliente: " + nombre +"\napellido: " +apellido+ "\nDNI: " + dni + "\nSueldomensual "+ sueldomensual);
            
             }
        public static void datosPrestamo(int prestamo,int montoCuotas,int cuotas){
            System.out.println("Monto solicitado: "+prestamo+ "\nCuotas a Pagar: "+montoCuotas+ "\nCantidad de Cuotas: "+cuotas);
                   
        }
        
        public static void validaOtorgado(boolean otorgado){
        if (otorgado){
            System.out.println("Prestamo APROBADO");
            
        }else{
            JOptionPane.showMessageDialog(null,"No se puede otorgar el prestamo por excedente \nDEDEGADO");
        }
        
}

    
}
