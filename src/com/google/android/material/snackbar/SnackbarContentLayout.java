package com.google.android.material.snackbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.C2733w0;
import p083eb.C6807f;

/* loaded from: classes3.dex */
public class SnackbarContentLayout extends LinearLayout implements AbstractC5708a {

    /* renamed from: k */
    private TextView f11194k;

    /* renamed from: l */
    private Button f11195l;

    /* renamed from: m */
    private int f11196m;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: c */
    private static void m27677c(View view, int i, int i2) {
        if (C2733w0.m37027W(view)) {
            C2733w0.m37054F0(view, C2733w0.m37053G(view), i, C2733w0.m37055F(view), i2);
        } else {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
        }
    }

    /* renamed from: d */
    private boolean m27676d(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f11194k.getPaddingTop() == i2 && this.f11194k.getPaddingBottom() == i3) {
            return z;
        }
        m27677c(this.f11194k, i2, i3);
        return true;
    }

    @Override // com.google.android.material.snackbar.AbstractC5708a
    /* renamed from: a */
    public void mo27675a(int i, int i2) {
        this.f11194k.setAlpha(0.0f);
        long j = i2;
        long j2 = i;
        this.f11194k.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        if (this.f11195l.getVisibility() == 0) {
            this.f11195l.setAlpha(0.0f);
            this.f11195l.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        }
    }

    @Override // com.google.android.material.snackbar.AbstractC5708a
    /* renamed from: b */
    public void mo27674b(int i, int i2) {
        this.f11194k.setAlpha(1.0f);
        long j = i2;
        long j2 = i;
        this.f11194k.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        if (this.f11195l.getVisibility() == 0) {
            this.f11195l.setAlpha(1.0f);
            this.f11195l.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        }
    }

    public Button getActionView() {
        return this.f11195l;
    }

    public TextView getMessageView() {
        return this.f11194k;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f11194k = (TextView) findViewById(C6807f.f38023I);
        this.f11195l = (Button) findViewById(C6807f.f38022H);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
        if (m27676d(1, r0, r0 - r2) != false) goto L_0x0054;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
        if (m27676d(0, r0, r0) != false) goto L_0x0054;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
        if (r1 == false) goto L_?;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
        super.onMeasure(r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.getOrientation()
            r1 = 1
            if (r0 != r1) goto L_0x000b
            return
        L_0x000b:
            android.content.res.Resources r0 = r7.getResources()
            int r2 = p083eb.C6805d.f14565g
            int r0 = r0.getDimensionPixelSize(r2)
            android.content.res.Resources r2 = r7.getResources()
            int r3 = p083eb.C6805d.f14564f
            int r2 = r2.getDimensionPixelSize(r3)
            android.widget.TextView r3 = r7.f11194k
            android.text.Layout r3 = r3.getLayout()
            int r3 = r3.getLineCount()
            r4 = 0
            if (r3 <= r1) goto L_0x002e
            r3 = r1
            goto L_0x002f
        L_0x002e:
            r3 = r4
        L_0x002f:
            if (r3 == 0) goto L_0x0048
            int r5 = r7.f11196m
            if (r5 <= 0) goto L_0x0048
            android.widget.Button r5 = r7.f11195l
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f11196m
            if (r5 <= r6) goto L_0x0048
            int r2 = r0 - r2
            boolean r0 = r7.m27676d(r1, r0, r2)
            if (r0 == 0) goto L_0x0053
            goto L_0x0054
        L_0x0048:
            if (r3 == 0) goto L_0x004b
            goto L_0x004c
        L_0x004b:
            r0 = r2
        L_0x004c:
            boolean r0 = r7.m27676d(r4, r0, r0)
            if (r0 == 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r1 = r4
        L_0x0054:
            if (r1 == 0) goto L_0x0059
            super.onMeasure(r8, r9)
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public void setMaxInlineActionWidth(int i) {
        this.f11196m = i;
    }
}
