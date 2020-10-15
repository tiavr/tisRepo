<?xml version="1.0" encoding="ISO-8859-1"?>
<!-- Document XSL permettant d'afficher une page html
   - dont les données sont tirées d'un document XML
   - représentant un catalogue de CD
 -->
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="html" encoding="iso-8859-1" indent="yes"/>

    <xsl:template match="/">
    <!-- début du document HTML -->
        <html>
            <head>
                <title>CD-thèque</title>
            </head>
            <body>
                <!-- Titre HTML -->
                <h1>Liste de mes CD</h1>
                <!-- Création d'un tableau dans le fichier html de sortie. -->
                <table border="1">
                    <!-- la première ligne du tableau dans le fichier de sorte
                         a la couleur verte.
                     -->
                    <tr bgcolor="#9acd32">
                        <td>Titre</td>
                        <td>Artiste</td>
                        <td>Maison de disque</td>
                        <td>Année</td>
                    </tr>
                    <!-- Instruction XSL permettant d'appeler le template
                         qui suit sur chaque élément cd.
                      -->
                    <xsl:apply-templates select="catalog/cd">
                        <xsl:sort select="year"/>
                    </xsl:apply-templates>
                </table> <!-- fin du tableau -->
            </body>
        </html> <!-- fin du document html-->
    </xsl:template>

    <!-- template: fonction xls appelée pour chaque élément cd. -->
    <xsl:template match="cd">
        <!-- Pour chaque élément cd, on crée une ligne -->
        <tr>
            <!-- Sur cette ligne, on affiche dans l'ordre, le titre, l'artiste,
                 le label et l'année de sortie du cd.
              -->
            <td>
                <xsl:value-of select="title" />
            </td>
            <td>
                <xsl:value-of select="artist" />
            </td>
            <td>
                <xsl:value-of select="label" />
            </td>
            <td>
                <xsl:value-of select="year" />
            </td>
        </tr>

    </xsl:template>
</xsl:stylesheet>