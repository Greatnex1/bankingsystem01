import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankTest {
    Bank bank;

    @BeforeEach
            void up(){
        bank = new Bank("John","Snow",23,"Male","jonny@email", "+234");
    }
    @Test
    void testBankIsNotEmpty (){
        assertNotNull(bank);

    }
    @Test
    void testViewUserDetails(){
        User user = new User();
        user.setFirstname("Maxwell");
        user.setLastname("John");
        bank.getUsers();
        System.out.println(bank.viewUser());

    }


}