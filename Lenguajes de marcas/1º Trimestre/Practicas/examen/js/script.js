function sumar() {

    let operando1 = document.getElementById("operando1").value;
    let operando2 = document.getElementById("operando2").value;
    let resultado = parseInt(operando1) + parseInt(operando2);

    document.getElementById("resultados").innerHTML = resultado;
}