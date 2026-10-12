# TallerUnidad1_2

Taller práctico de Java: operadores, condicionales (`if-else`), operador ternario, `switch` y depuración con IntelliJ IDEA.

**Autor:** Carlos Mario Velasquez
**Curso:** M4

## Requisitos

- JDK 17 o 21 (LTS)
- IntelliJ IDEA Community Edition

## Estructura del proyecto

Todas las clases están en el paquete `org.example`.

| Archivo | Descripción |
|---|---|
| `Main.java` | Tabla de evaluación de expresiones (operadores `%`, `++`, división, `&&`) |
| `reto1.java` | Reto 1 de decisiones con `if-else` |
| `reto2.java` | Aprobación según calificación, asistencia y proyecto final |
| `reto3.java` | Tarifas de entrada y descuentos según tipo de boleto |
| `ternario.java` | Refactorización de un `if-else` a operador ternario |
| `switchTradicional.java` | Días de la semana con `switch` clásico (`case` y `break`) |
| `switchModerno.java` | Días de la semana con `switch` moderno (flecha `->`) |
| `integrador.java` | Simulador de caja e inventario (descuentos, cupón e IVA) |
| `ErrorAsignacion.java` | Depuración: `=` en lugar de `==` |
| `ErrorComparacionString.java` | Depuración: `==` vs `.equals()` en `String` |
| `ErrorFallThrough.java` | Depuración: `switch` sin `break` |
| `ErrorPrecision.java` | Depuración: división entera |

## Cómo ejecutar

1. Abre el proyecto en IntelliJ IDEA.
2. Abre la clase que quieras probar.
3. Haz clic en el triángulo verde junto a `main`, o presiona `Shift + F10`.
4. Si el programa pide datos, escríbelos en la consola de abajo.

## Resultados esperados del reto integrador

| Caso | Entrada | Total a pagar |
|---|---|---|
| A | cantidad = 3, cliente = VIP, con cupón | $638.00 |
| B | cantidad = 1, cliente = NUEVO, con cupón | $275.50 |
