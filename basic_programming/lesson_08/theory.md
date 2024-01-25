## Массивы
**Массив** — это структура данных, в которой хранятся элементы **одного** типа.
Его можно представить, как набор пронумерованных ячеек, в каждую из которых можно поместить какие-то данные (один элемент данных в одну ячейку). Доступ к конкретной ячейке осуществляется через её номер.
Номер элемента в массиве также называют **индексом**.

В случае с Java массив однороден, то есть во всех его ячейках будут храниться элементы одного типа. Так, массив целых чисел содержит только целые числа (например, типа int), массив строк — только строки, массив из элементов созданного нами класса Dog20 будет содержать только объекты Dog20.
То есть в Java мы не можем поместить в первую ячейку массива целое число, во вторую String, а в третью — “собаку”.

<img src="https://raw.githubusercontent.com/ait-tr/cohort41/main/basic_programming/lesson_08/img/array.jpeg" width="100%">


### Как объявить массив?
Как и любую переменную, массив в Java нужно объявить. Сделать это можно одним из двух способов. 
Они равноправны, но первый из них лучше соответствует стилю Java.


```
dataType[] arrayName;    ->     int[] myArray;
dataType arrayName[];    ->     int myArray[];
```

### Создание массива
Как и любой другой объект, создать массив Java, то есть зарезервировать под него место в памяти, можно с помощью оператора new.

Делается это так:

```
new arrayType [length];
```

`arrayType` — это тип массива, а `length` — его длина (то есть, количество ячеек), выраженная в целых числах (int)



```
int[] myArray; // объявление массива -- Array declaration
myArray = new int[10]; // создание, то есть, выделение памяти для массива на 10 элементов типа int
                       // Creation, i.e., memory allocation for an array of 10 elements of type int
```

Однако гораздо чаще массив создают сразу после объявления с помощью такого сокращённого синтаксиса:

```
int[] myArray = new int[10]; // объявление и выделение памяти в одной строке кода

```

При подобной инициализации все элементы массива имеют **значение по умолчанию**.\
Для числовых типов (в том числе для типа char) это число 0, для типа boolean это значение false, а для остальных объектов это значение null.

Однако также можно задать конкретные значения для элементов массива при его создании:

```
int[] numbers = new int[] { 1, 2, 3, 5 };
String[] strings = { “One”, “Two”, “Twenty five” };
```

Обращение к элементу массива происходит по его индексу:
```
myArray[0];
```

Важнейшее свойство, которым обладают массивы, является свойство(метод) `length`, возвращающее длину массива, то есть количество его элементов:
```
int[] numbers = {1, 2, 3, 4, 5};
int length = numbers.length;   // 5
```

Для работы с массивами в Java есть класс `java.util.Arrays`


___

## Цикл for
Цикл **for** является наиболее распространённым циклом в программировании, поэтому его следует изучить. Цикл for проводит инициализацию перед первым шагом цикла. Затем выполняется проверка условия цикла, и в конце каждой итерации происходит изменение управляющей переменной.

```
for(<начальная точка>; <условие выхода>; <изменение счетчика>) {
	// Тело цикла
}
```

Пример перебора цифр от 0 до 5 и вывод каждой в консоль:
```
for(int i = 0; i < 5; i++) {
   System.out.println(i);
}
```

Счетчик цикла не обязательно должен быть целочисленным. Вполне допустим, например, тип double. И даже тип String:\

```
 for (String str = "Hello"; str.length() < 10; str = str + "1") {
      System.out.println(str);
  }
```

Такой счетчик цикла допустим, но практически не используется. За ненадобностью.

Все три блока <начальная точка>; <условие выхода>; <изменение счетчика> - не обязательны.
Программа вполне себе скомпилируется и запустит бесконечный цикл:

```
for( ; ; ){
    System.out.println("Hello");
}
```

Если при обработке цикла нужно его прервать, используйте оператор `break`, который останавливает работу текущего тела цикла.
Все последующие итерации также пропускаются

Оператор `continue` завершает текущую итерацию цикла и переходит к следующей.


<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: green;"><b>English</b></summary>


## Arrays
An **array** is a data structure that holds elements of the **same** type.
You can envision it as a collection of numbered cells, each capable of holding some data (one data element in one cell). Access to a specific cell is achieved using its number, also known as an **index**.

In the context of Java, arrays are homogeneous, meaning all cells store elements of the same type. For instance, an array of integers contains only integers (e.g., of type int), an array of strings contains only strings, and an array of objects of a custom class like Dog20 contains only Dog20 objects.
In Java, we cannot place an integer in the first cell of an array, a string in the second, and a "dog" in the third cell.


### Declaring an Array
**How to Declare an Array?**  
Just like any variable, you need to declare an array in Java. You can do it in one of two ways. They are equivalent, but the first one aligns better with Java's style.

```
dataType[] arrayName;    ->     int[] myArray;
dataType arrayName[];    ->     int myArray[];
```


### Creating an Array
Similar to creating any other object, you can allocate memory for a Java array using the **new** operator.

This is done as follows:

```
new arrayType [length];
```

`arrayType` is the array type, and `length` is its length, expressed in integers (`int`).

```
int[] myArray; // Array declaration
myArray = new int[10]; // Creation, i.e., memory allocation for an array of 10 elements of type int
```

However, more often arrays are created immediately after declaration using this shorthand syntax:
```
int[] myArray = new int[10]; // Array creation and memory allocation for an array of 10 elements of type int

```

When initialized this way, all array elements have a **default value**.  
For numerical types (including the `char` type), this value is 0. For the `boolean` type, it's `false`, and for other objects, it's `null`.

However, you can also assign specific values to array elements during its creation:

```
int[] numbers = new int[] { 1, 2, 3, 5 };
String[] strings = { “One”, “Two”, “Twenty five” };
```

Accessing an array element is done using its index:
```
myArray[0];
```

An essential property that arrays possess is the `length` property (method), which returns the length of the array, i.e., the number of its elements:
```
int[] numbers = {1, 2, 3, 4, 5};
int length = numbers.length;   // 5
```

To work with arrays in Java, there is the `java.util.Arrays` class

___


## The "for" Loop
The **for** loop is the most commonly used loop in programming, so it's crucial to understand. The **for** loop performs initialization before the first loop step. Then, it checks the loop condition, and at the end of each iteration, the control variable is modified.
```
for (<initialization>; <exit condition>; <counter modification>) {
    // Loop body
}
```

Example of iterating through numbers from 0 to 5 and printing each one to the console:
```
for(int i = 0; i < 5; i++) {
   System.out.println(i);
}
```

The loop counter doesn't necessarily have to be an integer. It's perfectly acceptable, for instance, to use the double type. Even the String type can be used:

```
 for (String str = "Hello"; str.length() < 10; str = str + "1") {
      System.out.println(str);
  }
```

While such a loop counter is permissible, it's rarely used due to its impracticality.

All three blocks, <initialization>; <exit condition>; <counter modification>, are not mandatory. A program will successfully compile and run with an infinite loop:
```
for( ; ; ){
    System.out.println("Hello");
}
```

If you need to interrupt a loop's processing, use the `break` statement, which stops the execution of the current loop body. All subsequent iterations are also skipped.

The `continue` statement terminates the current iteration of the loop and proceeds to the next one.

</details>