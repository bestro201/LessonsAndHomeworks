### Класс Arrays
Класс `Arrays` в Java — это утилитный класс, принадлежащий пакету `java.util`, который предоставляет статические методы для выполнения различных операций на массивах, таких как сортировка и поиск. 
Этот класс помогает обрабатывать массивы примитивных типов данных, таких как `int`, `double`, `char`, а также массивы объектов.

Вот некоторые из наиболее часто используемых методов класса `Arrays`:

#### Сортировка

- **sort()**: Сортирует массив. Существует несколько перегрузок этого метода для различных типов данных.
    - `void sort(int[] a)` - Сортирует массив целых чисел по возрастанию.
    - `void sort(int[] a, int fromIndex, int toIndex)` - Сортирует диапазон массива целых чисел.
    - Аналогичные методы существуют для `byte`, `short`, `long`, `float`, `double`, `char` и объектов (`Object[]`), включая версии, которые принимают компаратор для объектов.

#### Поиск

- **binarySearch()**: Использует бинарный поиск для нахождения индекса элемента в отсортированном массиве. Если элемент не найден, возвращает отрицательное значение.
    - `int binarySearch(int[] a, int key)` - Выполняет поиск в массиве целых чисел.
    - `int binarySearch(int[] a, int fromIndex, int toIndex, int key)` - Выполняет поиск в диапазоне массива целых чисел.
    - Существуют аналогичные методы для других примитивных типов и объектов.

#### Копирование

- **copyOf()**: Возвращает новый массив, который является копией указанного массива.
    - `int[] copyOf(int[] original, int newLength)` - Возвращает копию массива целых чисел, длина которой `newLength`.
    - Аналогичные методы существуют для всех примитивных типов и объектов.

- **copyOfRange()**: Возвращает новый массив, который является копией указанного диапазона массива.
    - `int[] copyOfRange(int[] original, int from, int to)` - Возвращает копию диапазона массива целых чисел.
    - Аналогичные методы существуют для всех примитивных типов и объектов.

#### Заполнение

- **fill()**: Заполняет массив указанным значением.
    - `void fill(int[] a, int val)` - Заполняет массив целых чисел значением `val`.
    - `void fill(int[] a, int fromIndex, int toIndex, int val)` - Заполняет диапазон массива целых чисел.
    - Существуют аналогичные методы для других примитивных типов и объектов.

#### Сравнение

- **equals()**: Сравнивает два массива на предмет равенства.
    - `boolean equals(int[] a, int[] a2)` - Проверяет, равны ли два массива целых чисел.
    - Аналогичные методы существуют для всех примитивных типов и объектов.

#### Преобразование в строку

- **toString()**: Возвращает строковое представление массива.
    - `String toString(int[] a)` - Возвращает строковое представление массива целых чисел.
    - Аналогичные методы существуют для всех примитивных типов и объектов.

Эти методы значительно упрощают работу с массивами в Java, обеспечивая готовые решения для распространённых задач, таких как сортировка, поиск и сравнение массивов.

<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: green;"><b>English</b></summary>

The `Arrays` class in Java is a utility class belonging to the `java.util` package, which provides static methods for performing various operations on arrays, such as sorting and searching. This class aids in handling arrays of primitive data types, such as `int`, `double`, `char`, as well as arrays of objects.

Here are some of the most frequently used methods of the `Arrays` class:

#### Sorting

- **sort()**: Sorts an array. There are several overloads of this method for different data types.
    - `void sort(int[] a)` - Sorts an array of integers in ascending order.
    - `void sort(int[] a, int fromIndex, int toIndex)` - Sorts a range of an array of integers.
    - Similar methods exist for `byte`, `short`, `long`, `float`, `double`, `char`, and objects (`Object[]`), including versions that accept a comparator for objects.

#### Searching

- **binarySearch()**: Uses binary search to find the index of an element in a sorted array. If the element is not found, returns a negative value.
    - `int binarySearch(int[] a, int key)` - Performs a search in an array of integers.
    - `int binarySearch(int[] a, int fromIndex, int toIndex, int key)` - Performs a search in a range of an array of integers.
    - Similar methods exist for other primitive types and objects.

#### Copying

- **copyOf()**: Returns a new array that is a copy of the specified array.
    - `int[] copyOf(int[] original, int newLength)` - Returns a copy of an array of integers with length `newLength`.
    - Similar methods exist for all primitive types and objects.

- **copyOfRange()**: Returns a new array that is a copy of the specified range of the array.
    - `int[] copyOfRange(int[] original, int from, int to)` - Returns a copy of a range of an array of integers.
    - Similar methods exist for all primitive types and objects.

#### Filling

- **fill()**: Fills an array with the specified value.
    - `void fill(int[] a, int val)` - Fills an array of integers with the value `val`.
    - `void fill(int[] a, int fromIndex, int toIndex, int val)` - Fills a range of an array of integers.
    - Similar methods exist for other primitive types and objects.

#### Comparison

- **equals()**: Compares two arrays for equality.
    - `boolean equals(int[] a, int[] a2)` - Checks whether two arrays of integers are equal.
    - Similar methods exist for all primitive types and objects.

#### Conversion to String

- **toString()**: Returns a string representation of the array.
    - `String toString(int[] a)` - Returns a string representation of an array of integers.
    - Similar methods exist for all primitive types and objects.

These methods significantly simplify working with arrays in Java, providing ready-made solutions for common tasks such as sorting, searching, and comparing arrays.

</details>







