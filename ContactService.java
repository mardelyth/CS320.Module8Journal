import java.util.HashMap;
import java.util.Map;

public class ContactService {
    private Map<String, Contact> contacts = new HashMap<>();

    public void addContact(Contact contact) {
        if (contacts.containsKey(contact.getContactId())) {
            throw new IllegalArgumentException("Error: Contact ID must be unique");
        }
        contacts.put(contact.getContactId(), contact);
    }

    public void deleteContact(String contactId) {
        contacts.remove(contactId);
    }

    public void updateContact(String contactId, String firstName, String lastName, String phone, String address) {
        Contact contact = contacts.get(contactId);
        if (contact != null) {
            if (firstName != null) {
                contact.setFirstName(firstName);
            }
            if (lastName != null) {
                contact.setLastName(lastName);
            }
            if (phone != null) {
                contact.setPhone(phone);
            }
            if (address != null) {
                contact.setAddress(address);
            }
        }
    }

    public Contact getContactById(String contactId) {
        return contacts.get(contactId);
    }
}
