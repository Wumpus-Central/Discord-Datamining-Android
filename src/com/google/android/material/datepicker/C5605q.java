package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.C3136g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.google.android.material.datepicker.q */
/* loaded from: classes3.dex */
class C5605q extends LinearLayoutManager {

    /* renamed from: com.google.android.material.datepicker.q$a */
    /* loaded from: classes3.dex */
    class C5606a extends C3136g {
        C5606a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C3136g
        protected float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5605q(Context context, int i, boolean z) {
        super(context, i, z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: R1 */
    public void mo28122R1(RecyclerView recyclerView, RecyclerView.State state, int i) {
        C5606a aVar = new C5606a(recyclerView.getContext());
        aVar.setTargetPosition(i);
        m35481S1(aVar);
    }
}
