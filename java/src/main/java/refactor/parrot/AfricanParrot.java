package refactor.parrot;

public class AfricanParrot extends Parrot {
    private final int numberOfCoconuts;

    public AfricanParrot(int numberOfCoconuts) {
        this.numberOfCoconuts = numberOfCoconuts;
    }

    @Override
    public double getSpeed() {
        double speed = BASE_SPEED - numberOfCoconuts;
        return Math.max(0, speed);
    }
}
