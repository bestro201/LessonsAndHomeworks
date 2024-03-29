#### Task 0

Будем дорабатывать наш класс Dog.

Добавить в класс константу. Использовать эту константу в классе.

Добавить в класс поле, в котором будет храниться количество прыжков, сделанных всеми объектами класса.

Добавить в класс статический метод, возвращающий общее количество прыжков, сделанных всеми собаками

#### Task 1

Класс "Счётчик"
Разработайте класс Counter, который позволяет создавать объекты-счётчики с возможностью увеличения и уменьшения значения счётчика. 
В классе должны быть:

- Поле `value` для хранения текущего значения счётчика.
- Методы `increment()` и `decrement()`, увеличивающие и уменьшающие значение счётчика соответственно.
- Метод getValue() для получения текущего значения счётчика.

### Task 2
Класс "Калькулятор"
Создайте класс Calculator, который будет предоставлять базовые арифметические операции: сложение, вычитание, умножение и деление. 

Класс должен содержать:
Статические методы для каждой операции, принимающие два аргумента и возвращающие результат операции.

### Task по просьбе Ксении Сухорученко

**Задание: Создайте класс `Product`**

1. **Основные требования:**
    - Класс должен содержать приватные поля: `static long counterId` для подсчета и автоматического присвоения уникального идентификатора каждому создаваемому объекту, `final long id` для хранения уникального идентификатора конкретного объекта, `String name` для названия продукта и `double price` для хранения его цены.
    - Реализуйте конструктор, который принимает название и цену продукта. Внутри конструктора уникальный `id` должен автоматически присваиваться продукту, используя `counterId` для подсчета идентификаторов.
    - Добавьте геттеры и сеттеры для полей `name` и `price`.
    - Создайте метод `info()`, который возвращает строку с информацией о продукте, включая его `id`, название и цену.

2. **Дополнительные требования:**
    - Добавьте в класс `Product` метод, который позволяет изменить цену продукта на заданный процент (например, повышение или понижение цены на 5%). Метод должен принимать один параметр — процент изменения цены.
    - Реализуйте статический метод, который возвращает общее количество созданных продуктов. Этот метод должен возвращать текущее значение `counterId`.

3. **Задача для отработки:**
    - Создайте несколько объектов класса `Product`, используя разные названия и цены.
    - Выведите информацию о каждом продукте, используя метод `info()`.
    - Измените цену одного из продуктов с помощью созданного метода изменения цены.
    - Выведите общее количество созданных продуктов.













