package com.qlgy.tank;

import com.qlgy.util.MyUtil;

import java.awt.*;

/**
 * 自己的坦克
 */
public class MyTank extends Tank{

    //坦克的图片数组
    private static Image[] tankImg;

    //静态代码块中对它进行初始化
    static{
        tankImg = new Image[4];
        for (int i = 0; i <tankImg.length ; i++) {
            tankImg[i] = MyUtil.createImage("res/tank1_"+i+".png");
        }
    }

    public MyTank(int x, int y, int dir) {
        super(x, y, dir);
    }

    @Override
    public void drawImgTank(Graphics g) {
        g.drawImage(tankImg[getDir()],getX()-RADIUS,getY()-RADIUS,null);
    }

}
