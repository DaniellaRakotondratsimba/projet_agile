		document.addEventListener('DOMContentLoaded', function () {
            // Charger le fichier JSON
            fetch('/tasks.json')
                .then(response => response.json())
                .then(data => {
                    // Stocker les tâches dans une variable globale
                    window.tasks = data;

                    // Afficher la première tâche
                    displayTask(0);
                })
                .catch(error => console.error('Error fetching JSON:', error));
        });

        var currentTaskIndex = 0;

        function displayTask(index) {
            // Sélectionner l'élément HTML où afficher la tâche
            var taskListElement = document.getElementById('taskList');

            // Effacer le contenu précédent
            taskListElement.innerHTML = '';

            // Créer un élément de paragraphe pour la tâche
            var taskElement = document.createElement('p');

            // Remplir le contenu du paragraphe avec les détails de la tâche
            taskElement.textContent = 'CU ' + window.tasks[index].id_task + ' : ' + window.tasks[index].task_name;

            // Ajouter le paragraphe à la liste des tâches
            taskListElement.appendChild(taskElement);
        }

        function showNextTask() {
            // Passer à la tâche suivante
            currentTaskIndex++;

            // Si toutes les tâches ont été affichées, réinitialiser à la première tâche
            if (currentTaskIndex >= window.tasks.length) {
                currentTaskIndex = 0;
            }

            // Afficher la tâche actuelle
            displayTask(currentTaskIndex);
        }