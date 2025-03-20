<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
<html> 
<body>
  <h2>Concesionarios</h2>
  <table border="1">
    <tr bgcolor="pink">
      <th style="text-align:left">Nombre</th>
      <th style="text-align:left">Ciudad</th>
    </tr>
    <xsl:for-each select="concesionarios/concesionario">
    <tr>
      <td><xsl:value-of select="nombre"/></td>
      <td><xsl:value-of select="ciudad"/></td>
    </tr>
    </xsl:for-each>
  </table>
  <h2>Coches</h2>
  <table border="1">
    <tr bgcolor="pink">
      <th style="text-align:left">Modelo</th>
      <th style="text-align:left">Marca</th>
      <th style="text-align:left">Potencia</th>
      <th style="text-align:left">Puertas</th>
      <th style="text-align:left">Precio</th>
      <th style="text-align:left">CO2</th>
      <th style="text-align:left">Consumo</th>
      <th style="text-align:left">Velmax</th>
    </tr>
    <xsl:for-each select="concesionarios/concesionario/coches/coche">
    <tr>
      <td><xsl:value-of select="modelo"/></td>
      <td><xsl:value-of select="marca"/></td>
      <td><xsl:value-of select="potencia"/></td>
      <td><xsl:value-of select="puertas"/></td>
      <td><xsl:value-of select="precio"/></td>
      <td><xsl:value-of select="co2"/></td>
      <td><xsl:value-of select="consumo"/></td>
      <td><xsl:value-of select="velmax"/></td>
    </tr>
    </xsl:for-each>
  </table>
</body>
</html>
</xsl:template>
</xsl:stylesheet>
