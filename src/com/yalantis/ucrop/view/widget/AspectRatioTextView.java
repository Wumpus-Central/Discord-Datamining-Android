package com.yalantis.ucrop.view.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.C2337a;
import gf.C7581a;
import gf.C7582b;
import gf.C7588h;
import java.util.Locale;
import p001if.a;

/* loaded from: classes8.dex */
public class AspectRatioTextView extends AppCompatTextView {

    /* renamed from: k */
    private final float f13076k;

    /* renamed from: l */
    private final Rect f13077l;

    /* renamed from: m */
    private Paint f13078m;

    /* renamed from: n */
    private int f13079n;

    /* renamed from: o */
    private float f13080o;

    /* renamed from: p */
    private String f13081p;

    /* renamed from: q */
    private float f13082q;

    /* renamed from: r */
    private float f13083r;

    public AspectRatioTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: e */
    private void m25654e(int i) {
        Paint paint = this.f13078m;
        if (paint != null) {
            paint.setColor(i);
        }
        setTextColor(new ColorStateList(new int[][]{new int[]{16842913}, new int[]{0}}, new int[]{i, C2337a.m38135c(getContext(), C7581a.f16455k)}));
    }

    /* renamed from: g */
    private void m25652g(TypedArray typedArray) {
        setGravity(1);
        this.f13081p = typedArray.getString(C7588h.f38389R);
        this.f13082q = typedArray.getFloat(C7588h.f38390S, 0.0f);
        float f = typedArray.getFloat(C7588h.f38391T, 0.0f);
        this.f13083r = f;
        float f2 = this.f13082q;
        if (f2 == 0.0f || f == 0.0f) {
            this.f13080o = 0.0f;
        } else {
            this.f13080o = f2 / f;
        }
        this.f13079n = getContext().getResources().getDimensionPixelSize(C7582b.f16465h);
        Paint paint = new Paint(1);
        this.f13078m = paint;
        paint.setStyle(Paint.Style.FILL);
        m25651h();
        m25654e(getResources().getColor(C7581a.f16456l));
        typedArray.recycle();
    }

    /* renamed from: h */
    private void m25651h() {
        if (!TextUtils.isEmpty(this.f13081p)) {
            setText(this.f13081p);
        } else {
            setText(String.format(Locale.US, "%d:%d", Integer.valueOf((int) this.f13082q), Integer.valueOf((int) this.f13083r)));
        }
    }

    /* renamed from: i */
    private void m25650i() {
        if (this.f13080o != 0.0f) {
            float f = this.f13082q;
            float f2 = this.f13083r;
            this.f13082q = f2;
            this.f13083r = f;
            this.f13080o = f2 / f;
        }
    }

    /* renamed from: f */
    public float m25653f(boolean z) {
        if (z) {
            m25650i();
            m25651h();
        }
        return this.f13080o;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isSelected()) {
            canvas.getClipBounds(this.f13077l);
            Rect rect = this.f13077l;
            float f = rect.bottom - (rect.top / 2.0f);
            int i = this.f13079n;
            canvas.drawCircle((rect.right - rect.left) / 2.0f, f - (i * 1.5f), i / 2.0f, this.f13078m);
        }
    }

    public void setActiveColor(int i) {
        m25654e(i);
        invalidate();
    }

    public void setAspectRatio(a aVar) {
        this.f13081p = aVar.m19851a();
        this.f13082q = aVar.m19850b();
        float e = aVar.m19849e();
        this.f13083r = e;
        float f = this.f13082q;
        if (f == 0.0f || e == 0.0f) {
            this.f13080o = 0.0f;
        } else {
            this.f13080o = f / e;
        }
        m25651h();
    }

    @TargetApi(21)
    public AspectRatioTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13076k = 1.5f;
        this.f13077l = new Rect();
        m25652g(context.obtainStyledAttributes(attributeSet, C7588h.f38388Q));
    }
}
