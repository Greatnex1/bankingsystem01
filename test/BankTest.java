import org.junit.jupiter.api.BeforeEach;
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

}