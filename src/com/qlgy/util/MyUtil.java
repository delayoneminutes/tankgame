package com.qlgy.util;

import java.awt.*;

/**
 * 工具类
 */
public class MyUtil {
    private  MyUtil(){}

    /**
     * 得到指定的区间的随机数
     * @param min 区间最小值，包含
     * @param max 区间最大值，不包含
     * @return 随机数
     */
    public static final int getRandomNumber(int min, int max){
        return (int)(Math.random()*(max-min)+min);
    }

    /**
     * 得到随机的颜色
     * @return
     */
    public static final Color getRandomColor(){
        int red = getRandomNumber(0,256);
        int blue = getRandomNumber(0,256);
        int green = getRandomNumber(0,256);
        return new Color(red,green,blue);
    }

    /**
     * 判断一个点是否在某一个正方形的内部，
     * @param rectX 正方形的中心点的x坐标
     * @param rectY 正方形的中心点的y坐标
     * @param radius 正方形的边长的一半
     * @param pointX 点的x坐标
     * @param pointY 点的y坐标
     * @return 如果点在正方形内部，返回true，否则返回false
     */
    public static final boolean isCollide(int rectX,int rectY,int radius,int pointX,int pointY){
        //正方形中心点 和 点 的 x y 轴 的距离
        int disX = Math.abs(rectX - pointX);
        int disY = Math.abs(rectY - pointY);
        if (disX <= radius && disY <= radius)
            return true;
        return false;
    }

    /**
     * 根据图片的资源路径创建加载图片对象
     * @param path 图片资源的路径
     * @return
     */
    public static final Image createImage(String path){
        return Toolkit.getDefaultToolkit().createImage(path);
    }

    private static final String[] NAMES = {
            "行人","乐园","花草","人才","左手","目的","课文","优点","年代","灰尘",
            "沙子","小说","儿女","难题","明星","本子","彩色","水珠","路灯","把握",
            "房屋","心愿","左边","新闻","早点",
            "市场","雨点","细雨","书房","毛巾","画家","元旦","绿豆","本领","起点",
            "青菜","土豆","总结","礼貌","右边",
            "老虎","老鼠","猴子","树懒"," 斑马","小狗","狐狸","狗熊","黑熊",
            "大象","豹子"," 麝牛","狮子","熊猫","疣猪","羚羊","驯鹿","考拉",
            "犀牛","猞猁","猩猩","海牛","水獭","海豚","海象","刺猬","袋鼠",
            "犰狳","河马","海豹","海狮","蝙蝠","白虎","狸猫","水牛","山羊",
            "绵羊","牦牛","猿猴","松鼠","野猪","豪猪","麋鹿","花豹","野狼",
            "灰狼","蜂猴","熊猴","叶猴","紫貂","貂熊","熊狸","云豹","雪豹",
            "黑麂","野马","鼷鹿","坡鹿","豚鹿","野牛","藏羚","河狸","驼鹿",
            "黄羊","鬣羚","斑羚","岩羊","盘羊","雪兔"
    };

    private static final String[] MODIFIY = {
            "可爱","傻傻","萌萌","羞羞","笨笨","呆呆","美丽","聪明","伶俐","狡猾",
            "胖乎乎","粉嫩嫩","白胖胖","漂亮","可爱","聪明","懂事","乖巧","淘气",
            "淘气","顽劣","调皮","顽皮","天真","可爱","无邪","单纯","纯洁","无暇",
            "纯真","稚气","温润","好奇"
    };

    /**
     * 得到一个随机的名字
     * @return
     */
    public static final String getRandomName(){
        return MODIFIY[getRandomNumber(0,MODIFIY.length)] + "的" +
                NAMES[getRandomNumber(0,NAMES.length)];
    }
}
