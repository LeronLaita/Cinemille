CREATE TABLE IF NOT EXISTS sala (
	id LONG,
	nome_sala VARCHAR,
	capienza INTEGER,
	imax BOOLEAN,
	PRIMARY KEY(id)
	);
	
CREATE TABLE IF NOT EXISTS programmazione (
	id LONG,
	nome_film VARCHAR,
	descrizione VARCHAR,
	sala LONG,
	data_inizio DATE,
	data_fine DATE,
	PRIMARY KEY(id)
	);
	
CREATE TABLE IF NOT EXISTS programmazione_storico (
	id LONG,
	nome_film VARCHAR(255),
	descrizione VARCHAR(255),
	sala LONG,
	data_inizio DATE,
	data_fine DATE,
	in_sala BOOLEAN,
	PRIMARY KEY(id)
	);
	
	INSERT INTO sala (id, nome_sala, capienza, imax) VALUES (1, '1', 250, TRUE);
	INSERT INTO sala (id, nome_sala, capienza, imax) VALUES (2, '2', 50, FALSE);
	INSERT INTO sala (id, nome_sala, capienza, imax) VALUES (3, '3', 100, FALSE);
	INSERT INTO sala (id, nome_sala, capienza, imax) VALUES (4, '4', 75, FALSE);
	INSERT INTO sala (id, nome_sala, capienza, imax) VALUES (5, '5', 250, TRUE);
	INSERT INTO sala (id, nome_sala, capienza, imax) VALUES (6, '6', 150, FALSE);
	INSERT INTO sala (id, nome_sala, capienza, imax) VALUES (7, '7', 150, FALSE);
	INSERT INTO sala (id, nome_sala, capienza, imax) VALUES (8, '8', 50, FALSE);
	INSERT INTO sala (id, nome_sala, capienza, imax) VALUES (9, '9', 250, FALSE);
	INSERT INTO sala (id, nome_sala, capienza, imax) VALUES (10, '10', 100, FALSE);
	INSERT INTO sala (id, nome_sala, capienza, imax) VALUES (11, '11', 150, FALSE);
	INSERT INTO sala (id, nome_sala, capienza, imax) VALUES (12, '12', 50, FALSE);
	
	commit;
	
	INSERT INTO programmazione (id, nome_film, descrizione, sala, data_inizio, data_fine) VALUES (1, 'Principi e Principesse', 'descrizione principi e principesse', 6, '2023-05-01', '2023-05-14');
	INSERT INTO programmazione (id, nome_film, descrizione, sala, data_inizio, data_fine) VALUES (2, 'Avengers', 'descrizione Avengers', 6, '2023-07-01', '2023-07-14');
	INSERT INTO programmazione (id, nome_film, descrizione, sala, data_inizio, data_fine) VALUES (3, 'Shrek', 'descrizione Shrek', 6, '2024-01-01', '2023-01-14');
	INSERT INTO programmazione (id, nome_film, descrizione, sala, data_inizio, data_fine) VALUES (4, 'Il signore degli anelli', 'descrizione Il signore degli anelli', 6, '2023-03-14', '2023-03-21');
	INSERT INTO programmazione (id, nome_film, descrizione, sala, data_inizio, data_fine) VALUES (5, 'Overdriver', 'descrizione OverDriver', 6, '2021-05-01', '2021-05-14');
	INSERT INTO programmazione (id, nome_film, descrizione, sala, data_inizio, data_fine) VALUES (6, 'La bella e la bestia', 'descrizione la bella e la bestia', 6, '2022-05-01', '2022-05-14');
	INSERT INTO programmazione (id, nome_film, descrizione, sala, data_inizio, data_fine) VALUES (7, 'Il re Leone', 'descrizione Il re leone', 6, '2024-05-01', '2024-05-21');
	INSERT INTO programmazione (id, nome_film, descrizione, sala, data_inizio, data_fine) VALUES (8, 'Titanic', 'descrizione Titanic', 6, '2023-09-01', '2023-09-14');
	INSERT INTO programmazione (id, nome_film, descrizione, sala, data_inizio, data_fine) VALUES (9, 'Deadpool', 'descrizione deadpool', 6, '2023-12-01', '2023-12-14');
	
	commit;
	
	INSERT INTO programmazione_storico (id, nome_film, descrizione, sala, data_inizio, data_fine, in_sala) VALUES (1, 'Principi e Principesse', 'descrizione principi e principesse', 6, '2023-05-01', '2023-05-14', TRUE);
	INSERT INTO programmazione_storico (id, nome_film, descrizione, sala, data_inizio, data_fine, in_sala) VALUES (2, 'Avengers', 'descrizione Avengers', 6, '2023-07-01', '2023-07-14', TRUE);
	INSERT INTO programmazione_storico (id, nome_film, descrizione, sala, data_inizio, data_fine, in_sala) VALUES (3, 'Shrek', 'descrizione Shrek', 6, '2024-01-01', '2023-01-14', TRUE);
	INSERT INTO programmazione_storico (id, nome_film, descrizione, sala, data_inizio, data_fine, in_sala) VALUES (4, 'Il signore degli anelli', 'descrizione Il signore degli anelli', 6, '2023-03-14', '2023-03-21', TRUE);
	INSERT INTO programmazione_storico (id, nome_film, descrizione, sala, data_inizio, data_fine, in_sala) VALUES (5, 'Overdriver', 'descrizione OverDriver', 6, '2021-05-01', '2021-05-14', TRUE);
	INSERT INTO programmazione_storico (id, nome_film, descrizione, sala, data_inizio, data_fine, in_sala) VALUES (6, 'La bella e la bestia', 'descrizione la bella e la bestia', 6, '2022-05-01', '2022-05-14', TRUE);
	INSERT INTO programmazione_storico (id, nome_film, descrizione, sala, data_inizio, data_fine, in_sala) VALUES (7, 'Il re Leone', 'descrizione Il re leone', 6, '2024-05-01', '2024-05-21', TRUE);
	INSERT INTO programmazione_storico (id, nome_film, descrizione, sala, data_inizio, data_fine, in_sala) VALUES (8, 'Titanic', 'descrizione Titanic', 6, '2023-09-01', '2023-09-14', TRUE);
	INSERT INTO programmazione_storico (id, nome_film, descrizione, sala, data_inizio, data_fine, in_sala) VALUES (9, 'Deadpool', 'descrizione deadpool', 6, '2023-12-01', '2023-12-14', TRUE);
	
	commit;