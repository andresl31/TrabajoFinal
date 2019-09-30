#language:es
#encoding: iso-8859-1
Característica: Buscar empleo contador
  Como usuario del empleo.com
  deseo buscar empleo para el cargo contador
  para validar las posibles bacantes en bogota

  Esquema del escenario: Busquedad ofertas exitoso
    Dado que estoy en la pagina del empleo.com
    Cuando ingreso los datos de <cargo> y <ciudad> del formulario de consulta de empleo
    Entonces puedo visulizar las ofertas disponibles

    Ejemplos: 
      | cargo | ciudad |
      | cont  | bogota |
