package com.google.android.material.timepicker;

import android.text.InputFilter;
import android.text.Spanned;

/* renamed from: com.google.android.material.timepicker.b */
/* loaded from: classes3.dex */
class C5778b implements InputFilter {

    /* renamed from: a */
    private int f11413a;

    public C5778b(int i) {
        this.f11413a = i;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        try {
            StringBuilder sb2 = new StringBuilder(spanned);
            sb2.replace(i3, i4, charSequence.subSequence(i, i2).toString());
            if (Integer.parseInt(sb2.toString()) <= this.f11413a) {
                return null;
            }
            return "";
        } catch (NumberFormatException unused) {
            return "";
        }
    }
}
