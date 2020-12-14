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
ou requete type : miroir
SELECT dateR, nomP, nomV
FROM LeMenu natural join LesRepas R1 join LesRepas R2 on (R1.date = R2.date)
WHERE R1.nomI = 'Thomas' and R2.nomI = 'Jacques'

SELECT dateR, nomP, nomV
FROM LeMenu NATURAL JOIN LesRepas
WHERE nomI='Jacques'
INTERSECT
SELECT dateR, nomP, nomV
FROM LeMenu NATURAL JOIN LesRepas
WHERE nomI = 'Thomas'

5)

Select DISTINCT nomI
From LesRepas natural join LesMenus
Where (nomI,nomP) in (Select nomA, nomP 
    From LesPréférences)

Select distinct nomI
From LesRepas natural join LesMenus  join LesPréférences on
( nomI=nomA and LesMenus.nomP=LesPréférences.nomP );



6)
SELECT nomI
FROM LesRepas
GROUP BY nomI
HAVING count(*) >= 2;

7)
select nomI
From Les preferences  natural join LesPlats
Where typeP = ‘dessert’
Minus
(select nomI
From Les preferences  natural join LesPlats
Where typeP != ‘dessert’)


8)
Select distinct nomA
From LesPreférences
Where nomA not in (select nomA  
                   From  LesRepas Natural Join LeMenu  join  LesPreferences on (nomI= nomA and LeMenu.nomP= LesPreférence.nomP))
					

9)
SELECT nomI
FROM LesRepas NATURAL JOIN LeMenu
WHERE nomI NOT IN (SELECT nomI
					FROM LesPreferences JOIN LesRepas on (nomA = nomI)
					WHERE nomP = 'fois gras')

SELECT nomI
FROM LesRepas NATURAL JOIN LeMenu
WHERE nomP = 'foie gras'
MINUS
SELECT nomI
FROM LesPreferences JOIN LesRepas on (nomA = nomI)
WHERE nomP = 'fois gras'

10) 
SELECT DISTINCT nomI, nomP, nomV
FROM LesRepas NATURAL JOIN LeMenu
WHERE dateR = (SELECT max(dateR)
			   FROM LesRepas NATURAL JOIN LeMenu);

SELECT DISTINCT nomI, nomP, nomV
FROM LesRepas NATURAL JOIN LeMenu 
NATURAL JOIN (SELECT max(dateR) dateR
			   FROM LesRepas NATURAL JOIN LeMenu)

11)
DIVISION INTERNE

Select nomI
From LesRepas
Group by nomI
Having count(distinct dateR) = (select count (distinct dateR)
     							from LesRepas)

Select nomI
From (select nomI, count(distinct dateR) TR
           from LesRepas
           group by nomI)
Natural join (select count(distinct dateR) TR
     			from LesRepas)

12)

MAXIMUM ABSOLU 

select NomA, NomP
from Lesplats
where nomA in
			(select nomI 
			from lesRepas 
			group by nomI
			having count(dateR)=(select max(count(dateR)) from LesRepas group by nomI))

select NomA, NomP
from Lesplats join
				(select nomI 
				from lesRepas 
				group by nomI
				having count(dateR)=(select max(count(dateR)) from LesRepas group by nomI))
on (nomA=nomI)

13)
MAXIMUM RELATIF

RELATION : 
select dateR, nomI, count(*)nbPMP
from LesRepas natural join LeMenu join LesPréférences on (nomI=nomA and LeMenu.nomP=LesPréférences.nomP)
group by dateR, nomI

requete : 
select dateR, nomI
from  (select dateR, nomI, count(*)nbPMP
		from LesRepas natural join LeMenu join LesPréférences on (nomI=nomA and  LeMenu.nomP=LesPréférences.nomP)
		group by dateR, nomI)
where (dateR,nbPMP) in  (select dateR, max(nbPMP)
   						from  (select dateR, nomI, count(*) nbPMP
								from LesRepas natural join LeMenu join LesPréférences on (nomI=nomA and LeMenu.nomP=LesPréférences.nomP)
								group by dateR, nomI)
   						group by dateR)


14)
Select dateR, count(distinct nomI)
from LesRepas natural join LeMenu join LesPréférences on (nomI = nomA and LeMenu.nomP = LesPréférences.nomP)
group by dateR;

15)
DIVISION EXTERNE
Select nomA, count(distinct typeP)
From LesPreferences natural join LesPlats
Group By nomA
Having count(distinct typeP)= (Select count(distinct typeP) from LesPlats)

16)
select count (nomI), month(dateR)
from LesRepas  
group by month(dateR) ; 

17)
MAX RELATIF
RELATION : 
(SELECT nomp, nomv, COUNT(dater) nbfois
FROM lemenu
GROUP BY nomp, nomv)

SELECT nomp, nomv, nbfois
FROM (SELECT nomp, nomv, COUNT(dater) nbfois
              FROM lemenu
              GROUP BY nomp, nomv)
WHERE (nomp, nbfois) IN (SELECT nomp, MAX(nbfois)
					     FROM (SELECT nomp, nomv, COUNT(dater) nbfois
					     		FROM lemenu
					     		GROUP BY nomp, nomv)
      					GROUP BY nomp)

18)

Select nomA, count(dateR), count(nomP), count(distinct typeP)
from LesRepas natural join LesPlats right outer join LesPreferences 
on (nomI = nomA and LesPreferences.nomP = LesPlats.nomP)
group by nomI;

TD ETUDIANTS

1)
SELECT DISTINCT S.nom, S.Prenom, E.Nom, E.Prenom
FROM Etudiants S NATURAL JOIN Inscription NATURAL JOIN MatEns JOIN Enseignants E on (MatEns.NEnseignant = E.NEnseignant);

SELECT DISTINCT S.nom, S.Prenom, E.Nom, E.Prenom
FROM Etudiants S NATURAL JOIN Inscription NATURAL JOIN MatEns NATURAL JOIN Enseignants;

2)
REQUETE TYPE : Division EXTERNE
Attributs : NMatiere, NEtudiant
SELECT NEtudiant
FROM Notes NATURAL JOIN Matiere
GROUP BY NEtudiant
HAVING COUNT(distinct NMatiere) = (select count(distinct NMatiere) FROM Notes);

SELECT NEtudiant
FROM (SELECT NEtudiant, count(distinct NMatiere) TOTNM
	FROM Notes NATURAL JOIN Matiere
	GROUP BY NEtudiant)
NATURAL JOIN (SELECT COUNT(Nmatiere) TOTNM
			FROM Matiere);

3)
REQUETE TYPE : Division EXTERNE
Attributs : Nmatiere, NEtudiant
SELECT NMatiere
FROM Notes NATURAL JOIN Matiere
GROUP BY NMatiere
HAVING COUNT(distinct NEtudiant) = (SELECT COUNT(distinct NEtudiant) FROM NOTES);

SELECT NMatiere
FROM (SELECT NMatiere, count(distinct NEtudiant) TOTNE
	FROM Notes NATURAL JOIN Matiere
	GROUP BY NMatiere)
NATURAL JOIN (SELECT COUNT(NEtudiant) TOTNE
			FROM Etudiants);

4)
SELECT NMatiere, Intitule, Coefficient, NEtudiant, Note
FROM Matiere NATURAL LEFT JOIN Notes on(Matiere.NMatiere = Notes.Nmatiere);

Requête 5 :
Letourneau
on identifie
SELECT NEtudiant, AVG(Note)
FROM Etudiants NATURAL JOIN Notes NATURAL JOIN Matiere
WHERE upper(Intitulé)=’BD’ 
GROUP BY NEtudiant;

2) on décore
SELECT MOY, NOM, Prenom
FROM Etudiants 
Natural Join  (SELECT NEtudiant, AVG(Note) MOY
FROM Etudiants NATURAL JOIN Notes NATURAL JOIN Matiere
WHERE upper(Intitulé)=’BD’ 
GROUP BY NEtudiant);

autre solution (à manipuler avec précaution)
SELECT Nom, Prenom , AVG(Note)
FROM Etudiants NATURAL JOIN Notes NATURAL JOIN Matiere
WHERE upper(Intitulé)=’BD’ 
GROUP BY NEtudiant, Nom, Prenom;


===============
Requête 6 :
Long Wah
Select Nom, Prenom, Intitule, Note
from Etudiants natural left outer join Notes natural left outer join Matiere

Select Nom, Prenom, Intitule, Note
from Matière  natural join Notes  natural right outer join Etudiants
===============

Requête 7 :
Ouassou
moyenne de chaque étudiant en BD :
( select avg (note) moyenne, Netudiant)
        from notes
        where intitulé ='BD'
        group by intitule , Netudiant)
moyenne en BD de tous les étudiants :
select avg( note) 
from notes
where  intitulé = ‘BD’;

liste des étudiants qui en BD ont + que la moyenne en BD :
select Netudiant 
        from notes
        where intitulé ='BD'
        group by  Netudiant
        Having AVG(note) > ( select avg( note) 
                                          from notes
                                          where  intitulé = ‘BD’)

Select nom , age , sexe
from etudiant natural join (select Netudiant 
         from notes
        where intitulé ='BD'
        group by  Netudiant
        Having AVG(note) > ( select avg( note) 
                                          from notes
                                          where  intitulé = ‘BD’))

===============

Requête 8 :
Richard
calculer la moyenne de chaque étudiant dans chaque matière
(select NEtudiant, NMatiere, AVG(Note) Moy
from Notes natural join Matiere
group by NEtudiant, NMatiere)


select NEtudiant, sum(Moy*Coefficient)/sum(Coefficient)
from (select NEtudiant, NMatiere, AVG(Note) Moy
from Notes natural join Matiere
group by NEtudiant, NMatiere)
natural join Matiere
group by NEtudiant


===============

Requête 9 :
Samson
Absence de requête 
MINUS
 
Select NEtudiant, nom, intitulé
From (select NEtudiant, NMatiere 
          From Etudiant natural join Matiere
          MINUS 
          Select NEtudiant, NMatiere
          From Notes)
natural join Etudiants natural join Matière
