
# Planning poker

## Description

C'est la mise en place d'une application de planning poker.

## Installation

Il va falloir clôner le dépot git : `git clone https://github.com/DaniellaRakotondratsimba/projet_agile`


## Structure du projet
projet_agile

├── mvn/wrapper/

    ├── maven-wrapper.java
    ├── maven-wrapper.properties

├── src/

    ├── main/
    
        ├── java/agile_poject/
            
            ├── controllers/
                ├── GameController.java  
                ├── HomeController.java
                ├── PlayerController.java

            ├── models/
                ├── Game.java    
                ├── GameCommand.java  
                ├── Player.java
                ├── Task.java  
                ├── Vote.java
                
            ├── repositories
                ├── GameRepository.java    
                ├── PlayerRepository.java 
            
            ├── AgileProjectApplication.java
        
        ├── resources/
            
            ├── static/
                ├── css/   
                    ├── creategame.css
                    ├── game.css
                    ├── home.css
                    ├── root.css
                ├── js/ 
                    ├── game.js
                ├── tasks.json
            
            
            ├── templates/
                ├── createGame.html  
                ├── game.html
                ├── home.html
                ├── listPlayer.html
                ├── resumeGame.html
            
            ├── application.properties


    
    ├── test/java/agile_project
        ├── AgileProjectApplicationTests.java

├── .gitignore

├── README

├── Rapport.docx

├── mvnw.cmd

├── pom.xml



## Configuration
### Dépendances
Pour ajouter toutes les dépendances nécessaires au projet, vous ouvrez le fichier `pom.xml`et vous y trouverez le nécessaire.
### Base de données
Pour le projet nous avons utilisé `postgres`pour la base de données. Vous devez d'abord le télécharger puis l'installer. Une fois l'installation terminée, recherchez et lancez `pgAdmin 4` depuis la barre de recherche de votre PC puis créer une base de données dans `pgAdmin 4`
### Environnements
Le projet a été réalisé sous la `version 8 de Java` et en utilisant l'IDE `Spring Tool Suite` ou `STS`.
### Lancement de l'application
`AgileProjectApplication.java`est la classe principale de notre application. Vous devez ensuite ouvrir un navigateur web et puis tapez `localhost:8080/`pour utiliser l'application.
