package application;

import domain.factory.SignupInput;

public class ApplicationSignupRejector {
    public boolean isReject(SignupInput input) {
        if(input == null)
            return true;
        else
            return false;
    }
}
