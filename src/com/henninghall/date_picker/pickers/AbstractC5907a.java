package com.henninghall.date_picker.pickers;

import android.graphics.Paint;
import android.view.View;

/* renamed from: com.henninghall.date_picker.pickers.a */
/* loaded from: classes6.dex */
public interface AbstractC5907a {

    /* renamed from: com.henninghall.date_picker.pickers.a$a */
    /* loaded from: classes6.dex */
    public interface AbstractC0168a {
        /* renamed from: a */
        void mo25540a();
    }

    /* renamed from: com.henninghall.date_picker.pickers.a$b */
    /* loaded from: classes6.dex */
    public interface AbstractC5908b {
        /* renamed from: a */
        void mo26892a(AbstractC5907a aVar, int i, int i2);
    }

    /* renamed from: a */
    void mo26895a(int i, boolean z);

    /* renamed from: b */
    void mo26894b(int i);

    /* renamed from: c */
    boolean mo26893c();

    String[] getDisplayedValues();

    int getMaxValue();

    int getValue();

    View getView();

    boolean getWrapSelectorWheel();

    void setDisplayedValues(String[] strArr);

    void setDividerHeight(int i);

    void setItemPaddingHorizontal(int i);

    void setMaxValue(int i);

    void setMinValue(int i);

    void setOnValueChangeListenerInScrolling(AbstractC5908b bVar);

    void setOnValueChangedListener(AbstractC0168a aVar);

    void setShownCount(int i);

    void setTextAlign(Paint.Align align);

    void setTextColor(String str);

    void setValue(int i);

    void setVisibility(int i);

    void setWrapSelectorWheel(boolean z);
}
