<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

    <xsl:output method="xml" indent="yes"/>

<xsl:template match="/cartelera">
  <programacion>
    <fecha><xsl:value-of select= "fecha"></xsl:value-of></fecha>
    <localidad><xsl:value-of select= "localidad"></xsl:value-of></localidad>
    <xsl:apply-templates select="cines/cine"/>
  </programacion>
</xsl:template>

<xsl:template match="cine">
  <cine>
    <nombre><xsl:value-of select= "@nombre"></xsl:value-of></nombre>
    <ubicacion><xsl:value-of select= "direccion"></xsl:value-of></ubicacion>
    <lista_salas>
      <xsl:apply-templates select="salas/sala"/>
    </lista_salas>
    <pelicula>
      <xsl:apply-templates select="peliculas/pelicula"/>
    </pelicula>
  </cine>
</xsl:template>

<xsl:template match="sala">
  <sala>
    <codigo><xsl:value-of select= "@codigo"></xsl:value-of></codigo>
    <vip><xsl:value-of select= "@vip"></xsl:value-of></vip>
  </sala>
</xsl:template>

<xsl:template match="pelicula">
  <pelicula>
    <titulo><xsl:value-of select= "titulo"></xsl:value-of></titulo>
    <duracion><xsl:value-of select= "duracion"></xsl:value-of></duracion>
    <pases>