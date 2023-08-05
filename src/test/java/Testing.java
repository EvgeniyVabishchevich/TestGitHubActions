import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Testing {
    @org.junit.jupiter.api.Test
    public void testing() {
        Assertions.assertEquals(1, 1);
    }

    @Test
    public void testing2() {
        Assertions.assertEquals(1, 2);
    }
}
