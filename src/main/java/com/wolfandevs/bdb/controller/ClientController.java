package com.wolfandevs.bdb.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wolfandevs.bdb.model.Client;
import com.wolfandevs.bdb.service.ClientRepository;

@RestController
@RequestMapping("/api/getClient")
@CrossOrigin(origins = "https://app-nttdata.wolfangdevs.com")
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @GetMapping
    public ResponseEntity<Object> getClientByDni(@RequestParam("typeDNI") String typeDNI,
            @RequestParam("numberDNI") Long numberDNI) {

            if (numberDNI == null) {
                Map<String, String> errorResponse = new HashMap<>();
                errorResponse.put("message", "'DOCUMENT NUMBER' IS REQUIRED.");
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
            }

            if (!typeDNI.equals("C") && !typeDNI.equals("P")) {
                Map<String, String> errorResponse = new HashMap<>();
                errorResponse.put("message", "INVALID 'DOCUMENT TYPE' VALUE.");
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
            }


            Optional<Client> client = clientRepository.findByTypeDNIAndNumberDNI(typeDNI, numberDNI);

            if (client.isPresent()) {
                return ResponseEntity.ok(client.get());
            } else {
                Map<String, String> response = new HashMap<>();
                response.put("message", "CUSTOMER NOT FOUND WITH DOCUMENT NUMBER: " + numberDNI);
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
            }

    }

}
