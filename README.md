# Design Patterns Demo

This project demonstrates the implementation of various design patterns in software development, with a focus on Facade, Factory, and Template patterns. It serves as an educational resource for understanding how these patterns can be applied in real-world scenarios.

## Design Patterns Covered

### 1. Facade Pattern
The Facade pattern provides a simplified interface to a complex subsystem. It encapsulates a group of interfaces in a higher-level interface, making the subsystem easier to use.

### 2. Factory Pattern
The Factory pattern is a creational pattern that provides an interface for creating objects in a superclass, allowing subclasses to decide which class to instantiate.

### 3. Template Pattern
The Template pattern defines the skeleton of an algorithm in a method, deferring some steps to subclasses. It lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.

## Project Structure

The project is organized as follows:

```
src/
├── facade/
│   ├── [Facade pattern implementation files]
├── factory/
│   ├── [Factory pattern implementation files]
├── template/
│   ├── [Template pattern implementation files]
├── Main.java
```

Each pattern has its own directory containing the relevant implementation files.

## How to Run

1. Clone the repository:
   ```
   git clone https://github.com/Hashara13/Design-Patterns-Demo.git
   ```

2. Navigate to the project directory:
   ```
   cd Design-Patterns-Demo
   ```

3. Compile the Java files:
   ```
   javac src/*.java
   ```

4. Run the main class:
   ```
   java src.Main
