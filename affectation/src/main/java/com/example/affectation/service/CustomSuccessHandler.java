package com.example.affectation.service;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;


import java.io.IOException;

public class CustomSuccessHandler implements AuthenticationSuccessHandler {

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
                                        Authentication authentication) throws IOException, ServletException {
        // TODO Auto-generated method stub

        var authourities = authentication.getAuthorities();
        var roles = authourities.stream().map(r -> r.getAuthority()).findFirst();

        if (roles.orElse("").equals("MANAGER")) {
            response.sendRedirect("/Employee-Affectation");
        } else if (roles.orElse("").equals("MANAGER,TECHLEAD")) {
            response.sendRedirect("/employees");
        } else if (roles.orElse("").equals("DEV,TEST,DEVOS")) {
            response.sendRedirect("/JSON");
        }
        else {
            response.sendRedirect("/error");
        }



    }

}