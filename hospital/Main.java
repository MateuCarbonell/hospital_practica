package hospital;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        //Cuando escojas la opción 2 se pedirá por teclado los datos del paciente 1 y el resto de 
        //pacientes se crearán automáticamente(sin pedirlos por teclado) utilizando su constructor  y añadiendo los siguientes valores:   
        //Paciente2: 2 (Código),  nombrePaciente2 (Nombre), apellidoPaciente2(Apellidos)   Paciente3: 3 (Código),  nombrePaciente3 (Nombre), apellidoPaciente3 (Apellidos)

        // PARA HACER ESTO HEMOS DE CREAR EL PRIMER PACIENTE EN BASE A VARIABLES, Y LUEGO USAR ESAS VARIABLES EN EL CONSTRUCTOR PARA LOS PROXIMOS PACIENTES.

        System.out.println("1. Inicializar valores");
        System.out.println("2. Pacientes");
        System.out.println("3. Medicos");
        System.out.println("4. Visitas");
        System.out.println("5. Imprimir visitas");
        System.out.println("6. Imprimir total de visitas por tipos");
        System.out.println("7. Salir");

        Scanner opc = new Scanner(System.in);
        int opcion = opc.nextInt();

        switch (opcion) {
            case 1:
                
                break;
                case 2:
                Scanner datosP = new Scanner(System.in);
                System.out.println("Inserte nombre");
                String nombre = datosP.nextLine();
                System.out.println("Apellido paciente");
                String apellido = datosP.nextLine();
                
                Paciente paciente1 = new Paciente("1",nombre, apellido);
                Paciente paciente2 = new Paciente("2","Joan","Alcover");
                Paciente paciente3 = new Paciente("3","Mateu","Carbonell");


                break;

                case 3:
                // Hacer un boolean para que el bucle (que se cambiará a un bucle while para que no pare hasta que sea correcto)
                // se pueda parar.
                boolean validacionCodigo = false;
                Scanner datosMedico = new Scanner(System.in);

                String codigoMedico = "";
                while(!validacionCodigo){
                    System.out.println("Codigo medico: ");
                    codigoMedico = datosMedico.nextLine();
                    try {
                        validacionCodigo = Utilidades.codigoValido(codigoMedico);
                        if (Utilidades.codigoValido(codigoMedico)) {
                            System.out.println("Codigo valido");
                        }
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                }

                System.out.println("Nombre medico: ");
                String nombreMedico = datosMedico.nextLine();
                System.out.println("DNI medico");
                String dniMedico = datosMedico.nextLine();

                System.out.println("Especialidad medico");
                System.out.println("Escoge 0 si la especialidad es medico de cabecera");
                System.out.println("Escoge 1 si la especialidad es Traumatologia");
                System.out.println("Escoge 2 si la especialidad es Digestivo");
                System.out.println("Escoge 3 si la especialidad es Ginecologia");
                int opcionEspecialidad = datosMedico.nextInt();

                Especialidad especialidadMedico = null;
                switch (opcionEspecialidad) {
                    case 0:
                        especialidadMedico = Especialidad.MCABECERA;
                        break;

                    case 1:
                        especialidadMedico = Especialidad.TRAUMATOLOGIA;
                        break;

                    case 2:
                        especialidadMedico = Especialidad.DIGESTIVO;
                        break;

                    case 3:
                        especialidadMedico = Especialidad.GINECOLOGIA;
                        break;

                    default:
                        break;
                } 

                Medico medico1 = new Medico(codigoMedico, nombreMedico, dniMedico, especialidadMedico);
                Medico medico2 = new Medico("DI0001","Marian","dni2",Especialidad.DIGESTIVO);
                Medico medico3 = new Medico("GI0002","Ana Paz","dni3",Especialidad.GINECOLOGIA);
                Medico medico4 = new Medico("TR0003","Pedro","dni4",Especialidad.TRAUMATOLOGIA);
                
                /*((APUNTE)) --> No se podrá comprobar si un objecto tiene el codigo valido llamandolo directamente ya que
                 el método codigoValido es estático, así que se ha de llamar a la clase directamente.
                if (Utilidades.codigoValido(medico2.getCodigo())) {
                    System.out.println("El código del médico es válido.");
                } else {
                    System.out.println("El código del médico no es válido.");
                }*/

                break;
                case 4:
                    

                break;
                case 5:
                
                break;
                case 6:
                
                break;
                case 7:
                
                break;
        
            default:
                break;
        }

    }
    
}
