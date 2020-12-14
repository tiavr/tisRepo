ANNALES 2016 : 

1)

Medecin : idMed
Patient : idSS
Consultation : idConsultation
Parcours_Sante : idConsultation, idMed_a_consulter, id_nouvelle_consultation
Ordonnance : idConsultation, idMedicament

2°

CREATE TABLE Consultation(
idConsultation integer PRIMARY KEY,
idSS char(15) references Patient(idSS),
idMed integer references Medecin(idMed),
dateC date
constraint idSS CHECK (idSS NOT LIKE '%[^0_9]%')
);
CREATE TABLE Parcours_Sante(
idConsultation integer,
idMed_a_consulter integer,
id_nouvelle_consultation integer references Consultation(id_nouvelle_consultation),
PRIMARY KEY(idConsultation, idMed_a_consulter, id_nouvelle_consultation)
FOREIGN KEY (idConsultation, idMed_a_consulter) references Consultation(idConsultation, idMed)
)

CREATE TABLE Ordonnance(
idConsultation integer PRIMARY KEY,
idMedicament integer,
quantite integer,
FOREIGN KEY idConsultation references Parcours_Sante(idConsultation),
FOREIGN KEY idConsultation references Consultation(idConsultation)

);

3) On ne peut pas verifier que la demande de nouvelle Consultation est bien faite par un medecin traitant

Question 4 :

1) 
SELECT idSS, nom, idMedicament
FROM Patient NATURAL JOIN Consultation NATURAL JOIN Ordonnance;

2)

SELECT idMed, Med1.nom, idMed_a_consulter, Med2.nom
FROM Medecin Med1 NATURAL JOIN Consultation NATURAL JOIN Parcours_Sante JOIN Medecin Med2 on(idMed = idMed_a_consulter);

3)
SELECT idSS, nom
FROM Patient NATURAL JOIN Consultation NATURAL JOIN Medecin
WHERE specialite = 'médecin généraliste'
GROUP BY idSS, nom
HAVING COUNT(distinct idMed) = (SELECT count(idMed) FROM Medecin WHERE specialite = 'médecin généraliste';

4)
SELECT idMed
FROM Medecin NATURAL JOIN Consultation NATURAL JOIN Parcours_Sante
GROUP BY idMed
HAVING COUNT(distinct specialite) = (SELECT count(distinct specialite) FROM Medecin)

5)

SELECT idMed, dateC, count(idConsultation) NB_Cons
FROM Consultation
GROUP BY idMed, dateC;

6)

SELECT idMed, AVG(count(idConsultation))
FROM Consultation
GROUP BY idMed, dateC;


7)

SELECT idMed, count(distinct idSS)
FROM Consultation
GROUP BY idMed;

8)

SELECT idConsultation, sum(quantite)
FROM Ordonnance
GROUP BY idConsultation;

9)

SELECT idMed, AVG(quantite)
FROM Ordonnance NATURAL JOIN Consultation
GROUP BY idMed, idConsultation;

10)

SELECT idMed, AVG(count(idConsultation)), count(distinct idSS), Avg(quantite)
FROM Ordonnance NATURAL JOIN Consultation
GROUP BY idMed, idConsultation, dateC;

11)

SELECT idMedicament, count(distinct idSS)
FROM Ordonnance NATURAL JOIN Consultation
GROUP BY idMedicament;

12)
MAX RELATIF

SELECT idSS, idMed
FROM (SELECT idSS, idMed, count(*) maxMed
	  FROM Consultation
	  GROUP BY idSS, idMed)
WHERE (idSS, maxMed) IN (SELECT idSS, max(maxMed)
						FROM (SELECT idSS, idMed, count(*) maxMed
							  FROM Consultation
							  GROUP BY idSS, idMed)
						GROUP BY idSS
						)

13)

SELECT idSS, Patient.nom, idMed, Medecin.nom
FROM (SELECT idSS, idMed, count(*) maxMed
	  FROM Consultation
	  GROUP BY idSS, idMed) Consultation
NATURAL JOIN PATIENT JOIN Medecin on (Consultation.idMed = Medecin.idMed)
WHERE (idSS, maxMed) IN (SELECT idSS, max(maxMed)
						FROM (SELECT idSS, idMed, count(*) maxMed
							  FROM Consultation
							  GROUP BY idSS, idMed)
						GROUP BY idSS
						) 

14)

15)
SELECT idSS, Patient.nom, Medecin.nom, idMed
FROM Patient left join Medecin on(medecin_traitant = idMed)