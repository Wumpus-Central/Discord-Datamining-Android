package p163j$.util.function;

import java.util.function.ObjDoubleConsumer;

/* renamed from: j$.util.function.Y */
/* loaded from: classes2.dex */
public final /* synthetic */ class C9301Y implements AbstractC9302Z {

    /* renamed from: a */
    public final /* synthetic */ ObjDoubleConsumer f20398a;

    private /* synthetic */ C9301Y(ObjDoubleConsumer objDoubleConsumer) {
        this.f20398a = objDoubleConsumer;
    }

    /* renamed from: a */
    public static /* synthetic */ C9301Y m16533a(ObjDoubleConsumer objDoubleConsumer) {
        if (objDoubleConsumer == null) {
            return null;
        }
        return new C9301Y(objDoubleConsumer);
    }

    @Override // p163j$.util.function.AbstractC9302Z
    public final /* synthetic */ void accept(Object obj, double d) {
        this.f20398a.accept(obj, d);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C9301Y) {
            obj = ((C9301Y) obj).f20398a;
        }
        return this.f20398a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20398a.hashCode();
    }
}
