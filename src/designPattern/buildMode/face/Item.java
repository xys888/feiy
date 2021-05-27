package designPattern.buildMode.face;

/**
 * @author xys
 * 第一步 创建类目表
 * 创建一个表示食物条目和食物包装的接口。
 * @date 2021年05月27日15:07
 */
public interface Item {
    //名称
    public String name();
    //包装
    public Packing packing();
    //价格
    public float price();
}
