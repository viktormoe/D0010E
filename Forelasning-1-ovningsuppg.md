# Lösningar: Övningsuppgifter föreläsning 1 (D0010E)

## Uppgift 1: Teoretiska begrepp
* **a) Information och representation:** Information är abstrakt kunskap. Representation är informationens konkreta form för maskinhantering. Information har betydelse, medan representation kräver tolkning.
* **b) Typ:** En mängd objekt som delar samma egenskaper.
* **c) Element:** Objekt eller instanser i en typs mängd.
* **d) Huvudpoängen med typer:** Att möjliggöra typkontroll för att undvika felanvändning och särskilja data.
* **e) Java-motsvarighet:** Klasser.
* **f) Instanser:** Konkreta komponenter skapade av en klass (typ) under körning.

---

## Uppgift 2: Variabler och primitiva typer
* **a) Variabel:** Ett namn på en minnesplats.
* **b) Platser i programmet:** I klasser och metoder.
* **c) Förberedelse:** Måste deklareras med namn och typ (och startvärde).
* **d) De 8 primitiva typerna:** `byte`, `short`, `int`, `long`, `float`, `double`, `char`, `boolean`.
* **e) Deklaration:** `int antalManader = 12;`

---

## Uppgift 3: Metoder
* **a) Plats:** I klasser.
* **b) Main-metoden:** Startpunkten för programmets exekvering.

---

## Uppgift 4: Grundstenar
1. **Arv** (Inheritance)
2. **Inkapsling** (Encapsulation)
3. **Abstraktion** (Abstraction)
4. **Polymorfism** (Polymorphism)

---

## Uppgift 5: for-loopar
* **i)** `for (int i = 1; i <= 8; i++) System.out.print(i);`
* **ii)** `for (int i = 8; i >= 1; i--) System.out.print(i);`
* **iii)** `for (int i = 1; i <= 8; i++) System.out.print(i * i + " ");`
* **iv)** `for (int i = 1; i <= 11; i += 2) System.out.print(i + " ");`
* **v)** `for (int i = 11; i >= -9; i -= 4) System.out.print(i + " ");`

---

## Uppgift 6: while-loopar
* **ii)** `int i = 8; while (i >= 1) System.out.print(i--);`
* **iv)** `int i = 1; while (i <= 11) { System.out.print(i + " "); i += 2; }`
* **v)** `int i = 11; while (i >= -9) { System.out.print(i + " "); i -= 4; }`

---

## Uppgift 7: do-while-loopar
* **i)** `int i = 1; do { System.out.print(i++); } while (i <= 8);`
* **v)** `int i = 11; do { System.out.print(i + " "); i -= 4; } while (i >= -9);`

---

## Uppgift 8: Sittplatser
```java
public int sittplatser(int n) {
    int platser = 10;
    for (int r = 2; r <= n; r++) {
        platser += 2;
        if (r % 5 == 0) platser++;
    }
    return platser;
}
```

---

## Uppgift 9: if-satser
```java
// a)
if (i >= j) k = 100;

// b)
if (a) i = j;

// c)
if (a && b) c = true;

// d)
if (a || b) c = false;

// e)
if (a && b || b && c) b = a && c;

// f)
if (!a && (b || !c)) a = true;

// g)
if (!b) a = true;
else c = true;

// h)
if (c || a) {
    if (b) j = k;
    else j = k;
} else c = false;

// i)
if (a && b && c) k *= 2;

// j)
if (a && !a) b = c || !c;
else b = b && !b;
```