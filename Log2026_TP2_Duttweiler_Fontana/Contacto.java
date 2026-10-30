
/**
 * Write a description of class Contacto here.
 * 
 * @author Duttweiler Fontana 
 * @version (a version number or a date)
 */
public class Contacto
{
    private String nombre;
    private String localidad;
    private String direccion;
    
    private String[] telefono;

public Contacto(String nombre,String localidad,String direccion,String telefono){
    
    this.telefono=new String[5];
    this.nombre=nombre.toUpperCase();
    this.localidad=localidad.toUpperCase();
    this.direccion=direccion.toUpperCase();
}

 
public String getnombre(){return this.nombre;}
public void setnombre(String nombre){this.nombre=nombre.toUpperCase();}

public String getlocalidad(){return this.localidad;}
public void setlocalidad(String localidad){this.localidad=localidad.toUpperCase();}

public String getDireccion(){return this.direccion;}
public void setDireccion(String direccion){this.direccion=direccion.toUpperCase();}

public String[] gettelefono(){return this.telefono;}
public void setTelefono(String[] telefono){this.telefono=telefono;}

public void agregarTelefono(){}
public void agregarTelefono(String caracteristica, int numero){}
public void modificarTelefono(){}
public void eliminarTelefono(){}
public void listarTelefono(){}
public int elementoVacio(){return 0;}
public boolean validarPosicion (int p){
    return true;
}
public boolean validarCaracteristica(String c){return true;}
public boolean validarNumero(int n){return true;}
}




