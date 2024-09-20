const display = document.querySelector('.display');
let operacaoSendoFeita = document.querySelector('.mostraOperacao');

let valorAtual = '';
let valorAnterior = '';
let operacao = null;

function atualizarDisplay(texto) {
  display.innerText = texto || '0';
}

function adicionarNumero(numero) {
  valorAtual += numero;
  atualizarDisplay(valorAtual);
}

function limpar() {
  valorAtual = '';
  valorAnterior = '';
  operacao = null;
  atualizarDisplay('');
}

function apagarUltimoNumero() {
  valorAtual = valorAtual.slice(0, -1);
  atualizarDisplay(valorAtual);
}

function escolherOperador(op) {
  if (valorAtual === '') return;
  if (valorAnterior !== '') {
    calcular();
  }
  operacao = op; // corrigido para usar 'operacao'
  valorAnterior = valorAtual;
  valorAtual = '';
}

function calcular() {
  let resultado;
  const numeroAnterior = parseFloat(valorAnterior);
  const numeroAtual = parseFloat(valorAtual);

  function mostraOperacaoFeita() {
    operacaoSendoFeita.textContent =+ numeroAnterior, operacao, numeroAtual;
    console.log(numeroAnterior, operacao, numeroAtual);
  }

  if (isNaN(numeroAnterior) || isNaN(numeroAtual)) return;

  switch (
    operacao // corrigido para usar 'operacao'
  ) {
    case '+':
      resultado = numeroAnterior + numeroAtual;
      break;
    case '-':
      resultado = numeroAnterior - numeroAtual;
      break;
    case '*':
      resultado = numeroAnterior * numeroAtual;
      break;
    case '/':
      resultado = numeroAnterior / numeroAtual;
      break;
    case '%':
      resultado = numeroAnterior % numeroAtual;
      break;
    default:
      return;
  }
  mostraOperacaoFeita();
  valorAtual = resultado.toString();
  operacao = null;
  valorAnterior = '';
  atualizarDisplay(valorAtual);
}

function adicionarPonto() {
  if (!valorAtual.includes('.')) {
    valorAtual += '.';
    atualizarDisplay(valorAtual);
  }
}

// Adiciona eventos aos botões
document.querySelectorAll('.btn').forEach(botao => {
  botao.addEventListener('click', () => adicionarNumero(botao.innerText));
});

// Eventos para operações
document.querySelectorAll('.operacao').forEach(botao => {
  botao.addEventListener('click', event => {
    const operador = event.target.innerText;
    if (operador === '=') {
      calcular();
    } else {
      escolherOperador(operador);
    }
  });
});

// Eventos de limpeza e apagar
document.querySelector('.btn-clear').addEventListener('click', limpar);
document.querySelector('.btn-delete').addEventListener('click', apagarUltimoNumero);

// Evento para adicionar ponto decimal
document.querySelector('.btn-add-ponto-decimal').addEventListener('click', adicionarPonto);
