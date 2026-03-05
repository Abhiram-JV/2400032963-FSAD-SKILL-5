SKILL 5 – Spring Autowiring
Repo

skill5-autowired-demo

Laptop.java
package com.demo;

import org.springframework.stereotype.Component;

@Component
public class Laptop {

    public void compile(){
        System.out.println("Compiling code...");
    }

}
Programmer.java
package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Programmer {

    @Autowired
    Laptop laptop;

    public void code(){
        laptop.compile();
        System.out.println("Coding...");
    }

}
