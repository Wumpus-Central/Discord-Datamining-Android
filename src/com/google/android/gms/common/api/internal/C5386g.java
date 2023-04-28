package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.C5378d;
import com.google.android.gms.tasks.TaskCompletionSource;
import p365u9.C13217c;
import p384v9.C13456a;
import p384v9.C13456a.AbstractC13457b;
import p400w9.AbstractC13827i;
import p400w9.C13812a0;
import p400w9.C13848z;
import p400w9.RunnableC13847y;
import p420x9.C14004p;

/* renamed from: com.google.android.gms.common.api.internal.g */
/* loaded from: classes5.dex */
public class C5386g<A extends C13456a.AbstractC13457b, L> {

    /* renamed from: a */
    public final AbstractC5384f<A, L> f10151a;

    /* renamed from: b */
    public final AbstractC5392i<A, L> f10152b;

    /* renamed from: c */
    public final Runnable f10153c;

    /* renamed from: com.google.android.gms.common.api.internal.g$a */
    /* loaded from: classes5.dex */
    public static class C5387a<A extends C13456a.AbstractC13457b, L> {

        /* renamed from: a */
        private AbstractC13827i<A, TaskCompletionSource<Void>> f10154a;

        /* renamed from: b */
        private AbstractC13827i<A, TaskCompletionSource<Boolean>> f10155b;

        /* renamed from: d */
        private C5378d<L> f10157d;

        /* renamed from: e */
        private C13217c[] f10158e;

        /* renamed from: g */
        private int f10160g;

        /* renamed from: c */
        private Runnable f10156c = RunnableC13847y.f31168k;

        /* renamed from: f */
        private boolean f10159f = true;

        /* synthetic */ C5387a(C13848z zVar) {
        }

        /* renamed from: a */
        public C5386g<A, L> m29043a() {
            boolean z;
            boolean z2;
            boolean z3 = true;
            if (this.f10154a != null) {
                z = true;
            } else {
                z = false;
            }
            C14004p.m2059b(z, "Must set register function");
            if (this.f10155b != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            C14004p.m2059b(z2, "Must set unregister function");
            if (this.f10157d == null) {
                z3 = false;
            }
            C14004p.m2059b(z3, "Must set holder");
            return new C5386g<>(new C5373a0(this, this.f10157d, this.f10158e, this.f10159f, this.f10160g), new C5375b0(this, (C5378d.C5379a) C14004p.m2050k(this.f10157d.m29055b(), "Key must not be null")), this.f10156c, null);
        }

        /* renamed from: b */
        public C5387a<A, L> m29042b(AbstractC13827i<A, TaskCompletionSource<Void>> iVar) {
            this.f10154a = iVar;
            return this;
        }

        /* renamed from: c */
        public C5387a<A, L> m29041c(int i) {
            this.f10160g = i;
            return this;
        }

        /* renamed from: d */
        public C5387a<A, L> m29040d(AbstractC13827i<A, TaskCompletionSource<Boolean>> iVar) {
            this.f10155b = iVar;
            return this;
        }

        /* renamed from: e */
        public C5387a<A, L> m29039e(C5378d<L> dVar) {
            this.f10157d = dVar;
            return this;
        }
    }

    /* synthetic */ C5386g(AbstractC5384f fVar, AbstractC5392i iVar, Runnable runnable, C13812a0 a0Var) {
        this.f10151a = fVar;
        this.f10152b = iVar;
        this.f10153c = runnable;
    }

    /* renamed from: a */
    public static <A extends C13456a.AbstractC13457b, L> C5387a<A, L> m29044a() {
        return new C5387a<>(null);
    }
}
