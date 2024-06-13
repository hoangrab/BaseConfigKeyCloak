package com.hoan.sprikeycloak.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/")
public class HomeController {
    @PreAuthorize("hasAnyRole('admin')")
    @GetMapping("admin")
    public String homeadmin() {
        RestTemplate restTemplate = new RestTemplate();
        return "homeadmin";
    }

    @PreAuthorize("hasAnyRole('user')")
    @GetMapping("user")
    public String homeuser() {
        return "homeuser";
    }
}
