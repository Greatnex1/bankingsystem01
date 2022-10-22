import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankTest {
    Bank bank;
    @BeforeEach
    void setUp(){
        bank = new Bank("Lush");

    }

@Test
   void BankHasAName(){
        assertEquals("Lush", bank.getName());
        assertNotNull(bank);


}
@Test
    void testThatUserCanCreateAnAccount(){

}
}