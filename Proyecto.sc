// Definimos una función de orden superior que aplica una operación a cada elemento de la lista
def procesarLista(lista: List[Int], operacion: Int => Int): List[Int] =
  lista.map(operacion)

// Función que filtra los números pares de una lista
def filtrarPares(x: Int): Boolean = x % 2 == 0

// Función que calcula la suma de los elementos de una lista
def sumarLista(lista: List[Int]): Int = lista.reduce(_ + _)

  // Creamos una lista de números
  val numeros = List(1, 2, 3, 4, 5)

  // Definimos una función que duplica un número
  def duplicar(x: Int): Int = x * 2

  // Aplicamos la función de orden superior para duplicar cada elemento de la lista
  val duplicados = procesarLista(numeros, duplicar)

  // Filtramos los números pares de la lista original

  val pares = numeros.filter(filtrarPares)

  // Calculamos la suma de los elementos de la lista original

  val suma = sumarLista(numeros)

// Imprimimos los resultados
println(s"Lista original: " + numeros)
println(s"Lista duplicada: " + duplicados)
println(s"Números pares: " + pares)
println(s"Suma de la lista: " + suma)

