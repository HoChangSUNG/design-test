package application;

import domain.SignupRequest;

public class ApplicationAcceptConvertor {
    public AcceptRequest signupRequestToAcceptRequest(SignupRequest signupRequest) {
        return new AcceptRequest(signupRequest.getEmail());
    }
}
