package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* renamed from: com.google.android.material.datepicker.k */
/* loaded from: classes3.dex */
public final class C5595k<S> extends AbstractC5604p<S> {

    /* renamed from: l */
    private int f10850l;

    /* renamed from: m */
    private AbstractC5571d<S> f10851m;

    /* renamed from: n */
    private C5566a f10852n;

    /* renamed from: com.google.android.material.datepicker.k$a */
    /* loaded from: classes3.dex */
    class C5596a extends AbstractC5603o<S> {
        C5596a() {
        }

        @Override // com.google.android.material.datepicker.AbstractC5603o
        /* renamed from: a */
        public void mo28125a(S s) {
            Iterator<AbstractC5603o<S>> it = C5595k.this.f10875k.iterator();
            while (it.hasNext()) {
                it.next().mo28125a(s);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static <T> C5595k<T> m28159f(AbstractC5571d<T> dVar, int i, C5566a aVar) {
        C5595k<T> kVar = new C5595k<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("DATE_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        kVar.setArguments(bundle);
        return kVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f10850l = bundle.getInt("THEME_RES_ID_KEY");
        this.f10851m = (AbstractC5571d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f10852n = (C5566a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f10851m.m28223G(layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f10850l)), viewGroup, bundle, this.f10852n, new C5596a());
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f10850l);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f10851m);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f10852n);
    }
}
