
VPN : ssh -X im2ag-oracle.e.ujf-grenoble.fr -l randriti
setenv ORACLE_SID im2ag

SELECT NVEN, NOMC, QTV QT_Mouchoir
FROM VENTE join produit on(npro = nprv)
WHERE DATEV <= '10-SEP-19' and NOMP = 'mouchoir';

SELECT * from ACHAT where nomf = 'xuong';

SELECT count(DISTINCT NPRA) from ACHAT where nomf = 'xuong';

6)
SELECT NOMF
FROM ACHAT
WHERE NOMF NOT IN (SELECT NOMF FROM ACHAT where DATEA > '09-OCT-15')
ORDER BY nomf asc;

SELECT NOMF 
FROM ACHAT
MINUS 
SELECT NOMF FROM ACHAT where DATEA > '09-OCT-15'
ORDER BY NOMF ASC;

8) 
SELECT  NOMF, QTA
FROM ACHAT JOIN Produit on(npro = npra)
WHERE QTA > (SELECT avg(qtv) 
			FROM VENTE JOIN Produit on(nprv = npro) 
			WHERE couleur = 'vert')
and couleur = 'vert';

10)
SELECT NOMC, count(DISTINCT NPRV)
FROM VENTE JOIN PRODUIT on(nprv = npro)
WHERE couleur = 'vert'
GROUP BY NOMC
ORDER BY NOMC ASC;


12)
SELECT NOMC, count(DISTINCT NPRV)
FROM VENTE JOIN PRODUIT on(nprv = npro)
WHERE couleur = 'vert'
GROUP BY NOMC
HAVING COUNT(DISTINCT NPRV) >= 2
ORDER BY NOMC ASC;
 
14)
SELECT NOMC
FROM VENTE
GROUP BY NOMC
HAVING count(nven) = (SELECT min(count(nven)) FROM VENTE GROUP BY NOMC;

SELECT NOMC	
FROM(SELECT NOMC, count(nven) Nvente
	FROM VENTE
	GROUP BY NOMC)
NATURAL JOIN
	(SELECT min(count(nven)) Nvente
	FROM VENTE
	GROUP BY NOMC);

16)
SELECT DISTINCT NOMF, NPRA
FROM ACHAT
NATURAL JOIN
	(SELECT DISTINCT NOMF, max(QTA) QTA
	FROM ACHAT
	GROUP BY NOMF);
 
 SELECT NOMF, NPRA
 FROM ACHAT
 WHERE (NOMF,QTA) IN (SELECT NOMF, max(QTA)
 					  FROM ACHAT
 					  GROUP BY NOMF);

 TP 2)

2)
SELECT num_enfant
FROM enfant_enseignant NATURAL JOIN enseignant
WHERE nom = 'ne001' and prenom = 'pe001';

SELECT num_enfant
FROM enfant_enseignant
WHERE num_enseignant IN (SELECT num_enseignant
					FROM enseignant
					WHERE nom = 'ne001' and prenom = 'pe001');

4)
SELECT case
when count(num_classe) = 0 then 'oui'
else 'non';
FROM CLASSE
WHERE niveau2 IS null;

SELECT count(num_classe)
FROM CLASSE
WHERE niveau2 = 'vide';

SELECT count(num_classe)
FROM CLASSE 
where niveau2 IS NULL;

6)

SELECT num_classe, count(num_enfant)
FROM CLASSE natural join enfant_enseignant natural join enfant
GROUP BY num_classe;


8) 

SELECT sum(NUM/DEN) Moyenne
FROM (SELECT num_classe, count(num_enfant) NUM
	FROM CLASSE natural join enfant_enseignant natural join enfant
	GROUP BY num_classe)
CROSS JOIN 
	(SELECT count(DISTINCT num_classe) DEN
	FROM CLASSE natural join enfant_enseignant natural join enfant
	);

10)

SELECT num_classe, nb_places
FROM classe natural join enfant_enseignant natural join salle
GROUP BY num_classe, nb_places
HAVING count(*) > nb_places;
12)

SELECT num_enfant, annee_de_naissance, niveau
FROM ENFANT
WHERE niveau = 'petit' and annee_de_naissance != 2017;

13)
VERSION VALEUR NULL
SELECT
FROM enfant natural join enfant_enseignant natural join classe
WHERE (niveau != niveau1) and (niveau != niveau2 or niveau is null)

14)

SELECT num_classe, count(distinct niveau)
FROM classe natural join enfant_enseignant natural join enfant
GROUP BY (num_classe);

VERSION VALEURE NULL
SELECT num_classe, count(distinct niveau) + count(niveau2)
FROM classe 
GROUP BY (num_classe);

15)
SELECT num_classe, num_salle, count(*)
FROM enfant_enseignant natural join classe natural right join salle
GROUP BY num_classe, num_salle

16)

Quelles sont les classes dans lesquelles on trouve des enfants de tous les niveaux ?
SELECT num_classe
FROM CLASSE natural join enfant_enseignant natural join enfant
group by num_classe
having count(distinct niveau) = (select count(distinct niveau) FROM enfant)

TP3)

2)

SELECT avg(sal) MOYSAL
FROM EMP;

4) 
SELECT DEPTNO DEPARTEMENT, avg(sal + NVL(comm, 0)) MOYREVENU
FROM EMP NATURAL JOIN DEPT
GROUP BY DEPTNO
ORDER BY MOYREVENU desc;

6) 

select deptno DEPARTEMENT
from emp
Where job IN ('CLERK', 'ANALYST', 'MANAGER')
group by deptno
Having count (distinct job) = 3;

8)
SELECT s.ename EMPLOYE, nvl(c.ename, 'BIG BOSS') CHEF
FROM emp s LEFT OUTER JOIN emp c on(c.empno = s.mgr)
ORDER BY EMPLOYE;


10)
SELECT c.empno EMPLOYE, count(s.empno) NBSUBORDONNE
FROM EMP c left outer join emp s on(s.mgr = c.empno)
GROUP BY c.empno
ORDER BY NBSUBORDONNE desc;

11)
SELECT ENAME, mgr, DEPTNO
FROM (SELECT *
	  FROM EMP
	  WHERE comm is not null) emp2 JOIN EMP on (emp2.EMPNO = EMP.mgr);

12)
SELECT DISTINCT ENAME NOM, (sal + NVL(comm, 0)) as REVENU, LOC
FROM EMP NATURAL JOIN DEPT
WHERE lower(LOC) IN ('chicago', 'dallas') AND  (sal + NVL(comm, 0)) > 1000
ORDER BY REVENU desc;


14)

SELECT JOB 
FROM EMP
GROUP BY JOB
HAVING COUNT(distinct deptno)=(select count(distinct deptno) FROM EMP)

16)
SELECT DEPTNO, sum(sal + NVL(comm, 0)) SUMREVENUMAX
FROM DEPT NATURAL JOIN EMP
GROUP BY DEPTNO
HAVING SUM(sal + NVL(comm, 0)) = (SELECT max(SUM(sal + NVL(comm, 0)))
								  FROM DEPT NATURAL JOIN EMP
								  GROUP BY DEPTNO);

SELECT DISTINCT DEPTNO
FROM (SELECT DEPTNO, sum(sal + NVL(comm, 0)) SOMME
	  FROM DEPT NATURAL JOIN EMP
	  GROUP BY DEPTNO )
NATURAL JOIN
	(SELECT max(SOMME) SOMME
	FROM (
	  SELECT DEPTNO, sum(sal + NVL(comm, 0)) SOMME
	  FROM DEPT NATURAL JOIN EMP
	  GROUP BY DEPTNO));

18)
SELECT ename NOM, (sysdate-hiredate)/365 ANCIENNETE
FROM EMP
WHERE (sysdate-hiredate)/365 >= 20
ORDER BY ANCIENNETE;

TP4 :

drop table e1;
drop table e2;
drop table mag;
drop table ventes;
drop table prod2;
drop table prod1;

CREATE TABLE PROD1
(NP1 NUMBER(2) PRIMARY KEY,
DESCR1 CHAR(20),
PRIX1 number(4) NOT NULL check (PRIX1 > 0));

CREATE TABLE PROD2
(NP2 NUMBER(2) PRIMARY KEY,
DESCR2 CHAR(20),
PRIX2 number(4) NOT NULL check (PRIX2 > 0));

CREATE TABLE E1
(NE NUMBER(3) PRIMARY KEY,
NOM CHAR(20),
ADR CHAR(20),
RAYON integer);

CREATE TABLE E2
(NE NUMBER(3) references e1(ne),
DEB DATE,
FIN DATE,
SALAIRE NUMBER(7) NOT NULL CHECK(SALAIRE > 0),
PRIMARY KEY(NE,DEB),
CHECK (DEB < FIN));

CREATE TABLE MAG
(RAYON integer PRIMARY KEY,
ETAGE NUMBER(2) NOT NULL,
DIR number(3) references e1(ne));

CREATE TABLE VENTES
(NP number(2),
RAYON integer references mag(rayon),
PRIMARY KEY(NP,RAYON));

C1 : 
(select np1 from prod1)
intersect
(select np2 from prod2);

C2 :
select NE
from e1
where NE not in (select NE from e2)
UNION
select NE
from e2
where NE not in (select NE from e1);

C3 : 
select dir
from mag 
where dir not in (select ne from e1);

C4 :
select rayon 
from ventes
where rayon not in (select rayon from mag)
select rayon 
from mag
where rayon not in (select rayon from ventes);

C5 : 
SELECT *
FROM (select np1 NP from prod1 UNION select np2 from prod2)
where NP not in(select np from ventes);

2ème partie : 

1)
SELECT NP, descr, prix
FROM (SELECT np1 NP, descr1 descr, prix1 prix
FROM PROD1
UNION
select np2 np, descr2 descr, prix2 prix
FROM PROD2) natural join ventes natural join mag
WHERE RAYON = 3;



2)



