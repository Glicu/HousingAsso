package pl.HousingAsso.Flat;

import pl.HousingAsso.User.User;

import java.util.List;
import java.util.Optional;

public interface FlatService {

    List<User> getFlats();

    void add(Flat flat);

    Optional<Flat> get(Long id);

    void delete(Long id);

}
