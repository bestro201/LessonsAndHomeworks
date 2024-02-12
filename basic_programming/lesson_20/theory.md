<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: green;"><b>на Русском</b></summary>

С вероятностью 99,9% между классами в наших приложениях будут существовать некая связь

В ООП выделяют два вида связей между классами:
- IS-A является
- HAS-A имеет



```
Autobus IS-A Vehicle
Driver IS-A Person
Passenger IS-A Person
```

```
Autobus HAS-A RegistrationDoc
Autobus HAS-A Driver
Autobus HAS-A Passengers
```

В объектно-ориентированных языках программирования существует три способа организации взаимодействия между классами

- Наследование
- Агрегация
- Композиция

**Наследование** — это когда класс-наследник имеет все поля и методы родительского класса, и, как правило, добавляет какой-то новый функционал и/или поля. 
Наследование – это один из основных принципов объектно-ориентированного программирования, который позволяет создавать новый класс на основе существующего класса.
Наследование основывается на связи IS-A «является».

Наследование в коде программы обозначается ключевым словом `extends`.  Также следует знать, что класс, от которого наследуются, называется родителем (родительским классом, класс-родитель). Класс, который наследует, соответственно класс-потомок.

```
public class Car extends Vehicle{

   private final int passengersCount;
   private int  mileage;

   public Car(String model, int year, int passengersCount) {
       super(model, year);
       this.passengersCount = passengersCount;
       this.mileage = 10000;
   }
```



Вынесение общих состояний и поведения (полей и методов) в класс-родитель позволит нам сэкономить кучу времени и места.

Если же у какого-то типа есть свойства или методы, уникальные только для него и отсутствующие у других типов машин, — не беда. 
Их всегда можно создать в классе-потомке, отдельно от всех остальных.

**Важно! В Java нет множественного наследования.**
**Каждый класс может наследоваться только от одного класса**

---

#### Как решать задачи в программировании:


Научиться составлять алгоритмы решения задач — ключевой навык в программировании. Этот процесс требует практики и понимания основных принципов. Вот несколько шагов и советов, которые помогут в этом:

### 1. Понимание задачи
- **Тщательно прочитайте задачу**: Убедитесь, что вы понимаете, что от вас требуется. Определите входные данные, выходные данные и заданные условия.
- **Идентифицируйте ключевые элементы**: Выделите основные компоненты задачи, такие как объекты действия, условия и искомые результаты.

### 2. Разбиение задачи на подзадачи
- **Декомпозиция**: Разбейте большую задачу на более мелкие, управляемые части. Это упрощает процесс решения.
- **Пошаговый подход**: Определите шаги, необходимые для перехода от входных данных к выходным.

### 3. Выбор подходов и инструментов
- **Анализ алгоритмов**: Изучите различные алгоритмические подходы (например, рекурсия, итерация, динамическое программирование) и выберите наиболее подходящий.
- **Паттерны решения**: Обратите внимание на типичные паттерны решений, такие как поиск, сортировка, разбиение на классы и объекты в ООП, которые могут подходить для задачи.

### 4. Псевдокод и черновики
- **Псевдокод**: Прежде чем писать код, составьте псевдокод или алгоритм на простом языке, описывающий шаги решения.
- **Черновики**: Не бойтесь делать черновики. Это поможет визуализировать задачу и организовать мысли.

### 5. Написание кода
- **Простота**: Начните с простого решения, даже если оно не оптимально. Вы всегда можете улучшить его позже.
- **Модульность**: Разбейте код на функции или классы, каждый из которых выполняет чётко определённую задачу.

### 6. Тестирование и отладка
- **Тестовые примеры**: Проверьте ваше решение на различных тестовых случаях, включая граничные условия.
- **Отладка**: Используйте отладчик или добавляйте выводы в консоль для отслеживания работы программы и выявления ошибок.

### 7. Рефакторинг
- **Улучшение кода**: После того как решение будет найдено, подумайте, как его можно улучшить. Это может быть оптимизация производительности, улучшение читаемости кода или упрощение логики.

### 8. Обучение и практика
- **Изучение и анализ**: Разбирайте решения других людей и анализируйте, почему был выбран тот или иной подход.
- **Постоянная практика**: Решайте задачи регулярно. Платформы вроде LeetCode, Codeforces, и HackerRank предоставляют множество задач разного уровня сложности.

### 9. Обратная связь
- **Код-ревью**: Попросите более опытных коллег или преподавателей проверить ваш код и дать советы по улучшению.

Составление алгоритмов — это навык, который развивается с опытом. Не бойтесь ошибаться; каждая ошибка даёт ценный опыт и помогает стать лучше.


</details>

<hr>

<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: green;"><b>English</b></summary>


With a probability of 99.9%, there will be some relationship between classes in our applications.

In OOP, two types of relationships are distinguished between classes:
- IS-A relationship
- HAS-A relationship

```
Autobus IS-A Vehicle
Driver IS-A Person
Passenger IS-A Person
```

```
Autobus HAS-A RegistrationDoc
Autobus HAS-A Driver
Autobus HAS-A Passengers
```

In object-oriented programming languages, there are three ways to organize the interaction between classes:

- **Inheritance**
- **Aggregation**
- **Composition**

**Inheritance** is when a subclass inherits all fields and methods of the parent class and typically adds some new functionality and/or fields. Inheritance is based on the IS-A relationship.

Inheritance in code is indicated by the keyword `extends`. It's important to note that the class from which another class is inherited is called the parent (or superclass), and the class that inherits is called the child (or subclass).

```
public class Car extends Vehicle{

   private final int passengersCount;
   private int  mileage;

   public Car(String model, int year, int passengersCount) {
       super(model, year);
       this.passengersCount = passengersCount;
       this.mileage = 10000;
   }
```

Extracting common states and behaviors (fields and methods) into a parent class allows us to save a lot of time and space.

If a particular type has properties or methods unique to it and not present in other types of vehicles, that's not a problem. You can always create them in a child class, separate from all the others.

**Important! In Java, there is no multiple inheritance.**
**Each class can only inherit from one class.**
</details>