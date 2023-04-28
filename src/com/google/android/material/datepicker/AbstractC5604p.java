package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* renamed from: com.google.android.material.datepicker.p */
/* loaded from: classes3.dex */
abstract class AbstractC5604p<S> extends Fragment {

    /* renamed from: k */
    protected final LinkedHashSet<AbstractC5603o<S>> f10875k = new LinkedHashSet<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo28124d(AbstractC5603o<S> oVar) {
        return this.f10875k.add(oVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m28123e() {
        this.f10875k.clear();
    }
}
