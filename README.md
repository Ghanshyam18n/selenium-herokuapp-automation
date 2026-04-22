 Project Overview

This project is a Selenium-based automation framework designed to test real-world UI scenarios using a structured and maintainable approach.

The application under test is The Internet (Herokuapp), which provides multiple independent modules to practice core Selenium concepts.

 Objective
Automate real-time user scenarios
Strengthen Selenium WebDriver concepts
Implement Page Object Model (POM) design pattern
Ensure validation after each user action

 Modules Covered

This project covers multiple important automation scenarios:

🔹 1. Login (Form Authentication)
Valid login
Invalid login
Success and error message validation
🔹 2. Checkboxes
Select checkbox
Unselect checkbox
Verify checkbox state
🔹 3. Dynamic Controls
Remove and add checkbox
Enable and disable input field
Validate dynamic messages
🔹 4. JavaScript Alerts
Handle alert popup
Handle confirm popup
Validate result messages
🔹 5. Dropdown
Select option using Select class
Verify selected value
🔹 6. iFrame Handling
Switch to iframe
Perform text operations
Switch back to main page
🔹 7. File Upload
Upload file using sendKeys
Verify upload success message
🔹 8. Drag and Drop
Perform drag and drop using Actions class
Validate element position change

🔄 Test Execution Flow
Launch browser
Navigate to application URL
Execute login scenarios
Perform checkbox validations
Test dynamic controls
Handle JavaScript alerts
Validate dropdown selection
Perform iframe operations
Upload file and verify
Execute drag and drop
Close browser

 
 Framework Design

This framework follows the Page Object Model (POM) for better code organization and maintainability.

📁 Project Structure
src/test/java
│
├── base
│     └── BaseTest.java
│
├── pages
│     ├── LoginPage.java
│     ├── CheckboxPage.java
│     ├── DynamicControlsPage.java
│     ├── AlertsPage.java
│     ├── DropdownPage.java
│     ├── IframePage.java
│     ├── FileUploadPage.java
│     └── DragAndDropPage.java
│
└── tests
      └── HerokuAppTest.java
      
⚙️ Technologies Used
Java
Selenium WebDriver
TestNG
Maven
ChromeDriver

 Key Highlights
Clean and modular framework design
Reusable methods using POM
Clear separation of test logic and page actions
Handling of dynamic elements and waits
Alert, iframe, dropdown, and file handling

🚀 How to Run
Clone the repository
Open the project in Eclipse or IntelliJ
Install Maven dependencies
Run the test class: HerokuAppTest.java
💡 Learning Outcome

Through this project, I gained practical experience in:

Handling dynamic web elements
Working with alerts and popups
Managing dropdowns and iframes
Uploading files and performing drag-and-drop actions
Designing a structured automation framework using POM
