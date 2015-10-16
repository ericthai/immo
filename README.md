# immo

*** DATABASE ***
Pour generer le script SQL correspondant a la base MYSQL : 
lancer une CMD, se placer dans "immo-services" et lancer "mvn hibernate4:export" le fichier sql se trouve dans le repertoire target.
Lancer SQLMyAdmin se placer sur la base "immo" (ou en créer une) et importer le script (aller chercher le fichier SQL) et executer.

*** MAVEN et gestion des dependances ***
utiliser le projet immo-agregator pour lancer les commandes maven pour tous les projets

GENERER les fichiers de config pour ECLIPSE (dependances) : mvn eclipse:eclipse -Dwtpversion=1.0
attention : il faut aller enlever les "exclude des fichiers properties" de chaque projet eclipse "java build path : source : src/main/resource qui doit être à "NONE" (faire un remove)

BUILD TOTAL (livraison) : mvn clean compile package install

Toutes les couches sont mises en place. Il reste à coder un exemple de bout en bout : "immo-web" appelle un service de "immo-services"
