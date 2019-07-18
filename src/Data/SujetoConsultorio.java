
package Data;
import java.util.Date;


    //Atributos
    //Métodos
    //Métodos Constructor
    //Métodos GET
    //Métodos SET
    //Métodos Abstractos

public abstract class SujetoConsultorio {
    //Atributos
    public String nombre;
    public String primer_apellido;    
    public String segundo_apellido;
    public Date fecha_nacimiento;
    public int IdPersona;
    //Métodos
    //Métodos Constructor
    
    public SujetoConsultorio(String nombre, String primer_apellido, String segundo_apellido, Date fecha_nacimiento, int IdPersona) {
        this.nombre = nombre;
        this.primer_apellido = primer_apellido;
        this.segundo_apellido = segundo_apellido;
        this.fecha_nacimiento = fecha_nacimiento;
        this.IdPersona = IdPersona;
    }

    //Métodos GET
    public Date getFecha_nacimiento() {    
        return fecha_nacimiento;
    }
    public String getNombre() {
        return nombre;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public String getSegundo_apellido() {
        return segundo_apellido;
    }

    public int getIdPersona() {
        return IdPersona;
    }
    
    
    //Métodos SET
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public void setSegundo_apellido(String segundo_apellido) {
        this.segundo_apellido = segundo_apellido;
    }
    public void setFecha_nacimiento(Date fecha_nacimiento) {    
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public void setIdPersona(int IdPersona) {
        this.IdPersona = IdPersona;
    }
    
    //Métodos Abstractos

    
   }
