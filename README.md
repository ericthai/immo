# immo
Boot du projet immo


spring boot, hibernate, mysql, DDL

pre-requis :
jdk 8 + JAVA_HOME configure
maven
eclipse luna pour developper
wamp avec une base "immo" et un login/pwd base sur la base "immo"

- chaque projet "eclispe" :
lancer avec eclipse sur les applications "Main"

pour compiler avec maven :
mvn clean compile package install 

pour lancer avec maven (sauf immo-agregator): 
mvn spring-boot:run


- test via : 
http://localhost:8080/immo/annonces/
login=eric
pwd=password

config de la securite dans :
immo-ws\src\main\java\com\virtualobject\MySecurityConfiguration.java

TODO :
- GIS
- revoir heritage
- faire un CRUD complet

