# Practica HashSet vs. TreeSet en Java Collections Framework

## 1. Diferencias entre HashSet y TreeSet

Diferencias entre HashSet y TreeSet
La diferencia principal entre un HashSet y un TreeSet en Java es que el HashSet 
almacena elementos sin ningún orden específico utilizando una tabla hash, 
mientras que el TreeSet los mantiene ordenados de forma ascendente o natural mediante un árbol rojo-negro


## 2. Respuestas a las preguntas de análisis

1. ¿Qué característica fundamental define a `Set`?
Representa una coleccion que no permite elementos duplicados
2. ¿Permite `HashSet` elementos duplicados?
No
3. ¿Permite `TreeSet` elementos duplicados?
Np
4. ¿Qué devuelve `add()` cuando el elemento ya existe?
devuelve false
5. ¿Por qué `HashSet` no garantiza un orden de iteración?
porque organiza elementos de una tabla hash basandose en codigo hashCode() de los objetos
6. ¿Qué tipo de orden mantiene `TreeSet`?
orden natural
7. ¿Cuál es la complejidad promedio de `HashSet.contains()`?
0(1) promedio
8. ¿Cuál es la complejidad de `TreeSet.contains()`?
0(log n)
9. ¿Por qué `TreeSet` tiene un costo adicional respecto a `HashSet`?
porque cada insercion, busqueda o eliminacion debe recorrer y balancear 
internamente una estructura de arbol (rojo-negro) realizando comparaciones entre los elementos
10. ¿Qué ventaja proporciona `TreeSet.first()`?
permite obtener el elemento menor del conjunto segun el orden establecido
11. ¿Qué diferencia existe entre `lower()` y `floor()`?
lower devuelve el elemento estrictamente menor que e
floor devueve el mayor elemento menor o igual que e 
12. ¿Qué diferencia existe entre `higher()` y `ceiling()`?
higher devuelve el menor elemento mayor que e
ceiling devuelve el menor elemento mayor o igual que e
13. ¿Para qué sirve `subSet()`?
 Sirve para obtener una vista (subconjunto) de los elementos comprendidos dentro
de un rango determinado de valores
14. ¿Qué papel desempeña un `Comparator` en `TreeSet`?
Permite definir un criterio de ordenamiento personalizado para 
los elementos, ignorando o reemplazando el orden natural de la clase
15. ¿Cómo se implementa una unión utilizando `Set`?
Creando una copia de uno de los conjuntos y aplicando el método addAll() 
sobre el otro
16. ¿Cómo se implementa una intersección?
Creando una copia de uno de los conjuntos y aplicando el método 
retainAll() con respecto al otro
17. ¿Cómo se implementa una diferencia?
creando una copia del primer conjunto y aplicando el método removeAll pasando 
el segundo conjunto
18. ¿En qué escenario utilizaría `HashSet`?
cuando solo se requiere garantizar unicidad de datos y realizar busquedas, inserciones
o eliminaciones de la forma mas rapida posible 0(1), sin importa el orden de los elementos
19. ¿En qué escenario utilizaría `TreeSet`?
cuando ademas de evitar duplicados se necesite mantener la informacion siemore ordenada, obtener valores
minimos/maximos, o realizar operaciones de navegacion y consultar por rango
20. ¿Por qué es conveniente declarar `Set<String>` en lugar de
    `HashSet<String>` cuando solo se necesitan operaciones de `Set`?
Porque sigue el principio de programación hacia interfaces, lo cual desacopla el código de una 
implementación concreta y permite cambiar fácilmente a otra clase (como TreeSet o LinkedHashSet) 
en el futuro sin tener que modificar la lógica que utiliza la colección



## 3. Tabla comparativa final

| Característica | `HashSet`                      | `TreeSet`                |
|---|--------------------------------|--------------------------|
| Implementa `Set` | Si                             | Si                       |
| Permite duplicados | no                             | no                       |
| Mantiene orden de inserción | no                             | no                       |
| Mantiene orden natural | no                             | si                       |
| Estructura conceptual | Hash table                     | arbol ordenado           |
| `add()` | 0(1)promedio                   | 0(log n)                 |
| `contains()` | 0(1) promedio                  | 0(log n)                 |
| `remove()` | 0(1) promedio                  | 0(log n)                 |
| Elemento mínimo/máximo | No directamente                | `first()` / `last()`     |
| Navegación | No                             | si                       |
| Consultas por rango | no directamente                | si                       |
| Orden personalizado | no como caracteristica del set | si mediante `Comparator` |
| Uso típico | Pertenencia/unicidad           | unicidad + orden         |

