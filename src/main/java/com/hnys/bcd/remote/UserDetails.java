package com.hnys.bcd.servlet;

import jakarta.ejb.Remote;

@Remote
public interface UserDetails {
    String getUsername();
    String getEmail();
}
