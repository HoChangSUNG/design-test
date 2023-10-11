package presentation;

import application.ApplicationSignupRequester;
import domain.factory.SignupInput;
import presentation.dto.SignupInputRequest;
import presentation.dto.SignupResponse;

public class SignupController {

    private ApplicationSignupRequester applicationSignupRequester;

    public SignupController(ApplicationSignupRequester applicationSignupRequester) {
        this.applicationSignupRequester = applicationSignupRequester;
    }

    /**
     * 가입 요청 API
     */
    public SignupResponse signup(SignupInputRequest request) {
        SignupInput signupInput = convertToSignupInput(request);
        applicationSignupRequester.signup(signupInput);

        return new SignupResponse();
    }

    private SignupInput convertToSignupInput(SignupInputRequest request) {
        // convert
        return new SignupInput(request.getName(), request.getEmail());
    }
}
