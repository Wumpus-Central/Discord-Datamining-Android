package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.TaskCompletionSource;
import p365u9.C13217c;
import p384v9.C13456a;
import p384v9.C13456a.AbstractC13457b;
import p400w9.AbstractC13827i;
import p400w9.C13822f0;
import p420x9.C14004p;

/* renamed from: com.google.android.gms.common.api.internal.h */
/* loaded from: classes5.dex */
public abstract class AbstractC5389h<A extends C13456a.AbstractC13457b, ResultT> {

    /* renamed from: a */
    private final C13217c[] f10162a;

    /* renamed from: b */
    private final boolean f10163b;

    /* renamed from: c */
    private final int f10164c;

    /* renamed from: com.google.android.gms.common.api.internal.h$a */
    /* loaded from: classes5.dex */
    public static class C5390a<A extends C13456a.AbstractC13457b, ResultT> {

        /* renamed from: a */
        private AbstractC13827i<A, TaskCompletionSource<ResultT>> f10165a;

        /* renamed from: c */
        private C13217c[] f10167c;

        /* renamed from: b */
        private boolean f10166b = true;

        /* renamed from: d */
        private int f10168d = 0;

        /* synthetic */ C5390a(C13822f0 f0Var) {
        }

        /* renamed from: a */
        public AbstractC5389h<A, ResultT> m29031a() {
            C14004p.m2059b(this.f10165a != null, "execute parameter required");
            return new C5377c0(this, this.f10167c, this.f10166b, this.f10168d);
        }

        /* renamed from: b */
        public C5390a<A, ResultT> m29030b(AbstractC13827i<A, TaskCompletionSource<ResultT>> iVar) {
            this.f10165a = iVar;
            return this;
        }

        /* renamed from: c */
        public C5390a<A, ResultT> m29029c(boolean z) {
            this.f10166b = z;
            return this;
        }

        /* renamed from: d */
        public C5390a<A, ResultT> m29028d(C13217c... cVarArr) {
            this.f10167c = cVarArr;
            return this;
        }

        /* renamed from: e */
        public C5390a<A, ResultT> m29027e(int i) {
            this.f10168d = i;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC5389h(C13217c[] cVarArr, boolean z, int i) {
        this.f10162a = cVarArr;
        boolean z2 = false;
        if (cVarArr != null && z) {
            z2 = true;
        }
        this.f10163b = z2;
        this.f10164c = i;
    }

    /* renamed from: a */
    public static <A extends C13456a.AbstractC13457b, ResultT> C5390a<A, ResultT> m29036a() {
        return new C5390a<>(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo29035b(A a, TaskCompletionSource<ResultT> taskCompletionSource);

    /* renamed from: c */
    public boolean m29034c() {
        return this.f10163b;
    }

    /* renamed from: d */
    public final int m29033d() {
        return this.f10164c;
    }

    /* renamed from: e */
    public final C13217c[] m29032e() {
        return this.f10162a;
    }
}
