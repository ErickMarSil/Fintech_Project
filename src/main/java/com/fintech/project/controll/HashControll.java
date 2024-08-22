package com.fintech.project.controll;

public class HashControll {
    String hash_password;
    String salt_increment;
    Long user_id;
    public HashControll(
            String hash_password,
            String salt_increment,
            Long user_id
    ){
        this.hash_password = hash_password;
        this.salt_increment = salt_increment;
        this.user_id = user_id;
    }
}