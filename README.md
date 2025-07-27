# 🛒 OpenCart Abstracta - Selenium Automation Project

Automated testing project for the [OpenCart Abstracta Demo site](https://opencart.abstracta.us/) using **Selenium WebDriver**, **Java**, **TestNG**, and the **Page Object Model (POM)** design pattern.

---

## 📌 Project Description

This automation framework is designed to test the registration flow on the OpenCart website — both positive and negative scenarios — including form validation and error message handling.

The framework uses:
- Java
- Selenium WebDriver
- TestNG
- Page Object Model (POM)
- DataProvider (for dynamic test data)

---

## 📁 Project Structure

openCartAbstracta/
│
├── HomePageClass.java # Page Object class for UI elements and actions
├── BaseTestClass.java # Base class with WebDriver setup and teardown
├── TestData.java # Contains static test data and DataProvider
├── HomePageClassTest.java # Main test class with @Test methods
├── utils/ # Optional: helper methods/utilities
└── README.md # Project overview and usage guide

---

## ✅ Features Covered

- ✅ OpenCart homepage navigation
- ✅ Product interaction (Phone & PDA → HTC Touch HD)
- ✅ Cart add/remove verification
- ✅ Full registration process with positive inputs
- ✅ Negative tests for registration form:
  - Missing First Name
  - Missing Last Name
  - Missing Email
  - Missing Phone
  - Short/invalid Password or mismatched confirmation
  - Empty Address / City / Post Code / Region
  - Unchecked Privacy Policy
- ✅ Validation message checks using WebDriverWait
- ✅ Assert-based verifications

---

## 🚀 How to Run

### Prerequisites:
- Java JDK 17+
- Maven or manually added Selenium/TestNG dependencies
- TestNG plugin for your IDE (e.g. Eclipse or IntelliJ)

### Steps:
1. Clone or download the project
2. Update ChromeDriver path if needed
3. Open the project in your IDE
4. Run `HomePageClassTest.java` as TestNG test

---

## 🧪 Sample Test Execution


---

## 🧠 Author

**Nikola Medan**  
📍 Novi Sad, Serbia  
🔗 [LinkedIn](https://www.linkedin.com/in/nikola-medan-99a923124)  
🔗 [GitHub](https://github.com/nikolame1991)

---

## 📷 Screenshots (optional)

You can include screenshots of test execution reports or browser steps here.

---

## 📌 Note

This is a test automation project for learning and portfolio purposes. It is not affiliated with OpenCart or Abstracta.

---
