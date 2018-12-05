package edu.csumb.cst438.chipsdb;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import edu.csumb.cst438.chipsdb.entities.chip;


@Repository
public interface IChipsRepository extends MongoRepository<chip, String> {

    @Query (value = "{'id':?0}")
    chip findByRepoId(String id);

    @Query (value = "{'name':?0}")
    List<chip> findByName(String name);
}