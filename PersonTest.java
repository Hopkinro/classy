import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonTest {
    Person person;

    @BeforeEach
    void setUp() {
        person = new Person("Timmy", "Griffin", "65446", "Mr.", 1980);
    }

    @Test
    void testFullName() {
        assertEquals("Timmy Griffin", person.fullName());
    }

    @Test
    void testGetAge() {
        assertEquals(44, person.getAge(2024));
    }

    @Test
    void testToCSV() {
        assertEquals("Timmy,Griffin,65446,Mr.,1980", person.toCSV());
    }

}
