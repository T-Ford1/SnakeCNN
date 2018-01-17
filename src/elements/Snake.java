package elements;

import java.awt.Point;
import java.util.Iterator;
import java.util.LinkedList;
import running.Runner;

public class Snake {

    private final LinkedList<Point> snake;
    private Point last;

    public Snake(int startX, int startY) {
        snake = new LinkedList();
        snake.addFirst(new Point(startX, startY));
        last = snake.getLast();
    }

    public void step(Point dir) {
        Point head = snake.getFirst();
        Point next = add(head, dir);
        last = snake.removeLast();
        Runner.MAP.getTile(next.y, next.x).setHead();
        Runner.MAP.getTile(head.y, head.x).setBody();
        Runner.MAP.getTile(last.y, last.x).setBackground();
        snake.addFirst(next);
    }
    
    public void grow() {
        snake.add(last);
        Runner.MAP.getTile(last.y, last.x).setBody();
    }

    private Point add(Point a, Point b) {
        return new Point(a.x + b.x, a.y + b.y);
    }

    public boolean alive() {
        Point head = snake.getFirst();
        Iterator<Point> i = snake.listIterator(1);
        while(i.hasNext())  {
            if(i.next().equals(head)) {
                return false;
            }
        }
        return true;
    }

    public boolean eaten(Point food) {
        return snake.getFirst().equals(food);
    }
}
