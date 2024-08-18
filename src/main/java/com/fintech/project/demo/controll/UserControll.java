package com.fintech.project.demo.controll;

// Generic importation
import java.sql.Date;

// Type importation
import com.fintech.project.demo.enviroment.Enums.User_Type;

// Table association importation
//import erick.martins.models.Hash;


public class UserControll {
    Integer cd_cpf;
    String first_name;
    String last_name;
    String email;
    String password;
    Date birth_date;
    Integer nm_phone;
    User_Type user_type;
    public UserControll(
            Integer cd_cpf,
            String first_name,
            String last_name,
            String email,
            String password,
            Date birth_date,
            Integer nm_phone,
            User_Type user_type
    ){
        this.cd_cpf = cd_cpf;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.password = password;
        this.birth_date = birth_date;
        this.nm_phone = nm_phone;
        this.user_type = user_type;
    }
    public boolean setData(){
        return true;
    }
}
