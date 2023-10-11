package domain.repository;

import domain.SignupRequest;

public interface SignupRequestRepository {
    void save(SignupRequest request);
    SignupRequest findById(Long id);
}
