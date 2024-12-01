function agregar() {

    let nota = document.getElementById("nota").value;
    let prio = document.getElementById("prioridad").value;
    let tiempo = document.getElementById("tiempo").value;

    let nuevaNota = '<ul id="lista-tareas">Nota: ' + nota + ' Prioridad: '+prio + ' tiempo: ' + tiempo +'</ul>';

    document.getElementById("listaR").innerHTML = listaR.appendChild(nuevaNota);
    
}

function borrar(){

    

}