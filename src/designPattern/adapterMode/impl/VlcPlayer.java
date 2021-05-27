package designPattern.adapterMode.impl;

import designPattern.adapterMode.face.AdvancedMediaPlayer;

/**
 * 第二步
 * 实现高级媒体播放器
 *
 * @author xys
 * @date 2021年05月27日16:25
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("播放VlC文件. 名字: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //什么也不做
    }
}
