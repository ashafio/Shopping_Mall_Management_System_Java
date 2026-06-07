# Shopping Mall Management System

A console-based Java application that simulates a shopping mall environment — built using Object-Oriented Programming principles for the **OOP CSE 2214** module.

---

## Overview

This system models the relationship between sellers and buyers in a shopping mall. Sellers can register and manage product listings, while buyers can search for products and browse available items. The project demonstrates core OOP concepts applied to a real-world retail scenario — all through a clean, menu-driven console interface.

---

## Features

- **Seller portal** — register products with name, price, category, and quantity
- **Buyer portal** — search and browse available products by name or category
- **Product management** — add, update, and remove product listings
- **Console UI** — menu-driven navigation for both buyer and seller roles
- **OOP design** — entities modelled as classes with encapsulation, inheritance, and polymorphism

---

## Tech Stack

| Layer | Technology |
|---|---|
| Language | Java |
| Paradigm | Object-Oriented Programming |
| IDE | IntelliJ IDEA |
| Module | OOP CSE 2214 |

---

## Project Structure

```
Shopping_Mall_Management_System_Java/
├── src/
│   └── OOP_CSE_2214/     # All Java source files
│       ├── Main.java          # Entry point and menu loop
│       ├── Product.java       # Product entity class
│       ├── Seller.java        # Seller role and operations
│       ├── Buyer.java         # Buyer role and search logic
│       └── ...
├── .idea/                 # IntelliJ IDEA project config
├── Shopping Mall Management System.iml
└── README.md
```

---

## Getting Started

### Prerequisites

- JDK 8 or later
- IntelliJ IDEA (recommended)

### Run in IntelliJ IDEA

1. Clone the repository:

```bash
   git clone https://github.com/ashafio/Shopping_Mall_Management_System_Java.git
```

2. Open in IntelliJ via `File → Open`.

3. Run `Main.java` — the console menu will guide you through the seller and buyer flows.

### Run from the terminal

```bash
javac -d out src/OOP_CSE_2214/*.java
java -cp out OOP_CSE_2214.Main
```

---

## OOP Concepts Demonstrated

- **Encapsulation** — private fields with getters/setters in entity classes
- **Inheritance** — shared base class for mall participants (e.g. `User → Seller`, `User → Buyer`)
- **Polymorphism** — method overriding for role-specific behaviour
- **Abstraction** — interfaces or abstract classes defining shared contracts
- **Collections** — `ArrayList` / `HashMap` for in-memory product storage

---

## Academic Context

Developed as a coursework project for **OOP CSE 2214** (Object-Oriented Programming) during a BSc in Computer Science and Engineering.

---

## Author

**Shafi (Abid Rahman Shafi)** — GitHub: [@ashafio](https://github.com/ashafio)
