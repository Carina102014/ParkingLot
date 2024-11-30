package com.parking.parkinglot.common;

public class UserDto {


    private String email;
    private String password;
    private String username;
    private Long id;

    public UserDto(String email, String username, String password, Long id) {
        this.email = email;
        this.username = username;
        this.password = password;
        this.id = id;
    }


    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Long getId() {
        return id;
    }

}