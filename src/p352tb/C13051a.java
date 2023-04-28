package p352tb;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.appcompat.widget.C1713r;
import androidx.core.widget.C2787d;
import lb.C10395a;
import p083eb.C6803b;
import p083eb.C6811j;

/* renamed from: tb.a */
/* loaded from: classes3.dex */
public class C13051a extends C1713r {

    /* renamed from: q */
    private static final int f29348q = C6811j.f14670p;

    /* renamed from: r */
    private static final int[][] f29349r = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: o */
    private ColorStateList f29350o;

    /* renamed from: p */
    private boolean f29351p;

    public C13051a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6803b.f37982B);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f29350o == null) {
            int d = C10395a.m13517d(this, C6803b.f14534h);
            int d2 = C10395a.m13517d(this, C6803b.f14536j);
            int d3 = C10395a.m13517d(this, C6803b.f14539m);
            int[][] iArr = f29349r;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = C10395a.m13513h(d3, d, 1.0f);
            iArr2[1] = C10395a.m13513h(d3, d2, 0.54f);
            iArr2[2] = C10395a.m13513h(d3, d2, 0.38f);
            iArr2[3] = C10395a.m13513h(d3, d2, 0.38f);
            this.f29350o = new ColorStateList(iArr, iArr2);
        }
        return this.f29350o;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f29351p && C2787d.m36728b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f29351p = z;
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
    public C13051a(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = p352tb.C13051a.f29348q
            android.content.Context r8 = p462zb.C14615a.m126c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = p083eb.C6812k.f38059D3
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.C5662m.m27838h(r0, r1, r2, r3, r4, r5)
            int r10 = p083eb.C6812k.f38067E3
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L_0x0028
            android.content.res.ColorStateList r8 = p366ub.C13242c.m4241a(r8, r9, r10)
            androidx.core.widget.C2787d.m36727c(r7, r8)
        L_0x0028:
            int r8 = p083eb.C6812k.f38075F3
            boolean r8 = r9.getBoolean(r8, r6)
            r7.f29351p = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p352tb.C13051a.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
