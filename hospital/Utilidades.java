package hospital;
import java.util.Date;

public class Utilidades {
    
    public static boolean mayorFecha(Date fecha){
        Date fechaActual = new Date(); // Creamos objeto fecha actual unicamente para compararla con la fecha visita
        return fecha.after(fechaActual);
    }

    public static double precioVisita(String tipoVisita, Especialidad especialidad,int PRECIO_MINIMO){
       
        if (tipoVisita.equals("CONSULTA") && Especialidad.DIGESTIVO.equals(especialidad)){
            PRECIO_MINIMO *= 1.15;
        }else if(tipoVisita.equals("REVISION")  && Especialidad.GINECOLOGIA.equals(especialidad)){
            PRECIO_MINIMO *= 1.10;
        }else if(tipoVisita.equals("RECETAS")){
            PRECIO_MINIMO *= 0.90;
        }else if(tipoVisita.equals("URGENCIA") && !Especialidad.MCABECERA.equals(especialidad)){
            PRECIO_MINIMO *= 1.50;
        }else{
            throw new IllegalArgumentException("El tipo de visita marcado no es correcto");
        }     
        return PRECIO_MINIMO; // Basamos todas las operaciones en el PRECIO MINIMO que de base es 50, y depende de las condiciones se va aumentando.
        }
    

        public static boolean codigoValido(String codigo)throws Exception{   // Se pone throws Exception para poder usar en el Else la nueva excepcion que hemos creado.
            // No es necesario hacer un condicional ya que con la expresion regular ya son 7 digitos obligatoriamente.
            String comprobador = "^(TR|DI|GI|MC)\\d{5}$"; // Primera parte para las  letras, luego se indica que habrá 5 digitos \\d{5} y después de eso terminará. $.
            if(codigo.matches(comprobador)){
                return true;
            }else{
                throw new Exception("Codigo no valido");
            }
        }

    }