function lista() {

    let numero = document.getElementById("numero").value;
    let i = 0;
    let result = "<li> Numero " + i + "</li>";
    
    for (i = 0; i <= numero; i++) {
        
        document.getElementById("lista").innerHTML = result;
    }
    }