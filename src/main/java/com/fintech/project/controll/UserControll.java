package com.fintech.project.controll;

// Generic importation
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

// Table association importation
import com.fintech.project.models.User;

// Hibernate controll
import com.fasterxml.jackson.databind.JsonNode;
import org.hibernate.Session;
import org.hibernate.query.Query;

// User login actions
interface UserControlAction{
    public boolean LoginAction();
    public boolean LogoutAction();
}

public class UserControll implements UserControlAction{
    User user = null;
    Session session = SessionControll.getCurrentSessionFromConfig();

    public UserControll(JsonNode Json){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        try{
            user = new User (
                Json.get("cd_cpf").asText(),
                Json.get("first_name").asText(),
                Json.get("last_name").asText(),
                Json.get("email").asText(),
                Json.get("password").asText(),
                (Date) dateFormat.parse(Json.get("birth_date").asText()),
                Json.get("nm_phone").asText(),
                Json.get("user_type").asInt()
            );
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean LoginAction() {
        try {
            session.beginTransaction();
            Query queryLogin = session.createQuery("SELECT * FROM users WHERE users.email = :email");
            queryLogin.setParameter("email", user.email);

            return (queryLogin.getResultList().isEmpty());
        } finally {
            return false;
        }
    }

    @Override
    public boolean LogoutAction() {
        return false;
    }
}
