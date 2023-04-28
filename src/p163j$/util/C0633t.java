package p163j$.util;

import p163j$.util.function.AbstractC9290M;
import p163j$.util.function.Consumer;

/* renamed from: j$.util.t */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0633t implements AbstractC9290M {

    /* renamed from: a */
    public final /* synthetic */ Consumer f20799a;

    public /* synthetic */ C0633t(Consumer consumer) {
        this.f20799a = consumer;
    }

    @Override // p163j$.util.function.AbstractC9290M
    public final void accept(long j) {
        this.f20799a.accept(Long.valueOf(j));
    }
}
