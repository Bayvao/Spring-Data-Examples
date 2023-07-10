package com.howtodoinjava.demo.repository;

import com.howtodoinjava.demo.model.Item;
import java.util.List;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends ListCrudRepository<Item, Long> {

  List<Item> findByName(String name);
}
