package p163j$.util.function;

import java.util.function.DoubleConsumer;

/* renamed from: j$.util.function.h */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0493h implements AbstractC0494i {

    /* renamed from: a */
    public final /* synthetic */ DoubleConsumer f20412a;

    private /* synthetic */ C0493h(DoubleConsumer doubleConsumer) {
        this.f20412a = doubleConsumer;
    }

    /* renamed from: a */
    public static /* synthetic */ C0493h m16524a(DoubleConsumer doubleConsumer) {
        if (doubleConsumer == null) {
            return null;
        }
        return new C0493h(doubleConsumer);
    }

    @Override // p163j$.util.function.AbstractC0494i
    public final /* synthetic */ void accept(double d) {
        this.f20412a.accept(d);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0493h) {
            obj = ((C0493h) obj).f20412a;
        }
        return this.f20412a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20412a.hashCode();
    }
}
