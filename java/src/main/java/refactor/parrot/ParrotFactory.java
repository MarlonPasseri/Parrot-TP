package refactor.parrot;

public class ParrotFactory {

    public static Parrot createParrot(ParrotContext ctx) {
        switch (ctx.type) {
            case EUROPEAN:
                return new EuropeanParrot();
            case AFRICAN:
                return new AfricanParrot(ctx.numberOfCoconuts);
            case NORWEGIAN_BLUE:
                return new NorwegianBlueParrot(ctx.voltage, ctx.isNailed);
            default:
                throw new IllegalArgumentException("Unknown parrot type: " + ctx.type);
        }
    }
}
