function mostrarTabla() {
    let numero = parseInt(document.getElementById("numero").value);
    let valorMaximo = parseInt(document.getElementById("valorMaximo").value);
  
    let tablaResultado = "<table border='1'>";
    for (let i = 1; i <= valorMaximo; i++) {
      tablaResultado += "<tr><td>" + numero + " x " + i + "</td><td>" + (numero * i) + "</td></tr>";
    }
    tablaResultado += "</table>";
  
    document.getElementById("tablaResultado").innerHTML = tablaResultado;
  }
  