package com.demo.project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Hardware {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE) // Untuk Menggenerate AutoIncrement
	private Long id;

	@Column(name = "tipe")
	private String tipe;

	@Column(name = "merk")
	private String merk;

	@Column(name = "harga")
	private Long harga;

	@Column(name = "jenis_garansi")
	private String jenisGaransi;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipe() {
		return tipe;
	}

	public void setTipe(String tipe) {
		this.tipe = tipe;
	}

	public String getMerk() {
		return merk;
	}

	public void setMerk(String merk) {
		this.merk = merk;
	}

	public Long getHarga() {
		return harga;
	}

	public void setHarga(Long harga) {
		this.harga = harga;
	}

	public String getJenisGaransi() {
		return jenisGaransi;
	}

	public void setJenisGaransi(String jenisGaransi) {
		this.jenisGaransi = jenisGaransi;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((harga == null) ? 0 : harga.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((jenisGaransi == null) ? 0 : jenisGaransi.hashCode());
		result = prime * result + ((merk == null) ? 0 : merk.hashCode());
		result = prime * result + ((tipe == null) ? 0 : tipe.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hardware other = (Hardware) obj;
		if (harga == null) {
			if (other.harga != null)
				return false;
		} else if (!harga.equals(other.harga))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (jenisGaransi == null) {
			if (other.jenisGaransi != null)
				return false;
		} else if (!jenisGaransi.equals(other.jenisGaransi))
			return false;
		if (merk == null) {
			if (other.merk != null)
				return false;
		} else if (!merk.equals(other.merk))
			return false;
		if (tipe == null) {
			if (other.tipe != null)
				return false;
		} else if (!tipe.equals(other.tipe))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Hardware [id=" + id + ", tipe=" + tipe + ", merk=" + merk + ", harga=" + harga + ", jenisGaransi="
				+ jenisGaransi + "]";
	}

}
