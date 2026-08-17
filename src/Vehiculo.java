public abstract class Vehiculo {
    String placa;
    String marca;
    String modelo;
    int año;
    double precioBase;

    public Vehiculo() {
    }

    public Vehiculo(String placa, String marca, String modelo, int año, double precioBase) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.precioBase = precioBase;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }


    @Override
    public String toString() {
        return "Vehiculo{" +
                "placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año=" + año +
                ", precioBase=" + precioBase +
                '}';
    }

    public abstract double calcularPrecioFinal();

    public String mostrarFicha(){
        return "Placa: " + placa + "| Marca: " + marca + "| Modelo: " + modelo + "| Año: " + año + "| Precio Base: " + precioBase ;
    }
}

