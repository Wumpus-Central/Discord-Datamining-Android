package com.google.android.flexbox;

import android.view.View;
import java.util.List;

/* renamed from: com.google.android.flexbox.a */
/* loaded from: classes5.dex */
interface AbstractC5346a {
    /* renamed from: b */
    void mo29287b(View view, int i, int i2, C5348c cVar);

    /* renamed from: c */
    int mo29286c(int i, int i2, int i3);

    /* renamed from: e */
    View mo29285e(int i);

    /* renamed from: f */
    int mo29284f(int i, int i2, int i3);

    /* renamed from: g */
    int mo29283g(View view);

    int getAlignContent();

    int getAlignItems();

    int getFlexDirection();

    int getFlexItemCount();

    List<C5348c> getFlexLinesInternal();

    int getFlexWrap();

    int getLargestMainSize();

    int getMaxLine();

    int getPaddingBottom();

    int getPaddingEnd();

    int getPaddingLeft();

    int getPaddingRight();

    int getPaddingStart();

    int getPaddingTop();

    int getSumOfCrossSize();

    /* renamed from: h */
    void mo29282h(C5348c cVar);

    /* renamed from: i */
    View mo29281i(int i);

    /* renamed from: j */
    void mo29280j(int i, View view);

    /* renamed from: k */
    int mo29279k(View view, int i, int i2);

    /* renamed from: l */
    boolean mo29278l();

    void setFlexLines(List<C5348c> list);
}
