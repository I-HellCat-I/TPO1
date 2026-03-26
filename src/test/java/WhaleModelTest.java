import com.hellcat.domainModel.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WhaleModelTest {

    private Whale whale;

    @Test
    void testWhaleCreation_UnhappyAndConfused() {
        whale = new Whale(10.0);

        assertEquals(WhaleState.CONFUSED, whale.getState(), "Изначально кит не понимает, кто он.");
        assertEquals(10.0, whale.getTimeToLive());
    }

    @Test
    void testRealizeIdentity_EnoughTime_BecomesAwareWhale() {
        whale = new Whale(10.0);

        whale.tryToRealizeIdentity(5.0);

        assertEquals(WhaleState.AWARE_WHALE, whale.getState());
        assertEquals(5.0, whale.getTimeToLive());
    }

    @Test
    void testRealizeIdentity_NotEnoughTime_DiesBeforeKnowing() {
        whale = new Whale(2.0);

        whale.tryToRealizeIdentity(5.0);

        assertEquals(WhaleState.DEAD, whale.getState(), "Кит должен был перестать быть китом.");
        assertTrue(whale.getTimeToLive() <= 0, "Время жизни должно исчерпаться.");
    }

    @Test
    void testFullBookScenario_AwareThenDead() {
        whale = new Whale(10.0);

        whale.tryToRealizeIdentity(8.0);
        assertEquals(WhaleState.AWARE_WHALE, whale.getState(), "Успел понять, что он кит.");
        assertEquals(2.0, whale.getTimeToLive());

        whale.tryToRealizeIdentity(3.0);

        assertEquals(WhaleState.DEAD, whale.getState(), "Больше не кит.");
        assertEquals(0.0, whale.getTimeToLive(), "Время вышло.");
    }

    @Test
    void testDeadWhaleCannotRealizeAnything() {
        whale = new Whale(0.0); // Изначально мертв
        whale.setEnvironment(Environment.OCEAN);
        whale.die();

        whale.tryToRealizeIdentity(10.0);

        assertEquals(WhaleState.DEAD, whale.getState(), "Мертвый кит не может менять состояние.");
    }

    @Test
    void testWhaleWithIQBeingAbleToNotRealize() {
        whale = new Whale(10.0, 9);
        whale.tryToRealizeIdentity( 9.0);

        assertEquals(WhaleState.CONFUSED, whale.getState(), "Глупый кит не быстро поймёт кто он.");
    }

    @Test
    void testWhaleInTheOcean() {
        whale = new Whale(10.0);
        whale.setEnvironment(Environment.OCEAN);

        whale.tryToRealizeIdentity(10.0);

        assertEquals(WhaleState.AWARE_WHALE, whale.getState(), "В океане кит живёт и может себя осознать.");
    }


    @Test
    void testDumbWhaleInTheOcean() {
        whale = new Whale(1.0, 9);
        whale.setEnvironment(Environment.OCEAN);

        whale.tryToRealizeIdentity(1.0);

        assertEquals(WhaleState.CONFUSED, whale.getState(), "Глупый кит может себя не осознать не сразу даже в океане.");
    }
}