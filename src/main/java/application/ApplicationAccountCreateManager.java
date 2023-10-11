package application;

import domain.Account;
import domain.factory.AccountFactory;
import domain.factory.AccountInput;
import domain.repository.AccountRepository;

public class ApplicationAccountCreateManager {

    private AccountFactory accountFactory;
    private AccountRepository accountRepository;

    public ApplicationAccountCreateManager(AccountFactory accountFactory, AccountRepository accountRepository) {
        this.accountFactory = accountFactory;
        this.accountRepository = accountRepository;
    }

    public void create(AccountInput input) {
        Account account = accountFactory.create(input);

        accountRepository.save(account);
    }
}
