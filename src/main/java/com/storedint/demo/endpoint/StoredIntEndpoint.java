package com.storedint.demo.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.*;
import java.nio.file.*;
import java.util.Random;

@RestController
public class StoredIntEndpoint {
    
    private static final String FILE_PATH = "/tmp/stored-int.txt";
    
    @GetMapping("/stored-int")
    public String getStoredInt() {
        try {
            if (Files.exists(Paths.get(FILE_PATH))) {
                String content = new String(Files.readAllBytes(Paths.get(FILE_PATH)));
                return "Stored value: " + content;
            } else {
                int randomNum = new Random().nextInt(1000);
                Files.write(Paths.get(FILE_PATH), String.valueOf(randomNum).getBytes());
                return "New generated value: " + randomNum;
            }
        } catch (IOException e) {
            return "Error: " + e.getMessage();
        }
    }
}