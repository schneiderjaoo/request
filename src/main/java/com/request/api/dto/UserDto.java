package com.request.api.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
    private String name;
    private String password;

    public UserDto() {}

    public UserDto(String name, String password) {
        this.name = name;
        this.password = password;
    }
}
