SELECT NVEN, NOMC, QTV QT_Mouchoir
FROM VENTE join produit on(npro = nprv)
WHERE DATEV <= '10-SEP-19' and NOMP = 'mouchoir';

SELECT * from ACHAT where nomf = 'xuong';

SELECT count(DISTINCT NPRA) from ACHAT where nomf = 'xuong';

SELECT NOMF
FROM ACHAT
WHERE NOMF NOT IN (SELECT NOMF FROM ACHAT where DATEA > '09-OCT-15')
ORDER BY nomf asc;

SELECT NOMF 
FROM ACHAT
MINUS 
SELECT NOMF FROM ACHAT where DATEA > '09-OCT-15';
ORDER BY NOMF ASC

SELECT  NOMF, NOMP, COULEUR
FROM ACHAT JOIN Produit on(npro = npra)
WHERE QTA > (SELECT avg(qtv) 
FROM VENTE JOIN Produit on(nprv = npro) 
WHERE couleur = 'vert')
and couleur = 'vert';

SELECT NOMC, count(DISTINCT NPRV)
FROM VENTE JOIN PRODUIT on(nprv = npro)
WHERE couleur = 'vert'
GROUP BY NOMC
ORDER BY NOMC ASC;

SELECT NOMC, count(DISTINCT NPRV)
FROM VENTE JOIN PRODUIT on(nprv = npro)
WHERE couleur = 'vert'
GROUP BY NOMC
HAVING COUNT(DISTINCT NPRV) >= 2
ORDER BY NOMC ASC;
 
SELECT NOMC, count(NVEN)
FROM VENTE
GROUP BY NOMC
HAVING count(nven) = (SELECT min(count(nven)) FROM VENTE GROUP BY NOMC;

