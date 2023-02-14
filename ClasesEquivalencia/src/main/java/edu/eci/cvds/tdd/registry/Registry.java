package edu.eci.cvds.tdd.registry;

import java.util.ArrayList;

public class Registry {
    private ArrayList<Person> registry = new ArrayList<Person>();

    public RegisterResult registerVoter(Person p) {

        for(Person person: registry){
            if(p.getId() == person.getId()){
                return RegisterResult.DUPLICATED;
            }
        }
        if(p.getAge() < 0 || p.getAge() >= 200){
            return RegisterResult.INVALID_AGE;
        }
        else if( p.getAge() >= 0 && p.getAge() < 18 ){
            return RegisterResult.UNDERAGE;
        }
        else if(p.isAlive() == false){
            return RegisterResult.DEAD;
        }

        // TODO Validate person and return real result.
        registry.add(p);
        return RegisterResult.VALID;
    }
}