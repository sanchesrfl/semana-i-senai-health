
//funcoes
let limpouQuarto = true;
let limpouCozinha = false;





let sairFunciton = possoSair();
let sairArrowFunction = possoSairArrow();

console.log(sairFunciton);
console.log(sairArrowFunction);


//function declaração "padrão"
function possoSair() {
    if (limpouQuarto && limpouCozinha) {
        return "sim";
    } else {
        return "não";
    } 
}



//Arrow function
const possoSairArrow = () => {

    if (limpouQuarto && limpouCozinha) {
        return "sim";
    } else {
        return "não";
    }

}


