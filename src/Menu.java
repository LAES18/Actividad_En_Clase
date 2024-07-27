import java.util.Scanner;

public class Menu {
    private DispositivoElectronico[] dispositivos;

    public Menu(DispositivoElectronico[] dispositivos) {
        this.dispositivos = dispositivos;
    }

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Seleccione un dispositivo:");
            for (int i = 0; i < dispositivos.length; i++) {
                System.out.println((i + 1) + ". " + dispositivos[i].getMarca() + " " + dispositivos[i].getModelo());
            }
            System.out.println((dispositivos.length + 1) + ". Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            if (opcion == dispositivos.length + 1) {
                break;
            }

            if (opcion < 1 || opcion > dispositivos.length) {
                System.out.println("Opción inválida. Intente nuevamente.");
                continue;
            }

            DispositivoElectronico dispositivo = dispositivos[opcion - 1];
            System.out.println("Seleccione una funcionalidad:");
            System.out.println("1. Realizar Operación");
            System.out.println("2. Obtener Información");

            int accion = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (accion) {
                case 1:
                    System.out.println("Ingrese un parámetro para realizarOperación:");
                    String param1 = scanner.nextLine();
                    dispositivo.realizarOperacion(param1);
                    break;
                case 2:
                    System.out.println("Ingrese un parámetro para obtenerInformación:");
                    int param2 = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    String resultado = dispositivo.obtenerInformacion(param2);
                    System.out.println(resultado);
                    break;
                default:
                    System.out.println("Acción inválida. Intente nuevamente.");
            }
        }

        scanner.close();
    }
}

