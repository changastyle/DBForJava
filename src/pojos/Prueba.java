package pojos;

import java.util.Date;

public class Prueba
{
    private int id;
    private String nombre;
    private boolean binario;
    private java.util.Date fecha;
    
    /*GYS*/

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public boolean isBinario()
    {
        return binario;
    }

    public void setBinario(boolean binario)
    {
        this.binario = binario;
    }

    public Date getFecha()
    {
        return fecha;
    }

    public void setFecha(Date fecha)
    {
        this.fecha = fecha;
    }

    @Override
    public String toString()
    {
        return "Prueba{" + "id=" + id + ", nombre=" + nombre + ", binario=" + binario + ", fecha=" + fecha + '}';
    }
    
    
    
}
