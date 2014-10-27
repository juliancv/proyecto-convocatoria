DROP TABLE IF EXISTS AREA CASCADE;

CREATE TABLE AREA
(
cod_area VARCHAR (10) NOT NULL PRIMARY KEY
nombre VARCHAR (100) NOT NULL,
descripcion VARCHAR (200) NOT NULL
);

DROP TABLE IF EXISTS CAMA CASCADE;

CREATE TABLE CAMA
(
num_cama INTEGER NOT NULL PRIMARY KEY,
estado VARCHAR (20) NOT NULL,
descripcion VARCHAR (200) NOT NULL,
cod_area VARCHAR (10) NOT NULL,

CONSTRAINT area_fk FOREIGN KEY (cod_area)
REFERENCES AREA (cod_area)
ON UPDATE CASCADE ON DELETE NO ACTION
);

DROP TABLE IF EXISTS PERSONA CASCADE;

CREATE TABLE PERSONA
(
identificacion INTEGER NOT NULL PRIMARY KEY,
nombre VARCHAR(50) NOT NULL,
direccion VARCHAR (100) NOT NULL,
telefono INTEGER NOT NULL
);

DROP TABLE IF EXISTS PACIENTE CASCADE;

CREATE TABLE PACIENTE
(
identificacion INTEGER NOT NULL PRIMARY KEY,
fecha_nacimiento DATE NOT NULL,
actividad_economica VARCHAR(100) NOT NULL,
num_seguridad_social INTEGER NOT NULL,

CONSTRAINT persona_fk FOREIGN KEY (identificacion)
REFERENCES PERSONA (identificacion)
ON UPDATE CASCADE ON DELETE NO ACTION 
);

DROP TABLE IF EXISTS EMPLEADO CASCADE;

CREATE TABLE EMPLEADO
(
identificacion INTEGER NOT NULL PRIMARY KEY,
codigo_area VARCHAR (10) NOT NULL,
cargo VARCHAR(20) NOT NULL,
email VARCHAR(50) NOT NULL,
salario MONEY NOT NULL,
id_jefe INTEGER NOT NULL,

CONSTRAINT empleado_fk FOREIGN KEY (id_jefe)
REFERENCES EMPLEADO (identificacion)
ON UPDATE CASCADE ON DELETE NO ACTION, 

CONSTRAINT persona_fk FOREIGN KEY (identificacion)
REFERENCES PERSONA (identificacion)
ON UPDATE CASCADE ON DELETE NO ACTION 

);

DROP TABLE IF EXISTS ENFERMERA CASCADE;

CREATE TABLE ENFERMERA
(
identificacion INTEGER NOT NULL PRIMARY KEY,
anos_experiencia INTEGER NOT NULL,


CONSTRAINT empleado_fk FOREIGN KEY (identificacion)
REFERENCES EMPLEADO (identificacion)
ON UPDATE CASCADE ON DELETE NO ACTION
);

DROP TABLE IF EXISTS ENFERMERA_HABILIDADES CASCADE;

CREATE TABLE ENFERMERA_HABILIDADES
(
identificacion INTEGER NOT NULL PRIMARY KEY,
habilidad VARCHAR(50),

CONSTRAINT enfermera_fk FOREIGN KEY (identificacion)
REFERENCES ENFERMERA (identificacion)
ON UPDATE CASCADE ON DELETE NO ACTION
);

DROP TABLE IF EXISTS MEDICO CASCADE;

CREATE TABLE MEDICO
(
identificacion INTEGER NOT NULL PRIMARY KEY,
especialidad VARCHAR (100) NOT NULL,
universidad VARCHAR (100) NOT NULL,
num_licencia INTEGER NOT NULL,
CONSTRAINT empleado_fk FOREIGN KEY (identificacion)
REFERENCES EMPLEADO (identificacion)
ON UPDATE CASCADE ON DELETE NO ACTION
);




