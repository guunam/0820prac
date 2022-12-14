package com.example.restfulwebservice.user;

import lombok.AllArgsConstructor;
import lombok.Data;


import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@AllArgsConstructor
public class User {
    private Integer Id;

    @Size(min=4, message = "Name은 4글자 이상 입력해 주세요.")
    private String name;

    @Past
    private Date joinDate;

    private String password;
    private String ssn;
}
