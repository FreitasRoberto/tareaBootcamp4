public class Main {
    public static void main(String[] args) {
        Trabajador trabajador = new Trabajador();
        trabajador.laEdad = 28;
        trabajador.elTelefono = 687264987;
        trabajador.elNombre = "Roberto";

    }

class Persona {
        int laEdad;
        int elTelefono;
        String elNombre;

}
class Cliente extends Persona {

        String credito;
        public Persona() {
            System.out.println("Valor Crédito");
        }

}
class Trabajador extends Persona {

        int salario;
        public Persona(){
            System.out.println("Salario del Trabajador");
        }
}

}