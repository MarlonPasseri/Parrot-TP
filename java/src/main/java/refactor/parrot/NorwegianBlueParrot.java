package refactor.parrot;

public class NorwegianBlueParrot extends Parrot {
    private final double voltage;
    private final boolean isNailed;
    private static final double MAX_SPEED = 24.0;

    public NorwegianBlueParrot(double voltage, boolean isNailed) {
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    @Override
    public double getSpeed() {
        if (isNailed) {
            return 0.0;
        }
        double speed = voltage * BASE_SPEED;
        return Math.min(MAX_SPEED, speed);
    }
}
