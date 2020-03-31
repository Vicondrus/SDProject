package com.project.controller;

import com.project.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
@RequiredArgsConstructor
public class CommandLineController implements CommandLineRunner {

    @Autowired
    private UserService userService;

    private final Scanner scanner = new Scanner(System.in).useDelimiter("\n");

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Seen this bih");
        boolean done = false;
        while (!done) {
            System.out.println("Enter a command: ");
            String command = scanner.next().trim();
            done = handleCommand(command);
        }
    }

    private boolean handleCommand(String command) {
        switch (command) {
            case "addUser":
                handleAddUser();
                return false;
            case "findAll":
                handleFindAll();
                return false;
            case "exit":
                return true;
            default:
                System.out.println("Unknown command. Try again.");
                return false;
        }
    }

    private void handleAddUser(){
        System.out.println("Username:");
        String username = scanner.next().trim();
        System.out.println(userService.save(username).getUsername());

    }

    private void handleFindAll(){
        userService.getAllUsers().forEach(x -> System.out.println(x.getUsername()));
    }

}
