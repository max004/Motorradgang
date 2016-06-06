CREATE DATABASE IF NOT EXISTS Motorradgang;
USE Motorradgang;

CREATE TABLE Motorradfahrer(
MotorradfahrerID INT NOT NULL, 
Vorname VARCHAR(30) NOT NULL, 
Nachname VARCHAR(30) NOT NULL,
Motorrad VARCHAR(30) NOT NULL,
Geschlecht CHAR(1) NOT NULL,
PRIMARY KEY(MotorradfahrerID)
);

CREATE TABLE Strecke(
StreckenID INT NOT NULL,
Startort VARCHAR(30) NOT NULL,
StartPlz VARCHAR(10) NOT NULL,
StartLand VARCHAR(3) NOT NULL,
Zielort VARCHAR(30) NOT NULL,
ZielPlz VARCHAR(10) NOT NULL,
ZielLand VARCHAR(3) NOT NULL,
PRIMARY KEY(StreckenID)
);

CREATE TABLE Ausfahrt(
MotorradfahrerID INT NOT NULL,
StreckenID INT NOT NULL,
Zeitpunkt DATETIME NOT NULL,
Beschreibung VARCHAR(100) NOT NULL,
KEY(StreckenID),
KEY(MotorradfahrerID),
FOREIGN KEY (StreckenID) REFERENCES Strecke (StreckenID) ON DELETE CASCADE,
FOREIGN KEY (MotorradfahrerID) REFERENCES Motorradfahrer (MotorradfahrerID) ON DELETE CASCADE
);
