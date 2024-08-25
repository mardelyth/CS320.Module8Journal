import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {
    @Test
    public void testAddContact() {
        ContactService contactService = new ContactService();
        Contact contact = new Contact("A1", "Jane", "Doe", "1234567890", "123 Main St");
        contactService.addContact(contact);

        assertNotNull(contactService.getContactById("A1"));
    }

    @Test
    public void testUpdateContact() {
        ContactService contactService = new ContactService();
        Contact contact = new Contact("A1", "Jane", "Doe", "1234567890", "123 Main St");
        contactService.addContact(contact);

        contactService.updateContact("A1", "Dave", "Smith", "0987654321", "456 Main St");

        Contact updatedContact = contactService.getContactById("A1");
        assertEquals("Dave", updatedContact.getFirstName());
        assertEquals("Smith", updatedContact.getLastName());
        assertEquals("0987654321", updatedContact.getPhone());
        assertEquals("456 Main St", updatedContact.getAddress());
    }

    @Test
    public void testDeleteContact() {
        ContactService contactService = new ContactService();
        Contact contact = new Contact("A1", "Jane", "Doe", "1234567890", "123 Main St");
        contactService.addContact(contact);

        contactService.deleteContact("A1");
        assertNull(contactService.getContactById("A1"));
    }
}
