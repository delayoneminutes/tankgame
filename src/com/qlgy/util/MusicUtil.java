package com.qlgy.util;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.io.IOException;

public class MusicUtil {
    private static AudioClip start;
    private static AudioClip bomb;
    //装载音乐资源
    static {
        try {
            //引号里面的是音乐文件所在的绝对路径
            start = Applet.newAudioClip(new File("music/start.wav").toURL());//加载音频
            bomb = Applet.newAudioClip(new File("music/bomb.wav").toURL());//加载音频
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void playStart() {
        start.play(); //播放音频
    }

    public static void playBomb() {
        bomb.play(); //播放音频
    }
}
