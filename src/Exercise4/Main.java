
package Exercise4;

public class Main {

   
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(500d, "Agostina", 25, "2615263");
        System.out.println(cliente1.toString());
        
        Person trabajador = new Trabajador(50000,"Franco",28,"26513543");
        System.out.println(trabajador.toString());
        
        
    }
    
}
