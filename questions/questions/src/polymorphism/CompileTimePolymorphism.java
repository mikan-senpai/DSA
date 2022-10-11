package polymorphism;

public class CompileTimePolymorphism {
    // In this program, we will see how multiple functions are created with the same name,
// but the compiler decides which function to call easily at to compile time itself.
    // 1st method with name add
    public int add(int x, int y) {
        return x + y;
    }

    // 2nd method with name add
    public int add(int x, int y, int z) {
        return x + y + z;
    }

    // 3rd method with name add
    public int add(double x, int y) {
        return (int) x + y;
    }

    // 4th method with name add
    public int add(int x, double y) {
        return x + (int) y;
    }
}

class Test {
    public static void main(String[] args) {
        CompileTimePolymorphism demo = new CompileTimePolymorphism();
        // In the below statement, the Compiler looks at the argument types and decides to call method 1
        System.out.println(demo.add(2, 3));
        // Similarly, in the below statement, the compiler calls method 2
        System.out.println(demo.add(2, 3, 4));
        // Similarly, in the below statement, the compiler calls method 4
        System.out.println(demo.add(2, 3.4));
        // Similarly, in the below statement, the compiler calls method 3
        System.out.println(demo.add(2.5, 3));
    }
}
