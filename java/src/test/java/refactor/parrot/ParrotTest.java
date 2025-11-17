package refactor.parrot;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ParrotTest {

    @Test
    void europeanParrotSpeed() {
        Parrot p = ParrotFactory.createParrot(new ParrotContext(ParrotType.EUROPEAN, 0, false, 0));
        assertEquals(12.0, p.getSpeed(), 0.0001);
    }

    @Test
    void africanParrotWithCoconuts() {
        Parrot p = ParrotFactory.createParrot(new ParrotContext(ParrotType.AFRICAN, 0, false, 3));
        assertEquals(Math.max(0, 12.0 - 3), p.getSpeed(), 0.0001);
    }

    @Test
    void norwegianBlueNailed() {
        Parrot p = ParrotFactory.createParrot(new ParrotContext(ParrotType.NORWEGIAN_BLUE, 1.5, true, 0));
        assertEquals(0.0, p.getSpeed(), 0.0001);
    }

    @Test
    void norwegianBlueNotNailedHighVoltage() {
        Parrot p = ParrotFactory.createParrot(new ParrotContext(ParrotType.NORWEGIAN_BLUE, 1.5, false, 0));
        assertEquals(Math.min(24.0, 1.5 * 12.0), p.getSpeed(), 0.0001);
    }
}
