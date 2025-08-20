CREATE TABLE tb_mission (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    difficulty VARCHAR(50) NOT NULL
);

CREATE TABLE tb_ninjas (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    age INT NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    mission_id BIGINT,
    CONSTRAINT fk_ninja_mission FOREIGN KEY (mission_id) REFERENCES tb_mission(id)
);

