
# Planning poker

## Description

C'est la mise en place d'une application de planning poker.

## Installation

1. Il va falloir clôner le dépot git : `git clone https://github.com/DaniellaRakotondratsimba/projet_agile`
2. Vous allez trouver toutes les dépendances pour le lancement de l'application dans le fichier `pom.xml`


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

├── Rapport.otd

├── mvnw.cmd

├── pom.xml

├── README
