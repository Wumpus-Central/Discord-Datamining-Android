package com.google.android.exoplayer2;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import p119g9.C7557q0;
import p153i8.AbstractC8285q0;

/* renamed from: com.google.android.exoplayer2.s0 */
/* loaded from: classes7.dex */
final class C5222s0 extends AbstractC5162a {

    /* renamed from: e */
    private final int f9354e;

    /* renamed from: f */
    private final int f9355f;

    /* renamed from: g */
    private final int[] f9356g;

    /* renamed from: h */
    private final int[] f9357h;

    /* renamed from: i */
    private final Timeline[] f9358i;

    /* renamed from: j */
    private final Object[] f9359j;

    /* renamed from: k */
    private final HashMap<Object, Integer> f9360k = new HashMap<>();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5222s0(Collection<? extends AbstractC5206n0> collection, AbstractC8285q0 q0Var) {
        super(false, q0Var);
        int i = 0;
        int size = collection.size();
        this.f9356g = new int[size];
        this.f9357h = new int[size];
        this.f9358i = new Timeline[size];
        this.f9359j = new Object[size];
        int i2 = 0;
        int i3 = 0;
        for (AbstractC5206n0 n0Var : collection) {
            this.f9358i[i3] = n0Var.mo30035b();
            this.f9357h[i3] = i;
            this.f9356g[i3] = i2;
            i += this.f9358i[i3].mo20022p();
            i2 += this.f9358i[i3].mo20025i();
            this.f9359j[i3] = n0Var.mo30036a();
            this.f9360k.put(this.f9359j[i3], Integer.valueOf(i3));
            i3++;
        }
        this.f9354e = i;
        this.f9355f = i2;
    }

    @Override // com.google.android.exoplayer2.AbstractC5162a
    /* renamed from: A */
    protected int mo30005A(int i) {
        return this.f9357h[i];
    }

    @Override // com.google.android.exoplayer2.AbstractC5162a
    /* renamed from: D */
    protected Timeline mo30004D(int i) {
        return this.f9358i[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public List<Timeline> m30003E() {
        return Arrays.asList(this.f9358i);
    }

    @Override // com.google.android.exoplayer2.Timeline
    /* renamed from: i */
    public int mo20025i() {
        return this.f9355f;
    }

    @Override // com.google.android.exoplayer2.Timeline
    /* renamed from: p */
    public int mo20022p() {
        return this.f9354e;
    }

    @Override // com.google.android.exoplayer2.AbstractC5162a
    /* renamed from: s */
    protected int mo30002s(Object obj) {
        Integer num = this.f9360k.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.exoplayer2.AbstractC5162a
    /* renamed from: t */
    protected int mo30001t(int i) {
        return C7557q0.m22149h(this.f9356g, i + 1, false, false);
    }

    @Override // com.google.android.exoplayer2.AbstractC5162a
    /* renamed from: u */
    protected int mo30000u(int i) {
        return C7557q0.m22149h(this.f9357h, i + 1, false, false);
    }

    @Override // com.google.android.exoplayer2.AbstractC5162a
    /* renamed from: x */
    protected Object mo29999x(int i) {
        return this.f9359j[i];
    }

    @Override // com.google.android.exoplayer2.AbstractC5162a
    /* renamed from: z */
    protected int mo29998z(int i) {
        return this.f9356g[i];
    }
}
