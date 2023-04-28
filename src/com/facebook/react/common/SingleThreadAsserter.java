package com.facebook.react.common;

import p059d6.C6399a;

/* loaded from: classes7.dex */
public class SingleThreadAsserter {
    private Thread mThread = null;

    public void assertNow() {
        boolean z;
        Thread currentThread = Thread.currentThread();
        if (this.mThread == null) {
            this.mThread = currentThread;
        }
        if (this.mThread == currentThread) {
            z = true;
        } else {
            z = false;
        }
        C6399a.m25624a(z);
    }
}
