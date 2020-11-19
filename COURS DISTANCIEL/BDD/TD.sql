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

SELECT idCD,  COUNT (idMorceau) NbMorceau
FROM ContenuCD 
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
SELECT idArtiste, count(idCD) Nb_Cd_Pref
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
HAVING count(idCD) >= 3;

SELECT idArtiste
FROM CD JOIN Preferences on (idCD = id)
WHERE typeid ='cd' AND NiveauP = 1
GROUP BY idArtiste
HAVING count(idCD) > 3;

13) 
Select categArt, Count(idCD)
From CD Natural join Artiste
Group by categArt;


14)
SELECT count(idCD)
FROM CD JOIN Categorie on(idCD = id)
WHERE typeid = 'cd'
GROUP BY idArtiste, typeArtistique;

SELECT count(idCD)
FROM CD
WHERE idCD IN (SELECT id from Categorie WHERE typeid = 'cd')
GROUP BY idArtiste, typeArtistique;

15)
SELECT typeArtistique, count(idArtiste)
FROM Categorie JOIN CD on(id = idCD)
WHERE typeid = 'cd'
GROUP BY typeArtistique;


8bis) 

SELECT DISTINCT Nom, Nb_CD
FROM 
(SELECT idArtiste, COUNT(idCD) Nb_CD 
FROM CD 
GROUP BY idArtiste)
NATURAL JOIN Artiste


8ter)
SELECT Nom, count(idCD)
FROM Artiste natural join CD
GROUP BY Nom;

7bis)
SELECT Distinct titre, NbMorceau
FROM (SELECT idCD,  COUNT (idMorceau) NbMorceau
FROM ContenuCD 
GROUP BY idCD ) 
NATURAL JOIN CD


9bis)

SELECT DISTINCT Nom, NB_Morceaux
from  (SELECT idArtiste, count(idMorceaux) NB_Morceaux 
from CD join ContenuCD using (idCD) 
GROUP BY idArtiste) 
natural join Artiste

10bis)
select distinct nom, nb
from
(SELECT COUNT (id) nb , idArtiste

FROM PREFERENCE JOIN CD ON (idCD=id)

WHERE typeid=’CD’ AND preference=1

Group by idArtiste)
natural join artiste

16)
SELECT idArtiste
FROM 
	(SELECT idArtiste, count(idCD) Nb_Cd_Pref
	FROM CD
	WHERE idCD in (SELECT id FROM Preferences WHERE typeid = 'CD' and NiveauP = 1)
	GROUP BY idArtiste)
NATURAL JOIN 
	(SELECT idArtiste, max(count(idCD)) Nb_Cd_Pref 
	 FROM CD
	 WHERE idCD in (SELECT id FROM Preferences WHERE typeid = 'CD' and NiveauP = 1)
	 GROUP BY idArtiste)
GROUP BY idArtiste;

SELECT idArtiste
FROM CD
WHERE idCD in (SELECT id FROM Preferences WHERE typeid = 'CD' and NiveauP = 1)
GROUP BY idArtiste
HAVING count(idCD) = (SELECT max(count(idCD)) 
							FROM CD 
							WHERE idCD in (SELECT id FROM Preferences WHERE typeid = 'CD' and NiveauP = 1)
							GROUP BY idArtiste)

17)
SELECT idCD
FROM (
		SELECT idCD, count(idMorceaux) Nb_Morceaux
		FROM contenuCD 
		GROUP BY idCD)
NATURAL JOIN (
				Select max(count(idMorceaux)) Nb_Morceaux
				FROM ContenuCD
				GROUP BY idCD)
GROUP BY idCD;

SELECT idCD
FROM contenuCD
GROUP BY idCD
HAVING count(idMorceaux) = (SELECT max(count(idMorceaux)) FROM ContenuCD GROUP BY idCD);





18)
SELECT idArtiste
FROM (SELECT idArtiste, count(idCD) Nb_CD
		FROM CD
		WHERE DateCD BETWEEN '01/01/2017' AND '31/12/2017'
		GROUP BY idArtiste)
NATURAL JOIN
	(SELECT max(count(idCD)) Nb_CD
	FROM CD
	WHERE DateCD BETWEEN '01/01/2017' AND '31/12/2017'
	GROUP BY idArtiste)
GROUP BY idArtiste;

SELECT idArtiste
FROM CD
WHERE DateCD BETWEEN '01/01/2017' AND '31/12/2017'
GROUP BY idArtiste
HAVING count(idCD) = (SELECT max(count(idCD)) 
					FROM CD 
					WHERE DateCD BETWEEN '01/01/2017' AND '31/12/2017'
					GROUP BY idArtiste)
					
19)
SELECT idArtiste
FROM (SELECT idArtiste, count(idCD) nb_cd
	FROM CD
	WHERE idCD in (SELECT id FROM Preferences WHERE typeid = 'artiste' and NiveauP = 1)
	GROUP BY idArtiste)
NATURAL JOIN
	(SELECT max(count(idCD)) nb_cd
	FROM CD
	WHERE idCD in (SELECT id FROM Preferences WHERE typeid = 'artiste' and NiveauP = 1))
GROUP BY idArtiste;

SELECT idArtiste
FROM CD
WHERE idCD in (SELECT id FROM Preferences WHERE typeid = 'artiste' and NiveauP = 1)
GROUP BY idArtiste
HAVING count(idCD) = (SELECT max(count(idCD)) 
							FROM CD 
							WHERE idCD in (SELECT id FROM Preferences WHERE typeid = 'artiste' and NiveauP = 1)
							GROUP BY idArtiste)

20)
					
SELECT typeArtistique, idArtiste
FROM (select typeArtistique , idArtiste , count(idcd) nbCD  
	from CD join categorie on (idCD=id) where typeid=’cd’
	group by typeArtistique, idArtiste)

NATURAL JOIN
	(SELECT typeArtistique, max(idCD) nbCD
	FROM 
		(select typeArtistique , idArtiste , count(idcd) nbCD  
		from CD join categorie on (idCD=id) where typeid=’cd’
		group by typeArtistique, idArtiste)
	group by typeArtistique  )
	
Version Bloc imbriqué : 
Select typeArtistique , idArtiste
from 
	(select typeArtistique , idArtiste , count(idcd) nbCD  
	from CD join categorie on (idCD=id) where typeid=’cd’
	group by typeArtistique, idArtiste) 
Where ( typeArtistique , nbCD) in 
								(select typeArtistique , max(nbCd) 
								from 
									(select typeArtistique , idArtiste , count(idcd) nbCD  
									from CD join categorie on (idCD=id) where typeid=’cd’
									group by typeArtistique, idArtiste)  
								group by typeArtistique);


	
TD : INVITATIONS

1)
SELECT distinct nomV
FROM LeMenu
WHERE nomP = 'médaillon de langouste'

2)
SELECT DISTINCT nomP, nomV
FROM LeMenu
WHERE dateR = '21/10/2017';

3)
SELECT DISTINCT nomA
FROM LesPreferences
WHERE nomA NOT IN (SELECT nomI
					FROM LesRepas)
				
SELECT nomA
FROM LesPreferences
MINUS
SELECT nomI
FROM LesRepas
					
4) 
SELECT dateR, nomP, nomV
FROM LeMenu NATURAL JOIN LesRepas
WHERE nomI = 'Jacques' and nomI = 'Thomas'

5)
SELECT DISTINCT nomA
FROM LesPreferences NATURAL JOIN LeMenu

6)
SELECT nomI
FROM LesRepas
GROUP BY nomI
HAVING count(*) >= 2;

7)
SELECT nomI
FROM LesRepas JOIN (LesPreferences Natural Join LesPlats) on(nomI = nomA)
WHERE typeP = 'dessert'

8)
SELECT DISTINCT nomA
FROM LesPreferences JOIN LesRepas on (nomA = nomI)
WHERE (nomP,nomA) NOT IN 
				(SELECT nomP, nomI
				FROM LeMenu NATURAL JOIN LesRepas)
					

