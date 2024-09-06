let numero1 = parseInt(prompt('Digite o Primeiro número?'));
console.log(numero1)
let numero2 = parseInt(prompt('Digite o Segundo número?'));

let resultado;

let operacao = prompt(`
  Escolha uma Operação:
  1 - Adição
  2 - Subtração
  3 - Multiplicação
  4 - Divisão`);

switch (operacao) {
  case 1:
    resultado = Number(numero1 + numero2);
    alert('O Resultado é ' + resultado);
    console.log(resultado);
    break;
  case 2:
    resultado = Number(numero1 - numero2);
    alert('O Resultado é ' + resultado);
    break;
  case 3:
    resultado = Number(numero1 * numero2);
    alert('O Resultado é ' + resultado);
    break;
  case 4:
    resultado = Number(numero1 / numero2);
    alert('O Resultado é ' + resultado);
    break;
}

