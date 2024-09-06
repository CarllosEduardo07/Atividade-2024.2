const numero1 = parseInt(prompt('Digite o Primeiro número?'));
const numero2 = parseInt(prompt('Digite o Segundo número?'));

let resultado = 0;

const operacao = parseInt(
  prompt(`
  Escolha uma Operação:
  1 - Adição
  2 - Subtração
  3 - Multiplicação
  4 - Divisão`),
);

switch (operacao) {
  case 1:
    resultado = numero1 + numero2;
    alert('O Resultado é ' + resultado);
    break;
  case 2:
    resultado = numero1 - numero2;
    alert('O Resultado é ' + resultado);
    break;
  case 3:
    resultado = numero1 * numero2;
    alert('O Resultado é ' + resultado);
    break;
  case 4:
    resultado = numero1 / numero2;
    if (numero2 !== 0) {
      resultado = numero1 / numero2;
     alert('O Resultado é ' + resultado);
    } else {
     alert('Erro: Divisão por zero');
    }
    break;
  default:
    console.log('Operação inválida');
}
