package com.sahil.concours.db;

import com.sahil.concours.entities.Offre;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * Created by sahil on 10/08/18.
 */
@CrossOrigin(origins = "http://localhost:4200")
public interface ConcoursRepository extends MongoRepository<Offre,String>{
    Offre findBy_id(ObjectId _id);
}
