package org.example.behavioural.chainOfResponsibility;

public class AuthorizationRequest {
    private boolean isAuthenticated;
    private String authorizationLevel;
    private boolean isAccessAllowed;
    private Role role;
    private String name;

    public AuthorizationRequest(boolean isAuthenticated, String authorizationLevel, boolean isAccessAllowed, Role role, String name) {
        this.isAuthenticated = isAuthenticated;
        this.authorizationLevel = authorizationLevel;
        this.isAccessAllowed = isAccessAllowed;
        this.role = role;
        this.name = name;
    }

    @Override
    public String toString() {
        return "AuthorizationRequest{" +
                "isAuthenticated=" + isAuthenticated +
                ", authorizationLevel='" + authorizationLevel + '\'' +
                ", isAccessAllowed=" + isAccessAllowed +
                '}';
    }

    public boolean isAuthenticated() {
        return isAuthenticated;
    }

    public void setAuthenticated(boolean authenticated) {
        isAuthenticated = authenticated;
    }

    public String getAuthorizationLevel() {
        return authorizationLevel;
    }

    public void setAuthorizationLevel(String authorizationLevel) {
        this.authorizationLevel = authorizationLevel;
    }

    public boolean isAccessAllowed() {
        return isAccessAllowed;
    }

    public void setAccessAllowed(boolean accessAllowed) {
        isAccessAllowed = accessAllowed;
    }

    public Role getRole() {
        return role;
    }

    public String getName() {
        return name;
    }
}
