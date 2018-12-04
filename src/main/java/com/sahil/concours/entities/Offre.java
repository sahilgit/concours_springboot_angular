package com.sahil.concours.entities;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by sahil on 10/08/18.
 */
@Document(collection = "Offre")
public class Offre {
    @Id
    public ObjectId _id;

    public String nom;
    public String etablissement;
    public String description;

    // Constructors
    public Offre() {}

    public Offre(String nom, String etablissement, String description) {
        this.nom = nom;
        this.etablissement = etablissement;
        this.description = description;
    }

    public Offre(String nom, String etablissement) {
        this.nom = nom;
        this.etablissement=etablissement;
    }

    // ObjectId needs to be converted to string
    public String get_id() { return _id.toHexString(); }
    public void set_id(ObjectId _id) { this._id = _id; }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEtablissement() {
        return etablissement;
    }

    public void setEtablissement(String etablissement) {
        this.etablissement = etablissement;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}