package com.example.anonymous.catering.models;

import com.google.gson.annotations.SerializedName;

public class Driver {
    @SerializedName("id_driver")
    private Integer idDriver;
    @SerializedName("username")
    private String username;
    @SerializedName("email")
    private String email;
    @SerializedName("password")
    private String password;
    @SerializedName("nama")
    private String nama;
    @SerializedName("no_hp")
    private String noHp;
    @SerializedName("jk")
    private String jk;
    @SerializedName("alamat")
    private String alamat;

    public Integer getIdDriver() {
        return idDriver;
    }

    public void setIdDriver(Integer idDriver) {
        this.idDriver = idDriver;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
