function cambiar() {

    let texto1 = document.getElementById("valor1");
    let texto2 = document.getElementById("valor2");

    let temporal = texto1.value;

    texto1.value = texto2.value;
    texto2.value = temporal;
}