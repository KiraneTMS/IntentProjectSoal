package com.example.intentproject;

import android.os.Parcel;
import android.os.Parcelable;

public class output implements Parcelable {

    public static final Parcelable.Creator<output> CREATOR = new Parcelable.Creator<output>() {
        @Override
        public output createFromParcel(Parcel source) {
            return new output(source);
        }

        @Override
        public output[] newArray(int size) {
            return new output[size];
        }
    };
    private String nama;
    private String alamat;
    private String pesanan;


    public output(String name,String alamat,String pesanan) {
        this.nama = name;
        this.alamat = alamat;
        this.pesanan = pesanan;
    }

    protected output(Parcel in) {
        this.nama = in.readString();
        this.alamat = in.readString();
        this.pesanan = in.readString();
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getPesanan() {
        return pesanan;
    }

    public void setPesanan(String pesanan) {
        this.pesanan = pesanan;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.nama);
        dest.writeString(this.alamat);
        dest.writeString(this.pesanan);
    }
}
