package application;

import infrastructure.sender.Sender;

public class ApplicationAcceptRequester {

    private Sender sender;

    public ApplicationAcceptRequester(Sender sender) {
        this.sender = sender;
    }

    public void request(AcceptRequest request) {
        sender.send();
    }
}
