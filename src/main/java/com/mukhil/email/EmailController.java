package com.mukhil.email;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/email")
@CrossOrigin(origins = "*")
public class EmailController {
    @Autowired
    private EmailService emailService;
    @PostMapping("generate")
    public ResponseEntity<String> generateEmail(@RequestBody EmailRequest emailRequest)
    {
        String response=emailService.genrerateEmailResponse(emailRequest);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
