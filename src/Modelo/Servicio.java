package Modelo;

public class Servicio {
    
    private int idServicio;
    private String Descripcion;
    private int Precio;
    private String Tiempo;

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public String getTiempo() {
        return Tiempo;
    }

    public void setTiempo(String Tiempo) {
        this.Tiempo = Tiempo;
    }
}
