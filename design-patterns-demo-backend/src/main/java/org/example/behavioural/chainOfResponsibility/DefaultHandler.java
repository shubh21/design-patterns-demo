package org.example.behavioural.chainOfResponsibility;

public class DefaultHandler extends AbstractBaseHandler<AuthorizationRequest>{

    @Override
    public void handle(AuthorizationRequest request) {
        System.out.println("final stage");
    }
}
