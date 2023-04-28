package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.C2733w0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.appbar.d */
/* loaded from: classes3.dex */
public class C5513d {

    /* renamed from: a */
    private final View f10493a;

    /* renamed from: b */
    private int f10494b;

    /* renamed from: c */
    private int f10495c;

    /* renamed from: d */
    private int f10496d;

    /* renamed from: e */
    private int f10497e;

    /* renamed from: f */
    private boolean f10498f = true;

    /* renamed from: g */
    private boolean f10499g = true;

    public C5513d(View view) {
        this.f10493a = view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m28740a() {
        View view = this.f10493a;
        C2733w0.m37020b0(view, this.f10496d - (view.getTop() - this.f10494b));
        View view2 = this.f10493a;
        C2733w0.m37022a0(view2, this.f10497e - (view2.getLeft() - this.f10495c));
    }

    /* renamed from: b */
    public int m28739b() {
        return this.f10496d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m28738c() {
        this.f10494b = this.f10493a.getTop();
        this.f10495c = this.f10493a.getLeft();
    }

    /* renamed from: d */
    public boolean m28737d(int i) {
        if (!this.f10499g || this.f10497e == i) {
            return false;
        }
        this.f10497e = i;
        m28740a();
        return true;
    }

    /* renamed from: e */
    public boolean m28736e(int i) {
        if (!this.f10498f || this.f10496d == i) {
            return false;
        }
        this.f10496d = i;
        m28740a();
        return true;
    }
}
