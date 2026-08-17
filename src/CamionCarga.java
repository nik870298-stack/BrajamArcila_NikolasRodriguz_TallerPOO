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

    public void calcularPrecioFinal(){
        System.out.println("26.000.000");
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
