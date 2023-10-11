package presentation;

import application.ApplicationAcceptManager;
import presentation.dto.AcceptResponse;

public class SignupAcceptController {

    private ApplicationAcceptManager applicationAcceptManager;

    public SignupAcceptController(ApplicationAcceptManager applicationAcceptManager) {
        this.applicationAcceptManager = applicationAcceptManager;
    }

    /**
     * 가입 요청 인증 API
     */
    public AcceptResponse accept(Long id) {
        applicationAcceptManager.accept(id);
        return new AcceptResponse();
    }
}
