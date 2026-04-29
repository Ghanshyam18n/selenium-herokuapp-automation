##  End-to-End Automation Flow (Detailed)

- Launch Chrome browser using WebDriver  
- Apply browser configurations (maximize window)  
- Set implicit wait for element synchronization  

- Navigate to base URL: https://the-internet.herokuapp.com/  

---

###  Login Module

- Navigate to Login page  
- Locate username input field  
- Enter valid username (`tomsmith`)  
- Locate password input field  
- Enter valid password (`SuperSecretPassword!`)  
- Locate and click Login button  
- Capture success message from UI  
- Validate login success using assertion  

- Repeat login with invalid credentials  
- Capture error message  
- Validate error message using assertion  

---

###  Checkbox Module

- Navigate to Checkboxes page  
- Locate checkbox elements  
- Click checkbox 1  
- Verify checkbox 1 is selected using `isSelected()`  
- Click checkbox 2  
- Verify checkbox 2 is unselected  

---

###  Dynamic Controls Module

- Navigate to Dynamic Controls page  
- Locate and click "Remove" button  
- Wait for dynamic message to appear  
- Capture and validate message ("It's gone!")  

- Locate and click "Add" button  
- Capture and validate message ("It's back!")  

- Locate and click "Enable" button  
- Verify input field is enabled using `isEnabled()`  

---

###  JavaScript Alerts Module

- Navigate to JavaScript Alerts page  
- Click "JS Alert" button  
- Switch to alert popup  
- Accept alert using `accept()`  
- Capture result message  
- Validate alert result  

- Click "JS Confirm" button  
- Switch to alert popup  
- Dismiss alert using `dismiss()`  
- Capture and validate cancel result  

---

###  Dropdown Module

- Navigate to Dropdown page  
- Locate dropdown element  
- Create Select object  
- Select option using visible text ("Option 1")  
- Retrieve selected option  
- Validate selected value  

---

### iFrame Module

- Navigate to iFrame page  
- Locate iframe element  
- Switch to iframe using `switchTo().frame()`  
- Locate text editor inside iframe  
- Clear existing text  
- Enter new text ("Hello Automation")  
- Retrieve and validate entered text  
- Switch back to main page using `defaultContent()`  

---

###  File Upload Module

- Navigate to File Upload page  
- Locate file input element  
- Provide file path using `sendKeys()`  
- Click upload button  
- Capture uploaded file name  
- Validate uploaded file  

---

###  Drag and Drop Module

- Navigate to Drag and Drop page  
- Locate source element (A)  
- Locate target element (B)  
- Perform drag and drop using Actions class  
- Validate element position after action  

---

### Failure Handling

- Capture test execution status using TestNG  
- On test failure, trigger screenshot capture  
- Save screenshot in project directory (`/screenshots`)  
- Log screenshot path for debugging  

---

###  Test Execution Handling

- Use `@BeforeMethod` to initialize browser before each test  
- Use `@AfterMethod` to close browser after each test  
- Maintain test isolation between test cases  

---

###  Framework Design

- Implement Page Object Model (POM)  
- Separate page classes for each module  
- Maintain reusable methods for actions  
- Keep test logic and validations in test classes  
- Use BaseTest for common setup and teardown

<img width="377" height="415" alt="image" src="https://github.com/user-attachments/assets/d12ea3f5-5531-42dc-b462-5acb5397deca" />


---
