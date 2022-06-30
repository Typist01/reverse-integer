import com.sparta.reverse.Main;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class MainTestTest extends Main {

    Main main;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
         main = new Main();
    }

    @test
    void reverseIntTest(){
        Assertions.assertEquals(1234, main.reverseInt(4321));
    }

}