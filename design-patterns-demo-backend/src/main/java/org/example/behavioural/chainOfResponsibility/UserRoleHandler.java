package org.example.behavioural.chainOfResponsibility;

public class UserRoleHandler extends AbstractBaseHandler<AuthorizationRequest>{


    @Override
    public void handle(AuthorizationRequest request) {
        if(request.isAuthenticated() && request.getRole()==Role.USER){
            System.out.println("User Authorized");
        }
        else{
           passToNext(request);
        }
    }
}
