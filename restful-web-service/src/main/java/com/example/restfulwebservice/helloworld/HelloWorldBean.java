package com.example.restfulwebservice.helloworld;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HelloWorldBean {

    // Data 어노테이션 덕에 set, get, toString 불필요
    private String message;

    // AllArgsConstructor로 자동 생성되는 constructor
    // public HelloWorldBean(String message){
    //     this.message = message;
    // }

    // NoArgsConstructor로 자동 생성되는 constructor
    // public HelloWorldBean(){
    // }

}
