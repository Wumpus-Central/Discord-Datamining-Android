package p163j$.util.function;

import java.util.function.ObjIntConsumer;

/* renamed from: j$.util.function.a0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C9303a0 implements AbstractC9304b0 {

    /* renamed from: a */
    public final /* synthetic */ ObjIntConsumer f20400a;

    private /* synthetic */ C9303a0(ObjIntConsumer objIntConsumer) {
        this.f20400a = objIntConsumer;
    }

    /* renamed from: b */
    public static /* synthetic */ C9303a0 m16531b(ObjIntConsumer objIntConsumer) {
        if (objIntConsumer == null) {
            return null;
        }
        return new C9303a0(objIntConsumer);
    }

    @Override // p163j$.util.function.AbstractC9304b0
    /* renamed from: a */
    public final /* synthetic */ void mo16406a(int i, Object obj) {
        this.f20400a.accept(obj, i);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C9303a0) {
            obj = ((C9303a0) obj).f20400a;
        }
        return this.f20400a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20400a.hashCode();
    }
}
