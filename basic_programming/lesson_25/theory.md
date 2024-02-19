
## Обобщения (Generics)
Дженерики (обобщения) — это особые средства языка Java для реализации обобщённого программирования: особого подхода к описанию данных и алгоритмов, позволяющего работать с различными типами данных без изменения их описания.
На сайте Oracle дженерикам посвящён отдельный tutorial: [Oracle](https://docs.oracle.com/javase/tutorial/java/generics/index.html "Generics tutorial")

Обобщения или generics (обобщенные типы и методы) позволяют нам уйти от жесткого определения используемых типов.

Дженерики позволяют создавать классы, интерфейсы и методы, работающие с разными типами данных.

 - Обобщенные классы.
Пример: class Box<T> { private T content; ... }
- Обобщенные интерфейсы.
Пример: interface List<T> { void add(T item); T get(int index); }
- Обобщенные методы.
```
    public <T> void printArray(T[] array) {
    for (T item : array) {
    System.out.println(item);
    }
    }
```

- Параметризация типами

```
public class GenericBox<T> {}
...
GenericBox<Integer> integerBox = new GenericBox<>;

```

При создании объекта класса после имени класса в угловых скобках нужно указать, какой именно тип будет использоваться вместо универсального параметра.
При этом надо учитывать, что они **работают только с объектами**, но не работают с примитивными типами.
То есть мы можем написать <Integer>, но не можем использовать тип int или double.
Вместо примитивных типов надо использовать классы-обертки: Integer вместо int, Double вместо double и т.д.


### Ограничения дженериков:

- Использование extends для ограничения типов.
Пример: `class NumericBox<T extends Number> { ... }`

- Использование super для ограничения типов.
Применяется в основном с `wildcards`.
Wildcards: ?, `? extends T`, `? super T`.

Пример: 
```
void processBoxes(List<? extends Fruit> boxes) { ... }
```

### Особенности работы с дженериками

- Erasure типов: что происходит во время компиляции.
Во время выполнения информация о типах удаляется, и `List<Integer>` становится просто `List`.

- Невозможность создания экземпляров обобщенного типа.
Пример: T item = new T(); // Ошибка

### Преимущества и недостатки использования дженериков.
  - Преимущества: безопасность типов, переиспользование кода, улучшенная читаемость кода.
  - Недостатки: сложность, ограничения на использование с примитивами, сложности при работе с массивами обобщенных типов.

<hr>

## Wrappers

Классы-обертки в Java используются для представления примитивных типов данных как объектов. Примитивные типы данных в Java, такие как `int`, `char` и `double`, не являются объектами. Однако иногда требуется работать с примитивами как с объектами, например, при добавлении их в коллекции или при использовании методов, ожидающих объекты.

Вот список классов-оберток для примитивных типов:

1. `Byte` - обертка для `byte`
2. `Short` - обертка для `short`
3. `Integer` - обертка для `int`
4. `Long` - обертка для `long`
5. `Float` - обертка для `float`
6. `Double` - обертка для `double`
7. `Character` - обертка для `char`
8. `Boolean` - обертка для `boolean`

Основные причины использования классов-оберток:

1. **Добавление в коллекции**: Примитивы напрямую не могут быть добавлены в коллекции, такие как `ArrayList`. С помощью классов-оберток их можно добавить как объекты.

2. **Методы и константы**: Классы-обертки предоставляют ряд полезных методов и констант для работы с соответствующими примитивами. Например, `Integer` предоставляет метод `parseInt` для преобразования строки в целое число.

3. **Поддержка `null`**: Примитивные типы не могут принимать значение `null`, в то время как их обертки могут. Это может быть полезно в некоторых случаях, чтобы отличить "отсутствующее" значение от любого конкретного значения примитива.

4. **Приведение типов**: Автоупаковка и автораспаковка в Java позволяют автоматически конвертировать примитивы в их обертки и наоборот.

Пример автоупаковки и автораспаковки:

```
Integer wrappedInt = 5;  // автоупаковка
int primitiveInt = wrappedInt;  // автораспаковка
```

Однако следует быть осторожным при работе с классами-обертками из-за возможных проблем с производительностью и неожиданным поведением, связанным с автоупаковкой и автораспаковкой.



Особенности работы с классами-обертками, связанные с автоупаковкой и автораспаковкой, могут проявляться в следующих условиях:

1. **Сравнение объектов с использованием `==`**: При использовании оператора `==` для сравнения двух объектов классов-оберток, сравниваются их ссылки, а не их значения. Это может привести к неожиданным результатам, особенно когда используется автоупаковка.

   ```
   Integer a = 127;
   Integer b = 127;
   System.out.println(a == b); // true

   Integer c = 128;
   Integer d = 128;
   System.out.println(c == d); // false
   ```

   В приведенном выше примере для значений от -128 до 127 используются кешированные объекты, поэтому `a` и `b` ссылаются на один и тот же объект. Однако для значений вне этого диапазона создаются новые объекты, и `c` и `d` являются разными объектами.

2. **Производительность**: Автоупаковка и автораспаковка добавляют накладные расходы, так как каждый раз создается новый объект. В циклах или интенсивных вычислениях это может существенно снизить производительность.

Общие (или схожие) методы, которыми обладают классы-обертки:

1. **`valueOf()`**: Преобразует данный тип (обычно строку или примитив) в соответствующий объект класса-обертки.

2. **`parseXxx()`**: Преобразует строку в соответствующий примитивный тип. Например, `Integer.parseInt()` или `Double.parseDouble()`.

3. **`toString()`**: Возвращает строковое представление значения объекта.

4. **`equals(Object obj)`**: Сравнивает текущий объект с указанным объектом на равенство.

5. **`compareTo()`**: Сравнивает текущий объект с другим объектом того же типа.

6. **`XxxValue()`**: Возвращает значение объекта как примитивный тип. Например, `intValue()` для `Integer` или `doubleValue()` для `Double`.

Это общие методы, но стоит отметить, что у каждого класса-обертки могут быть и свои уникальные методы, связанные с особенностями данного примитивного типа.
Все числовые обертки над примитивами в Java наследуются от абстрактного класса `Number`. Это включает в себя следующие классы:

- `Byte`
- `Short`
- `Integer`
- `Long`
- `Float`
- `Double`

Эти классы обладают методами, унаследованными от `Number`, которые позволяют извлекать значение объекта в различных примитивных форматах. К таким методам относятся:

- `byteValue()`
- `shortValue()`
- `intValue()`
- `longValue()`
- `floatValue()`
- `doubleValue()`

Таким образом, вы можете создать объект, например, `Integer`, и затем извлечь его значение в любом другом примитивном числовом формате с помощью соответствующего метода.


<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: green;"><b>English</b></summary>

## Generics

Generics, also known as templates in some programming languages, are a feature in Java that allow you to write classes, interfaces, and methods that operate on types as parameters. They enable you to create more flexible and reusable code by abstracting data types.

In Java, generics provide the ability to work with different types of data without specifying those types when defining the class or method. This makes your code more generic and adaptable to different data types.

Oracle has a dedicated tutorial on generics, which you can find [here](https://docs.oracle.com/javase/tutorial/java/generics/index.html).

Generics help improve code reusability and type safety, allowing you to write more flexible and robust Java programs.


```
public class GenericBox<T> {}
...
GenericBox<Integer> gBox1 = new GenericBox<>;

```

### Using Generics

When creating an object of a generic class, you need to specify the actual type that will be used in place of the generic parameter. This allows you to work with different types in a type-safe manner while reusing the same code structure.

However, it's important to note that generics in Java work only with objects and cannot be used with primitive data types. For instance, you can write `<Integer>` to work with `Integer` objects, but you cannot use generics with primitive types like `int` or `double`. In such cases, you should use wrapper classes like `Integer` instead of `int` and `Double` instead of `double`.

Generics provide a powerful way to create reusable code that can work with various data types while maintaining type safety.

<hr>


## Wrappers

Wrapper classes in Java are used to represent primitive data types as objects. Primitive data types in Java, such as `int`, `char`, and `double`, are not objects. However, there are times when you need to treat primitives as objects, for instance when adding them to collections or when using methods that expect objects.

Here's a list of wrapper classes for primitive types:

1. `Byte` - wrapper for `byte`
2. `Short` - wrapper for `short`
3. `Integer` - wrapper for `int`
4. `Long` - wrapper for `long`
5. `Float` - wrapper for `float`
6. `Double` - wrapper for `double`
7. `Character` - wrapper for `char`
8. `Boolean` - wrapper for `boolean`

Main reasons for using wrapper classes:

1. **Adding to Collections**: Primitives can't be added directly to collections, like `ArrayList`. With wrapper classes, they can be added as objects.

2. **Methods and Constants**: Wrapper classes offer a range of useful methods and constants to work with their respective primitives. For instance, `Integer` offers the `parseInt` method to convert a string into an integer.

3. **Support for `null`**: Primitive types can't take a `null` value, while their wrappers can. This can be helpful in certain scenarios to distinguish a "missing" value from any specific primitive value.

4. **Type Casting**: Autoboxing and unboxing in Java allows primitives to be automatically converted to their wrappers and vice versa.

Example of autoboxing and unboxing:

```
Integer wrappedInt = 5;  // autoboxing
int primitiveInt = wrappedInt;  // unboxing
```

However, care should be taken when working with wrapper classes due to possible performance issues and unexpected behavior related to autoboxing and unboxing.

Particularities of working with wrapper classes related to autoboxing and unboxing can manifest under the following conditions:

1. **Object comparison using `==`**: When using the `==` operator to compare two wrapper class objects, their references are compared, not their values. This can lead to unexpected results, especially when autoboxing is involved.

   ```
   Integer a = 127;
   Integer b = 127;
   System.out.println(a == b); // true

   Integer c = 128;
   Integer d = 128;
   System.out.println(c == d); // false
   ```

In the example above, for values from -128 to 127, cached objects are used, so `a` and `b` refer to the same object. However, for values outside this range, new objects are created, and `c` and `d` are different objects.

Here's the translation:

2. **Performance**: Autoboxing and unboxing introduce overhead since a new object is created every time. In loops or intensive computations, this can significantly degrade performance.

Common (or similar) methods that wrapper classes possess:

1. **`valueOf()`**: Converts the given type (usually a string or primitive) into the corresponding wrapper class object.

2. **`parseXxx()`**: Converts a string into the corresponding primitive type. For instance, `Integer.parseInt()` or `Double.parseDouble()`.

3. **`toString()`**: Returns the string representation of the object's value.

4. **`equals(Object obj)`**: Compares the current object with the specified object for equality.

5. **`compareTo()`**: Compares the current object with another object of the same type.

6. **`XxxValue()`**: Returns the object's value as a primitive type. For instance, `intValue()` for `Integer` or `doubleValue()` for `Double`.

These are general methods, but it's worth noting that each wrapper class may also have its own unique methods related to the specifics of its primitive type.
All numeric wrappers over primitives in Java inherit from the abstract class `Number`. This includes the following classes:

- `Byte`
- `Short`
- `Integer`
- `Long`
- `Float`
- `Double`

These classes possess methods inherited from `Number` that allow extracting the object's value in various primitive formats. Such methods include:

- `byteValue()`
- `shortValue()`
- `intValue()`
- `longValue()`
- `floatValue()`
- `doubleValue()`

Thus, you can create an object, for instance, `Integer`, and then extract its value in any other primitive numeric format using the respective method.


</details>