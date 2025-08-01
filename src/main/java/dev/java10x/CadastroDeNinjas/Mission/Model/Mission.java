package dev.java10x.CadastroDeNinjas.Mission.Model;

import dev.java10x.CadastroDeNinjas.Mission.Dto.Enum.MissionDifficulty;
import dev.java10x.CadastroDeNinjas.Ninjas.Model.Ninja;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_mission")
public class Mission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(value = EnumType.STRING)
    private MissionDifficulty difficulty;

    @OneToMany(mappedBy = "mission") // Uma/One Missao para muitos/Many ninjas
    private List<Ninja> ninjas;

}
