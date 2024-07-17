package views;

import java.io.IOException;
import java.util.Scanner;

public class Welcome {
    public void welcomeScreen(){

        Scanner num = new Scanner(System.in);
        System.out.println("Welcome to the app");
        System.out.println("Press 1 to login");
        System.out.println("press 2 top signup");
        System.out.println("press 0 to exit");
        int choice = 0;
        try{
            choice=num.nextInt();
        } catch (Exception ex){
            ex.printStackTrace();
        }
        switch (choice){
            case 1-> login();
            case 2-> signUp();
            case 0-> System.exit(0);

        }
    }

    private void login() {
    }

    private void signUp() {
    }
}
