# Snake Game (Java)

A classic Snake game built in Java using **Swing** and **AWT**. Made as a group project a couple of years ago — uploading it here to keep a record of it and share the code.

## Features

- Classic grid-based snake movement with arrow key controls
- Randomly spawning food that grows the snake when eaten
- Score tracking based on snake length
- Game over on self-collision or hitting the board edges
- Simple, dependency-free — just core Java (`javax.swing`, `java.awt`)

## How to Run

### Requirements
- [Java JDK](https://www.oracle.com/java/technologies/downloads/) 8 or later installed

### Steps

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/snake-game-java.git
   cd snake-game-java
   ```

2. Compile the files:
   ```bash
   javac SnakeGame.java snakeMain.java
   ```

3. Run the game:
   ```bash
   java snakeMain
   ```

> **Note:** Both files declare `package snake;`. If you get a package-related error when compiling/running, either place both files inside a folder named `snake` (and run commands from the parent directory, e.g. `java snake.snakeMain`), or remove the `package snake;` line from both files to run them from a single flat folder.

## Controls

| Key | Action |
|-----|--------|
| ↑ | Move up |
| ↓ | Move down |
| ← | Move left |
| → | Move right |

## Project Structure

```
├── SnakeGame.java   # Core game logic, rendering, and input handling
└── snakeMain.java    # Entry point — sets up the game window
```

## Credits

Built as a group project with a friend. 

## License

Feel free to use, modify, and learn from this code.
