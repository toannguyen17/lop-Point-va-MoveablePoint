package app;

public class MoveablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveablePoint() {
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        setSpeed(xSpeed, ySpeed);
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        setSpeed(xSpeed, ySpeed);
    }

    /**
     * @return the xSpeed
     */
    public float getxSpeed() {
        return xSpeed;
    }

    /**
     * @param xSpeed the xSpeed to set
     */
    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    /**
     * @return the ySpeed
     */
    public float getySpeed() {
        return ySpeed;
    }

    /**
     * @param ySpeed the ySpeed to set
     */
    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    /**
     * @return the ySpeed
     */
    public float[] getSpeed() {
        float[] result = {xSpeed, ySpeed};
        return result;
    }

    /**
     * @param xSpeed
     * @param ySpeed
     */
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + "), speed=(" + xSpeed + ", " + ySpeed +")";
    }

    public MoveablePoint move() {
        x += xSpeed;
        y += ySpeed;
        return this;
    }
}
