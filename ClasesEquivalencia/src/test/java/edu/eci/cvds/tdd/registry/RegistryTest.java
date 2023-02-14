package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;


public class RegistryTest {
    private Registry registry = new Registry();

    //CASE 1; VALID
    @Test
        public void validateRegistryResultValid() {
            Person person = new Person("Carolina", 101, 30, Gender.FEMALE , true);
            RegisterResult result = registry.registerVoter(person);
            Assert.assertEquals(RegisterResult.VALID, result);
        }
    @Test        

        public void validateRegistryResultValid2() {
            Person person = new Person("Nicolas", 102, 18, Gender.MALE , true);
            RegisterResult result = registry.registerVoter(person);
            Assert.assertEquals(RegisterResult.VALID, result);
        }
    @Test
        public void validateRegistryResultValid3() {
            Person person = new Person("Jacinto", 103, 100, Gender.MALE , true);
            RegisterResult result = registry.registerVoter(person);
            Assert.assertEquals(RegisterResult.VALID, result);

     }
 
    //CASE 2; DEAD
    @Test
    public void validateRegistryResultDead() {
        Person person = new Person("Mariano", 104, 70, Gender.MALE , false);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.DEAD, result);
    }
    
    @Test
    public void validateRegistryResultDead2() {
        Person person = new Person("Veronica", 105, 120, Gender.FEMALE , false);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.DEAD, result);
    }


    //CASE 3; UNDERAGE

    @Test
    public void validateRegistryResultUnderage() {
        Person person = new Person("Carlos", 106, 0, Gender.MALE , true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }
    @Test
    public void validateRegistryResultUnderage2() {
        Person person = new Person("Vanessa", 107, 17, Gender.FEMALE , true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }


    
    //CASE 4; INVALID_AGE
    @Test
    public void validateRegistryResultInvalidAge() {
        Person person = new Person("Angela", 108, 500, Gender.FEMALE , true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }
    @Test
    public void validateRegistryResultInvalidAge2() {
        Person person = new Person("Sergio", 109, -3, Gender.FEMALE , true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }

    //Caso 5; DUPLICATED
    @Test
    public void validateRegistryResultIsDuplicated() {
        Person person = new Person("Nicolas", 102, 18, Gender.MALE , true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, result);
    }

    
}