package decorator;

public class Main {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        System.out.println(component.operation());

        Component decorated = new ConcreteDecorator(component);
        System.out.println(decorated.operation());
    }
}