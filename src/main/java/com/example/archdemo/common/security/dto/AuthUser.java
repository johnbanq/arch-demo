package com.example.archdemo.common.security.dto;


import lombok.Value;

import java.util.List;

/**
 * value object for Authorisation related info
 * usually kept in session of JWT
 */
@Value
public class AuthUser {

    long uid;

    List<Role> roles;

}
