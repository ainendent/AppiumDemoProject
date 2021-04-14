# **Mobile Automation for Calculator**
This repository contains Mobile Automation for Calculator. Using Android Virtual Device and Eclipse simulator to simulate mobile devices.

## Stack
* Maven
* Appium
* TestNG
* Java 11

## IDE used (select one)
* [IntelliJ](https://www.jetbrains.com/idea/download/)
* [Eclipse](https://www.eclipse.org/downloads/)
* [Visual Studio Code](https://code.visualstudio.com/download)

## Dependencies
* TestNG
* Selenium Java
* Appium
* Java Client

## Prerequisite
* Install [Java](https://java.com/en/download/help/download_options.html) 8 or above
* Install [Maven](https://maven.apache.org/install.html)
* Install [Android Studio](https://developer.android.com/studio/install)
* Install Eclipse for Windows user

## **How to use**
## Installation
- Clone this repository to your local working directory using `git clone https://github.com/ainendent/AppiumDemoProject.git`
- Install all Maven dependencies to your local repository using `mvn install -DskipTest`
- Set several setting depends on your local machine in the `/AppiumDemoProject/src/test/java/tests/CalculatorTest.java`.
    - `deviceName`
    - `platformName`
    - `platformVersion`
    - `udid` for android
    - `appPackage` for android
    - `appActivity` for android
    - `automationName` for android
    
- Create test case under the `/test/java/tests` folder
- Run testing using command `mvn clean test -Dport=[port] -Dplatform=[platform] -Dtest=[fileName]`
    - `port` is used to run appium server on the specific port
    - `platform` is used to run test for android
    - `fileName` is the name of the class test


# **Still need further development**

#### Team member
* Ai Nenden Triana
