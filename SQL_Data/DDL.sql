CREATE DATABASE IF NOT EXISTS apartmentdb;
USE apartmentdb;
CREATE TABLE flat (id INT NOT NULL, unit VARCHAR(40), configuration VARCHAR(40), currentstatus VARCHAR(40), apartment  VARCHAR(100));
INSERT INTO flat (id, unit, configuration, currentstatus, apartment) VALUES (1, 'B-211', '3-BHK', 'Rented', 'Genesis Ecosphere');
INSERT INTO flat (id, unit, configuration, currentstatus, apartment) VALUES (2, 'C-342', '2-BHK', 'Available', 'The Greens');
INSERT INTO flat (id, unit, configuration, currentstatus, apartment) VALUES (3, 'A-008', '2-BHK', 'Rented', 'Genesis Ecosphere');
