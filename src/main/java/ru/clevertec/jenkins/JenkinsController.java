package ru.clevertec.jenkins;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/jenkins")
public class JenkinsController {

    @GetMapping
    public ResponseEntity<String> getJenkins() {
        return ResponseEntity.ok("Hello from Jenkins");
    }
}
