/**
 * Created by rishabgargeya on 10/11/14.
 */
public class Enemy {
    int x;
    int y;
    public Enemy(int xpos, int ypos){
        x = xpos;
        y = ypos;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    if (this.getX() == Player.getX() && this.getY() == Player.getY())
    {
        //// player dies;
    }
}
