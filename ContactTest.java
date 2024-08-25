import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactTest {
    @Test
    public void testContactCreation() {
        Contact contact = new Contact("A1", "Jane", "Doe", "1234567890", "123 Main St");
        assertEquals("A1", contact.getContactId());
        assertEquals("Jane", contact.getFirstName());
        assertEquals("Doe", contact.getLastName());
        assertEquals("1234567890", contact.getPhone());
        assertEquals("123 Main St", contact.getAddress());
    }

    @Test
    public void testInvalidContactCreation() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("A12345678900", "Jane", "Doe", "1234567890", "123 Main St");
        });
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("A1", "Jane12345678900", "Doe", "1234567890", "123 Main St");
        });
    @Test
    public void testInvalidContactId() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(null, "Jane", "Doe", "1234567890", "123 Main St");
        });

        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("A12345678900", "Jane", "Doe", "1234567890", "123 Main St");
        });
    }

    @Test
    public void testInvalidFirstName() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("A1", null, "Doe", "1234567890", "123 Main St");
        });

        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("A1", "Jane12345678900", "Doe", "1234567890", "123 Main St");
        });
    }

    @Test
    public void testInvalidLastName() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("A1", "Jane", null, "1234567890", "123 Main St");
        });

        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("A1", "Jane", "Doe12345678900", "1234567890", "123 Main St");
        });
    }

    @Test
    public void testInvalidPhone() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("A1", "Jane", "Doe", null, "123 Main St");
        });

        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("A1", "Jane", "Doe", "12345", "123 Main St");
        });

        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("A1", "Jane", "Doe", "12345678900", "123 Main St");
        });

        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("A1", "Jane", "Doe", "abcdefghij", "123 Main St");
        });
    }

    @Test
    public void testInvalidAddress() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("A1", "Jane", "Doe", "1234567890", null);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("A1", "Jane", "Doe", "1234567890", "1234567890023456789012345678900");
        });
    }
}

    }
