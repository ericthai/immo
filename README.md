# immo

HOWTO pour GIT dans eclipse:
howto eclipse git commit push gestion des conflits 2

click "projet" : team->Synchronize workspace : à utiliser juste pour visualiser 

Contexte : 
les sources du serveurs Github ont été modifiées par un collègue.
les sources en local également sur les mêmes fichiers (ici exactement les mêmes fichiers)

principe général :
Il faut commiter (san pusher) en local, rabattre les modifs du serveur vers le local, gérer les conflits, faire un "Add to Index" puis commiter ET pusher ensuite.


1 - on visualise d'abord si il a potentiellement des conflits
"team->Synchronize workspace" sur le projet 
=> on prend juste connaissance des conflits éventuels (sans pour autant commencer à modifier et gérer les conflits)

2 - Si on a des conflits à arbitrer (<-> n rouge), on fait un COMMIT des sources en local EN PREMIER
On doit d'abord commiter en local les modifications avant de s'intéresser aux sources du serveur Github : 
faire un commit de tous les fichiers modifiés en local (sans PUSH)
mettre un commentaire explicit 

3 - on refait un "team->Synchronize workspace" sur le projet 
dans la perspective "Team Synchronizing" : onglet "Synchronize"
on voit les conflits 
ET
on PULL (flèche verte du cloud vers local) : cliquer sur ce bouton
=> des croix rouges DEVRAIENT apparaître sur les fichiers en conflits

4 - pour chaque fichier en conflit (ou pas) : 
- double cliquer sur le fichier en conflit (<-> et croix rouge)
- résoudre et arbitrer les conflits (entre "<<<<<<<" et ">>>>>>> branch 'master' of ...")
=> on doit avoir un code source "fusionné" (sans les "<<< ou >>>>")
sauvegarder : ctrl + S

[PRECO : une fois qu'on a TOUT fait pour TOUS les fichiers en conflits, IL est souhaitable
de tester en local la ou les fonctionnalités qu'on souhaite commiter à l'origine 
AVANT de COMMITER] puis, on peut poursuivre

5 - Pour tous les fichiers en conflits :
- click droit sur chaque fichier "propre" et "Add to Index"

6 - COMMITER ET PUSHER vers le serveur GitHub
click droit sur le "projet" et "COMMIT ..."
-> le commit message doit être pré-rempli avec "Merge branch 'master' ...."
-> sélectionner les fichiers à commiter (normalement tout)
-> cliquer sur "COMMIT and PUSH"
-> cliquer juste sur OK ensuite



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
