/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Maicol
 * Created: 31/08/2021
 */

/*TABLA concurso*/
CREATE TABLE concurso(
	con_id INT NOT NULL PRIMARY KEY,
	con_nombre CHAR(50) NULL
);

INSERT INTO concurso VALUES(101,"canto");
INSERT INTO concurso VALUES(102,"bailo");

/*TABLA participantes */

CREATE TABLE participantes (
	par_login CHAR(20) NOT NULL PRIMARY KEY ,
	par_nombre CHAR(20) NULL,
	par_apellido CHAR(45) NULL,
	par_email CHAR(45) NULL,
	par_celular BIGINT NULL,
	par_clave CHAR(45) NULL,
	par_fecha_nto DATE NULL
);

INSERT INTO participantes VALUES ("rortiz", "Roberto", "Ortiz", "rortiz@gmail.com",1234567890,"nnn","1990-01-01");
INSERT INTO participantes VALUES ("paploper", "Pablo", "Perez", "paploper@gmail.com",1234567890,"nnn","1991-02-02");
INSERT INTO participantes VALUES ("nataper", "Natali", "Perez", "nataper@gmail.com",1234567890,"nnn","1992-03-03");
INSERT INTO participantes VALUES ("jaironi", "Jairo", "Nieto", "jaironi@gmail.com",1234567890,"nnn","1993-04-04");
INSERT INTO participantes VALUES ("Jairve", "Jair", "Velasco", "Jairve@gmail.com",1234567890,"nnn","1994-05-05");
INSERT INTO participantes VALUES ("luisco", "Luis", "Cortez", "luisco@gmail.com",1234567890,"nnn","1995-06-06");
INSERT INTO participantes VALUES ("renegó", "Rene", "Gómez", "renegó@gmail.com",1234567890,"nnn","1996-07-07");
INSERT INTO participantes VALUES ("camiru", "Camilo", "Rueda", "camiru@gmail.com",1234567890,"nnn","1997-08-08");

/*TABLE participacion*/

CREATE TABLE participacion(
	pn_id INT NOT NULL  PRIMARY KEY,
	pn_user CHAR(20) NOT NULL,
	pn_concurso INT NOT NULL,
    pn_actuacion CHAR(30) NOT NULL,
	pn_fecha DATETIME NULL,
	FOREIGN KEY (pn_concurso) REFERENCES concurso(con_id),
	FOREIGN KEY (pn_user) REFERENCES participantes(par_login)

);


INSERT INTO participacion VALUES (1001,"rortiz",101,"Amiga","2021-08-10 20:00");
INSERT INTO participacion VALUES (1002,"rortiz",101,"Tu","2021-08-15 18:30");
INSERT INTO participacion VALUES (1003,"rortiz",102,"Salsa","2021-08-20 20:30:18");
INSERT INTO participacion VALUES (1004,"paploper",101,"Amiga","2021-08-10 20:30");
INSERT INTO participacion VALUES (1005,"nataper",101,"Gracias a ti","2021-08-14 20:30");
INSERT INTO participacion VALUES (1006,"nataper",102,"Las locuras mías","2018-08-15 21:30");
INSERT INTO participacion VALUES (1007,"nataper",102,"Cumbia","2021-08-14 15:30");
INSERT INTO participacion VALUES (1008,"jaironi",101,"Cumbia","2021-08-14 15:30");
INSERT INTO participacion VALUES (1009,"jaironi",101,"Samba","2021-08-13 18:30" );
INSERT INTO participacion VALUES (1010,"Jairve",102,"Break dance","2021-08-16 20:30");
INSERT INTO participacion VALUES (1011,"Jairve",102,"Salsa","2021-08-14 18:30:20" );
INSERT INTO participacion VALUES (1012,"Jairve",102,"Flamenco","2021-08-14 18:30" );
INSERT INTO participacion VALUES (1013,"renegó",101,"Danza irlandesa","2021-08-12 21:30" );
INSERT INTO participacion VALUES (1014,"camiru",102,"Las locuras mías","2021-08-13 17:30");
INSERT INTO participacion VALUES (1015,"camiru",102,"Tu","2021-08-16 18:30");
INSERT INTO participacion VALUES (1016,"camiru",102,"La gata bajo la lluvia","2021-08-16 18:30");

/*TABLA baile*/

CREATE TABLE baile(
	bai_id INT NOT NULL,
    bai_nombre CHAR(30) NOT NULL,
    bai_antiguedad INT NULL,
	bai_duracion INT NULL,
	FOREIGN KEY (bai_id) REFERENCES concurso(con_id)
);

INSERT INTO baile VALUES(102,"Cumbia",40,5);
INSERT INTO baile VALUES(102,"Samba",50,5);
INSERT INTO baile VALUES(102,"Break dance",30,4);
INSERT INTO baile VALUES(102,"Salsa",30,4);
INSERT INTO baile VALUES(102,"Danza irlandesa",34,7);
INSERT INTO baile VALUES(102,"Arrow",35,6);
INSERT INTO baile VALUES(102,"Polca",50,6);
INSERT INTO baile VALUES(102,"Danza clasica",56,5);

/*TABLA cantante*/

CREATE TABLE cantante(
	can_id INT PRIMARY KEY,
    can_nombre CHAR(20),
    can_apellido CHAR(20),
    can_nacionalidad CHAR(40)
);

insert into cantante values (101, "Miguel "," Bose ", "español");
insert into cantante values (102, "Silvestre ", "Dangond ", "colombiano");
insert into cantante values (103, "Jeison ", "Jiménez", "colombiano");
insert into cantante values (104, "Carin", "León", "mexicano");
insert into cantante values (105, "Roció", "Dúrcal", "española");


/*TABLA cancion*/


CREATE TABLE cancion(
	ca_id INT NOT NULL,
    ca_nombre CHAR(30) NULL,
	ca_genero CHAR(20) NULL,
	ca_anio YEAR NULL,
	ca_cantante INT NOT NULL,
    FOREIGN KEY (ca_id)REFERENCES concurso (con_id),
    FOREIGN KEY (ca_cantante) REFERENCES cantante (can_id)
);

INSERT INTO cancion VALUES(102,"Amiga","Balada","1990",101);
INSERT INTO cancion VALUES(102,"Las locuras mias","vallenato","2019",102);
INSERT INTO cancion VALUES(102,"Gracias a ti","popular","2020",103);
INSERT INTO cancion VALUES(102,"Tu","popular","2019",104);
INSERT INTO cancion VALUES(102,"La gata bajo la lluvia","Balada","1981",105);


/*ACTUALIZACIONES*/

UPDATE cancion SET ca_anio = 1988 WHERE ca_nombre = "Amiga";

UPDATE participantes SET par_celular = "3115678432" WHERE par_login = "Jairve";

DELETE FROM participacion WHERE pn_user = "camiru" AND pn_actuacion = "tu";

/*CONSULTAS*/

Select 'Consulta 1';
SELECT bai_nombre FROM baile UNION ALL SELECT ca_nombre FROM cancion ORDER BY bai_nombre ASC;
Select 'Consulta 2';
SELECT ca_nombre, ca_genero, ca_anio FROM cancion WHERE  ca_anio > "2000" ORDER BY ca_nombre;
Select 'Consulta 3';
SELECT cancion.ca_nombre FROM cancion INNER JOIN cantante ON(cantante.can_id = cancion.ca_cantante) WHERE cantante.can_nombre = "Roció";
Select 'Consulta 4';
SELECT participacion.pn_actuacion FROM participacion WHERE pn_user = "rortiz" ORDER BY pn_actuacion;
Select 'Consulta 5';
SELECT par_login,par_nombre,par_apellido FROM participantes INNER JOIN participacion on (participantes.par_login = participacion.pn_user) WHERE participacion.pn_actuacion = "Las locuras mías";
Select 'Consulta 6';
SELECT COUNT(ca_nombre) FROM cancion WHERE  ca_anio <= "2020" 