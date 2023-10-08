# Cyberpunk Character Modification

Welcome to the Cyberpunk Character Modification project! This Java project demonstrates the use of the decorator design pattern to model cyberware modifications for a character in a Cyberpunk-themed context while adhering to the SOLID, DRY, and KISS principles.

## Table of Contents

- [Introduction](#introduction)
- [Key Principles](#key-principles)
- [Project Structure](#project-structure)
- [License](#license)

## Introduction

In a Cyberpunk world, characters often undergo cyberware modifications to enhance their abilities. This project simulates character modifications, including hand and leg enhancements, using the decorator design pattern.

Key features of this project:

- Modifiable hands with enhancements such as Gorilla Hands and Mantis Hands.
- Modifiable legs with enhancements like Lynx Paws and Double Jump capability.

## Key Principles

This project adheres to three key software development principles:

- **SOLID Principles**:
  - **Single Responsibility Principle (SRP)**: Each class in this project has a single responsibility. For example, the `Modification` interface defines the methods for descriptions and costs, adhering to SRP.
  - **Open/Closed Principle (OCP)**: The code is open for extension and closed for modification, as demonstrated by the use of the decorator pattern for adding new cyberware modifications without altering existing code.
  - **Liskov Substitution Principle (LSP)**: The decorator classes in this project are substitutable for the `Modification` interface, maintaining the principle of substitutability.
  - **Interface Segregation Principle (ISP)**: The `Modification` interface is minimal and only contains methods relevant to modifications.
  - **Dependency Inversion Principle (DIP)**: Dependencies are inverted as concrete modifications depend on the `Modification` interface.

- **Don't Repeat Yourself (DRY)**: Code redundancy is minimized by centralizing the cost calculation logic in decorator classes, ensuring that changes in cost calculations are made in one place.

- **Keep It Simple, Stupid (KISS)**: The code follows a straightforward and easy-to-understand structure, making use of standard design patterns (e.g., decorator) for modularity and simplicity.

## Project Structure

The project is organized as follows:

- `CyberpunkCharacter.java`: The main driver class that demonstrates character modifications.
- `Modification.java`: An interface defining the `Modification` class with methods for description and cost.
- `BasicHands.java` and `BasicLegs.java`: Concrete classes representing basic hands and legs.
- `ModificationDecorator.java`: An abstract class that serves as the base class for concrete decorators.
- `GorillaHands.java`, `MantisHands.java`, `LynxPaws.java`, and `DoubleJump.java`: Concrete decorator classes for specific enhancements.
