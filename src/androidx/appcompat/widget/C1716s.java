package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import p052d.C6379a;

/* renamed from: androidx.appcompat.widget.s */
/* loaded from: classes.dex */
public class C1716s extends RatingBar {

    /* renamed from: k */
    private final C1707q f1470k;

    public C1716s(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6379a.f37742H);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap b = this.f1470k.m40063b();
        if (b != null) {
            setMeasuredDimension(View.resolveSizeAndState(b.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }

    public C1716s(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C1682i1.m40169a(this, getContext());
        C1707q qVar = new C1707q(this);
        this.f1470k = qVar;
        qVar.mo40062c(attributeSet, i);
    }
}
