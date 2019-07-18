
package Data;

import java.util.Date;


public class Usuario extends SujetoConsultorio{
    //Atributos
    public boolean recursos_económcos;
    public int estrato;
    public String ocupación;
    public String tipo_De_Vinculación;
    public boolean pertenece_A_Sisben;
    public String lugar_Nacimiento;
    public String estado_civil;
    public int num_contacto;
    public String dirección_residencia;
    public String barrio;
    public String dirección_Trabajo;   
    public int ingreso;
    public String grado_escolaridad;
    
    //Métodos
    //Métodos Constructor

    public Usuario(boolean recursos_económcos, int estrato, String ocupación, String tipo_De_Vinculación, boolean pertenece_A_Sisben, String lugar_Nacimiento, String estado_civil, int num_contacto, String dirección_residencia, String barrio, String dirección_Trabajo, int ingreso, String grado_escolaridad, String nombre, String primer_apellido, String segundo_apellido, Date fecha_nacimiento, int IdPersona) {
        super(nombre, primer_apellido, segundo_apellido, fecha_nacimiento, IdPersona);
        this.recursos_económcos = recursos_económcos;
        this.estrato = estrato;
        this.ocupación = ocupación;
        this.tipo_De_Vinculación = tipo_De_Vinculación;
        this.pertenece_A_Sisben = pertenece_A_Sisben;
        this.lugar_Nacimiento = lugar_Nacimiento;
        this.estado_civil = estado_civil;
        this.num_contacto = num_contacto;
        this.dirección_residencia = dirección_residencia;
        this.barrio = barrio;
        this.dirección_Trabajo = dirección_Trabajo;
        this.ingreso = ingreso;
        this.grado_escolaridad = grado_escolaridad;
    }

    //Métodos GET
    public boolean getRecursos_económcos() {
        return recursos_económcos;
    }

    public int getEstrato() {
        return estrato;
    }

    public String getOcupación() {
        return ocupación;
    }

    public String getTipo_De_Vinculación() {
        return tipo_De_Vinculación;
    }

    public boolean getPertenece_A_Sisben() {
        return pertenece_A_Sisben;
    }

    public String getLugar_Nacimiento() {
        return lugar_Nacimiento;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public int getNum_contacto() {
        return num_contacto;
    }

    public String getDirección_residencia() {
        return dirección_residencia;
    }

    public String getBarrio() {
        return barrio;
    }

    public String getDirección_Trabajo() {
        return dirección_Trabajo;
    }

    public int getIngreso() {
        return ingreso;
    }

    public String getGrado_escolaridad() {
        return grado_escolaridad;
    }
    //Métodos SET
    
    public void setRecursos_económcos(boolean recursos_económcos) {
        this.recursos_económcos = recursos_económcos;
    }

    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }

    public void setOcupación(String ocupación) {
        this.ocupación = ocupación;
    }

    public void setTipo_De_Vinculación(String tipo_De_Vinculación) {
        this.tipo_De_Vinculación = tipo_De_Vinculación;
    }

    public void setPertenece_A_Sisben(boolean pertenece_A_Sisben) {
        this.pertenece_A_Sisben = pertenece_A_Sisben;
    }

    public void setLugar_Nacimiento(String lugar_Nacimiento) {
        this.lugar_Nacimiento = lugar_Nacimiento;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public void setNum_contacto(int num_contacto) {
        this.num_contacto = num_contacto;
    }

    public void setDirección_residencia(String dirección_residencia) {
        this.dirección_residencia = dirección_residencia;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public void setDirección_Trabajo(String dirección_Trabajo) {
        this.dirección_Trabajo = dirección_Trabajo;
    }

    public void setIngreso(int ingreso) {
        this.ingreso = ingreso;
    }

    public void setGrado_escolaridad(String grado_escolaridad) {
        this.grado_escolaridad = grado_escolaridad;
    }
    
    //Métodos Abstractos



}
