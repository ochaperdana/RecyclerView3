package id.sch.smktelkom_mlg.learn.recyclerview3.model;

import android.graphics.drawable.Drawable;

/**
 * Created by Smktelkom on 10/29/2016.
 */

public class Hotel {
    public String judul;
    public String deskripsi;
    public Drawable foto;

    public Hotel(String judul, String deskripsi, Drawable foto)
    {
        this.judul=judul;
        this.deskripsi=deskripsi;
        this.foto=foto;
    }
}
