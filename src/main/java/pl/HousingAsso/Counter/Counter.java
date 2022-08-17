package pl.HousingAsso.Counter;

import com.sun.istack.NotNull;
import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = Counter.TABLE_NAME)
@Data
public class Counter {

    final static String TABLE_NAME = "counters";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String periodMonth;
    private String date;
    private String counter_number;

}



