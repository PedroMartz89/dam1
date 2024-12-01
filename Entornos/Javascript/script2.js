
//Pedimos un texto al usuario
let variable = prompt("Introduce un texto");

//primero con alert lo imprimos en una ventana emergente
alert(variable);

//usanco console.log lo imprimimos en la consola de js en el navegador
console.log(variable);

//con el uso de number() podemos cambiar el valor de la variable a numérico
variable = Number(prompt("Introduce un número"));

alert(`Has ingresado el número ${variable}`);
console.log("El número ingresado es:", variable);

//usando confirm() preguntaremos al usuario si quiere continuar, tras ello se guardara en variable true si elige si, o false si elige no
variable = confirm("¿Quieres continuar?");
console.log("¿El usuario quiere continuar?: ", variable);

//Aquí, comprobaremos el valor de la variable, si es true hará lo siguiente:
if (variable) {

    //creamos un objeto json con los siguientes valores:
    variable = {
        nombre: "Juan",  
        edad: 30          
    };
    //al ser true la condición, los imprimimos en pantalla y consola
    alert(`Información del objeto: Nombre: ${variable.nombre}, Edad: ${variable.edad}`);
    console.log("Información del objeto JSON:", variable);

} else {
    //si el resultado de la variable fuera false, se ejecutaría esto
    alert("No se ha continuado.");
    console.log("El usuario no continua.");
}
    
