package refactor.parrot;

public class ParrotContext {
    public final ParrotType type;
    public final double voltage;
    public final boolean isNailed;
    public final int numberOfCoconuts;

    public ParrotContext(ParrotType type, double voltage, boolean isNailed, int numberOfCoconuts) {
        this.type = type;
        this.voltage = voltage;
        this.isNailed = isNailed;
        this.numberOfCoconuts = numberOfCoconuts;
    }
}
