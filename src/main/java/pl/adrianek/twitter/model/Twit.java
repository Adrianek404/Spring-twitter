package pl.adrianek.twitter.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Twit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private User user;

    private String content;

    @OneToMany(mappedBy = "twit", cascade = CascadeType.ALL)
    private List<Like> likes = new ArrayList<>();

}
