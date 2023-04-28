package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.widget.ImageButton;

@SuppressLint({"AppCompatCustomView"})
/* renamed from: com.google.android.material.internal.p */
/* loaded from: classes3.dex */
public class C5671p extends ImageButton {

    /* renamed from: k */
    private int f11073k;

    /* renamed from: b */
    public final void m27821b(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f11073k = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.f11073k;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        m27821b(i, true);
    }
}
