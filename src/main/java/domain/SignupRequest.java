package domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignupRequest {

    private String status = "가입요청";
    private String name;
    private String email;

    public SignupRequest(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void accept() {
        status = "인증";
    }

    public void timeOut() {
        status = "미인증";
    }
}
