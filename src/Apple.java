import java.awt.*;
import java.net.CookieHandler;

public class Apple {
    private int xCoor, yCoor, width, height;
    public Apple(int xCoor, int yCoor, int tileSize){
        this.xCoor = xCoor;
        this.yCoor = yCoor;
        width= tileSize;
        height=tileSize;

    }
    public void tick(){

    }

    public int getxCoor() {
        return xCoor;
    }

    public void setxCoor(int xCoor) {
        this.xCoor = xCoor;
    }

    public int getyCoor() {
        return yCoor;
    }

    public void setyCoor(int yCoor) {
        this.yCoor = yCoor;
    }

    public void paint(Graphics g){
        g.setColor(Color.RED);
        g.fillRect(xCoor * width, yCoor * height, width, height);
    }


}
