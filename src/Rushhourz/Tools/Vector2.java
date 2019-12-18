package Rushhourz.Tools;

public class Vector2{
    public double x;
    public double y;
    public Vector2(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Vector2(int x, int y){
        this.x = x;
        this.y = y;
    }
    public Vector2(float x, float y, float z){
        this.x = x;
        this.y = y;
    }

    public static Vector2 UP(){
        return new Vector2(0.0,1.0);
    }
    public static Vector2 DOWN(){
        return new Vector2(0.0,-1.0);
    }
    public static Vector2 LEFT(){
        return new Vector2(-1.0,0.0);
    }
    public static Vector2 RIGHT(){
        return new Vector2(1.0,0.0);
    }
}