package sample;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MethodTest extends Method{

    @Test
    void upField() {
        Method method = new Method();
        String actual = method.UpField("1", "2");
        assertEquals("2", actual);
    }}