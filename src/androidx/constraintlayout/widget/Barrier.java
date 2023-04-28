package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.constraintlayout.solver.widgets.C2122a;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;

/* loaded from: classes.dex */
public class Barrier extends AbstractC2143b {

    /* renamed from: s */
    private int f2626s;

    /* renamed from: t */
    private int f2627t;

    /* renamed from: u */
    private C2122a f2628u;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    /* renamed from: o */
    private void m38810o(ConstraintWidget constraintWidget, int i, boolean z) {
        this.f2627t = i;
        if (z) {
            int i2 = this.f2626s;
            if (i2 == 5) {
                this.f2627t = 1;
            } else if (i2 == 6) {
                this.f2627t = 0;
            }
        } else {
            int i3 = this.f2626s;
            if (i3 == 5) {
                this.f2627t = 0;
            } else if (i3 == 6) {
                this.f2627t = 1;
            }
        }
        if (constraintWidget instanceof C2122a) {
            ((C2122a) constraintWidget).m38846M0(this.f2627t);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.AbstractC2143b
    /* renamed from: g */
    public void mo38746g(AttributeSet attributeSet) {
        super.mo38746g(attributeSet);
        this.f2628u = new C2122a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C2148f.f2813a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C2148f.f2876j1) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C2148f.f2869i1) {
                    this.f2628u.m38847L0(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == C2148f.f2882k1) {
                    this.f2628u.m38845N0(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
        }
        this.f2791n = this.f2628u;
        m38751m();
    }

    public int getMargin() {
        return this.f2628u.m38849J0();
    }

    public int getType() {
        return this.f2626s;
    }

    @Override // androidx.constraintlayout.widget.AbstractC2143b
    /* renamed from: h */
    public void mo38756h(ConstraintWidget constraintWidget, boolean z) {
        m38810o(constraintWidget, this.f2626s, z);
    }

    /* renamed from: n */
    public boolean m38811n() {
        return this.f2628u.m38851H0();
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f2628u.m38847L0(z);
    }

    public void setDpMargin(int i) {
        C2122a aVar = this.f2628u;
        aVar.m38845N0((int) ((i * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i) {
        this.f2628u.m38845N0(i);
    }

    public void setType(int i) {
        this.f2626s = i;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
