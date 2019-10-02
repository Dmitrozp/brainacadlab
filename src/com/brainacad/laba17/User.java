package com.brainacad.laba17;

public class User {

    private int login;
    private String password;
    private String name;
    private Position role = Position.ANONYMOUS;


    public boolean checkUserClient(String name, int password){
        if (this.role != Position.ANONYMOUS) {
            if (this.name.equals(name) && this.password.equals(password)) {
                loginUserClient();
                return true;
            }
            return false;
        }
        return false;
    }

    public void loginUserClient(){
        this.role = Position.CLIEN;
    }




    public int getLogin() {
        return login;
    }

    public void setLogin(int login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Position getRole() {
        return role;
    }

    public void setRole(Position role) {
        this.role = role;
    }

}
