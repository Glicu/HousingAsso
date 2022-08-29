package pl.HousingAsso.Flat;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;
import pl.HousingAsso.Counter.Counter;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = Flat.TABLE_NAME)
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Flat {

    final static String TABLE_NAME = "flats";

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column
    private String number;

    @ManyToOne
    @JoinColumn(name = "counter_id")
    private Counter counter;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Flat flat = (Flat) o;
        return id != null && Objects.equals(id, flat.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}



