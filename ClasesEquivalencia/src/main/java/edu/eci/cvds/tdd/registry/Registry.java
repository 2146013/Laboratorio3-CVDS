package edu.eci.cvds.tdd.registry;
import java.util.ArrayList;
import edu.eci.cvds.tdd.registry.*;
public class Registry {
    ArrayList<Integer> voted = new ArrayList<Integer>();
    public RegisterResult registerVoter(Person p) {
        RegisterResult result = null;
        if (p.getAge() >= 18 && p.getAge()<300 && p.isAlive() && !voted.contains((Integer)p.getId())){
            voted.add((Integer)p.getId());
            result = RegisterResult.VALID;
        }
        else if (p.getAge() >= 18 && p.getAge()<300 && p.isAlive() && voted.contains((Integer)p.getId())){
            result = RegisterResult.DUPLICATED;
        }
        else if (p.getAge() >= 18 && p.getAge()<300 && !p.isAlive()){
            result = RegisterResult.DEAD;
        }
        else if (p.getAge() > 0  && p.getAge()< 18 && p.isAlive()){
            result = RegisterResult.UNDERAGE;
        }
        else if (p.getAge() < 0 || p.getAge()>300 && p.isAlive()){
            result = RegisterResult.INVALID_AGE;
        }
        return result;
    }
}