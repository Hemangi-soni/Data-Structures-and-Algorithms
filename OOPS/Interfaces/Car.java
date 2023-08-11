public class Car implements Engine, Media, Brake{

    @Override
    public void start() {
        System.out.println(" Engine should start");
    }

    @Override
    public void stop() {
        System.out.println(" Engine should stop");
    }

    @Override
    public void accelerate() {
        System.out.println(" Engine should accelerate");
    }

    @Override
    public void brake() {
        System.out.println(" Apply brake");
    }
    
}
