
package Data;

import java.util.Date;

//se agrega de Usuario
public class Formulario extends Usuario {
    //Atributos
    public String email;
    public String rama_Derecho;
    public String hechos;
    public String [] documentos; //un array con listado enunciado de documentos que puede presentar
    public Usuario  usuario; 
    
    //Métodos
    //Métodos Constructor

    public Formulario(String email, String rama_Derecho, String hechos, String[] documentos, boolean recursos_económcos, int estrato, String ocupación, String tipo_De_Vinculación, boolean pertenece_A_Sisben, String lugar_Nacimiento, String estado_civil, int num_contacto, String dirección_residencia, String barrio, String dirección_Trabajo, int ingreso, String grado_escolaridad, String nombre, String primer_apellido, String segundo_apellido, Date fecha_nacimiento, int IdPersona) {
        super(recursos_económcos, estrato, ocupación, tipo_De_Vinculación, pertenece_A_Sisben, lugar_Nacimiento, estado_civil, num_contacto, dirección_residencia, barrio, dirección_Trabajo, ingreso, grado_escolaridad, nombre, primer_apellido, segundo_apellido, fecha_nacimiento, IdPersona);
        this.email = email;
        this.rama_Derecho = rama_Derecho;
        this.hechos = hechos;
        this.documentos = documentos;
    }
    
    
    //Métodos GET
    
    public String getEmail() {
        return email;
    }

    public String getRama_Derecho() {
        return rama_Derecho;
    }

    public String getHechos() {
        return hechos;
    }

    public String[] getDocumentos() {
        return documentos;
    }

    public Usuario getUsuario() {
        return usuario;
    }
    
    

    //Métodos SET
    
    public void setEmail(String email) {
        this.email = email;
    }

    public void setRama_Derecho(String rama_Derecho) {
        this.rama_Derecho = rama_Derecho;
    }

    public void setHechos(String hechos) {
        this.hechos = hechos;
    }

    public void setDocumentos(String[] documentos) {
        this.documentos = documentos;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    //Métodos Abstractos

    

    

    
}
