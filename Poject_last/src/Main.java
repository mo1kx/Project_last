//Вызываем все паттерны, которые созданы в пакетах
public class Main {
    public static void main(String[] args) {
        // Adapter
        System.out.println("Adapter Pattern:");
        adapter.Main.main(args);

        // Decorator
        System.out.println("\nDecorator Pattern:");
        decorator.Main.main(args);

        // Composite
        System.out.println("\nComposite Pattern:");
        composite.Main.main(args);

        // Facade
        System.out.println("\nFacade Pattern:");
        facade.Main.main(args);

        // Proxy
        System.out.println("\nProxy Pattern:");
        proxy.Main.main(args);
    }
}
