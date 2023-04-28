package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.app.C1543k;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C1650d;
import androidx.appcompat.widget.C1660e;
import androidx.appcompat.widget.C1663f;
import androidx.appcompat.widget.C1713r;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.C5751i;
import com.google.android.material.textview.MaterialTextView;
import p135hb.C7980a;
import p352tb.C13051a;

/* loaded from: classes3.dex */
public class MaterialComponentsViewInflater extends C1543k {
    @Override // androidx.appcompat.app.C1543k
    /* renamed from: c */
    protected C1650d mo27429c(Context context, AttributeSet attributeSet) {
        return new C5751i(context, attributeSet);
    }

    @Override // androidx.appcompat.app.C1543k
    /* renamed from: d */
    protected C1660e mo27428d(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // androidx.appcompat.app.C1543k
    /* renamed from: e */
    protected C1663f mo27427e(Context context, AttributeSet attributeSet) {
        return new C7980a(context, attributeSet);
    }

    @Override // androidx.appcompat.app.C1543k
    /* renamed from: k */
    protected C1713r mo27426k(Context context, AttributeSet attributeSet) {
        return new C13051a(context, attributeSet);
    }

    @Override // androidx.appcompat.app.C1543k
    /* renamed from: o */
    protected AppCompatTextView mo27425o(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
