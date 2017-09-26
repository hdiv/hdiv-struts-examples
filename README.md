Hdiv: Application Self-Protection
=================================
Sample application showing the integration between Struts 1 and Hdiv.
Supported Struts version is 1.3.8.

How to build the application
============================
Clone this repo and build war file (you'll need Git and Maven installed):

    git clone git://github.com/hdiv/hdiv-struts-examples.git
    cd hdiv-struts-examples
    mvn package
    mvn tomcat:run

Open [http://localhost:8080/hdiv-struts-examples](http://localhost:8080/hdiv-struts-examples) in your favorite browser.

Execute tests
============================
Follow these steps:

    mvn tomcat7:run-war -P test
    
Open other terminal on the same folder and execute:

    mvn integration-test
