
package metodosxenericos;


public class Instrumento extends MetodosXenericos{
    String marca,tipo;
    int noUnidad;
   
    public Instrumento(String marca, String tipo, int noUnidad) {
        this.marca = marca;
        this.tipo = tipo;
        this.noUnidad = noUnidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNoUnidad() {
        return noUnidad;
    }

    public void setNoUnidad(int noUnidad) {
        this.noUnidad = noUnidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Instrumento{" + "marca=" + marca + ", tipo=" + tipo + ", noUnidad=" + noUnidad + '}';
    }
    
}
