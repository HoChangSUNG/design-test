package domain.factory;


import domain.Account;

public class AccountFactory {

    public Account create(AccountInput input) {
        return new Account(input.getName(), input.getEmail());
    }
}
