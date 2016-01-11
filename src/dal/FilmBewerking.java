/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import bll.Film;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Helix
 */
public class FilmBewerking {

    private static final String ConnString = "jdbc:mysql://localhost:3307/eindwerkfilmshopdb?zeroDateTimeBehavior=convertToNull";

    public static void FilmToevoegen(Film film) {
        try {
            Connection Conn = DriverManager.getConnection(ConnString, "root", "usbw");
            Statement stmt = Conn.createStatement();
            stmt.executeUpdate("INSERT INTO FILM (Naam,Beschrijving,Genre,Foto,Prijs) VALUES ('" + film.getNaam() + "','" + film.getBeschrijving() + "','" + film.getGenre() + "','" + film.getFoto() + "'," + film.getPrijs() + ")");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static void FilmWijzigen(Film f) {
        try {
            Connection Conn = DriverManager.getConnection(ConnString, "root", "usbw");
            Statement stmt = Conn.createStatement();
            stmt.executeUpdate("UPDATE FILM SET Naam = '" + f.getNaam() + "', Beschrijving = '" + f.getBeschrijving() + "', Genre = '" + f.getGenre() + "', Foto = '" + f.getFoto() + "', Prijs = " + f.getPrijs() + " WHERE ID = " + f.getId() + " ");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static void FilmVerwijderen(Film f) {
        try {
            Connection Conn = DriverManager.getConnection(ConnString, "root", "usbw");
            Statement stmt = Conn.createStatement();
            stmt.executeUpdate("DELETE FROM FILM WHERE ID = " + f.getId());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static List<Film> FilmLijst() {
        List<Film> filmLijst = new ArrayList<>();
        try {
            Connection Conn = DriverManager.getConnection(ConnString,"root","usbw");
            Statement stmt = Conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM FILM ORDER BY Naam");
            while (rs.next()) {                
                Film f = new Film();
                f.setId(rs.getLong("ID"));
                f.setNaam(rs.getString("Naam"));
                f.setBeschrijving(rs.getString("Beschrijving"));
                f.setGenre(rs.getString("Genre"));
                f.setFoto(rs.getString("Foto"));
                f.setPrijs(rs.getDouble("Prijs"));
                filmLijst.add(f);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return filmLijst;
    }

}
