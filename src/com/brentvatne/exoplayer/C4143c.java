package com.brentvatne.exoplayer;

import android.content.Context;
import com.google.android.exoplayer2.upstream.AbstractC5318g;
import com.google.android.exoplayer2.upstream.C5309d;
import p081e9.C6781o;

/* renamed from: com.brentvatne.exoplayer.c */
/* loaded from: classes.dex */
public class C4143c implements AbstractC4147e {

    /* renamed from: a */
    private final C6781o f6941a;

    public C4143c(Context context) {
        this.f6941a = new C6781o.C6783b(context).m24332a();
    }

    @Override // com.brentvatne.exoplayer.AbstractC4147e
    /* renamed from: a */
    public AbstractC5318g mo32642a(int i) {
        return new C5309d(i);
    }

    @Override // com.brentvatne.exoplayer.AbstractC4147e
    /* renamed from: b */
    public C6781o mo32641b() {
        return this.f6941a;
    }
}
