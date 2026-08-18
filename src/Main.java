import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehiculo> inventario = new ArrayList<>();
        Scanner menu = new Scanner(System.in);
        agregarVehiculo(inventario, new Automovil("ABC123", "Mazda", "3", 2022, 35000000, 4, "Gasolina"));
        agregarVehiculo(inventario, new Automovil("EVO001", "Tesla", "Model 3", 2024, 120000000, 4, "Eléctrico"));
        agregarVehiculo(inventario, new Motocicleta("XYZ789", "Yamaha", "MT-07", 2023, 27000000, 689));
        agregarVehiculo(inventario, new Motocicleta("MOTO02", "Honda", "CB125F", 2021, 8000000, 125));
        agregarVehiculo(inventario, new CamionCarga("CAM456", "Kenworth", "T800", 2021, 150000000, 12.0));
        agregarVehiculo(inventario, new CamionCarga("TRK999", "Chevrolet", "FVR", 2020, 110000000, 8.5));

        int opcion = 0;

        do {
            System.out.println("\n=== SISTEMA DE GESTIÓN - AUTOMOTION S.A.S. ===");
            System.out.println("1. Lista del inventario");
            System.out.println("2. Ver valor total del inventario");
            System.out.println("3. Buscar vehículo por placa");
            System.out.println("4. Prueba de validación");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            if (menu.hasNextInt()) {
                opcion = menu.nextInt();
                menu.nextLine();
            } else {
                System.out.println("Opción inválida. Ingrese un número entre 1 y 5.");
                menu.nextLine();
                continue;
            }

            System.out.println();

            switch (opcion) {
                case 1:
                    System.out.println("--- Lista De Iventario ---");
                    listarInventario(inventario);
                    break;

                case 2:
                    double total = calcularValorTotalInventario(inventario);
                    System.out.println("=== Valor Total Del Inventario: $" + String.format("%,.0f", total) + " ===");
                    break;

                case 3:
                    System.out.print("Ingrese la placa a buscar: ");
                    String placaBuscada = menu.nextLine();
                    Vehiculo buscado = buscarPorPlaca(inventario, placaBuscada);
                    if (buscado != null) {
                        System.out.println("\nVehículo encontrado:");
                        System.out.println(buscado.mostrarFicha());
                        System.out.println("Precio final: $" + String.format("%,.0f", buscado.calcularPrecioFinal()));
                    } else {
                        System.out.println("No se encontró ningún vehículo con la placa: " + placaBuscada);
                    }
                    break;

                case 4:
                    System.out.println("--- PRUEBA DE VALIDACIÓN DE ENCAPSULAMIENTO ---");
                    try {
                        System.out.println("Intentando crear vehículo con año inválido (1800) y precio negativo (-500000)...");
                        Vehiculo invalido = new Automovil("ERR999", "Toyota", "Corolla", 1800, -500000, 4, "Gasolina");
                        agregarVehiculo(inventario, invalido);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Resultado: No se creó el vehículo debido a las validaciones.");
                    }
                    break;

                case 5:
                    System.out.println("¡Gracias por utilizar el sistema de AutoMotion S.A.S.!");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }

        } while (opcion != 5);

        menu.close();
    }

    public static void agregarVehiculo(ArrayList<Vehiculo> inventario, Vehiculo v) {
        if (v != null) {
            inventario.add(v);
        }
    }

    public static void listarInventario(ArrayList<Vehiculo> inventario) {
        for (Vehiculo v : inventario) {
            System.out.println(v.mostrarFicha() + "Precio final: " + String.format("%,.0f", v.calcularPrecioFinal())+ "\n");

        }
    }

    public static double calcularValorTotalInventario(ArrayList<Vehiculo> inventario) {
        double total = 0;
        for (Vehiculo v : inventario) {
            total += v.calcularPrecioFinal();
        }
        return total;
    }

    public static Vehiculo buscarPorPlaca(ArrayList<Vehiculo> inventario, String placa) {
        for (Vehiculo v : inventario) {
            if (v.getPlaca().equalsIgnoreCase(placa)) {
                return v;
            }
        }
        return null;
    }



}

