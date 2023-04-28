package com.facebook.yoga;

/* renamed from: com.facebook.yoga.h */
/* loaded from: classes7.dex */
public class C5130h extends YogaNodeJNIBase {
    public C5130h(YogaConfig yogaConfig) {
        super(yogaConfig);
    }

    protected void finalize() {
        try {
            m30590r0();
        } finally {
            super.finalize();
        }
    }

    /* renamed from: r0 */
    public void m30590r0() {
        long j = this.f8866o;
        if (j != 0) {
            this.f8866o = 0L;
            YogaNative.jni_YGNodeFreeJNI(j);
        }
    }
}
