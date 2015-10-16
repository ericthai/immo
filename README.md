# immo

utiliser le projet immo-agregator pour lancer les commandes maven pour tous les projets

GENERER les fichiers de config pour ECLIPSE (dependances) : mvn eclipse:eclipse -Dwtpversion=1.0
attention : il faut aller enlever les "exclude des fichiers properties" de chaque projet eclipse "java build path : source : src/main/resource qui doit être à "NONE" (faire un remove)

BUILD TOTAL (livraison) : mvn clean compile package install

Toutes les couches sont mises en place. Il reste à coder un exemple de bout en bout : "immo-web" appelle un service de "immo-services"
