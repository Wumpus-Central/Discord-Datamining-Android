package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.C5378d;
import com.google.android.gms.tasks.TaskCompletionSource;
import p365u9.C13217c;
import p384v9.C13456a;
import p384v9.C13456a.AbstractC13457b;

/* renamed from: com.google.android.gms.common.api.internal.f */
/* loaded from: classes5.dex */
public abstract class AbstractC5384f<A extends C13456a.AbstractC13457b, L> {

    /* renamed from: a */
    private final C5378d<L> f10146a;

    /* renamed from: b */
    private final C13217c[] f10147b;

    /* renamed from: c */
    private final boolean f10148c;

    /* renamed from: d */
    private final int f10149d;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC5384f(C5378d<L> dVar, C13217c[] cVarArr, boolean z, int i) {
        this.f10146a = dVar;
        this.f10147b = cVarArr;
        this.f10148c = z;
        this.f10149d = i;
    }

    /* renamed from: a */
    public void m29050a() {
        this.f10146a.m29056a();
    }

    /* renamed from: b */
    public C5378d.C5379a<L> m29049b() {
        return this.f10146a.m29055b();
    }

    /* renamed from: c */
    public C13217c[] m29048c() {
        return this.f10147b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo29047d(A a, TaskCompletionSource<Void> taskCompletionSource);

    /* renamed from: e */
    public final int m29046e() {
        return this.f10149d;
    }

    /* renamed from: f */
    public final boolean m29045f() {
        return this.f10148c;
    }
}
