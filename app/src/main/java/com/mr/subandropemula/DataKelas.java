package com.mr.subandropemula;

import com.mr.subandropemula.model.KursusModel;

import java.util.ArrayList;
import java.util.Collection;

public class DataKelas {

    private static String[] namaKelas = {
            "Bahasa Pemrograman",
            "Bahasa Perancis",
            "Belajar Memasak",
            "Membuat Website",
            "Design",
            "Social Media",
            "Handmade (Craft)",
            "Menjadi Youtuber",
            "Matematika Dasar",
            "Bisnis Online"
    };

    private static String[] durasiKelas = {
            "72 Jam",
            "48 Jam",
            "8 Jam",
            "72 Jam",
            "72 Jam",
            "24 Jam",
            "72 Jam",
            "48 Jam",
            "6 Jam",
            "12 Jam"
    };

    private static String[] hargaKelas = {
            "IDR 1.000.000",
            "IDR 800.000",
            "IDR 250.000",
            "IDR 1.000.000",
            "IDR 1.000.000",
            "IDR 500.000",
            "IDR 1.000.000",
            "IDR 800.000",
            "IDR 200.000",
            "IDR 400.000"
    };

    private static String[] kelasDetails = {
            "Belajar Bahasa Pemrograman apa saja yang anda inginkan",
            "Belajar Bahasa Perancis dengan Mudah dan Lengkap",
            "Belajar memasak dengan racikan spesial dengan chef berpengalaman",
            "Belajar Membuat Website dari NOL",
            "Mendesign Mockup Aplikasi secara profesional",
            "Menjadi Sosialita yang bermanfaat",
            "Membuat kerajinan tangan, dan membuat produk sendiri",
            "Cara menjadi YouTuber secara profesional",
            "Belajar Matemaika Dasar, Zero to Hero",
            "Belajar mendapatkan Income tambahan hanya dengan Online"
    };

    private static int[] kelasImage = {
            R.drawable.satu,
            R.drawable.dua,
            R.drawable.tiga,
            R.drawable.empat,
            R.drawable.lima,
            R.drawable.enam,
            R.drawable.tujuh,
            R.drawable.delapan,
            R.drawable.sembilan,
            R.drawable.sepuluh
    };

    public static Collection<? extends KursusModel> getListData() {
        ArrayList<KursusModel> list = new ArrayList<>();
        for (int position = 0; position < namaKelas.length; position++) {
            KursusModel kelas = new KursusModel();
            kelas.setIvImgKursus(kelasImage[position]);
            kelas.setTvNamaKursus(namaKelas[position]);
            kelas.setTvDurasi(durasiKelas[position]);
            kelas.setTvHarga(hargaKelas[position]);
            kelas.setTvDetails(kelasDetails[position]);
            list.add(kelas);
        }
        return list;
    }
}






