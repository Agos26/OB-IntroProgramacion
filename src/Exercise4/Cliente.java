
package Exercise4;

public class Cliente extends Person {
    private double credito;

    public Cliente() {
    }

    public Cliente(double credito, String nombre, int edad, String telefono) {
        super(nombre, edad, telefono);
        this.credito = credito;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    @Override
    public String toString() {
         return "Cliente {" + "nombre=" + getNombre() + ", edad=" + getEdad() + ", telefono=" + getTelefono() + ", credito= $" + credito +'}';
    }
    
    
    
}
