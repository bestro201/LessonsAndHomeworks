## ООП - Объектно-ориентированное программирование

Java является объектно-ориентированным языком. Это означает, что писать программы на Java нужно с применением объектно-ориентированного стиля.
По большому счету, объектно-ориентированный подход позволяет нам описывать **классы**, определять методы таким образом, чтобы затем использовать их вновь, частично либо полностью, без нарушения безопасности. Если совсем коротко: объектно-ориентированное программирование (ООП) — это методология программирования с использованием **объектов и классов**.

Выделяют четыре основные принципа ООП:

- Абстракция
- Инкапсуляция
- Наследование
- Полиморфизм

**Что такое объект?**

Мир, в котором мы живем, состоит из объектов. Если мы посмотрим вокруг, то увидим, что нас окружают дома, деревья, автомобили, мебель, посуда, компьютеры. Все эти предметы являются объектами, и каждый из них обладает набором определенных характеристик, поведением и назначением.
Мы привыкли к объектам, и мы их используем всегда для вполне конкретных целей. Например, если нам необходимо доехать до работы, мы пользуемся автомобилем, если захотим пить – чашкой, а если отдохнуть – нам понадобится удобное кресло.

Давайте, например, посмотрим на кота. У него есть:

```
Имя: Васька
Окрас: Серый
Возраст: 2 года
Порода: персидская
Вес: 7кг
Медалей: 98
```

Наш кот Васька умеет:
```
мяукать
спать
бежать
прыгать
есть
грызть обувь
подлизываться
```

Объект в Java характеризует состояние и поведение.
То есть, с точки зрения Java Имя, Возврат и т.д - это состояние объекта Васька, а его навыки - мяукать, спать и т.д - поведение объекта. Т.е. действия, которые он может совершать

С помощью таких характеристик можно описать любого кота.
**Шаблон**, в котором описаны общие черты и действия похожих друг на друга объектов, **называется классом**.
А **объект — это конкретный экземпляр класса**.

## Абстракция
Абстракцию в ООП можно определить, как способ представления элементов задачи из реального мира в виде объектов в программе. Абстракция всегда связана с обобщением некоторой информации о свойствах предметов или объектов, поэтому главное — это отделить значимую информацию от незначимой в контексте решаемой задачи.

**Абстракция** — это сокрытие подробностей и предоставление пользователю лишь самых важных характеристик объекта.

Например, в адресе здания важны такие данные, как почтовый индекс, страна, населенный пункт, улица и номер дома. Его этажность, материал стен  и наличие лифта в таком случае не имеют значения.

В классах Java состояние представлено в виде **полей**, а поведение — в виде **методов**.

<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: green;"><b>English</b></summary>

## Object-Oriented Programming (OOP)

Java is an object-oriented language, meaning programs in Java should be written using an object-oriented style. Essentially, the object-oriented approach allows us to describe **classes**, define methods in such a way that they can be reused either partially or entirely, without compromising security. In short: Object-Oriented Programming (OOP) is a programming methodology using **objects and classes**.

There are four main principles of OOP:

- Abstraction
- Encapsulation
- Inheritance
- Polymorphism

**What is an object?**

The world we live in is made up of objects. If we look around, we see that we are surrounded by houses, trees, cars, furniture, dishes, computers. All these items are objects, each possessing a set of specific characteristics, behavior, and purpose.
We are accustomed to objects, and we always use them for very specific purposes. For example, if we need to get to work, we use a car; if we're thirsty – a cup; and if we want to relax – a comfortable chair is needed.

Let's take a cat, for example. It has:

```
Name: Vasya
Color: Grey
Age: 2 years
Breed: Persian
Weight: 7kg
Medals: 98
```

Our cat Vasya can:
```
meow
sleep
run
jump
eat
gnaw on shoes
suck up
```

An object in Java is characterized by state and behavior.
That is, from the perspective of Java, Name, Age, etc., are the state of the object Vasya, and its skills - meowing, sleeping, etc., are the behavior of the object. I.e., actions it can perform.

Using such characteristics, you can describe any cat.
The **template**, which describes the common features and actions of similar objects, **is called a class**.
And an **object is a specific instance of a class**.

## Abstraction
Abstraction in OOP can be defined as a way of representing elements of a real-world problem as objects in a program. Abstraction is always associated with the generalization of certain information about the properties of objects or subjects, so the main point is to separate significant information from insignificant in the context of the problem being solved.

**Abstraction** is the hiding of details and providing the user only the most essential characteristics of an object.

For example, in a building's address, such data as the postal code, country, city, street, and house number are important. Its number of floors, wall material, and the presence of an elevator, in this case, are irrelevant.

In Java classes, the state is represented as **fields**, and behavior is represented as **methods**.

</details>