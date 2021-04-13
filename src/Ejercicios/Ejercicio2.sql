SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS Cursan;
DROP TABLE IF EXISTS Hacen;
DROP TABLE IF EXISTS Realizan;
DROP TABLE IF EXISTS Alumnos;
DROP TABLE IF EXISTS Asignaturas;
DROP TABLE IF EXISTS Elaboran;
DROP TABLE IF EXISTS Examenes;
DROP TABLE IF EXISTS Practicas;
DROP TABLE IF EXISTS Profesores;




/* Create Tables */

CREATE TABLE Alumnos
(
	Num_Alum  NOT NULL,
	Nombre ,
	Grupo ,
	PRIMARY KEY (Num_Alum)
);


CREATE TABLE Asignaturas
(
	Num_Ash  NOT NULL,
	Nombre ,
	Num_Prof  NOT NULL,
	PRIMARY KEY (Num_Ash)
);


CREATE TABLE Cursan
(
	Num_Alum  NOT NULL,
	Num_Ash  NOT NULL,
	Trimestre 
);


CREATE TABLE Elaboran
(
	Cod_Practica  NOT NULL,
	Num_Prof  NOT NULL,
	Fecha 
);


CREATE TABLE Examenes
(
	Num_Exa  NOT NULL,
	Npreguntas ,
	Fecha ,
	PRIMARY KEY (Num_Exa)
);


CREATE TABLE Hacen
(
	Num_Alum  NOT NULL,
	Num_Exa  NOT NULL,
	Nota 
);


CREATE TABLE Practicas
(
	Cod_Practica  NOT NULL,
	Titulo ,
	Nivel ,
	PRIMARY KEY (Cod_Practica)
);


CREATE TABLE Profesores
(
	Num_Prof  NOT NULL,
	Nombre ,
	PRIMARY KEY (Num_Prof)
);


CREATE TABLE Realizan
(
	Cod_Practica  NOT NULL,
	Num_Alum  NOT NULL,
	Nota ,
	Fecha 
);



/* Create Foreign Keys */

ALTER TABLE Cursan
	ADD FOREIGN KEY (Num_Alum)
	REFERENCES Alumnos (Num_Alum)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Hacen
	ADD FOREIGN KEY (Num_Alum)
	REFERENCES Alumnos (Num_Alum)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Realizan
	ADD FOREIGN KEY (Num_Alum)
	REFERENCES Alumnos (Num_Alum)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Cursan
	ADD FOREIGN KEY (Num_Ash)
	REFERENCES Asignaturas (Num_Ash)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Hacen
	ADD FOREIGN KEY (Num_Exa)
	REFERENCES Examenes (Num_Exa)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Elaboran
	ADD FOREIGN KEY (Cod_Practica)
	REFERENCES Practicas (Cod_Practica)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Realizan
	ADD FOREIGN KEY (Cod_Practica)
	REFERENCES Practicas (Cod_Practica)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Asignaturas
	ADD FOREIGN KEY (Num_Prof)
	REFERENCES Profesores (Num_Prof)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Elaboran
	ADD FOREIGN KEY (Num_Prof)
	REFERENCES Profesores (Num_Prof)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



