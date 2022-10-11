package ObjectOrientedJava.Interface;

public class MyCar implements engine,media {
    engine engine ;
    @Override
    public void start() {
        engine = new powerEngine();
    }

    @Override
    public void stop() {

    }

    @Override
    public void acc() {

    }
}
