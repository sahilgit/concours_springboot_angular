package com.sahil.concours.web;


import com.sahil.concours.db.ConcoursRepository;
import com.sahil.concours.entities.Offre;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by sahil on 10/08/18.
 */
@RestController
@RequestMapping("/api")
public class OffreController {

    @Autowired
    ConcoursRepository concoursRepository;

    @RequestMapping(value = "/offres", method = RequestMethod.GET)
    @CrossOrigin(origins = "*")
    public List<Offre> getAllOffres() {
        return concoursRepository.findAll();
    }

    @RequestMapping(value = "/addOffre", method = RequestMethod.POST)
    public Offre createOffre(@RequestBody Offre offre) {
        concoursRepository.save(offre);
        return offre;
    }

    @RequestMapping(value="/deleteOffre", method=RequestMethod.POST)
    public Offre deleteOffre(@RequestParam ObjectId _id){
        Offre new_offre=concoursRepository.findBy_id(_id);
        concoursRepository.delete(new_offre);
        return new_offre;
    }

}
