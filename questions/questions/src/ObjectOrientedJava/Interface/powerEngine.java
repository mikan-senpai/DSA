package ObjectOrientedJava.Interface;

public class powerEngine implements engine {
    @Override
    public void start() {
        System.out.println("power engin starts");
    }

    @Override
    public void stop() {
        System.out.println("power engine stops");
    }

    @Override
    public void acc() {
        System.out.println("power engine accelerating begins");
    }
}
