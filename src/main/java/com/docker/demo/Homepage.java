package com.docker.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homepage {

        @GetMapping("/Welcome")
        public static String welcome() {
                return "<h1>Welcome to docker demo</h1>";
        }

}
