package androidx.recyclerview.widget;

import android.graphics.Canvas;
import android.view.View;
import androidx.core.view.C2733w0;
import p310r1.C12320c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.e */
/* loaded from: classes.dex */
public class C3134e implements ItemTouchUIUtil {

    /* renamed from: a */
    static final ItemTouchUIUtil f4857a = new C3134e();

    C3134e() {
    }

    /* renamed from: e */
    private static float m35125e(RecyclerView recyclerView, View view) {
        int childCount = recyclerView.getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt != view) {
                float w = C2733w0.m36979w(childAt);
                if (w > f) {
                    f = w;
                }
            }
        }
        return f;
    }

    @Override // androidx.recyclerview.widget.ItemTouchUIUtil
    /* renamed from: a */
    public void mo35129a(View view) {
        int i = C12320c.f27671a;
        Object tag = view.getTag(i);
        if (tag instanceof Float) {
            C2733w0.m36974y0(view, ((Float) tag).floatValue());
        }
        view.setTag(i, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    @Override // androidx.recyclerview.widget.ItemTouchUIUtil
    /* renamed from: b */
    public void mo35128b(View view) {
    }

    @Override // androidx.recyclerview.widget.ItemTouchUIUtil
    /* renamed from: c */
    public void mo35127c(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
        if (z) {
            int i2 = C12320c.f27671a;
            if (view.getTag(i2) == null) {
                Float valueOf = Float.valueOf(C2733w0.m36979w(view));
                C2733w0.m36974y0(view, m35125e(recyclerView, view) + 1.0f);
                view.setTag(i2, valueOf);
            }
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }

    @Override // androidx.recyclerview.widget.ItemTouchUIUtil
    /* renamed from: d */
    public void mo35126d(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
    }
}
