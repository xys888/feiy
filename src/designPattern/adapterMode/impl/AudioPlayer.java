package designPattern.adapterMode.impl;

import designPattern.adapterMode.face.MediaPlayer;

/**
 * 第四步
 * 实现媒体播放器
 *
 * @author xys
 * @date 2021年05月27日16:25
 */
public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {

        //播放 mp3 音乐文件的内置支持
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("播放Mp3文件. 名字: " + fileName);
        }
        //mediaAdapter 提供了播放其他文件格式的支持
        else if (audioType.equalsIgnoreCase("vlc")
                || audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("无效媒体" +
                    audioType + " 不支持格式");
        }
    }
}