package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class NestedScrollingParentHelper {

    /* renamed from: a */
    private int f3510a;

    /* renamed from: b */
    private int f3511b;

    public NestedScrollingParentHelper(ViewGroup viewGroup) {
    }

    /* renamed from: a */
    public int m37531a() {
        return this.f3510a | this.f3511b;
    }

    /* renamed from: b */
    public void m37530b(View view, View view2, int i) {
        m37529c(view, view2, i, 0);
    }

    /* renamed from: c */
    public void m37529c(View view, View view2, int i, int i2) {
        if (i2 == 1) {
            this.f3511b = i;
        } else {
            this.f3510a = i;
        }
    }

    /* renamed from: d */
    public void m37528d(View view) {
        m37527e(view, 0);
    }

    /* renamed from: e */
    public void m37527e(View view, int i) {
        if (i == 1) {
            this.f3511b = 0;
        } else {
            this.f3510a = 0;
        }
    }
}
