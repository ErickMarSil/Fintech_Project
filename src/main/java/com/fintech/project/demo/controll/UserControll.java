package com.fintech.project.demo.controll;

// Generic importation
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

// Type importation
import com.fasterxml.jackson.databind.JsonNode;

// Table association importation


// User login actions
interface UserControlAction{
    public boolean LoginAction();
    public boolean LogoutAction();
}

public class UserControll implements UserControlAction {
    String cd_cpf;
    String first_name;
    String last_name;
    String email;
    String password;
    Date birth_date;
    String nm_phone;
    int user_type;

    public UserControll(JsonNode Json){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");

        this.cd_cpf =       Json.get("cd_cpf").asText();
        this.first_name =   Json.get("first_name").asText();
        this.last_name =    Json.get("last_name").asText();
        this.email =        Json.get("email").asText();
        this.password =     Json.get("password").asText();
        try {
            this.birth_date = (Date) dateFormat.parse(Json.get("birth_date").asText());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        this.nm_phone =     Json.get("nm_phone").asText();
        this.user_type =    Json.get("user_type").asInt();
    }

    @Override
    public boolean LoginAction() {
        return false;
    }

    @Override
    public boolean LogoutAction() {
        return false;
    }
}
