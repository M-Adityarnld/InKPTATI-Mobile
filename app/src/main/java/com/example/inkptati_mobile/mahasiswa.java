package com.example.inkptati_mobile;

public class mahasiswa {

    private int iconuser;

    private String nama;
    private String nim;
    private String judul;
    private String semester;

    public mahasiswa(int iconuser, String nama, String nim, String judul, String semester) {
        this.iconuser = iconuser;
        this.nama = nama;
        this.nim = nim;
        this.judul = judul;
        this.semester = semester;
    }

    public void displayData() {

        System.out.println("Nama: " + this.nama);
        System.out.println("NIM: " + this.nim);
    }

    public int getIconuser() {
        return iconuser;
    }

    public void setIconuser(int iconuser) {
        this.iconuser = iconuser;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }
}



