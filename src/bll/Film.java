/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bll;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Helix
 */
@Entity
public class Film implements Serializable {

    public Film() {
    }
    
    private String genre;
    private String beschrijving;
    private String naam;
    private String foto;
    private double prijs;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return naam;
    }

    /**
     * @return the Naam
     */
    public String getNaam() {
        return naam;
    }

    /**
     * @param Naam the Naam to set
     */
    public void setNaam(String Naam) {
        this.naam = Naam;
    }

    /**
     * @return the Foto
     */
    public String getFoto() {
        return foto;
    }

    /**
     * @param Foto the Foto to set
     */
    public void setFoto(String Foto) {
        this.foto = Foto;
    }

    /**
     * @return the Prijs
     */
    public double getPrijs() {
        return prijs;
    }

    /**
     * @param Prijs the Prijs to set
     */
    public void setPrijs(double Prijs) {
        this.prijs = Prijs;
    }

    /**
     * @return the Beschrijving
     */
    public String getBeschrijving() {
        return beschrijving;
    }

    /**
     * @param Beschrijving the Beschrijving to set
     */
    public void setBeschrijving(String Beschrijving) {
        this.beschrijving = Beschrijving;
    }

    /**
     * @return the Genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * @param Genre the Genre to set
     */
    public void setGenre(String Genre) {
        this.genre = Genre;
    }
    
}
