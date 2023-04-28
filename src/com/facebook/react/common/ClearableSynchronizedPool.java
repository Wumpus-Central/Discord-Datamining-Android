package com.facebook.react.common;

import androidx.core.util.AbstractC2516f;

/* loaded from: classes7.dex */
public class ClearableSynchronizedPool<T> implements AbstractC2516f<T> {
    private final Object[] mPool;
    private int mSize = 0;

    public ClearableSynchronizedPool(int i) {
        this.mPool = new Object[i];
    }

    @Override // androidx.core.util.AbstractC2516f
    public synchronized T acquire() {
        int i = this.mSize;
        if (i == 0) {
            return null;
        }
        int i2 = i - 1;
        this.mSize = i2;
        Object[] objArr = this.mPool;
        T t = (T) objArr[i2];
        objArr[i2] = null;
        return t;
    }

    public synchronized void clear() {
        for (int i = 0; i < this.mSize; i++) {
            this.mPool[i] = null;
        }
        this.mSize = 0;
    }

    @Override // androidx.core.util.AbstractC2516f
    public synchronized boolean release(T t) {
        int i = this.mSize;
        Object[] objArr = this.mPool;
        if (i == objArr.length) {
            return false;
        }
        objArr[i] = t;
        this.mSize = i + 1;
        return true;
    }
}
