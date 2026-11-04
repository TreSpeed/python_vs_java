# Comparativa: Python vs Java Moderno (21+)

## 1\. Código Básico (Definición de Funciones)

### Código en Python

```py
def doblar(numero):
    resultado = numero * 2
    return resultado

def triplica(valor):
    resultado = valor ** 3
    return resultado

print('Empieza el programa')
multiplica = doblar(5)
print(multiplica)
```

### El "Espejo" en Java Moderno (Java 21+)

```java
// Java 21+ (Top-Level Statements)
double doblar(double numero) {
    var resultado = numero * 2;
    return resultado;
}

double triplica(double valor) {
    var resultado = Math.pow(valor, 3);
    return resultado;
}

System.out.println("Empieza el programa");
var multiplica = doblar(5);
System.out.println(multiplica);
```

---

### Explicación paso a paso

#### 1\. ¿Qué es una función / método? (La caja negra)

Una función es una **máquina** que recibe un ingrediente (*parámetro*), hace un trabajo con él y devuelve un producto (*resultado*).

* **Python:** Usa la palabra reservada `def` (de *define*).  
* **Java:** Especifica el tipo de dato que devuelve (por ejemplo `double`) o infiere tipos según la firma.

---

#### 2\. Delimitar el código: ¿Cómo sabe el ordenador qué está DENTRO de la función?

* **Python (El poder del espacio):** Usa los dos puntos (`:`) y la **indentación** (sangría/espacios hacia la derecha). Todo lo que esté "metido hacia dentro" pertenece a la función.  
* **Java (Las llaves):** Usa llaves explícitas: `{` para abrir el bloque y `}` para cerrarlo.

---

#### 3\. Devolver datos al exterior: El concepto de `return`

En ambos lenguajes se utiliza la palabra reservada explícita **`return`** para entregar el resultado final al código principal.

---

#### 4\. Flujo de ejecución

1. El compilador/intérprete lee las definiciones de `doblar` y `triplica` (las guarda en memoria, pero no las ejecuta).  
2. La primera línea que realmente "ejecuta algo" es la impresión inicial (`print` / `System.out.println`).  
3. Al llamar a `doblar(5)`, el programa da un salto a la función, procesa la operación, devuelve el resultado y lo asigna a la variable.

---

### Resumen visual

| Concepto | ¿Qué significa? | Sintaxis en Python | Sintaxis en Java Moderno |
| :---- | :---- | :---- | :---- |
| **Definir función** | "Voy a crear una parte nueva" | `def doblar(numero):` | `double doblar(double numero) {` |
| **Límites** | "¿Dónde empieza y acaba?" | Indentación (espacios) | Llaves `{` ... `}` |
| **Devolver valor** | "Entrega el resultado final" | `return resultado` | `return resultado` |
| **Mostrar texto** | "Escribe algo en la consola" | `print('Texto')` | `System.out.println("Texto")` |

---

## 2\. Entrada de Datos por el Usuario

### Código en Python

```py
def doblar(numero):
    resultado = numero * 2
    return resultado

def triplica(valor):
    resultado = valor ** 3
    return resultado

# --- Entrada de datos del usuario ---
def pedir_numero():
    texto = input("Introduce un numero: ")
    numero = float(texto)  # Convertimos el texto a número decimal
    return numero

# --- Flujo del programa ---
print('Empieza el programa')

# Pedimos el número al usuario
num_usuario = pedir_numero()

# Calculamos y mostramos los resultados
resultado_doble = doblar(num_usuario)
resultado_triple = triplica(num_usuario)

print("El doble es:", resultado_doble)
print("El triple es:", resultado_triple)
```

---

### El "Espejo" en Java Moderno (Java 21+)

```java
import java.util.Scanner;

double doblar(double numero) {
    var resultado = numero * 2;
    return resultado;
}

double triplica(double valor) {
    var resultado = Math.pow(valor, 3);
    return resultado;
}

// --- Entrada de datos del usuario ---
double pedirNumero() {
    System.out.print("Introduce un numero: ");
    var scanner = new Scanner(System.in);
    return scanner.nextDouble();
}

// --- Flujo principal ---
System.out.println("Empieza el programa");

var numUsuario = pedirNumero();

var resultadoDoble = doblar(numUsuario);
var resultadoTriple = triplica(numUsuario);

// Interpolación de variables en Java Moderno
System.out.println(STR."El doble es: \{resultadoDoble}");
System.out.println(STR."El triple es: \{resultadoTriple}");
```

---

### Puntos clave comparativos (Python vs Java Moderno)

#### 1\. Estructura del código (Top-Level Statements)

* **En Java Tradicional:** Era obligatorio empaquetar todo dentro de una clase (`public class Main`) y un método principal (`public static void main(String[] args)`).  
* **En Java Moderno (21+):** Se permiten instrucciones y métodos de nivel superior directamente en la raíz del archivo, logrando la misma sencillez de lectura que Python.

#### 2\. Declaración de variables y Tipado (`var`)

* **En Python:** El tipado es dinámico implícito (`num_usuario = pedir_numero()`).  
* **En Java Moderno:** Mantiene el tipado estático pero utiliza inferencia de tipos mediante la palabra clave **`var`**, evitando repetir tipos de datos redundantes.

#### 3\. Entrada de texto y conversión

* **En Python:** `input()` captura texto (String) y requiere la conversión explícita mediante `float(texto)`.  
* **En Java Moderno:** `Scanner` permite leer y parsear directamente el tipo numérico esperado (`scanner.nextDouble()`).

---

### Tabla resumen para la pizarra

| Concepto | En Python | En Java Moderno |
| :---- | :---- | :---- |
| **Tipado / Inferencia** | Dinámico | Estático con `var` |
| **Leer teclado** | `input("Introduce: ")` | `scanner.nextDouble()` / `Scanner` |
| **Convertir a número** | `float(texto)` / `int(texto)` | Manejado por `Scanner` o `Double.parseDouble()` |
| **Mostrar en consola** | `print("El doble es:", resultado)` | `System.out.println(STR."El doble es: \{resultado}")` |
| **Delimitadores de bloque** | Indentación | Llaves `{` ... `}` |

&nbsp;