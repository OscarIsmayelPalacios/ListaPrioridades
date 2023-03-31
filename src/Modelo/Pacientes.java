
package Modelo;


public class Pacientes implements Comparable<Pacientes> {
    
    String Apellidos;
    String Nombres;
    String Telefono;
    int gravedad;

    public Pacientes(String Apellidos, String Nombres, String Telefono, int gravedad) {
        this.Apellidos = Apellidos;
        this.Nombres = Nombres;
        this.Telefono = Telefono;
        this.gravedad = gravedad;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public int getGravedad() {
        return gravedad;
    }

    public void setGravedad(int gravedad) {
        this.gravedad = gravedad;
    }

    @Override
    public int compareTo(Pacientes o) {
        
        if(this.getGravedad()>o.getGravedad())
        {
            return 1;
        }else if (this.getGravedad()<o.getGravedad())
        {
            return -1;
        }else 
        {
            return 0;
        }
        
    
    }
    
}
