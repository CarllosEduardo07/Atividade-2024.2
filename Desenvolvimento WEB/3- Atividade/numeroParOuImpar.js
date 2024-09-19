let numeroSolicitado = parseInt(prompt('Digite um número, para verificar se é Par Ou Impar? '));

if (isNaN(numeroSolicitado)) {
  alert('Você não digitou um número válido. Tente novamente.');
} else {
  if (numeroSolicitado % 2 === 0) {
    alert('O número ' + numeroSolicitado + ' é Par');
  } else {
    alert('O número ' + numeroSolicitado + ' é Ímpar');
  }
}
