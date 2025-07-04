# Проект work6 — Урок 12. Принципы SOLID

## 📌 Применённые принципы SOLID

### S — Single Responsibility Principle
В классе `Market` были объединены бизнес-логика и вывод в консоль. Разделили их: методы логики остались в `Market`, вывод перенесён в `MarketPrinter`.

### O — Open/Closed Principle
Внедрён интерфейс `OrderService`, теперь можно добавлять новые типы заказов, не меняя базовый класс.

### L — Liskov Substitution Principle
Класс-наследник `ExpressMarket` может быть подставлен вместо `Market`, не нарушая поведение — все методы соблюдают контракт.

### I — Interface Segregation Principle
Интерфейс `MarketBehaviour` был разделён на `QueueService` и `OrderService`. Каждый отвечает за свою зону, не перегружен.

### D — Dependency Inversion Principle
`Main` теперь зависит от абстракции `MarketInterface`, а не от конкретного класса `Market`. Зависимость внедряется через интерфейс.

## ✏️ Комментарии в коде
- Все места, где применялись принципы SOLID, снабжены комментариями вида:  
  `// SRP applied here: separated queue logic from console output`
