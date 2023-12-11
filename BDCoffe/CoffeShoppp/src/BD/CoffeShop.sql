CREATE DATABASE CoffeShop
GO
USE CoffeShop
GO
-- Tabla rol
CREATE TABLE rol (
    id_rol INT PRIMARY KEY IDENTITY(1,1),
    nombre_rol VARCHAR(20) UNIQUE,
);

-- Tabla usuario
CREATE TABLE usuario (
    id_usuario INT PRIMARY KEY IDENTITY(1,1),
    nombre VARCHAR(50),
    apellido VARCHAR(50),
    login VARCHAR(17) UNIQUE,
    contrasenia VARCHAR(100),
    id_rol INT NOT NULL,
    FOREIGN KEY (id_rol) REFERENCES rol(id_rol) 
	ON DELETE CASCADE 
	ON UPDATE CASCADE
);

-- Tabla categoria
CREATE TABLE categoria (
    id_categoria INT PRIMARY KEY IDENTITY(1,1),
    nombre_categoria VARCHAR(50) UNIQUE,
	descripcion VARCHAR(200)
);

-- Tabla producto
CREATE TABLE producto (
    id_producto INT PRIMARY KEY IDENTITY(1,1),
    id_categoria INT NOT NULL,
    nombre_producto VARCHAR(100),
    descripcion NVARCHAR(MAX),
    precio MONEY,
    FOREIGN KEY (id_categoria) REFERENCES categoria(id_categoria) 
	ON DELETE CASCADE 
	ON UPDATE CASCADE
);

ALTER TABLE producto
ALTER COLUMN precio MONEY

-- Tabla cliente

-- Tabla orden
CREATE TABLE orden (
    id_orden INT PRIMARY KEY IDENTITY(1,1),
    id_usuario INT NOT NULL,
    cliente VARCHAR(60),
    fecha_orden DATETIME DEFAULT GETDATE(),
    estado_orden VARCHAR(20),
    mesa INT,
	total DECIMAL,
    FOREIGN KEY (id_usuario) REFERENCES usuario(id_usuario) 
	ON DELETE CASCADE 
	ON UPDATE CASCADE,
);
-- Tabla orden_detalle
CREATE TABLE orden_detalle (
    id_detalle INT PRIMARY KEY IDENTITY(1,1),
    id_orden INT,
    id_producto INT,
    cantidad INT,
	precio_unitario DECIMAL,
	subtotal MONEY,
    FOREIGN KEY (id_orden) REFERENCES orden(id_orden) 
	ON DELETE CASCADE 
	ON UPDATE CASCADE,
    FOREIGN KEY (id_producto) REFERENCES producto(id_producto) 
	ON DELETE CASCADE 
	ON UPDATE CASCADE
);

GO

INSERT INTO rol	(nombre_rol)
VALUES ('Admin'),('Cajero'),('Cocinero');

GO

INSERT INTO categoria (nombre_categoria)
VALUES ('Bebida'),('Postre'),('Snack');

