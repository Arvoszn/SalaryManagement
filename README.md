# Salary Management System (Java OOP)

Console payroll exercise from an Object-Oriented Programming exam: one abstract
`Employee` base class, three employee types, and a single polymorphic
`calculateSalary()` call that produces each role's pay.

## What it demonstrates

| Concept | Where |
| --- | --- |
| Abstraction | `Employee` declares `calculateSalary()` and cannot be instantiated |
| Inheritance | `FullTimeFaculty`, `PartTimeFaculty`, `AdminStaff` extend `Employee` |
| Polymorphism | `Test.displayEmployee(Employee employee)` formats any role without knowing its type |
| Runtime type checks | `instanceof` selects each role's own heading |
| Static state | `Employee.getEmployeeCount()` counts every instance created |
| Formatted output | `printf` column alignment for the payroll report |

## Pay rules

| Class | Calculation |
| --- | --- |
| `FullTimeFaculty` | `monthlySalary + allowance` |
| `PartTimeFaculty` | `hoursWorked * hourlyRate` |
| `AdminStaff` | `basicSalary + overtimePay` |

## Files

| File | Role |
| --- | --- |
| `SalaryManagement/Employee.java` | abstract base class — ID, name, department, salary contract |
| `SalaryManagement/FullTimeFaculty.java` | full-time faculty pay |
| `SalaryManagement/PartTimeFaculty.java` | part-time faculty pay |
| `SalaryManagement/AdminStaff.java` | administrative staff pay |
| `SalaryManagement/Test.java` | demo run with three sample employees and a summary |
| `SalaryManagement/OOP_EXAM.java` | exam entry stub |

## Run

```bash
javac -d out SalaryManagement/*.java
java -cp out SalaryManagement.Test
```

Java 8+. No dependencies, no build tool.

---

Coursework by **Argelo Nuñez** · [argelo.spawntel.com](https://argelo.spawntel.com) · © 2026, shared for reference — all rights reserved.
