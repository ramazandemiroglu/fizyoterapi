
import com.fizyoterapi.model.User;
import com.fizyoterapi.repository.UserRepository;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       User user=new User();
       user.setFirstName("ramazan");
       user.setLastName("Demirci");
       user.setTc("12345678910");
       user.setTip(1);
       
        UserRepository repo=new UserRepository();
        repo.add(user);
    }
    
}
