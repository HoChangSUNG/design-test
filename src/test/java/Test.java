import domain.SignupRequest;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class Test {
    @Mock
    SignupRequest signupRequest;

    @org.junit.jupiter.api.Test
    public void test() {
        doNothing().when(signupRequest).accept();
        signupRequest.accept();
        verify(signupRequest, only()).accept();
    }
}
