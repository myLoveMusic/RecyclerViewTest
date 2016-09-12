package com.lihang.recyclerviewtest;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by 一指流沙 on 2016/9/12.
 */
public class MyItemDecoration extends RecyclerView.ItemDecoration {
    /**
     *渲染item前调用
     * @param c
     * @param parent
     */
    @Override
    public void onDraw(Canvas c, RecyclerView parent) {
        super.onDraw(c, parent);
    }

    /**
     *设置item编距
     * @param outRect
     * @param view
     * @param parent
     * @param state
     */
    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);
    }

    /**
     * 渲染item后调用的方法
     * @param c
     * @param parent
     * @param state
     */
    @Override
    public void onDrawOver(Canvas c, RecyclerView parent, RecyclerView.State state) {
        super.onDrawOver(c, parent, state);
    }
}
