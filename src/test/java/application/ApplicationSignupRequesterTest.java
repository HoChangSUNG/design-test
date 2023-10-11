package application;

import domain.SignupRequest;
import domain.factory.SignupInput;
import domain.factory.SignupRequestFactory;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;
import org.assertj.core.api.Assertions;

@ExtendWith(MockitoExtension.class)
class ApplicationSignupRequesterTest {

    @Mock
    ApplicationSignupRejector applicationSignupRejector;

    @InjectMocks
    SignupRequestFactory signupRequestFactory;


}