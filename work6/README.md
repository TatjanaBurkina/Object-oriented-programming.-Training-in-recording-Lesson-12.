# Project work6 — Seminar 12: Object-Oriented Programming & SOLID Intro

## Description

This Java project demonstrates core OOP concepts and introduces SOLID principles via simple class structures and substitutions. The project is designed for educational purposes and includes examples that intentionally illustrate both proper and violated design approaches.

## Project Structure

- Core classes: `Rectangle`, `Square`, `Greeter`
- Report generators: `AccountReportGenerator`, `DocumentReportGenerator`
- Interfaces: `JsonReportGenerator`, `ReportGenerator`
- Entry point: `Main.java`

## SOLID Principles in Code

| Principle | Implementation |
|----------|----------------|
| SRP (Single Responsibility) | `Greeter` focuses solely on greeting logic. `AccountReportGenerator` handles only JSON report generation |
| LSP (Liskov Substitution) | `Square extends Rectangle` — in `Main.java` we intentionally violate expectations to illustrate LSP breakage |
| ISP (Interface Segregation) | Separated interfaces `JsonReportGenerator` and `XmlReportGenerator` allow classes to implement only what they need |
| OCP, DIP | Not yet implemented — planned for future iterations |

> Note: The project is intentionally minimalistic to demonstrate concepts clearly.

## How to Run

```bash
javac Main.java work1/*.java work2/*.java
java Main
