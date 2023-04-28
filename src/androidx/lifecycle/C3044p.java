package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;
import p203l.C10297b;

/* renamed from: androidx.lifecycle.p */
/* loaded from: classes.dex */
public class C3044p<T> extends MutableLiveData<T> {

    /* renamed from: l */
    private C10297b<LiveData<?>, C3045a<?>> f4474l = new C10297b<>();

    /* renamed from: androidx.lifecycle.p$a */
    /* loaded from: classes.dex */
    private static class C3045a<V> implements Observer<V> {

        /* renamed from: a */
        final LiveData<V> f4475a;

        /* renamed from: b */
        final Observer<? super V> f4476b;

        /* renamed from: c */
        int f4477c = -1;

        C3045a(LiveData<V> liveData, Observer<? super V> observer) {
            this.f4475a = liveData;
            this.f4476b = observer;
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a */
        public void mo3067a(V v) {
            if (this.f4477c != this.f4475a.m35823g()) {
                this.f4477c = this.f4475a.m35823g();
                this.f4476b.mo3067a(v);
            }
        }

        /* renamed from: b */
        void m35761b() {
            this.f4475a.m35820j(this);
        }

        /* renamed from: c */
        void m35760c() {
            this.f4475a.mo35727n(this);
        }
    }

    @Override // androidx.lifecycle.LiveData
    /* renamed from: k */
    protected void mo35729k() {
        Iterator<Map.Entry<LiveData<?>, C3045a<?>>> it = this.f4474l.iterator();
        while (it.hasNext()) {
            it.next().getValue().m35761b();
        }
    }

    @Override // androidx.lifecycle.LiveData
    /* renamed from: l */
    protected void mo35728l() {
        Iterator<Map.Entry<LiveData<?>, C3045a<?>>> it = this.f4474l.iterator();
        while (it.hasNext()) {
            it.next().getValue().m35760c();
        }
    }

    /* renamed from: p */
    public <S> void m35763p(LiveData<S> liveData, Observer<? super S> observer) {
        C3045a<?> aVar = new C3045a<>(liveData, observer);
        C3045a<?> i = this.f4474l.mo13665i(liveData, aVar);
        if (i != null && i.f4476b != observer) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        } else if (i == null && m35822h()) {
            aVar.m35761b();
        }
    }

    /* renamed from: q */
    public <S> void m35762q(LiveData<S> liveData) {
        C3045a<?> j = this.f4474l.mo13664j(liveData);
        if (j != null) {
            j.m35760c();
        }
    }
}
