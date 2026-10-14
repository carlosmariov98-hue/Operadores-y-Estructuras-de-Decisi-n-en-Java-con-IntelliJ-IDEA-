# TallerUnidad1_2

Proyecto Maven con los talleres prácticos de la Unidad 1 de Java: operadores, condicionales (`if-else`), operador ternario, `switch`, estructuras repetitivas (`while`, `do-while`, `for`), sentencias de ramificación (`break`, `continue`) y depuración con IntelliJ IDEA.

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
│       │       └── ciclos                     (Taller 1.3)
│       │           ├── seccion1  (while)
│       │           ├── seccion2  (do-while)
│       │           ├── seccion3  (for)
│       │           ├── seccion4  (break / continue)
│       │           ├── seccion5  (reto integrador)
│       │           └── seccion6  (depuración + capturas)
│       └── resources
├── test
├── pom.xml
└── README.md
```

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

## Cómo ejecutar

1. Abre el proyecto en IntelliJ IDEA.
2. Abre la clase que quieras probar.
3. Haz clic en el triángulo verde junto a `main`, o presiona `Shift + F10`.
4. Si el programa pide datos, escríbelos en la consola de abajo.

## Depuración en IntelliJ

- **Breakpoint:** clic en el margen izquierdo de la línea.
- **Ejecutar en modo Debug:** `Shift + F9`.
- **Avanzar paso a paso (Step Over):** `F8`.
- **Evaluar una expresión:** `Alt + F8`.
- Para cada clase `Debug`, ejecuta primero la versión con error, observa la pestaña Variables y luego aplica la corrección.
