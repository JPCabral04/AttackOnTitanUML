package br.edu.unifei.ecot12a.trabalho;

public abstract class Wall {
    private String name;
    private float height;
    private float width;
    private boolean isDestroyed;

    private WallState wallState = new Safe();

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getHeight() {
        return height;
    }
    public void setHeight(float height) {
        this.height = height;
    }
    public float getWidth() {
        return width;
    }
    public void setWidth(float width) {
        this.width = width;
    }
    public boolean isDestroyed() {
        return isDestroyed;
    }
    public void setDestroyed(boolean isDestroyed) {
        this.isDestroyed = isDestroyed;
    }
    public WallState getWallState() {
        return wallState;
    }
    public void setWallState(WallState wallState) {
        this.wallState = wallState;
    }

    public void changeStage() {
        wallState.state(this);
    }
    

    
}
