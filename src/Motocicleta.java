public class Motocicleta extends Vehiculo{
    private int cilindraje;

    public Motocicleta() {
    }

    public Motocicleta(String placa, String marca, String modelo, int año, double precioBase, int cilindraje) {
        super(placa, marca, modelo, año, precioBase);
        this.cilindraje = cilindraje;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    @Override
    public double calcularPrecioFinal() {
        double c = 8700000;
        return c;
    }

    @Override
    public String mostrarFicha() {
        return super.mostrarFicha() + "\nTipo: Motocicleta | Cilindraje: " + cilindraje + "\n";
    }


    @Override
    public String toString() {
        return "Motocicleta{" +
                "cilindraje=" + cilindraje +
                ", placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año=" + año +
                ", precioBase=" + precioBase +
                '}';
    }

}
