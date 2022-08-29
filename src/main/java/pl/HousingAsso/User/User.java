package pl.HousingAsso.User;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;
import pl.HousingAsso.Flat.Flat;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = User.TABLE_NAME)
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class User {

    final static String TABLE_NAME = "users";

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String nickname;

    @Column
    private Boolean adminPrivilege;

    @Column
    private String password;

    @ManyToMany
    @JoinTable(name = "users_flats",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "flat_id"))
    @ToString.Exclude
    private List<Flat> flats;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        User user = (User) o;
        return id != null && Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

}
