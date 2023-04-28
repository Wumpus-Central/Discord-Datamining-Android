package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.widget.C2800k;
import p052d.C6388j;

/* renamed from: androidx.appcompat.widget.p */
/* loaded from: classes.dex */
class C1702p extends PopupWindow {

    /* renamed from: b */
    private static final boolean f1430b = false;

    /* renamed from: a */
    private boolean f1431a;

    public C1702p(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m40101a(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    private void m40101a(Context context, AttributeSet attributeSet, int i, int i2) {
        C1698n1 v = C1698n1.m40105v(context, attributeSet, C6388j.f37901Y1, i, i2);
        int i3 = C6388j.f13238a2;
        if (v.m40108s(i3)) {
            m40100b(v.m40126a(i3, false));
        }
        setBackgroundDrawable(v.m40120g(C6388j.f37905Z1));
        v.m40104w();
    }

    /* renamed from: b */
    private void m40100b(boolean z) {
        if (f1430b) {
            this.f1431a = z;
        } else {
            C2800k.m36695a(this, z);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2) {
        if (f1430b && this.f1431a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i, int i2, int i3, int i4) {
        if (f1430b && this.f1431a) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (f1430b && this.f1431a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }
}
