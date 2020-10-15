<?xml version="1.0" encoding="ISO-8859-1"?>
<!-- Document XSL permettant d'afficher une page html
   - dont les donn�es sont tir�es d'un document XML
   - repr�sentant un catalogue de CD
 -->
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="html" encoding="iso-8859-1" indent="yes"/>

    <xsl:template match="/">
    <!-- d�but du document HTML -->
        <html>
            <head>
                <title>CD-th�que</title>
            </head>
            <body>
                <!-- Titre HTML -->
                <h1>Liste de mes CD</h1>
                <!-- Cr�ation d'un tableau dans le fichier html de sortie. -->
                <table border="1">
                    <!-- la premi�re ligne du tableau dans le fichier de sorte
                         a la couleur verte.
                     -->
                    <tr bgcolor="#9acd32">
                        <td>Titre</td>
                        <td>Artiste</td>
                        <td>Maison de disque</td>
                        <td>Ann�e</td>
                    </tr>
                    <!-- Instruction XSL permettant d'appeler le template
                         qui suit sur chaque �l�ment cd.
                      -->
                    <xsl:apply-templates select="catalog/cd">
                        <xsl:sort select="year"/>
                    </xsl:apply-templates>
                </table> <!-- fin du tableau -->
            </body>
        </html> <!-- fin du document html-->
    </xsl:template>

    <!-- template: fonction xls appel�e pour chaque �l�ment cd. -->
    <xsl:template match="cd">
        <!-- Pour chaque �l�ment cd, on cr�e une ligne -->
        <tr>
            <!-- Sur cette ligne, on affiche dans l'ordre, le titre, l'artiste,
                 le label et l'ann�e de sortie du cd.
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