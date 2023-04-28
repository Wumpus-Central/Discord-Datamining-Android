package com.facebook.imagepipeline.memory;

import java.util.LinkedList;
import java.util.Queue;
import p394w3.C13740j;
import p414x3.C13925a;

/* renamed from: com.facebook.imagepipeline.memory.c */
/* loaded from: classes7.dex */
class C4917c<V> {

    /* renamed from: a */
    public final int f8324a;

    /* renamed from: b */
    public final int f8325b;

    /* renamed from: c */
    final Queue f8326c;

    /* renamed from: d */
    private final boolean f8327d;

    /* renamed from: e */
    private int f8328e;

    public C4917c(int i, int i2, int i3, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4 = true;
        if (i > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C13740j.m2832i(z2);
        if (i2 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C13740j.m2832i(z3);
        C13740j.m2832i(i3 < 0 ? false : z4);
        this.f8324a = i;
        this.f8325b = i2;
        this.f8326c = new LinkedList();
        this.f8328e = i3;
        this.f8327d = z;
    }

    /* renamed from: a */
    void mo31268a(V v) {
        this.f8326c.add(v);
    }

    /* renamed from: b */
    public void m31304b() {
        boolean z;
        if (this.f8328e > 0) {
            z = true;
        } else {
            z = false;
        }
        C13740j.m2832i(z);
        this.f8328e--;
    }

    @Deprecated
    /* renamed from: c */
    public V m31303c() {
        V g = mo31267g();
        if (g != null) {
            this.f8328e++;
        }
        return g;
    }

    /* renamed from: d */
    int m31302d() {
        return this.f8326c.size();
    }

    /* renamed from: e */
    public void m31301e() {
        this.f8328e++;
    }

    /* renamed from: f */
    public boolean m31300f() {
        return this.f8328e + m31302d() > this.f8325b;
    }

    /* renamed from: g */
    public V mo31267g() {
        return (V) this.f8326c.poll();
    }

    /* renamed from: h */
    public void m31299h(V v) {
        C13740j.m2834g(v);
        boolean z = false;
        if (this.f8327d) {
            if (this.f8328e > 0) {
                z = true;
            }
            C13740j.m2832i(z);
            this.f8328e--;
            mo31268a(v);
            return;
        }
        int i = this.f8328e;
        if (i > 0) {
            this.f8328e = i - 1;
            mo31268a(v);
            return;
        }
        C13925a.m2286l("BUCKET", "Tried to release value %s from an empty bucket!", v);
    }
}
