package esprit.tn.ms2foyer.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "foyer")  // MongoDB collection name
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Foyer {

    @Id
    private String id;  // MongoDB uses String for ID by default
    private String name;
    private String location;
    private int capacity;
}
