package com.bookmymovies.locatetheatre.repositories;

import org.springframework.data.repository.CrudRepository;
import com.bookmymovies.locatetheatre.entities.Region;
import com.bookmymovies.locatetheatre.entities.Theatre;

public interface TheatreRepository extends CrudRepository<Theatre, Long>{

}
