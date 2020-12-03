
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
SELECT DEPTNO DEPARTEMENT
FROM DEPT NATURAL JOIN EMP

select deptno DEPARTEMENT
from emp
Where job IN (‘CLERK’, ’ANALYST’, ‘MANAGER’)
group by deptno
Having count (distinct job) = 3;

8)
Select sub.ename EMPLOYE, nvl(chef.ename, 'BIG BOSS') CHEF
From emp sub left outer join emp chef on(chef.empno = sub.mgr)
Order By EMPLOYE;


10)
SELECT count(mgr) NBSUBORDONNE
FROM EMP emp1 LEFT OUTER JOIN EMP emp2
GROUP BY mgr
ORDER BY NBSUBORDONNE desc;

SELECT count(mgr) NBSUBORDONNE
FROM EMP
GROUP BY mgr
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

SELECT JOB, DEPTNO
FROM EMP
WHERE DEPTNO IN ()

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
SELECT ENAME NOM, (TO_DATE('27-NOV-20') - hiredate) ANCIENNETE
FROM EMP
WHERE (TO_DATE('27-NOV-20') - hiredate) >= 7305;

SELECT hiredate FROM EMP;