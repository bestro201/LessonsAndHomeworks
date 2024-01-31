## Алгоритмы и структуры
Алгоритмы и структуры данных являются фундаментальными компонентами программирования и относительно языка Java имеют особую значимость благодаря богатой стандартной библиотеке, которая включает в себя множество готовых реализаций

### Алгоритм
Алгоритм — это чёткий набор инструкций или правил, которые определяют процесс выполнения задачи или решения проблемы. В контексте программирования, алгоритмы могут применяться для обработки данных, вычислений, автоматизированных рассуждений и многих других задач.

### Структуры данных
Структуры данных — это способы организации и хранения данных в компьютере, так чтобы их можно было эффективно использовать. Они критически важны для создания эффективного программного обеспечения.

---

## Сортировка выбором

Задача любой сортировки - упорядочить элементы в массиве (или любой другой последовательности значений).
Сортировка может осуществляться по любому критерию.
Например, в порядке возрастания значений, в порядке убывания, строки могут сортироваться в алфавитном порядке, по длине строк и так далее.


**Сортировка выбором.**
Задача - упорядочить элементы в массиве в порядке возрастания значений.


Описания алгоритма сортировки:
1. Выбирается минимальный элемент массива
2. минимальное значение меняется местами с первым элементом
3. Вторая итерация - выбирается мин элемент из оставшейся части массива
4. Меняется местами с первым из оставшихся.


<img src="https://raw.githubusercontent.com/ait-tr/cohort41/main/basic_programming/lesson_12/img/SortSelection.jpeg" width="100%">

___
## Binary search
Binary search - алгоритм поиска элемента в отсортированном массиве. Обязательное условие - массив должен быть отсортирован.

Описания алгоритма поиска:

1. Делим массив пополам
2. Если значение равно искомому - возвращаем индекс.
3. Если значение в середине массива больше, чем искомое, значит, если искомое и присутствует в массиве, то оно будет в левой части массива. Значения в правой части можно не проверять
4. Если наоборот, значение в середине больше, то искомое может быть только в правой части
5. Если оставшуюся часть массива еще можно разделить пополам - возвращаемся в шан номер 1. Делим пополам оставшуюся часть массива
6. Если оставшуюся часть уже невозможно разделить - возвращаем -1 - элемент не найден

<img src="https://raw.githubusercontent.com/ait-tr/cohort41/main/basic_programming/lesson_12/img/BinarySearch.jpeg" width="100%">

---


## O-нотация?

**O-нотация** — это математическая нотация, используемая для описания асимптотической сложности алгоритмов. Это способ выразить, как быстро растёт время выполнения алгоритма или затрачиваемая память в зависимости от размера входных данных. O-нотация фокусируется на худшем сценарии выполнения алгоритма.

### Основные классы сложности

1. **O(1) — постоянная сложность**: Время выполнения алгоритма не зависит от размера входных данных. Например, доступ к элементу массива по индексу в Java:

   ```
   int value = array[index];
   ```

2. **O(log n) — логарифмическая сложность**: Время выполнения увеличивается логарифмически по отношению к размеру входных данных. Характерный пример — бинарный поиск:

   ```
   int binarySearch(int[] array, int x) {
       int l = 0, r = array.length - 1;
       while (l <= r) {
           int m = l + (r - l) / 2;
           if (array[m] == x)
               return m;
           if (array[m] < x)
               l = m + 1;
           else
               r = m - 1;
       }
       return -1;
   }
   ```

3. **O(n) — линейная сложность**: Время выполнения алгоритма растёт линейно в зависимости от размера входных данных. Пример — простой перебор массива:

   ```
   boolean contains(int[] array, int x) {
       for (int i : array) {
           if (i == x) {
               return true;
           }
       }
       return false;
   }
   ```

4. **O(n log n) — линейно-логарифмическая сложность**: Время выполнения алгоритма растёт быстрее, чем линейно, но медленнее, чем квадратично. Пример — эффективные алгоритмы сортировки, такие как сортировка слиянием.

5. **O(n²) — квадратичная сложность**: Время выполнения увеличивается квадратично по отношению к размеру входных данных. Характерный пример — вложенные циклы:

   ```
   void printPairs(int[] array) {
       for (int i = 0; i < array.length; i++) {
           for (int j = 0; j < array.length; j++) {
               System.out.println(array[i] + ", " + array[j]);
           }
       }
   }
   ```

### Важные моменты

- **Худший сценарий**: O-нотация обычно рассматривает худший сценарий выполнения алгоритма.
- **Игнорирование констант**: В O-нотации игнорируются константы и менее значимые термины. Например, O(2n) и O(n + 100) оба считаются O(n).
- **Большие размеры данных**: O-нотация особенно полезна для анализа алгоритмов, работающих с большими объёмами данных.

Используя O-нотацию, разработчики могут оценить, насколько хорошо алгоритм будет масштабироваться с увеличением размера входных данных, что критически важно при работе с больш
<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: green;"><b>English</b></summary>

### Selection Sort

Selection sort is a simple sorting algorithm that organizes elements in an array (or any other sequence of values) in a specified order, such as ascending or descending numerical order, alphabetical order, or by the length of the strings.

**Selection Sort Algorithm:**
1. Find the minimum element in the array.
2. Swap the minimum element with the first element.
3. Repeat the process for the remaining part of the array, starting from the second element.


### Binary Search

Binary search is an algorithm for finding an element in a sorted array. It's essential that the array is sorted before using binary search.

**Binary Search Algorithm:**
1. Divide the array in half.
2. If the middle value is equal to the target, return its index.
3. If the middle value is greater than the target, search the left half of the array.
4. If the middle value is less than the target, search the right half.
5. Repeat the process with the new half-array.
6. If the segment can no longer be divided, return -1, indicating the element isn't found.


### Big O Notation

Big O notation is a mathematical concept used to describe the asymptotic complexity of algorithms. It expresses how the run time or space requirements of an algorithm grow as the size of the input data increases, focusing on the worst-case scenario.

**Key Complexity Classes:**
1. **O(1) - Constant Complexity**: The runtime doesn't depend on the input size.
2. **O(log n) - Logarithmic Complexity**: The runtime grows logarithmically with input size.
3. **O(n) - Linear Complexity**: The runtime grows linearly with input size.
4. **O(n log n) - Linear-Logarithmic Complexity**: Faster than linear but slower than quadratic; common in efficient sorting algorithms.
5. **O(n²) - Quadratic Complexity**: Runtime grows quadratically with input size; common in nested loops.

These complexity classes help developers estimate how algorithms will scale with large data sizes, which is crucial for performance optimization.

</details>
