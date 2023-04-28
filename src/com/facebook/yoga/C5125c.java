package com.facebook.yoga;

/* renamed from: com.facebook.yoga.c */
/* loaded from: classes7.dex */
public class C5125c extends AbstractC5124b {
    /* renamed from: c */
    public void m30597c() {
        long j = this.f8897a;
        if (j != 0) {
            this.f8897a = 0L;
            YogaNative.jni_YGConfigFreeJNI(j);
        }
    }

    protected void finalize() {
        try {
            m30597c();
        } finally {
            super.finalize();
        }
    }
}
