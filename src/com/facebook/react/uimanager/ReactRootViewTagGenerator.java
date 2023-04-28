package com.facebook.react.uimanager;

/* loaded from: classes7.dex */
public class ReactRootViewTagGenerator {
    private static final int ROOT_VIEW_TAG_INCREMENT = 10;
    private static int sNextRootViewTag = 1;

    public static synchronized int getNextRootViewTag() {
        int i;
        synchronized (ReactRootViewTagGenerator.class) {
            i = sNextRootViewTag;
            sNextRootViewTag = i + 10;
        }
        return i;
    }
}
