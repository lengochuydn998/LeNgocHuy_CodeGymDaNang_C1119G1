package KeThua.BaiTap.PointAndMP;

public class Point {
    private float x ;
    private float y;

    public Point(){

    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x,float y){
        this.x=x;
        this.y=y;
    }
    public float[] getXY(){
        float array2D[]=new float[2];
        array2D[0]=getX();
        array2D[1]=getY();
        return array2D;
    }
    @Override
    public String toString(){
        return "("+getX()+","+getY()+")";
    }
}
