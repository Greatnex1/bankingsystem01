import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    User user;

    @BeforeEach
            void up(){
        user = new User("John","Snow",23,"Male","jonny@email", "+234");
    }

    @Test
   void testUserIsNotEmpty(){
        assertNotNull(user);

    }
    @Test
    void testUserFirstnameExist(){
      assertEquals("John", user.getFirstname());
    }

}