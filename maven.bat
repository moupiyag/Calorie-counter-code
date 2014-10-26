cd "C:\Users\Moupiya\Calorie counter code\CalorieCounter"
mvn clean install
cd "C:\Users\Moupiya\Calorie counter code\CalorieCounterWar"
mvn clean install
cd "C:\Softwares\apache-tomcat-7.0.34\bin"
shutdown.bat
del "C:\Softwares\apache-tomcat-7.0.34\webapps\CalorieCounterWar-1.0-SNAPSHOT.war"
rmdir /s "C:\Softwares\apache-tomcat-7.0.34\webapps\CalorieCounterWar-1.0-SNAPSHOT"
move "C:\Users\Moupiya\Calorie counter code\CalorieCounterWar\target\CalorieCounterWar-1.0-SNAPSHOT.war" "C:\Softwares\apache-tomcat-7.0.34\webapps\CalorieCounterWar-1.0-SNAPSHOT.war"
cd "C:\Softwares\apache-tomcat-7.0.34\bin"
startup.bat