# ANYIK DUKU MOBIQUITY QA CODE CHALLENGE

The following repository comprises the code for the Mobiquity Code Challenge.


Tools:
* Java (programming language of choice)
* Cucumber6:
  * Supports Behaviour Driven Development
  * Web Based Test Reports which can be uploaded on GitHub (see Test Reports section below)
* Hamcrest framework for customized assertion matchers
* RESTAssured library for writing simple yet powerful tests

## Test Cases Covered

The following tests were covered:
1. Search for user with username "Delphine": This scenario covered searching for the user using different parameters (e.g. id, name, company name); also included are negative tests cases for non-existent data (empty list returned).
2. Search for posts: This test case covers retrieving posts a user has made using values such as userId, title posts and id. Including is negative testing for non-existent userId, title and id.
3. Comments search: This test case tests the retrieval of comments by a user and validation that an email address exists and is in the proper format. Also included are cases with incorrectly formatted/non-existent emails (which fail, testing that system works).

## How to execute

Requirements to run test:
1. Java 8
2. Maven 3.8
3. To run tests pointing to https://jsonplaceholder.typicode.com/:
(i) Terminal: execute command `mvn clean verify` (after navigating to project on terminal).
(ii) Eclipse IDE: run MyTestRunner.java as a JUnit test.

## CI/CD

When a commit occurs, code is pushed to master branch and subsequently tests are run against CircleCI.


## Test Reports

Following the execution of a test, an HTML Cucumber report (cucumber-report) is generated under `~/target/maven-status`

Test results are deployed to Collection: [Test Reports](https://reports.cucumber.io/report-collections/a7f2e211-29d4-48cf-8951-2450aeb76b15)

To add reports to Collection, add following environmental variable to chosen IDE (Eclipse for this project):

Run->Run Configuration->click Environment tab then add following and apply:

CUCUMBER_PUBLISH_TOKEN: 057f9549-243f-474f-ac90-2c272f3e09cf

Reports will now be accessible in above collection.