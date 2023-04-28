package androidx.core.widget;

import android.widget.ListView;

/* renamed from: androidx.core.widget.i */
/* loaded from: classes.dex */
public class C2797i extends AbstractView$OnTouchListenerC2781a {

    /* renamed from: C */
    private final ListView f35674C;

    public C2797i(ListView listView) {
        super(listView);
        this.f35674C = listView;
    }

    @Override // androidx.core.widget.AbstractView$OnTouchListenerC2781a
    /* renamed from: a */
    public boolean mo36702a(int i) {
        return false;
    }

    @Override // androidx.core.widget.AbstractView$OnTouchListenerC2781a
    /* renamed from: b */
    public boolean mo36701b(int i) {
        ListView listView = this.f35674C;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i2 = firstVisiblePosition + childCount;
        if (i > 0) {
            if (i2 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else if (i >= 0) {
            return false;
        } else {
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.core.widget.AbstractView$OnTouchListenerC2781a
    /* renamed from: j */
    public void mo36700j(int i, int i2) {
        C2798j.m36698b(this.f35674C, i2);
    }
}
