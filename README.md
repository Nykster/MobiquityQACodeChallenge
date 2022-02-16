[![Production test execution flow](https://github.com/ricardorlg/mobiquity-qa-assignment/actions/workflows/production_flow.yml/badge.svg)](https://github.com/ricardorlg/mobiquity-qa-assignment/actions/workflows/production_flow.yml)
# ANYIK DUKU MOBIQUITY QA CODE CHALLENGE

The following repository comprises the code for the Mobiquity Code Challenge.


Tools:
* Java (programming language of choice)
* Cucumber6:
  * Supports Behaviour Driven Development
  * Web Based Test Reports which can be uploaded on GitHub (see Test Reports section below)
* Cucumber tool used for Behaviour Driven Development
* Hamcrest framework for customized assertion matchers
* RESTAssured library for writing simple yet powerful tests

## Test Cases Covered

The following tests were covered:
1. Search for user with username "Delphine": This scenario covered searching for the user using different parameters (e.g. id, name, company name); also included are negative tests cases for non-existent data (empty list returned).
2. Search for posts: This test case covers retrieving posts a user has made using values such as userId, title posts and id. Including is negative testing for non-existent userId, title and id.
3. Comments search: This cover the main test flow asked in the challenge, scenarios that covers searching comments using simple and complex queries (like comments made to all the posts of a user) were added, all the verifications checks valid emails. This test case tests the retrieval of comments by a user and validation that an email address exists and is in the proper format. Also included are cases with incorrectly formatted and non-existent emails.

## How to execute

Requirements to run test:
1. Java 8
2. Maven
4. to run the tests pointing to a local server run the command `mvn clean verify`
5. to run the tests pointing to the official [server deployment](https://jsonplaceholder.typicode.com/) run the command `mvn clean verify -Denvironment=production`
6. After test execution a SerenityBDD report will be generated located at `target/site/serenity`

## CI

For this project GitHub actions were used as CI, by default any commit made to the `development` branch will run the test pointing to a local server (deployed in the CI environment using Docker).
Any commit made to `master` branch will run the tests against the [production deployment](https://jsonplaceholder.typicode.com/).

## Test Reports

Following the execution of a test, an HTML Cucumber report (cucumber-report) is generated under `~/target/maven-status`

Test results are deployed to Collection: [Test Reports](https://reports.cucumber.io/report-collections/a7f2e211-29d4-48cf-8951-2450aeb76b15)

To add new reports add following environmental variable to chosen IDE (Eclipse for this project):

Run->Run Configuration->click Environment tab then add following and apply:

CUCUMBER_PUBLISH_TOKEN: 057f9549-243f-474f-ac90-2c272f3e09cf

Reports will now be available in above collection