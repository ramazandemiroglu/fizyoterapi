create schema fizyoterapi;
USE fizyoterapi;


CREATE TABLE user
(
ID int not null AUTO_INCREMENT,
LastName varchar(255) not null ,
FirstName varchar(255) not null,
Tip int not null,
TC varchar(11) not null,
PRIMARY KEY (ID)
);
CREATE TABLE movement
(
ID int not null AUTO_INCREMENT,
Name varchar(255) not null, 
PRIMARY KEY (ID)
);

CREATE TABLE usermovement
(
ID int not null AUTO_INCREMENT,
PatientID int not null,
DoctorID int not null,
MovementID int not null,
PRIMARY KEY (ID),
 CONSTRAINT FOREIGN KEY (`PatientID`) REFERENCES `user` (`ID`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
    
     CONSTRAINT FOREIGN KEY (`DoctorID`) REFERENCES `user` (`ID`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
    
      CONSTRAINT FOREIGN KEY (`MovementID`) REFERENCES `movement` (`ID`)
    ON DELETE CASCADE
    ON UPDATE CASCADE

);

