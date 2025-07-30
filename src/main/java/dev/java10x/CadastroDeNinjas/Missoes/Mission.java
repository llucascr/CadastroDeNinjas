package dev.java10x.CadastroDeNinjas.Missoes;

import dev.java10x.CadastroDeNinjas.Ninjas.Ninja;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class Mission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(value = EnumType.STRING)
    private MissionDifficulty difficulty;

    @OneToMany(mappedBy = "mission") // Uma/One Missao para muitos/Many ninjas
    private List<Ninja> ninjas;

    public Mission() {
    }

    public Mission(Long id, String name, MissionDifficulty difficulty) {
        this.id = id;
        this.name = name;
        this.difficulty = difficulty;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MissionDifficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(MissionDifficulty difficulty) {
        this.difficulty = difficulty;
    }

}
