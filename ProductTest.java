import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductTest {
    Product product;

    @BeforeEach
    void setUp() {
        product = new Product("Laptop", "Gaming laptop", "rtx4080", 2300.00);
    }

    @Test
    void testToCSV() {
        assertEquals("Laptop,Gaming laptop,rtx4080,2300.0", product.toCSV());
    }
}

