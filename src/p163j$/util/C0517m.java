package p163j$.util;

import p163j$.util.function.AbstractC0494i;
import p163j$.util.function.Consumer;

/* renamed from: j$.util.m */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0517m implements AbstractC0494i {

    /* renamed from: a */
    public final /* synthetic */ Consumer f20439a;

    public /* synthetic */ C0517m(Consumer consumer) {
        this.f20439a = consumer;
    }

    @Override // p163j$.util.function.AbstractC0494i
    public final void accept(double d) {
        this.f20439a.accept(Double.valueOf(d));
    }
}
