package com.wisdom.refreshview.processor;


import com.wisdom.refreshview.XRefreshLayout;

/**
 * Created by zzq on 2017/3/3.
 */

public abstract class Decorator implements IDecorator {
    protected IDecorator decorator;
    protected XRefreshLayout.CoContext cp;

    public Decorator(XRefreshLayout.CoContext processor, IDecorator decorator1) {
        cp = processor;
        decorator = decorator1;
    }
}
