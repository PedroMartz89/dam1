DROP DATABASE IF EXISTS aeropuerto;
CREATE DATABASE aeropuerto CHARSET=utf8mb4;
USE aeropuerto;

CREATE TABLE avion (
    id_avion INT NOT NULL PRIMARY KEY,
    matricula VARCHAR(255) NOT NULL,
    numregistro INT,
    fregistro DATE NOT NULL,
    fconstruccion DATE NOT NULL,
    antiguedad INT NOT NULL
) ENGINE=InnoDB;

CREATE TABLE pilotos (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    licencia VARCHAR(255) NOT NULL,
    nombre VARCHAR(255),
    direccion VARCHAR(255),
    nss BIGINT NOT NULL
) ENGINE=InnoDB;

CREATE TABLE tipo (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    modelo VARCHAR(255) NOT NULL,
    capacidad VARCHAR(255),
    peso INT,
    id_avion INT NOT NULL,
    id_pilotos INT NOT NULL,
    FOREIGN KEY (id_avion) REFERENCES avion(id_avion) ON DELETE RESTRICT,
    FOREIGN KEY (id_pilotos) REFERENCES pilotos(id) ON DELETE CASCADE
) ENGINE=InnoDB;

CREATE TABLE mecanico (
    id_mecanico INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nss BIGINT NOT NULL,
    salario FLOAT NOT NULL,
    nombre VARCHAR(255) NOT NULL
) ENGINE=InnoDB;

CREATE TABLE reparacion (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    id_mecanico INT NOT NULL,
    id_avion INT NOT NULL,
    fecha DATE NOT NULL,
    numhoras INT NOT NULL,
    codigo INT NOT NULL,
    FOREIGN KEY (id_mecanico) REFERENCES mecanico(id_mecanico),
    FOREIGN KEY (id_avion) REFERENCES avion(id_avion)
) ENGINE=InnoDB;

CREATE TABLE hangar (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    localizacion VARCHAR(255) NOT NULL,
    capacidad BIGINT NOT NULL,
    id_avion INT NOT NULL,
    FOREIGN KEY (id_avion) REFERENCES avion(id_avion)
) ENGINE=InnoDB;

CREATE TABLE propietario (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    telefono VARCHAR(255) NOT NULL,
    nombre VARCHAR(255) NOT NULL,
    direccion VARCHAR(255) NOT NULL,
    nss BIGINT NOT NULL
) ENGINE=InnoDB;

CREATE TABLE compras (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    id_avion INT NOT NULL,
    id_propietario INT NOT NULL,
    fcompra DATE NOT NULL,
    precio FLOAT NOT NULL,
    FOREIGN KEY (id_avion) REFERENCES avion(id_avion),
    FOREIGN KEY (id_propietario) REFERENCES propietario(id)
) ENGINE=InnoDB;
