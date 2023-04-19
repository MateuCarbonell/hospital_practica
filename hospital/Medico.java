package hospital;


public class Medico {
    private String codigo;
    private String nombre;
    private String dni;
    private Especialidad especialidad;




public Medico(String codigo,String nombre, String dni, Especialidad especialidad){
    this.codigo = codigo;
    this.nombre = nombre;
    this.dni = dni;
    this.especialidad = especialidad;
}



public void setCodigo(String codigo) {
    this.codigo = codigo;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public void setDni(String dni) {
    this.dni = dni;
}


public void setEspecialidad(Especialidad especialidad) {
    this.especialidad = especialidad;
}


public String getCodigo() {
    return codigo;
}

public String getNombre() {
    return nombre;
}

public String getDni() {
    return dni;
}

public Especialidad getEspecialidad() {
    return especialidad;
}



@Override
public String toString() {
    return "Medico [codigo=" + codigo + ", nombre=" + nombre + ", dni=" + dni + ", especialidad=" + especialidad + "]";
}



}