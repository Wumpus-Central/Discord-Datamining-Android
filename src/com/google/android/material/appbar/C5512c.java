package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.appbar.c */
/* loaded from: classes3.dex */
public class C5512c<V extends View> extends CoordinatorLayout.AbstractC2152c<V> {

    /* renamed from: a */
    private C5513d f10490a;

    /* renamed from: b */
    private int f10491b = 0;

    /* renamed from: c */
    private int f10492c = 0;

    public C5512c() {
    }

    /* renamed from: E */
    public int mo28743E() {
        C5513d dVar = this.f10490a;
        if (dVar != null) {
            return dVar.m28739b();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: F */
    public void mo28742F(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.m38742C(v, i);
    }

    /* renamed from: G */
    public boolean mo28741G(int i) {
        C5513d dVar = this.f10490a;
        if (dVar != null) {
            return dVar.m28736e(i);
        }
        this.f10491b = i;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC2152c
    /* renamed from: l */
    public boolean mo27375l(CoordinatorLayout coordinatorLayout, V v, int i) {
        mo28742F(coordinatorLayout, v, i);
        if (this.f10490a == null) {
            this.f10490a = new C5513d(v);
        }
        this.f10490a.m28738c();
        this.f10490a.m28740a();
        int i2 = this.f10491b;
        if (i2 != 0) {
            this.f10490a.m28736e(i2);
            this.f10491b = 0;
        }
        int i3 = this.f10492c;
        if (i3 == 0) {
            return true;
        }
        this.f10490a.m28737d(i3);
        this.f10492c = 0;
        return true;
    }

    public C5512c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
