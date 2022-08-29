package pl.HousingAsso.Counter;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = Counter.TABLE_NAME)
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Counter {


    final static String TABLE_NAME = "counters";

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column
    private String periodMonth;

    @Column
    private String enterDate;

    @Column
    private String counter_number;

    @Column
    private Long status;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Counter counter = (Counter) o;
        return id != null && Objects.equals(id, counter.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
