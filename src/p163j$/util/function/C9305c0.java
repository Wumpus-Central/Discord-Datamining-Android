package p163j$.util.function;

import java.util.function.ObjLongConsumer;

/* renamed from: j$.util.function.c0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C9305c0 implements AbstractC9306d0 {

    /* renamed from: a */
    public final /* synthetic */ ObjLongConsumer f20404a;

    private /* synthetic */ C9305c0(ObjLongConsumer objLongConsumer) {
        this.f20404a = objLongConsumer;
    }

    /* renamed from: a */
    public static /* synthetic */ C9305c0 m16529a(ObjLongConsumer objLongConsumer) {
        if (objLongConsumer == null) {
            return null;
        }
        return new C9305c0(objLongConsumer);
    }

    @Override // p163j$.util.function.AbstractC9306d0
    public final /* synthetic */ void accept(Object obj, long j) {
        this.f20404a.accept(obj, j);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C9305c0) {
            obj = ((C9305c0) obj).f20404a;
        }
        return this.f20404a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20404a.hashCode();
    }
}
