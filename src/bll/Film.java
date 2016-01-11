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
    
    private String Genre;
    private String Beschrijving;
    private String Naam;
    private String Foto;
    private double Prijs;

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
        return Naam;
    }

    /**
     * @return the Naam
     */
    public String getNaam() {
        return Naam;
    }

    /**
     * @param Naam the Naam to set
     */
    public void setNaam(String Naam) {
        this.Naam = Naam;
    }

    /**
     * @return the Foto
     */
    public String getFoto() {
        return Foto;
    }

    /**
     * @param Foto the Foto to set
     */
    public void setFoto(String Foto) {
        this.Foto = Foto;
    }

    /**
     * @return the Prijs
     */
    public double getPrijs() {
        return Prijs;
    }

    /**
     * @param Prijs the Prijs to set
     */
    public void setPrijs(double Prijs) {
        this.Prijs = Prijs;
    }

    /**
     * @return the Beschrijving
     */
    public String getBeschrijving() {
        return Beschrijving;
    }

    /**
     * @param Beschrijving the Beschrijving to set
     */
    public void setBeschrijving(String Beschrijving) {
        this.Beschrijving = Beschrijving;
    }

    /**
     * @return the Genre
     */
    public String getGenre() {
        return Genre;
    }

    /**
     * @param Genre the Genre to set
     */
    public void setGenre(String Genre) {
        this.Genre = Genre;
    }
    
}
