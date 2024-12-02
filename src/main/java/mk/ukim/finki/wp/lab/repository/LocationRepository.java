package mk.ukim.finki.wp.lab.repository;

import mk.ukim.finki.wp.lab.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LocationRepository {

    List<Location> locations = null;

    public List<Location> findAll(){
        return locations;
    }

}
