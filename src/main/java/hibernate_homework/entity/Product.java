package hibernate_homework.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id_produktu")
    private Integer id;

     @JsonProperty("nazwa_produktu")
    private String name;

    @JsonIgnore
    private String description;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "cat_id")
    private Category category;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category=" + category.getName() +
                '}';
    }
}

