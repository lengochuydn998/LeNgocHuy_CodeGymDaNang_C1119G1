package LopVaDoiTuong.BaiTap;

public class Fan {
    static final int slow = 1,medium = 2,fast = 3;
    private int speed = slow;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
    }

    public int getSlow() {
        return slow;
    }

    public int getMedium() {
        return medium;
    }

    public int getFast() {
        return fast;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString(){
        if (this.on){
            return "Fan is on"+"{Speed =" +this.speed
                    +",Color is "+this.color+" , Radius = "+this.radius+"}";
        }
        else
            return "Fan is off"+"{Color is "+this.color+" ,Radius = "+this.radius+"}";
    }

    public static void main(String[] args) {
        Fan fan = new Fan();
        fan.setRadius(5);
        fan.setOn(true);
        System.out.println(fan.toString());
    }
}
