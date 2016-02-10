package de.hk.bdk.model;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Version;
@Entity
public class Adresse implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	@Version
	@Column(name = "version")
	private int version;

	@Column
	private String Strasse;

	@Column
	private String Plz;

	@Column
	private String Ort;

	@Column
	private String Hsn;

	public Long getId() {
		return this.id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public int getVersion() {
		return this.version;
	}

	public void setVersion(final int version) {
		this.version = version;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Adresse)) {
			return false;
		}
		Adresse other = (Adresse) obj;
		if (id != null) {
			if (!id.equals(other.id)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	public String getStrasse() {
		return Strasse;
	}

	public void setStrasse(String Strasse) {
		this.Strasse = Strasse;
	}

	public String getPlz() {
		return Plz;
	}

	public void setPlz(String Plz) {
		this.Plz = Plz;
	}

	public String getOrt() {
		return Ort;
	}

	public void setOrt(String Ort) {
		this.Ort = Ort;
	}

	public String getHsn() {
		return Hsn;
	}

	public void setHsn(String Hsn) {
		this.Hsn = Hsn;
	}

	@Override
	public String toString() {
		String result = getClass().getSimpleName() + " ";
		if (Strasse != null && !Strasse.trim().isEmpty())
			result += "Strasse: " + Strasse;
		if (Plz != null && !Plz.trim().isEmpty())
			result += ", Plz: " + Plz;
		if (Ort != null && !Ort.trim().isEmpty())
			result += ", Ort: " + Ort;
		if (Hsn != null && !Hsn.trim().isEmpty())
			result += ", Hsn: " + Hsn;
		return result;
	}
}