package application;

import domain.SignupRequest;
import domain.factory.AccountInput;
import domain.repository.SignupRequestRepository;

public class ApplicationAcceptManager {

    private SignupRequestRepository requestRepository;
    private ApplicationAccountCreateManager accountCreateManager;

    public ApplicationAcceptManager(SignupRequestRepository requestRepository, ApplicationAccountCreateManager accountCreateManager) {
        this.requestRepository = requestRepository;
        this.accountCreateManager = accountCreateManager;
    }

    public void accept(Long id) {
        SignupRequest signupRequest = requestRepository.findById(id);

        signupRequest.accept();

        AccountInput accountInput = convertToAccountInput(signupRequest);
        accountCreateManager.create(accountInput);
    }

    private AccountInput convertToAccountInput(SignupRequest signupRequest) {
        return new AccountInput(signupRequest.getName(), signupRequest.getEmail());
    }
}
