package domain.factory;

import application.ApplicationSignupRejector;
import domain.SignupRequest;

public class SignupRequestFactory {

    private ApplicationSignupRejector rejector;

    public SignupRequestFactory(ApplicationSignupRejector rejector) {
        this.rejector = rejector;
    }

    public SignupRequest create(SignupInput input) {
        if(rejector.isReject(input)) {
            throw new RuntimeException();
        }

        return new SignupRequest(input.getName(), input.getEmail());
    }
}
