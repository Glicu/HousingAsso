package pl.HousingAsso.Flat;

import com.sun.istack.NotNull;
import lombok.Data;
import pl.HousingAsso.Counter.Counter;

import javax.persistence.*;

@Entity
@Table(name = Flat.TABLE_NAME)
@Data
public class Flat {

        final static String TABLE_NAME = "flats";

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String number;

        @NotNull
        @ManyToOne
        @JoinColumn(name = "counters_id")
        private Counter counter;


}
