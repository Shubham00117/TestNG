# 🧪 TestNG Framework — Complete Training

A structured training repository covering **TestNG** — the powerful Java testing framework. Organized by training days (Day 42–47), covering annotations, assertions, XML suites, data-driven testing, reporting, and Page Object Model integration.

---

## 📖 Overview

This repository provides hands-on examples for mastering TestNG, from basic annotations and assertions to advanced topics like data providers, Extent Reports, and the Page Object Model pattern — all integrated with Selenium WebDriver for real-world testing.

---

## 📚 Topics Covered

| Day | Topics | Key Classes |
|-----|--------|-------------|
| **Day 42** | TestNG Basics, First Test, OrangeHRM Login | `FirstTestNg`, `OrangeHrm` |
| **Day 43** | Annotations (`@Before/@After`), Hard vs Soft Assertions, XML Suites | `AllAnotations`, `Hard_VS_Soft_Assertinos`, `Before_After_Methods_Anotations` |
| **Day 44** | Test Dependencies (`dependsOnMethods`), Test Ordering | `DependsOnMethod`, `LoginTest`, `SignUpTest`, `PaymentTest` |
| **Day 45** | Parameterization, Data Providers | `ParamTest`, `DataProviderDemo` |
| **Day 46** | Extent Reports, Advanced Reporting | `ExtentReportManager`, `OrangeHRM` |
| **Day 47** | Page Object Model (POM) Pattern | `LoginPage1`, `LoginPage2`, `LoginPage3`, `LoginTest` |

---

## 📂 Project Structure

```
TestNG/
├── pom.xml                             # Maven build configuration
├── src/main/java/
│   ├── day_42/                         # TestNG basics & first tests
│   ├── day_43/                         # Annotations & assertions deep-dive
│   │   └── pack/                       # XML suite examples
│   ├── day_44/                         # Dependencies & test ordering
│   ├── day_45/                         # Parameterization & data providers
│   ├── day_46/                         # Extent Reports integration
│   └── day_47/                         # Page Object Model pattern
└── target/                             # Compiled classes & reports
```

---

## 🛠️ Tech Stack

| Technology | Purpose |
|-----------|---------|
| **Java** | Programming language |
| **TestNG** | Test framework & runner |
| **Selenium WebDriver** | Browser automation |
| **Extent Reports** | Rich HTML test reporting |
| **Maven** | Build & dependency management |

---

## 🚀 Getting Started

### Prerequisites
- Java JDK 11+
- Maven 3.x
- Any IDE (IntelliJ IDEA / Eclipse)

### Installation
```bash
git clone https://github.com/Shubham00117/TestNG.git
cd TestNG
mvn clean install
```

### Running Tests
```bash
# Run all tests
mvn test

# Run via TestNG XML suite
mvn test -DsuiteXmlFile=testng.xml
```

---

## 📜 License

This project is open source and available for educational purposes.
