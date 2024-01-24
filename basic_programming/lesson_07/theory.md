## Оператор выбора switch

Оператор выбора **switch** позволяет сравнивать переменную как с одним, так и с несколькими значениями. 
Общая форма написания выглядит следующим образом:


```
switch(ВыражениеДляВыбора) {
    case значение1:
        // Блок кода 1
        break;
    case значение2:
        // Блок кода 2
        break;
    case значениеN:
        // Блок кода N
        break;
    default :
        // Блок кода для default
}
```

Тип `ВыражениеДляВыбора` для оператора выбора switch в Java должен быть одним из следующих:

- byte, short, char, int.
- Их обёртки Byte, Short, Character, Integer.
- String (начиная с Java 7).
- Перечисление (Enum).

<img src="https://raw.githubusercontent.com/ait-tr/cohort41/main/basic_programming/lesson_07/img/switch.jpeg" width="100%">


---

## Циклы
**Циклы** позволяют выполнить некий код несколько раз подряд
Каждый такой повтор называется **итерацией**

## Циклы "while" / "do ... while"
Цикл **while** выполняется до тех пор, пока заданное условие является верным (имеет значение **true**):

```
while (condition) {
    // body
    ...
}
```


**Предикат** — условие, которое указывается в скобках после ключевого слова while и вычисляется на каждой итерации

**Тело цикла** — блок кода в фигурных скобках, аналогичный блоку кода в методе. Все константы или переменные, определенные внутри этого блока, будут видны только внутри этого блока

Цикл while - цикл с предусловием

цикл do-while - цикл с постусловием

Цикл "do ... while" похож, но он всегда выполняет блок кода хотя бы один раз, независимо от того, истинно условие или ложно:

```
do {
    ...
    ...
} while (condition)
```
<img src="https://raw.githubusercontent.com/ait-tr/cohort41/main/basic_programming/lesson_07/img/while41.jpeg" width="100%">
<img src="https://raw.githubusercontent.com/ait-tr/cohort41/main/basic_programming/lesson_07/img/doWhile.jpeg" width="100%">


---


<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: green;"><b>English</b></summary>



The `switch` selection statement allows you to compare a variable against both single and multiple values. The general writing form looks as follows:

```
switch(ExpressionToSelect) {
    case value1:
        // Code Block 1
        break;
    case value2:
        // Code Block 2
        break;
    case valueN:
        // Code Block N
        break;
    default:
        // Code Block for default
}

```

The type of `ExpressionToSelect` for the switch statement in Java must be one of the following:

- `byte`, `short`, `char`, `int`.
- Their wrappers: `Byte`, `Short`, `Character`, `Integer`.
- `String` (starting from Java 7).
- Enum.


## Loops
**Loops** allow you to execute a certain piece of code multiple times in a row. Each repetition is referred to as an **iteration**.

## "while" / "do ... while" Loops
The **while** loop continues executing as long as the specified condition remains true (evaluates to **true**):

```
while (condition) {
    // code to be executed
}
```

**Predicate** - a condition specified within the parentheses after the **while** keyword, evaluated at each iteration.

**Loop Body** - a code block enclosed in curly braces, similar to a code block in a method. All constants or variables defined inside this block will only be visible within this block.


The `do ... while loop` is similar, but it always executes the code block at least once, regardless of whether the condition is true or false:

```
do {
    ...
    ...
} while (condition)
```


</details>