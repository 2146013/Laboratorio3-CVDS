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

    @Test
    public void validateDuplicatedRegistryResult() {

        Person person = new Person("Andres",7890756,24,Gender.MALE,true);

        RegisterResult result2 = registry.registerVoter(person);
        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.DUPLICATED, result);

        
    }

    @Test
    public void validateDeadRegistryResult() {

        Person person = new Person("camilo",7675776,26,Gender.MALE,false);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.DEAD, result);

        
    }
   
    @Test
    public void validateUnderAgeRegistryResult() {

        Person person = new Person("juliana",10076898,15,Gender.FEMALE,true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.UNDERAGE, result);

        
    }

    @Test
    public void validateInvalidAgeRegistryResult() {

        Person person = new Person("Maria",100789848,-6,Gender.FEMALE,true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.INVALID_AGE, result);

        
    }

    

    
}