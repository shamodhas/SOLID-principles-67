# SOLID Principles

## Introduction

SOLID principles are five design principles that help developers create flexible and maintainable object-oriented
software systems. These principles are guidelines, not strict rules, and they help ensure clean code that is easy to
extend and maintain. While it is not always possible to apply all principles perfectly, using them where applicable can
improve the overall software design.

## The SOLID Principles

1. **S - Single Responsibility Principle (SRP)**
2. **O - Open/Closed Principle (OCP)**
3. **L - Liskov Substitution Principle (LSP)**
4. **I - Interface Segregation Principle (ISP)**
5. **D - Dependency Inversion Principle (DIP)**

---

## Single Responsibility Principle (SRP)

**Definition:** A class should have only one reason to change, meaning that it should have only one job.

A class, function, or module should have a single responsibility. If a class is responsible for multiple things, any
changes in one part might affect unrelated parts.

---

## Open/Closed Principle (OCP)

**Definition:** Software entities (classes, modules, functions) should be open for extension but closed for
modification.

This means we should be able to add new functionality without modifying existing code.


---

## Liskov Substitution Principle (LSP)

**Definition:** Objects of a superclass should be replaceable with objects of a subclass without affecting the program’s
behavior.

A subclass should extend the behavior of a superclass without changing its intended functionality.

---

## Interface Segregation Principle (ISP)

**Definition:** Clients should not be forced to depend on interfaces they do not use.

A class should not implement methods that it does not need.

---

## Dependency Inversion Principle (DIP)

**Definition:** High-level modules should not depend on low-level modules. Both should depend on abstractions.

Instead of depending on concrete implementations, classes should depend on interfaces or abstract classes.

---

## Conclusion

SOLID principles help create scalable, maintainable, and flexible software. While not always necessary to apply all five
principles strictly, using them where appropriate leads to cleaner and more robust code.

