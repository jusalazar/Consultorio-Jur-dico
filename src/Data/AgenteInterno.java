
package Data;

public class AgenteInterno {
        
    //Atributos
    public String usuario;
    public String contraseña;
    public long IdPersonal;
    public boolean activo;
    //Métodos
    //Métodos Constructor

    public AgenteInterno(String usuario, String contraseña, long IdPersonal, boolean activo) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.IdPersonal = IdPersonal;
        this.activo = activo;
    }
      
    //Métodos GET
    
    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public long getIdPersonal() {
        return IdPersonal;
    }

    public boolean isActivo() {
        return activo;
    }
    
    //Métodos SET
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setIdPersonal(long IdPersonal) {
        this.IdPersonal = IdPersonal;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    //Métodos Abstractos

    
    
    
}
