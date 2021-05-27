package designPattern.adapterMode.face;

/**
 * 第一步
 * 创建媒体播放器接口
 *
 * @author xys
 * @date 2021年05月27日16:24
 */
public interface MediaPlayer {
    public void play(String audioType, String fileName);
}
