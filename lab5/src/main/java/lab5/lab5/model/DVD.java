package lab5.lab5.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
public class DVD extends Product {
    @Getter
    @Setter
    @Column(name = "DVD_genre")
    private String genre;

    public DVD() {

    }

    public DVD(String name, String desc, String genre) {
        super(name, desc);
        this.genre = genre;
    }
}
