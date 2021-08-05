# Selanium - Basic commands 

This project has some Selanium basic commands which helps the beginers to learn about selanium.

Used environment
  IDE - IntelliJ IDEA
  Programming language - Java
  Browser - Chrome
  OS - WIndows
  Automation tool - Webdriver + Chromedriver
  
  Basic setup
  
  First you have to downlaod the Selanium IDE (I have used the Latest Selenium 4 Beta version 4.0.0-beta-4 which can be downloaded from https://www.selenium.dev/downloads/) and the chromedriver for chrome browser (https://chromedriver.chromium.org/).
  When downlaoding chromedriver, make sure to check you chrome version that you are currently using. If the driver version is differnt form your chrome version, it might not work (my chromedriver and chrome browser - version 92).
  If you are using other browsers such as Firefox, IE or Safari you should download relevant driver for that browser.
  
  Once done, now you have to setup your IntelliJ environment.
  
  If you are going to build a Java project simply you have to impot the selenium server as an external library.
  
  File -> Projcet structure -> module -> + -> add the selanium serevr
  
  If you are building a Maven project, you have add it as a dependancy in pom.xml (You can find the dependacy here : https://www.selenium.dev/maven/).
  
  And now you are good to go with writing your test scripts.
  
  
  
