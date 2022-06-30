import com.sparta.reverse.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTestTest extends Main {

    Main main;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
         main = new Main();
    }
    @Test
    void reverseIntTest(){
        Assertions.assertEquals(1234, main.reverseInt(4321));
        Assertions.assertEquals(2345, main.reverseInt(5432));

    }

}