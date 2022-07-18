
package Exercise4;


public class Trabajador extends Person {
    
        private int salario;

        public Trabajador() {
        }

        public Trabajador(int salario, String nombre, int edad, String telefono) {
            super(nombre, edad, telefono);
            this.salario = salario;
        }

        public int getSalario() {
            return salario;
        }

        public void setSalario(int salario) {
            this.salario = salario;
        }

        @Override
        public String toString() {
            return "Trabajador {" + "nombre=" + getNombre() + ", edad=" + getEdad() + ", telefono=" + getTelefono() + ", salario= $" + salario +'}'; 
        }
       
    
    }


    

