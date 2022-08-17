package pl.HousingAsso.User;

import com.sun.istack.NotNull;
import lombok.Data;
import pl.HousingAsso.Flat.Flat;

import javax.persistence.*;
import java.util.List;

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

    @NotNull
    @ManyToMany
    @JoinTable(name = "users_flats",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "flat_id"))
    private List<Flat> flats;



}
