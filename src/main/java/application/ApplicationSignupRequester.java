package application;

import domain.factory.SignupInput;
import domain.SignupRequest;
import domain.factory.SignupRequestFactory;
import domain.repository.SignupRequestRepository;

public class ApplicationSignupRequester {
    private SignupRequestFactory factory;
    private ApplicationAcceptRequester acceptRequester;
    private ApplicationAcceptConvertor convertor;
    private SignupRequestRepository requestRepository;

    public ApplicationSignupRequester(SignupRequestFactory factory, ApplicationAcceptRequester acceptRequester, ApplicationAcceptConvertor convertor, SignupRequestRepository requestRepository) {
        this.factory = factory;
        this.acceptRequester = acceptRequester;
        this.convertor = convertor;
        this.requestRepository = requestRepository;
    }

    public void signup(SignupInput input) {
        SignupRequest signupRequest = factory.create(input);

        AcceptRequest acceptRequest = convertor.signupRequestToAcceptRequest(signupRequest);

        acceptRequester.request(acceptRequest);

        requestRepository.save(signupRequest);
    }
}
