package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;
import edu.eci.cvds.tdd.registry.*;

public class RegistryTest {

    private Registry registry = new Registry();

    @Test
    public void validateRegistryResult() {

        Person person = new Person("Andres",7890756,24,Gender.MALE,true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.VALID, result);
    }
    

    
}