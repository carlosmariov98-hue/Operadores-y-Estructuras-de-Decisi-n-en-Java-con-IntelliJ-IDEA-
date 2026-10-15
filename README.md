# TallerUnidad1_2

Proyecto Maven con los talleres prácticos de la Unidad 1 de Java: operadores, condicionales (`if-else`), operador ternario, `switch`, estructuras repetitivas (`while`, `do-while`, `for`), sentencias de ramificación (`break`, `continue`), manejo de cadenas (`String`, `StringBuilder`) y depuración con IntelliJ IDEA.

**Autor:** Carlos Mario Velásquez
**Curso:** M4

## Requisitos

- JDK 17 o 21 (LTS)
- IntelliJ IDEA Community Edition
- Maven (incluido en IntelliJ)

## Estructura del proyecto

```
TallerUnidad1_2
├── src
│   └── main
│       ├── java
│       │   └── org.example
│       │       ├── Main.java                  (Taller 1.2)
│       │       ├── reto1.java
│       │       ├── reto2.java
│       │       ├── Reto3.java
│       │       ├── ternario.java
│       │       ├── switchTradicional.java
│       │       ├── switchModerno.java
│       │       ├── integrador.java
│       │       ├── ErrorAsignacion.java
│       │       ├── ErrorComparacionString.java
│       │       ├── ErrorFallThrough.java
│       │       ├── ErrorPrecision.java
│       │       ├── tabla expresiones.png      (evidencia)
│       │       ├── ciclos                     (Taller 1.3)
│       │       │   ├── seccion1  (while)
│       │       │   ├── seccion2  (do-while)
│       │       │   ├── seccion3  (for)
│       │       │   ├── seccion4  (break / continue)
│       │       │   ├── seccion5  (reto integrador)
│       │       │   └── seccion6  (depuración + capturas)
│       │       └── ahorcado                   (Taller 1.4)
│       │           └── Main.java
│       └── resources
├── test
├── pom.xml
└── README.md
```

| Taller | Tema | Paquete |
|---|---|---|
| Unidad 1.2 | Operadores, `if-else`, ternario y `switch` | `org.example` |
| Unidad 1.3 | Bucles `while`, `do-while`, `for`, `break` y `continue` | `org.example.ciclos` |
| Taller integrador | Juego "Adivina la Palabra Secreta / Ahorcado de Consola" | `org.example.ahorcado` |

---

## Taller Unidad 1.2: Decisiones y selección múltiple

Guía: _Operadores y Estructuras de Decisión en Java con IntelliJ IDEA_

Paquete: `org.example`

| Archivo | Descripción |
|---|---|
| `Main.java` | Tabla de evaluación de expresiones (`%`, `++`, división, `&&`) |
| `reto1.java` | Reto 1 de decisiones con `if-else` |
| `reto2.java` | Aprobación según calificación, asistencia y proyecto final |
| `Reto3.java` | Tarifas de entrada y descuentos según tipo de boleto |
| `ternario.java` | Refactorización de un `if-else` a operador ternario |
| `switchTradicional.java` | Días de la semana con `switch` clásico (`case` y `break`) |
| `switchModerno.java` | Días de la semana con `switch` moderno (flecha `->`) |
| `integrador.java` | Simulador de caja e inventario (descuentos, cupón e IVA) |
| `ErrorAsignacion.java` | Depuración: `=` en lugar de `==` |
| `ErrorComparacionString.java` | Depuración: `==` vs `.equals()` en `String` |
| `ErrorFallThrough.java` | Depuración: `switch` sin `break` |
| `ErrorPrecision.java` | Depuración: división entera |

**Resultados esperados del reto integrador**

| Caso | Entrada | Total a pagar |
|---|---|---|
| A | cantidad = 3, cliente = VIP, con cupón | $638.00 |
| B | cantidad = 1, cliente = NUEVO, con cupón | $275.50 |

---

## Taller Unidad 1.3: Estructuras repetitivas y ramificación

Guía: _Estructuras Repetitivas y Sentencias de Ramificación en Java_

Paquete base: `org.example.ciclos` (un subpaquete por sección). Total: **12 clases** (9 ejercicios de código y 3 de depuración).

| Sección | Paquete | Clase | Descripción |
|---|---|---|---|
| 1. `while` | `seccion1` | `Ejercicio1_1` | Suma y conteo de enteros con valor centinela (-99) |
| 1. `while` | `seccion1` | `Ejercicio1_2` | Transacciones de caja con bandera booleana y límite de $1'000.000 |
| 2. `do-while` | `seccion2` | `Ejercicio2_1` | Validación de PIN de 4 dígitos (1000 a 9999) |
| 2. `do-while` | `seccion2` | `Ejercicio2_2` | Menú bancario interactivo con `switch` |
| 3. `for` | `seccion3` | `Ejercicio3_1` | Tabla de multiplicar del 1 al 12 y conteo regresivo |
| 3. `for` | `seccion3` | `Ejercicio3_2` | Factorial con `long` y triángulo con bucles anidados |
| 4. Ramificación | `seccion4` | `Ejercicio4_1` | Primer número del 1 al 100 divisible entre 7 y 11 (`break`) |
| 4. Ramificación | `seccion4` | `Ejercicio4_2` | Pares del 1 al 50 que no son múltiplos de 5 (`continue`) |
| 5. Integrador | `seccion5` | `EjercicioIntegrador` | Gestión de lotes de un almacén (menú, validaciones, `continue` y `break`) |
| 6. Depuración | `seccion6` | `Debug1` | Bucle infinito por falta de incremento |
| 6. Depuración | `seccion6` | `Debug2` | Error de desfase por uno (`<` en lugar de `<=`) |
| 6. Depuración | `seccion6` | `Debug3` | `break` mal ubicado (debe ser `continue`) |

Las capturas del depurador están en `seccion6` (`paso1Debug1.png`, `paso2Debug1.png`, `paso3Debug1.png`).

---

## Taller Integrador: Adivina la Palabra Secreta (Ahorcado de Consola)

Guía: _Taller Práctico Integrador - String_

Paquete: `org.example.ahorcado` · Clase: `Main.java`

Juego interactivo de consola que integra los contenidos de las Unidades 1.1 a 1.4.

### Menú principal

```
1. Jugar
2. Ver Estadísticas
3. Salir
```

### Cómo se juega

1. Elige la opción **1** e ingresa tu nombre.
2. El programa escoge una palabra secreta y muestra una máscara de guiones (`_ _ _ _`).
3. En cada turno escribe **una letra**. Si acierta, se destapa en su posición; si falla, pierdes un intento.
4. Tienes **6 intentos** (`MAX_INTENTOS`). Escribe `RENDIRSE` para abandonar la partida.
5. Al terminar se muestra el resumen con jugador, estado final, palabra, intentos restantes, porcentaje de aciertos y puntaje.

### Reglas de puntaje

- El puntaje inicial es 100.0.
- Al ganar se suman 12.5 puntos por cada intento que sobró.
- En derrota o rendición el puntaje final es 0.
- Porcentaje de aciertos = aciertos ÷ turnos válidos × 100.

### Conceptos aplicados por unidad

| Unidad | Aplicación en el juego |
|---|---|
| 1.1 Fundamentos y tipos de datos | Constante `final int MAX_INTENTOS`, variables `int`, `double`, `boolean`, `char` y `String`, y casting a `double` para el porcentaje |
| 1.2 Estructuras seleccionadoras | Menú con `switch` y validación condicional de opciones |
| 1.3 Bucles y control de flujo | Menú con `do-while`, validación con `while`, turnos del juego, `break` (victoria o rendición) y `continue` (entrada vacía, inválida o repetida) |
| 1.4 Cadenas y memoria | `trim()`, `toUpperCase()`, `length()`, `charAt()`, `equalsIgnoreCase()`, y `StringBuilder` para la máscara y el historial de letras |

### Validaciones incluidas

- Opción de menú no numérica o fuera de rango (`Integer.parseInt()` con manejo de `NumberFormatException`).
- Nombre vacío o con solo espacios.
- Entrada vacía, de más de un carácter, que no sea letra, o letra repetida (no restan intentos).
- Lectura siempre con `nextLine()` para evitar residuos en el búfer.

### Salida esperada del resumen

```
====================================================
RESUMEN DE LA PARTIDA
====================================================
Jugador: CARLOS
Estado Final: ¡VICTORIA!
Palabra Secreta: JAVA
Intentos Restantes: 4 / 6
Porcentaje Aciertos: 60.00%
Puntaje Final: 150.00 pts
====================================================
```

El porcentaje varía según los aciertos y fallos de cada partida; el ejemplo corresponde a 3 aciertos y 2 fallos.

---

## Cómo ejecutar

1. Abre el proyecto en IntelliJ IDEA.
2. Abre la clase que quieras probar.
3. Haz clic en el triángulo verde junto a `main`, o presiona `Shift + F10`.
4. Si el programa pide datos, escríbelos en la consola de abajo.

Para el ahorcado, ejecuta el `Main` del paquete `org.example.ahorcado` (no el `Main` de `org.example`).

## Depuración en IntelliJ

- **Breakpoint:** clic en el margen izquierdo de la línea.
- **Ejecutar en modo Debug:** `Shift + F9`.
- **Avanzar paso a paso (Step Over):** `F8`.
- **Evaluar una expresión:** `Alt + F8`.
- Para cada clase `Debug`, ejecuta primero la versión con error, observa la pestaña Variables y luego aplica la corrección.
