package dev.java10x.CadastroDeNinjas.Ninjas;

import dev.java10x.CadastroDeNinjas.Missoes.Mission;
import jakarta.persistence.*;

import java.util.List;

@Entity // Entity ele transforma uma classe em uma entidade do BD
@Table(name = "tb_ninjas")
public class Ninja {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private int age;

    private String email;

    @ManyToOne // Muitos/Many Ninjas para um/One Missao
    @JoinColumn(name = "missionId") // FK
    private Mission mission;

    public Ninja() {
    }

    public Ninja(String nome, int age, String email) {
        this.nome = nome;
        this.age = age;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
