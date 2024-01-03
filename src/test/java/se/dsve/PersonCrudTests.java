package se.dsve;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class PersonCrudTests {

    private PersonCrud personCrud;

    @BeforeEach
    public void setUp() {
        // TODO: Implement setup logic
        // Konfigurera mockobjektet
        personCrud = mock(PersonCrud.class);
    }

    @Test
    public void testAddPerson() {
        // TODO: Implement testAddPerson logic
        // Konfigurera mockens beteende
        doNothing().when(personCrud).addPerson(any(Person.class));

        //Testa
        personCrud.addPerson(new Person("TestNamn", 10));

       //Om testet misslyckas
        fail("Test not yet implemented");
    }

    @Test
    public void testGetPersonByName() {
        // TODO: Implement testGetPersonByName logic
        //Testperson
        Person testPerson = new Person("TestNamn", 10);

        // Konfigurera mockens beteende
        when(personCrud.getPersonByName(eq("TestNamn"))).thenReturn(testPerson);

        //Testa
        Person result = personCrud.getPersonByName("TestNamn");

        //Kolla att resultatet är sant
        assertEquals("TestNamn", result.getName());
        assertEquals(10, result.getAge());

        // Kolla att metoden getPersonByName har anropats med rätt argument
        verify(personCrud).getPersonByName("TestNamn");

        //Om testet misslyckas
        fail("Test not yet implemented");
    }

    @Test
    public void testGetAllPersons() {
        // TODO: Implement testGetAllPersons logic
        fail("Test not yet implemented");
    }

    @Test
    public void testUpdatePerson() {
        // TODO: Implement testUpdatePerson logic
        fail("Test not yet implemented");
    }

    @Test
    public void testDeletePerson() {
        // TODO: Implement testDeletePerson logic
        fail("Test not yet implemented");
    }
}
