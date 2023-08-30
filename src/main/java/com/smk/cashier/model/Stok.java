package com.smk.cashier.model;

public class Stok extends model {
    private int id;
    private String kodeBarang;
    private int StokBarang;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public int getStokBarang() {
        return StokBarang;
    }

    public void setStokBarang(int stokBarang) {
        StokBarang = stokBarang;
    }

    @Override
    public String toString() {
        return "Stok{" +
                "id=" + id +
                ", kodeBarang='" + kodeBarang + '\'' +
                ", StokBarang=" + StokBarang +
                ", dateCreated=" + dateCreated +
                ", lastModified=" + lastModified +
                ", createdBy='" + createdBy + '\'' +
                ", updatedBy='" + updatedBy + '\'' +
                '}';
    }
}