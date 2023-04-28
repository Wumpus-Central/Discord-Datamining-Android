package com.google.android.gms.common.api.internal;

import android.os.Looper;
import java.util.concurrent.Executor;
import p063da.ExecutorC6418a;
import p420x9.C14004p;

/* renamed from: com.google.android.gms.common.api.internal.d */
/* loaded from: classes5.dex */
public final class C5378d<L> {

    /* renamed from: a */
    private final Executor f10140a;

    /* renamed from: b */
    private volatile L f10141b;

    /* renamed from: c */
    private volatile C5379a<L> f10142c;

    /* renamed from: com.google.android.gms.common.api.internal.d$a */
    /* loaded from: classes5.dex */
    public static final class C5379a<L> {

        /* renamed from: a */
        private final L f10143a;

        /* renamed from: b */
        private final String f10144b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C5379a(L l, String str) {
            this.f10143a = l;
            this.f10144b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5379a)) {
                return false;
            }
            C5379a aVar = (C5379a) obj;
            if (this.f10143a != aVar.f10143a || !this.f10144b.equals(aVar.f10144b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f10143a) * 31) + this.f10144b.hashCode();
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.d$b */
    /* loaded from: classes5.dex */
    public interface AbstractC5380b<L> {
        /* renamed from: a */
        void mo6569a(L l);

        /* renamed from: b */
        void mo6580b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5378d(Looper looper, L l, String str) {
        this.f10140a = new ExecutorC6418a(looper);
        this.f10141b = (L) C14004p.m2050k(l, "Listener must not be null");
        this.f10142c = new C5379a<>(l, C14004p.m2055f(str));
    }

    /* renamed from: a */
    public void m29056a() {
        this.f10141b = null;
        this.f10142c = null;
    }

    /* renamed from: b */
    public C5379a<L> m29055b() {
        return this.f10142c;
    }

    /* renamed from: c */
    public void m29054c(final AbstractC5380b<? super L> bVar) {
        C14004p.m2050k(bVar, "Notifier must not be null");
        this.f10140a.execute(new Runnable() { // from class: com.google.android.gms.common.api.internal.x
            @Override // java.lang.Runnable
            public final void run() {
                C5378d.this.m29053d(bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final void m29053d(AbstractC5380b<? super L> bVar) {
        Object obj = (L) this.f10141b;
        if (obj == null) {
            bVar.mo6580b();
            return;
        }
        try {
            bVar.mo6569a(obj);
        } catch (RuntimeException e) {
            bVar.mo6580b();
            throw e;
        }
    }
}
