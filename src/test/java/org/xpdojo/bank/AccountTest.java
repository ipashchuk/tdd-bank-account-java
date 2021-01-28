package org.xpdojo.bank;

//import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test	
    public void newAccountsHaveABalance() {
        Account account = new Account();        
        assertThat(account.getBalance()).isEqualTo(0);
    }

    @Test	
    public void depositingAnAmountIncreasesTheBalance() {
        Account account = new Account();
        account.deposit(100);
        assertThat(account.getBalance()).isEqualTo(100);
    }    
}
