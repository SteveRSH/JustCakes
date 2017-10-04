package com.theironyard.charlotte.JustCakes.repositories;

import com.theironyard.charlotte.JustCakes.models.Cake;
import org.springframework.data.repository.CrudRepository;

public interface CakeRepository
        extends CrudRepository<Cake, Integer> {
}
