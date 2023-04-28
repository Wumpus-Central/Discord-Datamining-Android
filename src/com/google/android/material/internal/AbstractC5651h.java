package com.google.android.material.internal;

import android.widget.Checkable;
import com.google.android.material.internal.AbstractC5651h;

/* renamed from: com.google.android.material.internal.h */
/* loaded from: classes3.dex */
public interface AbstractC5651h<T extends AbstractC5651h<T>> extends Checkable {

    /* renamed from: com.google.android.material.internal.h$a */
    /* loaded from: classes3.dex */
    public interface AbstractC5652a<C> {
        /* renamed from: a */
        void mo27867a(C c, boolean z);
    }

    int getId();

    void setInternalOnCheckedChangeListener(AbstractC5652a<T> aVar);
}
