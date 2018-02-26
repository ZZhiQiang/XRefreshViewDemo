package com.wisdom.refreshview.processor;

/**
 * Created by zzq on 2017/3/3.
 */

public interface IAnimRefresh {
    void scrollHeadByMove(float moveY);
    void scrollBottomByMove(float moveY);
    void animHeadToRefresh();
    void animHeadBack(boolean isFinishRefresh);
    void animHeadHideByVy(int vy);
    void animBottomToLoad();
    void animBottomBack(boolean isFinishRefresh);
    void animBottomHideByVy(int vy);
}
