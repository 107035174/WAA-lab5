package lab5.lab5.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Book extends Product {
    @Getter
    @Setter
    @Column(name = "book_title")
    private String title;

    public Book() {
    }

    public Book(String name, String desc, String title) {
        super(name, desc);
        this.title = title;
    }
}
