package com.google.android.material.datepicker;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;
import p083eb.C6809h;
import p083eb.C6810i;

/* renamed from: com.google.android.material.datepicker.g */
/* loaded from: classes3.dex */
class C5575g extends BaseAdapter {

    /* renamed from: n */
    private static final int f10789n;

    /* renamed from: k */
    private final Calendar f10790k;

    /* renamed from: l */
    private final int f10791l;

    /* renamed from: m */
    private final int f10792m;

    static {
        f10789n = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public C5575g() {
        Calendar k = C5609t.m28107k();
        this.f10790k = k;
        this.f10791l = k.getMaximum(7);
        this.f10792m = k.getFirstDayOfWeek();
    }

    /* renamed from: b */
    private int m28206b(int i) {
        int i2 = i + this.f10792m;
        int i3 = this.f10791l;
        if (i2 > i3) {
            return i2 - i3;
        }
        return i2;
    }

    /* renamed from: a */
    public Integer getItem(int i) {
        if (i >= this.f10791l) {
            return null;
        }
        return Integer.valueOf(m28206b(i));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f10791l;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"WrongConstant"})
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C6809h.f14632l, viewGroup, false);
        }
        this.f10790k.set(7, m28206b(i));
        textView.setText(this.f10790k.getDisplayName(7, f10789n, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(C6810i.f14648j), this.f10790k.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}
