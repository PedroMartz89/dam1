let nuevoElementoLi = document.createElement("li");

let elementoId = document.getElementById("lista");
elementoId.appendChild(nuevoElementoLi);

let nuevoElementoA = document.createElement("a");
nuevoElementoLi.appendChild(nuevoElementoA);

let nuevoNodoTexto = document.createTextNode("Actualidad");
nuevoElementoA.appendChild(nuevoNodoTexto)
nuevoElementoA.setAttribute("href", "actualidad.html");

let elementoBorrar = document.getElementsByTagName("li")[o];
elementoId.removeChild(elementoBorrar)