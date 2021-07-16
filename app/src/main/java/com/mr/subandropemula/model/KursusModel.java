package com.mr.subandropemula.model;

public class KursusModel {

    private String tvNamaKursus, tvDurasi, tvHarga, tvDetails;
    private int ivImgKursus;

    public KursusModel() {

    }

    public String getTvNamaKursus() {
        return tvNamaKursus;
    }

    public void setTvNamaKursus(String tvNamaKursus) {
        this.tvNamaKursus = tvNamaKursus;
    }

    public String getTvDurasi() {
        return tvDurasi;
    }

    public void setTvDurasi(String tvDurasi) {
        this.tvDurasi = tvDurasi;
    }

    public String getTvHarga() {
        return tvHarga;
    }

    public void setTvHarga(String tvHarga) {
        this.tvHarga = tvHarga;
    }

    public int getIvImgKursus() {
        return ivImgKursus;
    }

    public void setIvImgKursus(int ivImgKursus) {
        this.ivImgKursus = ivImgKursus;
    }

    public String getTvDetails() {
        return tvDetails;
    }

    public void setTvDetails(String tvDetails) {
        this.tvDetails = tvDetails;
    }
}
