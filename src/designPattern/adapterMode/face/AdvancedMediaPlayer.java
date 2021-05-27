package designPattern.adapterMode.face;

/**
 * 第一步
 * 创建高级媒体播放器接口
 *
 * @author xys
 * @date 2021年05月27日16:24
 */
public interface AdvancedMediaPlayer {
    public void playVlc(String fileName);

    public void playMp4(String fileName);
}
