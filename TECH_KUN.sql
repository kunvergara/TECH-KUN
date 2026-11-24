-- BASE DE DATOS TECH KUN
CREATE DATABASE IF NOT EXISTS tech_kun;

-- SELECCIONAR BASE DE DATOS
USE tech_kun;

-- CREAR TABLA DE PRODUCTOStech_kun
CREATE TABLE IF NOT EXISTS producto (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    descripcion VARCHAR(255),
    precio DECIMAL(10,2) NOT NULL,
    cantidad INT NOT NULL
);

-- CONSULTAR PRODUCTOS
INSERT INTO producto (nombre, descripcion, precio, cantidad)
VALUES ('Mouse inalambrico', 'Mouse USB para computador', 45000, 10);
SELECT * FROM producto;

SELECT * FROM producto;
DELETE FROM producto
WHERE id = 1;