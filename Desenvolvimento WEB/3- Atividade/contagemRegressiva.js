for (let i = 10; i >= 0; i--) {
  setTimeout(() => {
    console.log(i);
  }, (10 - i) * 1000); // Atraso de 1 segundo para cada número
}