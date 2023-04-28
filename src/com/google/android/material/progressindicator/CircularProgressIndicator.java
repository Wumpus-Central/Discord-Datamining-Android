package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import p083eb.C6803b;
import p083eb.C6811j;

/* loaded from: classes3.dex */
public final class CircularProgressIndicator extends AbstractC5672a<C5682e> {

    /* renamed from: z */
    public static final int f11074z = C6811j.f14668n;

    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6803b.f14533g);
    }

    /* renamed from: s */
    private void m27819s() {
        setIndeterminateDrawable(C5691j.m27730s(getContext(), (C5682e) this.f11076k));
        setProgressDrawable(C5683f.m27773u(getContext(), (C5682e) this.f11076k));
    }

    public int getIndicatorDirection() {
        return ((C5682e) this.f11076k).f11121i;
    }

    public int getIndicatorInset() {
        return ((C5682e) this.f11076k).f11120h;
    }

    public int getIndicatorSize() {
        return ((C5682e) this.f11076k).f11119g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public C5682e mo27810i(Context context, AttributeSet attributeSet) {
        return new C5682e(context, attributeSet);
    }

    public void setIndicatorDirection(int i) {
        ((C5682e) this.f11076k).f11121i = i;
        invalidate();
    }

    public void setIndicatorInset(int i) {
        S s = this.f11076k;
        if (((C5682e) s).f11120h != i) {
            ((C5682e) s).f11120h = i;
            invalidate();
        }
    }

    public void setIndicatorSize(int i) {
        int max = Math.max(i, getTrackThickness() * 2);
        S s = this.f11076k;
        if (((C5682e) s).f11119g != max) {
            ((C5682e) s).f11119g = max;
            ((C5682e) s).mo27776e();
            invalidate();
        }
    }

    @Override // com.google.android.material.progressindicator.AbstractC5672a
    public void setTrackThickness(int i) {
        super.setTrackThickness(i);
        ((C5682e) this.f11076k).mo27776e();
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, f11074z);
        m27819s();
    }
}
