
public class Generics {
    public static void main(String[] args) {
        int value = 5;

        // Number (Integer, Double, Float)

        // can set any element to values
        Container<Integer> obj = new Container<Integer>(value);
        Container<Double> obj2 = new Container<Double>(5.0002221);
        // Container<String> obj3 = new Container<String>("WEEE");
        obj.show();
        obj2.show();
        // obj3.show();

    }
}

// E - element
// T - type
class Container<T extends Number> {
    T value;

    public Container(T value) {
        this.value = value;
    }

    public void show() {
        System.out.println(value.getClass().getName());
    }
}