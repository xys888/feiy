package designPattern.adapterMode.impl;

import designPattern.adapterMode.face.AdvancedMediaPlayer;

/**
 * 第二步
 * 实现高级媒体播放器
 *
 * @author xys
 * @date 2021年05月27日16:25
 */
public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        //什么也不做
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("播放MP4文件. 名字: " + fileName);
    }
}