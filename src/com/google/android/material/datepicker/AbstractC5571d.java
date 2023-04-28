package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.util.C2515e;
import java.util.Collection;

/* renamed from: com.google.android.material.datepicker.d */
/* loaded from: classes3.dex */
public interface AbstractC5571d<S> extends Parcelable {
    /* renamed from: G */
    View m28223G(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, C5566a aVar, AbstractC5603o<S> oVar);

    /* renamed from: I */
    boolean m28222I();

    /* renamed from: J */
    Collection<Long> m28221J();

    /* renamed from: R */
    void m28220R(long j);

    S getSelection();

    /* renamed from: n */
    int m28219n(Context context);

    /* renamed from: x */
    String m28218x(Context context);

    /* renamed from: y */
    Collection<C2515e<Long, Long>> m28217y();
}
