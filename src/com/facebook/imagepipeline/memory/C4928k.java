package com.facebook.imagepipeline.memory;

import java.util.LinkedList;
import p005a4.C1261b;
import p394w3.C13740j;

/* renamed from: com.facebook.imagepipeline.memory.k */
/* loaded from: classes7.dex */
class C4928k<V> extends C4917c<V> {

    /* renamed from: f */
    private LinkedList<C1261b<V>> f8340f = new LinkedList<>();

    public C4928k(int i, int i2, int i3) {
        super(i, i2, i3, false);
    }

    @Override // com.facebook.imagepipeline.memory.C4917c
    /* renamed from: a */
    void mo31268a(V v) {
        C1261b<V> poll = this.f8340f.poll();
        if (poll == null) {
            poll = new C1261b<>();
        }
        poll.m41514c(v);
        this.f8326c.add(poll);
    }

    @Override // com.facebook.imagepipeline.memory.C4917c
    /* renamed from: g */
    public V mo31267g() {
        C1261b<V> bVar = (C1261b) this.f8326c.poll();
        C13740j.m2834g(bVar);
        V b = bVar.m41515b();
        bVar.m41516a();
        this.f8340f.add(bVar);
        return b;
    }
}
