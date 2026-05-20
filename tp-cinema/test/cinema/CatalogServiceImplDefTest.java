package cinema;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.ReflectionAssertions.*;

public class CatalogServiceImplDefTest {

    @Test
    public void testDeclaredConstructor() {
        assertDeclaredConstructor("cinema.CatalogServiceImpl", new String[]{"java.lang.String"}, "missing constructor CatalogServiceImpl(String) in class CatalogServiceImpl");
    }
}
