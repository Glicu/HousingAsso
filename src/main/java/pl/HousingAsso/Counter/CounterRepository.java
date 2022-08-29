package pl.HousingAsso.Counter;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.HousingAsso.Counter.Counter;

@Repository
public interface CounterRepository extends JpaRepository <Counter, Long> {
}
