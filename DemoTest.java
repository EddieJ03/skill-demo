import java.beans.Transient;

import static org.junit.Assert.*;
import org.junit.*;

public class DemoTest {
    @Test
    public void testSubtract() {
        assertEquals(10, Demo.subtract(10, 10));
    }
}
