# COMP2000 Assignment 1
## Session 2, 2025
### How To Run
- Open the project in vscode and then press the play/ run button top right or in terminal run -cp out Main

- Window will open and display the grid and HUD

- Hovering over each cell will display the cell details on the HUD

### Functionality Upadates From Week 5
- Added more actors related to superheroes and villians

- Added terrain to resemble a park

- Added a team class to manage the superheroes to track their stats

- Added a proper HUD to show details on the grid/park

- Adding these demonstrates my creativity and using the knowledge of inheritance, interfaces, and generics shows the growth in my skill.
### Inheritences

- Cell and Actor are now abstract classes and all the specific types (cat,dog,dirt,water,etc) inherit from it to more easily expand the game with more terrain and charaters

- This is more efficient as the shared functionality helps adding more aspects easier and also helps to avoid code duplication


### Interfaces
- Power class was made to represent a hero's power

### Generics
- The Team Class is a generic container who's purpose is to hold any group of an actor together.

- It provides type safe methods without the need of duplicating the code


