package designPattern.prototypeMode;

/**
 * 第一步
 *
 * @author xys
 * @date 2021年05月27日16:12
 */
public abstract class Shape implements Cloneable {
    private String id;
    protected String type;

    protected abstract void draw();

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
