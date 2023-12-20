package com.qlgy.util;

import com.qlgy.map.MapTile;
import com.qlgy.tank.EnemyTank;
import com.qlgy.tank.Tank;

import java.util.ArrayList;
import java.util.List;

public class MapTilePool{

    public static final int DEFAULT_POOL_SIZE = 50;
    public static final int POOL_MAX_SIZE = 70;

    private static List<MapTile> pool = new ArrayList<>();
    static{
        for (int i = 0; i <DEFAULT_POOL_SIZE ; i++) {
            pool.add(new MapTile());
        }
    }

    /**
     * 从池塘中获取一个对象。
     * @return
     */
    public static MapTile get(){
        MapTile tile = null;
        //池塘被掏空了！
        if(pool.size() == 0){
            tile = new MapTile();
        }else{//池塘中还有对象，拿走第一个位置的子弹对象
            tile = pool.remove(0);
        }
        return tile;
    }
    //子弹被销毁的时候，归还到池塘中来
    public static void theReturn(MapTile tile){
        //池塘中的子弹的个数已经到达了最大值。那就不再归还
        if(pool.size() == POOL_MAX_SIZE){
            return;
        }
        pool.add(tile);
    }
}
