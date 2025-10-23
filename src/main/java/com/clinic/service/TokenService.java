package com.clinic.service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.util.Date;

public class TokenService {

    private static final String SECRET = "mySecretKey";

    public String generateToken(String email) {
        return Jwts.builder()
                .setSubject(email)
                .setIssuedAt(new Date())
                .signWith(SignatureAlgorithm.HS256, SECRET)
                .compact();
    }

    public String getSigningKey() {
        return SECRET;
    }
}
