//lenyege, hogy a lista utolsó két szám összege lesz a lista következő eleme

function fibonacci(n) {
  var lista = [];
  if (n === 1) {
    lista = [0];
  } else if (n === 2) {
    lista = [0, 1];
  } else {
    lista = [0, 1];
    for (var i = 2; i < n; i++) {
      var m = lista[lista.length - 1] + lista[lista.length - 2];
      lista.push(m);

    }
  }
  return lista;
}
