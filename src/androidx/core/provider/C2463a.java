package androidx.core.provider;

import android.graphics.Typeface;
import android.os.Handler;
import androidx.core.provider.C2470f;
import androidx.core.provider.C2476g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.core.provider.a */
/* loaded from: classes.dex */
public class C2463a {

    /* renamed from: a */
    private final C2476g.C2479c f3389a;

    /* renamed from: b */
    private final Handler f3390b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.provider.a$a */
    /* loaded from: classes.dex */
    public class RunnableC0039a implements Runnable {

        /* renamed from: k */
        final /* synthetic */ C2476g.C2479c f3391k;

        /* renamed from: l */
        final /* synthetic */ Typeface f3392l;

        RunnableC0039a(C2476g.C2479c cVar, Typeface typeface) {
            this.f3391k = cVar;
            this.f3392l = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3391k.mo37667b(this.f3392l);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.provider.a$b */
    /* loaded from: classes.dex */
    public class RunnableC2464b implements Runnable {

        /* renamed from: k */
        final /* synthetic */ C2476g.C2479c f3394k;

        /* renamed from: l */
        final /* synthetic */ int f3395l;

        RunnableC2464b(C2476g.C2479c cVar, int i) {
            this.f3394k = cVar;
            this.f3395l = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3394k.mo37668a(this.f3395l);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2463a(C2476g.C2479c cVar, Handler handler) {
        this.f3389a = cVar;
        this.f3390b = handler;
    }

    /* renamed from: a */
    private void m37710a(int i) {
        this.f3390b.post(new RunnableC2464b(this.f3389a, i));
    }

    /* renamed from: c */
    private void m37708c(Typeface typeface) {
        this.f3390b.post(new RunnableC0039a(this.f3389a, typeface));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m37709b(C2470f.C2475e eVar) {
        if (eVar.m37681a()) {
            m37708c(eVar.f3418a);
        } else {
            m37710a(eVar.f3419b);
        }
    }
}
