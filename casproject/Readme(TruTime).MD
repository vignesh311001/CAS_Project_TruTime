**Project Name: Cognizant TruTime Automation**


# Overview
This project aims to automate the TruTime portal of Cognizant using Selenium WebDriver. The automation process involves navigating through the Be.Cognizant portal, extracting user information, verifying OneCognizant display, searching for Trutime, and validating  details.

## Libraries and Dependencies
- **Maven Repository:** Maven 4.0.0
- **TestNG:** 7.9.0
- **Extent Report:** 5.1.1
- **Selenium WebDriver:** 4.18.1
- **Loggers:** 2.22.0

## Automation Flow
1.  Navigate to Be.Cognizant portal.
2.  Extract user information from the profile.
3.  Navigate to OneCognizant Portal.
4.  Search for TruTime in the search bar.
5.  Click on TruTime and navigate to the portal.
6.  Capture current Week details from the portal.
7.  Compare with the system current week details and validate it.
8.  Verify current date is displayed on not.
9.  Verify current Month and Year is displayed on not.
10. Verify backdated TopUp date is displayed correctly or not (with 15 days backdated date).
11. Print all Legends present on trutime portal and validate it.
 

## Libraries Explanation
- **Maven Repository:** Used for project management and dependency resolution.
- **TestNG:** Facilitates test case organization and execution.
- **TestNG Report:** Generates comprehensive test reports.
- **Selenium WebDriver:** Automates browser interactions.
- **Loggers:** Facilitates logging for better debugging.

## Screenshots
Screenshots are captured at relevant steps for documentation and analysis.

## How to Run
1. **Open Eclipse IDE:**
   - Launch Eclipse IDE on your machine.

2. **Import Project:**
   - Select `File` -> `Import` from the menu.
   - Choose `Existing Maven Projects` and click `Next`.
   - Browse to the directory where you cloned the repository and select the project.

3. **Update Maven Project:**
   - Right-click on the project in the Project Explorer.
   - Choose `Maven` -> `Update Project`.
   - Click `OK` to update dependencies.

4. **Set Up Configuration:**
   - Open the `src/test/resources/config.properties` file.
   - Update any configuration parameters like browser type, URLs, etc., as needed.

5. **Run Test Suite:**
   - Locate the test suite file (`testng.xml`)
   - Right-click on the file and choose `Run As` -> `TestNG Suite`.

6. **View Reports:**
   - After execution, open the `test-output` folder.
   - Find the TestNG file (`index.html`) for detailed test case reports.

## Reporting
1. **Locate Test Reports:**
   - After the execution, navigate to the `test-output` folder in the project directory.

2. **Open Extent Report:**
   - Inside the `reports` folder, find the Extent Report HTML file named `TimeStamp.html`.

3. **View Test Reports:**
   - Open the `TimeStamp.html` file using any web browser.
   - This report provides a detailed overview of test executions, including passed and failed tests, test duration, and any exceptions encountered.

4. **Screenshots and Logs:**
   - screenshots captured during test execution and relevant logs for test cases.

5. **Analyze Results:**
   - Utilize the visual representation in the TestNG Report and Extent report to quickly identify test status and any issues encountered during the test run.

## Contributors
- **Veeresh  Odisumath 2318344**
- **Vignesh  P 2318390**
- **Gandhi Prakash  A 2318396**
- **Sanagamanath  Bellubbi 2318348**
- **G Mahesh 2318404**
- **Shaik Zia Ur Rahman 2318310**


## Known Issues

- **Issue 1: UI of One Cognizant portal is different in Chrome and Edge**
  - Description: The automation script may experience difficulty while trying to locate the inputbox of one cognizant portal.
  - Workaround: Consider locating the inputbox elemnt with diffrent locator for each browser.

## Future Enhancements

- **Enhancement 1: Parallel Execution**
  - Description: Enable parallel execution of tests to improve overall test suite efficiency.
  - Timeline: Investigating implementation feasibility.

- **Enhancement 2: Integration with CI/CD**
  - Description: Integrate the automation script with popular CI/CD platforms for continuous testing.
  - Timeline: Targeting a future release for streamlined workflows.


