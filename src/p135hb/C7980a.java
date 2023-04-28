package p135hb;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.C1663f;
import androidx.core.graphics.drawable.C2400a;
import androidx.core.widget.C2787d;
import com.google.android.material.internal.C5665o;
import lb.C10395a;
import p083eb.C6803b;
import p083eb.C6811j;

/* renamed from: hb.a */
/* loaded from: classes3.dex */
public class C7980a extends C1663f {

    /* renamed from: r */
    private static final int f17194r = C6811j.f14669o;

    /* renamed from: s */
    private static final int[][] f17195s = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: o */
    private ColorStateList f17196o;

    /* renamed from: p */
    private boolean f17197p;

    /* renamed from: q */
    private boolean f17198q;

    public C7980a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6803b.f14530d);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f17196o == null) {
            int[][] iArr = f17195s;
            int[] iArr2 = new int[iArr.length];
            int d = C10395a.m13517d(this, C6803b.f14534h);
            int d2 = C10395a.m13517d(this, C6803b.f14539m);
            int d3 = C10395a.m13517d(this, C6803b.f14536j);
            iArr2[0] = C10395a.m13513h(d2, d, 1.0f);
            iArr2[1] = C10395a.m13513h(d2, d3, 0.54f);
            iArr2[2] = C10395a.m13513h(d2, d3, 0.38f);
            iArr2[3] = C10395a.m13513h(d2, d3, 0.38f);
            this.f17196o = new ColorStateList(iArr, iArr2);
        }
        return this.f17196o;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f17197p && C2787d.m36728b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        Drawable a;
        int i;
        if (!this.f17198q || !TextUtils.isEmpty(getText()) || (a = C2787d.m36729a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        if (C5665o.m27826e(this)) {
            i = -1;
        } else {
            i = 1;
        }
        int width = ((getWidth() - a.getIntrinsicWidth()) / 2) * i;
        int save = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = a.getBounds();
            C2400a.m37831l(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.f17198q = z;
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f17197p = z;
        if (z) {
            C2787d.m36727c(this, getMaterialThemeColorsTintList());
        } else {
            C2787d.m36727c(this, null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C7980a(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = p135hb.C7980a.f17194r
            android.content.Context r8 = p462zb.C14615a.m126c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = p083eb.C6812k.f14873y3
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.C5662m.m27838h(r0, r1, r2, r3, r4, r5)
            int r10 = p083eb.C6812k.f14881z3
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L_0x0028
            android.content.res.ColorStateList r8 = p366ub.C13242c.m4241a(r8, r9, r10)
            androidx.core.widget.C2787d.m36727c(r7, r8)
        L_0x0028:
            int r8 = p083eb.C6812k.f38043B3
            boolean r8 = r9.getBoolean(r8, r6)
            r7.f17197p = r8
            int r8 = p083eb.C6812k.f38035A3
            r10 = 1
            boolean r8 = r9.getBoolean(r8, r10)
            r7.f17198q = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p135hb.C7980a.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
