# Spring Boot Pivot

A quick way to get started writing a Spring Boot application.

## Goals: 

- Developers should be able to download and run this application w/o additional configuration
- Common stack decisions should already be configured (database, template language, logging, testing etc.)

## Installation:

    curl https://raw.githubusercontent.com/berlin-ab/spring-boot-pivot/master/install.sh | bash
    create-spring [name of new project] 


    example:

    create-spring myapp

## Intellij

- IntelliJ import
- Follow link to import gradle project
- Check option - Create directories for empty content roots automatically
- If an error box appears with 'unable to load class org.gradle.plugins.ide.internal.idedependenciesextractor' then upgrade to Intellij to 13.1

---

## To do list:

- ability to create controllers backed by a template language
- ability to create entities with a database mapping solution
- ability to automate my database changes using a database migration solution
- an application server solution
- model serialization solution (respond to different mime-types)
- a single build tool (we prefer gradle)
- a *very clear* guide for expected project/file structure
- a testing framework, complete with configuration for unit, integration, and browser tests
