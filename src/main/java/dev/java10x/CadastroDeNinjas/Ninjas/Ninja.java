package dev.java10x.CadastroDeNinjas.Ninjas;

import dev.java10x.CadastroDeNinjas.Missoes.Mission;
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
@Entity // Entity ele transforma uma classe em uma entidade do BD
@Table(name = "tb_ninjas")
public class Ninja {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private int age;

    @Column(unique = true)
    private String email;

    @ManyToOne // Muitos/Many Ninjas para um/One Missao
    @JoinColumn(name = "missionId") // FK
    private Mission mission;

}
