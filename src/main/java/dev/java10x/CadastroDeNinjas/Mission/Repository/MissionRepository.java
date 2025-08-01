package dev.java10x.CadastroDeNinjas.Mission.Repository;

import dev.java10x.CadastroDeNinjas.Mission.Model.Mission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MissionRepository extends JpaRepository<Mission, Long> {
}
