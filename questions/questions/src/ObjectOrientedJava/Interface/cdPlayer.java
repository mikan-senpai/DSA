package ObjectOrientedJava.Interface;

public class cdPlayer implements media {
    @Override
    public void start() {
        System.out.println("music starts");
    }

    @Override
    public void stop() {
        System.out.println("music stops");
    }
}
