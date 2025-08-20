package dev.java10x.CadastroDeNinjas.Ninjas.Model;

import dev.java10x.CadastroDeNinjas.Mission.Model.Mission;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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

    private String rank;

    @ManyToOne // Muitos/Many Ninjas para um/One Missao
    @JoinColumn(name = "mission_id") // FK
    private Mission mission;

}
