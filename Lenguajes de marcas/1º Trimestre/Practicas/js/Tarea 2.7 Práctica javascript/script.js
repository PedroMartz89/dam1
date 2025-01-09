function agregar() {
    let nota = document.getElementById("nota").value;
    let prioridad = document.getElementById("prioridad").value;
    let tiempo = document.getElementById("tiempo").value;

    let tarea = document.createElement("li");
    tarea.className = "tarea";
    tarea.innerHTML = `${nota} // Tiempo estimado: ${tiempo} minutos // Prioridad: ${prioridad}`;

    let lista = document.getElementById("lista-tareas");
    lista.appendChild(tarea);
}

function borrar() {
    let lista = document.getElementById("lista-tareas");
    let tareaIndex = document.getElementById("borrar-index").value;

    let tarea = lista.children[tareaIndex - 1];
    lista.removeChild(tarea);
}
