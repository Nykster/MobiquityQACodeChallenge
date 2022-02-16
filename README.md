[![Production test execution flow](https://github.com/ricardorlg/mobiquity-qa-assignment/actions/workflows/production_flow.yml/badge.svg)](https://github.com/ricardorlg/mobiquity-qa-assignment/actions/workflows/production_flow.yml)
# MOBIQUITY QA CODE CHALLENGE

This repository contains the code for Mobiquity code assignment for the Senior QA engineer position.


Tools utilised:
* Java as programming language
* [Serenity BDD](https://github.com/serenity-bdd/serenity-core) as main library, that includes:
  * Rest-assured wrapper
  * Screenplay implementation
  * Cucumber integration
  * Test Reporting
* Cucumber tool used for Behaviour Driven Development
* Hamcrest for assertions
* GitHub Actions as CI

## Test Scenarios

In order to implement the assignment, the following flows were tested:
1. Users search: Test scenarios that covers Searching users by different queries were added
2. Posts search: Test that verify searching posts using different queries like, userId, title or postId were implemented
3. Comments search: This cover the main test flow asked in the challenge, scenarios that covers searching comments using simple and complex queries (like comments made to all the posts of a user) were added, all the verifications checks valid emails.

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

Test results are deployed to Collection: [Test Reports](https://reports.cucumber.io/report-collections/a7f2e211-29d4-48cf-8951-2450aeb76b15)

To add new reports add following environmental variable to chosen IDE (Eclipse for this project):

Run->Run Configuration->click Environment tab then add following and apply:
CUCUMBER_PUBLISH_TOKEN: 057f9549-243f-474f-ac90-2c272f3e09cf

Reports will now be available in above collection