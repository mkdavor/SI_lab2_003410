import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class SILab2Test {
	
	@Test
	//Spored multiple condition: T T T F X X X X X
    public void test1() {
		ArrayList<String> allUsers = new ArrayList<>();
		allUsers.add("Davor");
		allUsers.add("Petko");
		allUsers.add("Sharko");
		allUsers.add("Marko");
		
		User user = new User("Davor", "password", "denikj.davor@students.finki.edu.mk");
				SILab2 lab2 = new SILab2();
				
        assertEquals (lab2.function(user, allUsers), false);
    }

    @Test
    //spored every path: T T T F X F
    public void test2() {
    	ArrayList<String> allUsers = new ArrayList<>();
		allUsers.add("Davor");
		allUsers.add("Petko");
		allUsers.add("Sharko");
		allUsers.add("Marko");
		
		User user = new User("Davor", "password", "mail.adresa.bez.majmunche");
				SILab2 lab2 = new SILab2();
				
        assertEquals (lab2.function(user, allUsers), false);
    }
}