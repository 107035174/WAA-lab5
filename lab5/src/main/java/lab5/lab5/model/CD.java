package lab5.lab5.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
public class CD extends Product {
    @Getter
    @Setter
    @Column(name = "CD_artist")
    private String artist;

    public CD() {
    }

    public CD(String name, String desc, String artist) {
        super(name, desc);
        this.artist = artist;
    }
}
