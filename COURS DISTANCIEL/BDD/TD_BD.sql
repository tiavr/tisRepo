1a)
SELECT id
FROM Preferences
WHERE typeid = 'artiste' and NiveauP = 1;

1b)
SELECT DISTINCT Nom
FROM Artiste JOIN Preferences on (idArtiste = id)
WHERE typeid = 'artiste' and NiveauP = 1;

SELECT DISTINCT Nom
FROM Artiste
WHERE idArtiste in (SELECT id
FROM Preferences
WHERE typeid = 'artiste' and NiveauP = 1);

2)
SELECT DISTINCT Nom
FROM Artiste
WHERE idArtiste in (SELECT idArtiste FROM CD);

SELECT DISTINCT Nom
FROM Artiste NATURAL JOIN CD;

3)
SELECT DISTINCT Nom
FROM Artiste
WHERE idArtiste not in (SELECT idArtiste FROM CD);

SELECT idArtiste From Artiste 
MINUS
SELECT idArtiste from CD;

4)

SELECT DISTINCT Nom
FROM Artiste natural join CD
WHERE idCD in (SELECT DISTINCT id
FROM Preferences
WHERE typeid = 'CD' and NiveauP = 1);

SELECT DISTINCT idArtiste
FROM CD join Preferences on (idCD = id)
WHERE typeid = 'CD' and NiveauP = 1);

SELECT DISTINCT idArtiste
FROM CD
WHERE idCD in (SELECT id FROM Preferences where typeid ='CD' and NiveauP=1);

5) 
SELECT DISTINCT Nom
FROM Artiste natural join CD
WHERE idArtiste in 
(SELECT id
FROM Preferences
WHERE typeid = 'artiste' and NiveauP = 1) 
AND idCD not in 
(SELECT id 
FROM Preferences
WHERE typeid = 'CD' and NiveauP = 1);

REPONSE DU PROF : 

select distinct nom
from artiste
where 
idartisite in (select id
from Preferences
where NiveauP=1
and Typeid='artiste' )
and idartiste NOT IN (
SELECT idArtiste
FROM CD join Preferences on (idCD = id)
WHERE typeid = 'CD' and NiveauP = 1))
and idArtiste in (select idArtiste from CD);

6)
SELECT count(*) 
FROM Preferences 
WHERE typeid = 'artiste' AND NiveauP = 1);

7) 
SELECT idCD, count(idMorceaux)
FROM ContenuCD join CD using(idCD) 
GROUP BY idCD;

8) 
SELECT idArtiste, count(idCD)
FROM CD
GROUP BY idArtiste;


9)
SELECT idArtiste, count(idMorceaux)
FROM CD JOIN ContenuCD using(idCD)
GROUP BY idArtiste;

10)
SELECT idArtiste, count(idCD)
FROM CD
WHERE idCD in (SELECT id FROM Preferences WHERE typeid = 'CD' and NiveauP = 1)
GROUP BY idArtiste;

SELECT idArtiste, count(idCD)
FROM CD JOIN Preferences on (idCD = id)
WHERE typeid = 'CD' and NiveauP = 1
GROUP BY idArtiste;

11)
SELECT idArtiste
FROM CD
GROUP BY idArtiste
HAVING count(idCD) >= 2;

12)
SELECT idArtiste
FROM CD
WHERE idCD in (SELECT id FROM Preferences WHERE typeid = 'cd' AND NiveauP = 1)
GROUP BY idArtiste
HAVING count(idCD) > 3;

13) 
SELECT count(idCD)
FROM CD JOIN CategorieCD on (idCD=id)
WHERE typeid = 'CD'
GROUP BY typeArtistique;


