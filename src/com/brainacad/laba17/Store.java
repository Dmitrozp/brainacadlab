package com.brainacad.laba17;

import java.io.IOException;

public class Store {

    private String name;
    private String urlStore;
    public User[] allUsers;
    public User[] loginUsers;

    public void checkLogin(String name, int password) {
        for (int i = 0; i<allUsers.length; i++){
            if (allUsers[i].checkUserClient(name, password)) {
                System.out.println("Юзер авторизирован");
            }
            System.out.println("Юзер не авторизирован");
        }
    }

    public void getCurrentUserRights() throws IOException {
        for (int i = 0; i < loginUsers.length; i++)
            this.checkLogin("sdcsdsd", 1214525);

    }

}
