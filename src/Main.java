public class Main {
    public static void main(String[] args) {
        DispositivoElectronico[] dispositivos = {
                new Laptop("Dell", "XPS 13", 1500.0, 16, 512, 1.2),
                new Desktop("HP", "Pavilion", 800.0, 8, 1024, "Mid"),
                new Smartphone("Apple", "iPhone 13", 999.0, "iOS", 12),
                new Tablet("Samsung", "Galaxy Tab", 600.0, "Android", 10.5),
                new Refrigerador("LG", "InstaView", 1200.0, 100, 450)
        };

        Menu menu = new Menu(dispositivos);
        menu.mostrarMenu();
    }
}

