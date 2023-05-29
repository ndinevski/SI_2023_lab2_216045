package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class User {
    String username;
    String password;
    String email;

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username){
        this.username=username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}

public class SILab2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] parts = bf.readLine().split("\\s+");
        User user = new User(parts[0], parts[1], parts[2]);
        List<User> users = new ArrayList<>();
        System.out.println("How many more users do you want to enter?");
        int N = Integer.parseInt(bf.readLine());
        for (int i = 0; i < N; i++) {
            String [] input = bf.readLine().split("\\s+");
            User userToAdd = new User(input[0], input[1], input[2]);
            users.add(userToAdd);
        }
        System.out.println("==EXECUTING function==");
        System.out.println(function(user, users));
    }

    public static boolean function (User user, List<User> allUsers) { //1
        if (user==null || user.getPassword()==null || user.getEmail()==null){
            throw new RuntimeException("Mandatory information missing!"); //2
        }

        if (user.getUsername()==null){ //3
            user.setUsername(user.getEmail()); //4
        }

        int same = 1; //5
        if (user.getEmail().contains("@") && user.getEmail().contains(".")) {
            same = 0; //6
            for (int i=0; i<allUsers.size()	;i++) {
                User existingUser = allUsers.get(i); //7
                if (existingUser.getEmail().equals(user.getEmail())){
                    same += 1; //8
                }
                if (existingUser.getUsername().equals(user.getUsername())) { //9
                    same += 1; //10
                }
            }
        }

        String specialCharacters="!#$%&'()*+,-./:;<=>?@[]^_`{|}"; //11
        String password = user.getPassword();
        String passwordLower = password.toLowerCase();

        if (passwordLower.contains(user.getUsername().toLowerCase()) || password.length()<8) {
            return false; //12
        }
        else {
            if (!passwordLower.contains(" ")) { //13
                for (int i = 0; i < specialCharacters.length(); i++) { //14
                    if (password.contains(String.valueOf(specialCharacters.charAt(i)))) { //15
                        return same == 0; //16
                    }
                }
            }
        }
        return false; //17
    }//18

}
