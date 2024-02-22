

Тестирование в разработке программного обеспечения — это процесс оценки системы или её компонентов с целью выявления, прослеживания и исправления ошибок, а также проверки, соответствует ли продукт требованиям и ожиданиям пользователя.

Существуют различные типы и уровни тестирования:

1. **Модульное тестирование** (unit testing) — проверка отдельных модулей или компонентов программы на корректность выполнения заявленных функций.
2. **Интеграционное тестирование** (integration testing) — проверка взаимодействия между различными модулями программы.
3. **Системное тестирование** (system testing) — проверка всей системы в целом, чтобы убедиться, что все компоненты работают вместе корректно.
4. **Приемочное тестирование** (acceptance testing) — проверка того, соответствует ли система требованиям и ожиданиям заказчика.

Тестирование может проводиться как разработчиками (white-box testing), так и специалистами по тестированию, не имеющими доступа к коду программы (black-box testing). Кроме того, тестирование может быть автоматизированным или ручным.

Важной частью процесса тестирования является сравнение ожидаемого результата с фактическим. Ожидаемый результат - это то, что должно произойти, если система работает корректно, а фактический результат - это то, что произошло на самом деле при выполнении теста. Если ожидаемый и фактический результаты совпадают, тест считается успешным. Если результаты не совпадают, тест не пройден, и необходимо исследовать причину расхождения. Это может указывать на наличие ошибки в программном коде, в тестовых данных или в самом процессе тестирования

Модульное тестирование — это процесс проверки корректности работы отдельных частей программы в изоляции от остального кода. В контексте Java это обычно означает тестирование отдельных классов или методов с использованием фреймворков для модульного тестирования, таких как JUnit или TestNG.

Модульное тестирование помогает обеспечить, что ваш код работает правильно, и позволяет выявить и исправить ошибки на раннем этапе разработки, что может сэкономить время и усилия в будущем.

При модульном тестировании вы создаете тестовые случаи, которые проверяют работу отдельных функций или методов вашего кода. Эти тестовые случаи выполняются автоматически и могут быть легко повторно использованы при изменении кода, чтобы убедиться, что изменения не привели к появлению новых ошибок.

## JUnit
**JUnit 5** — это фреймворк для проведения модульного тестирования программного обеспечения, написанного на языке Java. JUnit 5 был создан в рамках проекта JUnit Lambda, который стал значимым шагом вперед по сравнению с предыдущими версиями JUnit. Фреймворк предоставляет аннотации для определения тестовых методов и поддерживает организацию тестов в наборы тестов для удобства управления тестированием.


### Основные аннотации в JUnit 5:
- `@Test` — указывает, что метод является тестовым.
- `@BeforeEach` — метод, помеченный этой аннотацией, выполняется перед каждым тестом.
- `@AfterEach` — метод, помеченный этой аннотацией, выполняется после каждого теста.
- `@BeforeAll` — метод, помеченный этой аннотацией, выполняется один раз перед всеми тестами в классе.
- `@AfterAll` — метод, помеченный этой аннотацией, выполняется один раз после всех тестов в классе.
- `@ParameterizedTest` используется для параметризованных тестов, позволяя запускать один и тот же тестовый метод с различными аргументами.
- `@Disabled` — аннотация, которая указывает, что тест или группа тестов отключены и не будут выполняться.

### Основные методы для проверки утверждений:
- `assertEquals(expected, actual)` — проверяет, равны ли два значения.
- `assertTrue(condition)` — проверяет, что условие истинно.
- `assertFalse(condition)` — проверяет, что условие ложно.
- `assertNull(object)` — проверяет, что объект равен null.
- `assertNotNull(object)` — проверяет, что объект не равен null.
- и другие.

Цель JUnit 5 — предоставить простой и удобный способ для написания и запуска тестов.

```
@Test
public void testAddition() {
    int result = 2 + 2;
    assertEquals(4, result);
}
```

**  @ParameterizedTest**
Эта аннотация используется для параметризованных тестов. Она позволяет выполнять один и тот же тестовый метод несколько раз с разными аргументами.

```
@ParameterizedTest
@ValueSource(strings = {"apple", "banana", "cherry"})
public void testFruits(String fruit) {
    assertNotNull(fruit);
}
```

** @BeforeEach**
Метод, аннотированный `@BeforeEach`, будет выполняться перед каждым тестовым методом. Это может быть полезно для выполнения предварительной настройки или инициализации, требуемой для тестов.

```
@BeforeEach
public void setup() {
    // код для инициализации
}
```

** @BeforeAll**
Метод, аннотированный `@BeforeAll`, будет выполнен один раз перед запуском всех тестов в классе. Он должен быть статическим.

```
@BeforeAll
public static void globalSetup() {
    // код для глобальной инициализации
}
```

** @Nested**
Эта аннотация позволяет создавать вложенные тестовые классы. Это может быть полезно для группировки тестов по определенной функциональности.

```
@Nested
class NestedTests {
    
    @BeforeEach
    public void nestedSetup() {
        // код для инициализации вложенного теста
    }

    @Test
    public void nestedTestExample() {
        // пример теста
    }
}
```

Кроме вышеуказанных аннотаций, в JUnit также есть другие полезные аннотации, такие как `@AfterEach`, `@AfterAll`, `@Disabled` и др., которые помогают управлять жизненным циклом тестов и их выполнением.



*- _Фреймворк — это набор инструментов, библиотек и соглашений, который предоставляет унифицированный подход к решению определённого типа задач. Фреймворк определяет структуру приложения и предоставляет набор готовых компонентов, которые можно использовать для создания программного обеспечения. Это упрощает процесс разработки и позволяет фокусироваться на решении задач бизнес-логики, а не на реализации стандартных функций. Фреймворк также обеспечивает расширяемость и масштабируемость приложения_



<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: green;"><b>English</b></summary>

Testing in software development is the process of evaluating a system or its components to identify, trace, and correct errors, as well as to verify whether the product meets the requirements and expectations of the user.

There are various types and levels of testing:

1. **Unit Testing** - Verifies the correctness of individual modules or components of the program to perform the declared functions.
2. **Integration Testing** - Checks the interaction between different program modules.
3. **System Testing** - Verifies the entire system as a whole to ensure all components work together correctly.
4. **Acceptance Testing** - Checks whether the system meets the requirements and expectations of the customer.

Testing can be conducted by developers (white-box testing) and testing specialists without access to the program code (black-box testing). Additionally, testing can be automated or manual.

An important part of the testing process is comparing the expected result with the actual outcome. The expected result is what should happen if the system operates correctly, and the actual result is what actually happens during the test execution. If the expected and actual results match, the test is considered successful. If the results do not match, the test fails, and the reason for the discrepancy needs to be investigated. This may indicate an error in the program code, test data, or the testing process itself.

Unit testing is the process of verifying the correctness of individual parts of the program in isolation from the rest of the code. In the context of Java, this usually means testing individual classes or methods using unit testing frameworks such as JUnit or TestNG.

Unit testing helps ensure that your code works correctly and allows you to identify and correct errors early in the development process, saving time and effort in the future.

In unit testing, you create test cases that check the operation of individual functions or methods in your code. These test cases are executed automatically and can be easily reused when the code changes to ensure that the changes did not introduce new errors.

## JUnit
**JUnit 5** is a framework for conducting unit testing of software written in Java. JUnit 5 was created as part of the JUnit Lambda project, which was a significant step forward compared to previous versions of JUnit. The framework provides annotations for defining test methods and supports organizing tests into test suites for convenient testing management.

### Main Annotations in JUnit 5:
- `@Test` — indicates that a method is a test method.
- `@BeforeEach` — a method marked with this annotation is executed before each test.
- `@AfterEach` — a method marked with this annotation is executed after each test.
- `@BeforeAll` — a method marked with this annotation is executed once before all tests in the class.
- `@AfterAll` — a method marked with this annotation is executed once after all tests in the class.
- `@ParameterizedTest` is used for parameterized tests, allowing the same test method to be run with different arguments.
- `@Disabled` — an annotation that indicates a test or group of tests is disabled and will not be executed.

### Main Methods for Assertion Checks:
- `assertEquals(expected, actual)` — checks that two values are equal.
- `assertTrue(condition)` — checks that a condition is true.
- `assertFalse(condition)` — checks that a condition is false.
- `assertNull(object)` — checks that an object is null.
- `assertNotNull(object)` — checks that an object is not null.
- and others.

The goal of JUnit 5 is to provide a simple and convenient way to write and run tests.

```
@Test
public void testAddition() {
    int result = 2 + 2;
    assertEquals(4, result);
}
```

**@ParameterizedTest**
This annotation is used for parameterized tests. It allows the same test method to be executed multiple times with different arguments.

```
@ParameterizedTest
@ValueSource(strings = {"apple", "banana", "cherry"})
public void testFruits(String fruit) {
    assertNotNull(fruit);
}
```

**@BeforeEach**
A method annotated with `@BeforeEach` will be executed before each test method. This can be useful for performing setup or initialization required for the tests.

```
@BeforeEach
public void setup() {
    // initialization code
}
```

**@BeforeAll**
A method annotated with `@BeforeAll` will be executed once before all tests in the class. It must be static.

```
@BeforeAll
public static void globalSetup() {
    // global initialization code
}
```

**@Nested**
This annotation allows creating nested test classes. This can be useful for grouping tests by certain functionality.

```
@Nested
class NestedTests {
    
    @BeforeEach
    public void nestedSetup() {
        // initialization code for nested test
    }

    @Test
    public void nestedTestExample() {
        // test example
    }
}
```

Besides the aforementioned annotations, JUnit also has other useful annotations such as `@AfterEach`, `@AfterAll`, `@Disabled`, etc., that help manage the lifecycle and execution of tests.

</details>