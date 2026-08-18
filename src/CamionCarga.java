public class CamionCarga extends Vehiculo {
    private double capacidadToneladas;

    public CamionCarga() {
    }

    public CamionCarga(String placa, String marca, String modelo, int año, double precioBase, double capacidadToneladas) {
        super(placa, marca, modelo, año, precioBase);
        this.capacidadToneladas = capacidadToneladas;
    }

    public double getCapacidadToneladas() {
        return capacidadToneladas;
    }

    public void setCapacidadToneladas(double capacidadToneladas) {
        this.capacidadToneladas = capacidadToneladas;
    }

    @Override
    public double calcularPrecioFinal(){
        double b = 26000000;
        return b;
    }

    @Override
    public String mostrarFicha() {
        return super.mostrarFicha() + "\nTipo: Camion de Carga | Capacidad de Toneladas: " + capacidadToneladas + "\n";
    }


    @Override
    public String toString() {
        return "CamionCarga{" +
                "capacidadToneladas=" + capacidadToneladas +
                ", placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año=" + año +
                ", precioBase=" + precioBase +
                '}';
    }

}
