# SchoolData

Details about "SchoolData" CRUD Web Application assignment which I have developed as per requirement.

I am using following technologies and build tools to develope SchoolData CRUD Web Application.

J2EE, JSP, JavaScript, JSTL, Spring Tag lib, Spring MVC, Hibernate, Maven3, Tomcat7, JDK 7, MySql 5+, Git

I am using MVC architecture with standered way of coding and Hibernate Spring Integration using Maven. For frontend validation using JavaScript. Through code I am establishing database connection and create schema and table for "School Info". Table "SchoolInfo" created as per given "schools.json" file. ID field is auto generated when we will insert data in database table. Dependencies are required to integrate Hibernate with Spring in POM.xml

Also uncomment "<!-- <prop key="hibernate.hbm2ddl.auto">${hbm2ddl.auto}</prop>	 -->" commented tag in "spring-config.xml" to create Schema and database table through code.

MVN build run: 
mvn clean,
mvn clean install tomcat7:run -Dmaven.test.skip=true

Git Repository URL for Source Code: 
https://github.com/AmritJava/SchoolData
