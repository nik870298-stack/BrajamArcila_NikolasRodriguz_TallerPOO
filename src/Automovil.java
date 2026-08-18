public class Automovil extends Vehiculo{
    private int numeroPuertas;
    private String tipoCombustible;

    public Automovil() {
    }

    public Automovil(String placa, String marca, String modelo, int año, double precioBase, int numeroPuertas, String tipoCombustible) {
        super(placa, marca, modelo, año, precioBase);
        this.numeroPuertas = numeroPuertas;
        this.tipoCombustible = tipoCombustible;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "numeroPuertas=" + numeroPuertas +
                ", tipoCombustible='" + tipoCombustible + '\'' +
                '}';
    }

    @Override
    public double calcularPrecioFinal() {
        double a = 21000000 ;
        return a;
    }

    @Override
    public String mostrarFicha() {
        return super.mostrarFicha() + "\nTipo: Automovil | Numero de puertas: " + numeroPuertas + "| Tipo de Combustible: " + tipoCombustible+ "\n";
    }


}
