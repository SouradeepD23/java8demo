package lambda;

interface Foo {
    void show(String str);
}

class Xyz implements Foo {
    @Override
    public void show(String str) {
        System.out.println(str + " from Xyz");
    }
}

public class LambdaMain {
    public static void main(String[] args) {

        /* Calling using implementation class object */
        Foo foo1 = new Xyz();
        foo1.show("Calling using implementation class object");

        /* Calling from ANONYMOUS OBJECT of Foo */
        Foo foo2 = new Foo() {
            @Override
            public void show(String str) {
                System.out.println("Calling from ANONYMOUS OBJECT of Foo");
            }
        };

        /* Called using Lambda Expression */
        Foo foo3 = str -> System.out.println("Called using Lambda Expression");

    }
}
