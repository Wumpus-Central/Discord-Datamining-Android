package p163j$.util.function;

import java.util.function.LongConsumer;

/* renamed from: j$.util.function.L */
/* loaded from: classes2.dex */
public final /* synthetic */ class C9289L implements AbstractC9290M {

    /* renamed from: a */
    public final /* synthetic */ LongConsumer f20387a;

    private /* synthetic */ C9289L(LongConsumer longConsumer) {
        this.f20387a = longConsumer;
    }

    /* renamed from: a */
    public static /* synthetic */ C9289L m16542a(LongConsumer longConsumer) {
        if (longConsumer == null) {
            return null;
        }
        return new C9289L(longConsumer);
    }

    @Override // p163j$.util.function.AbstractC9290M
    public final /* synthetic */ void accept(long j) {
        this.f20387a.accept(j);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C9289L) {
            obj = ((C9289L) obj).f20387a;
        }
        return this.f20387a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20387a.hashCode();
    }
}
