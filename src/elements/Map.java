package elements;

import java.awt.Point;

public class Map {

    private final Snake snake;
    private final Tile[][] tiles;
    private final Food food;

    public Map() {
        tiles = new Tile[20][20];
        for (int y = 0; y < 20; y++) {
            for (int x = 0; x < 20; x++) {
                tiles[y][x] = new Tile(y, x, 3);

            }
        }
        snake = new Snake(0, 0);
        tiles[0][0].setHead();
        food = new Food();
    }

    public void setFood() {
        Point f = food.foodPos();
        tiles[f.y][f.x].setFood();
    }

    public boolean step() {
        try {
            snake.step(running.Runner.SCREEN.input.getDirection());
            if (snake.eaten(food.foodPos())) {
                snake.grow();
                food.nextFood();
                setFood();
            }
            return snake.alive();
        } catch (ArrayIndexOutOfBoundsException e) {
            return false;
        }
    }
    
    public int score() {
        return snake.score();
    }

    public Tile getTile(int y, int x) {
        return tiles[y][x];
    }

}
