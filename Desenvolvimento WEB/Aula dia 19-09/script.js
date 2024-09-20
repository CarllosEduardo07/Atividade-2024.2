const btn = document.querySelectorAll('.btn');
const display = document.querySelector('.display');
const operacao = document.querySelectorAll('.operacao');
let btnValue;

operacao.forEach(element => {
  element.addEventListener('click', () => {
    display.textContent += element.textContent;
  });
});

// btn.forEach(element => {
//   element.addEventListener('click', () => {
//     btnValue = element.textContent;

//     display.textContent += btnValue;
//   });
// });
