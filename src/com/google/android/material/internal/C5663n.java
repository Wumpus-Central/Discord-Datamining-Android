package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.google.android.material.internal.n */
/* loaded from: classes3.dex */
public class C5663n {

    /* renamed from: a */
    private static final Comparator<View> f11065a = new C5664a();

    /* renamed from: com.google.android.material.internal.n$a */
    /* loaded from: classes3.dex */
    class C5664a implements Comparator<View> {
        C5664a() {
        }

        /* renamed from: b */
        public int compare(View view, View view2) {
            return view.getTop() - view2.getTop();
        }
    }

    /* renamed from: a */
    private static ImageView m27836a(Toolbar toolbar, Drawable drawable) {
        ImageView imageView;
        Drawable drawable2;
        if (drawable == null) {
            return null;
        }
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if ((childAt instanceof ImageView) && (drawable2 = (imageView = (ImageView) childAt).getDrawable()) != null && drawable2.getConstantState() != null && drawable2.getConstantState().equals(drawable.getConstantState())) {
                return imageView;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static ImageView m27835b(Toolbar toolbar) {
        return m27836a(toolbar, toolbar.getLogo());
    }

    /* renamed from: c */
    public static TextView m27834c(Toolbar toolbar) {
        List<TextView> d = m27833d(toolbar, toolbar.getSubtitle());
        if (d.isEmpty()) {
            return null;
        }
        return (TextView) Collections.max(d, f11065a);
    }

    /* renamed from: d */
    private static List<TextView> m27833d(Toolbar toolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public static TextView m27832e(Toolbar toolbar) {
        List<TextView> d = m27833d(toolbar, toolbar.getTitle());
        if (d.isEmpty()) {
            return null;
        }
        return (TextView) Collections.min(d, f11065a);
    }
}
