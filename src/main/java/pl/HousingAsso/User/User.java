package pl.HousingAsso.User;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = User.TABLE_NAME)
@Data
public class User {

    final static String TABLE_NAME = "users";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String LastName;
    private String nickname;
    private Boolean adminPrivilege;


}

