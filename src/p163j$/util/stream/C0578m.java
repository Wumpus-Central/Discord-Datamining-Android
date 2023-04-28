package p163j$.util.stream;

import java.util.concurrent.atomic.AtomicBoolean;
import p163j$.util.concurrent.ConcurrentHashMap;
import p163j$.util.function.AbstractC0498m;
import p163j$.util.function.AbstractC9280C;
import p163j$.util.function.AbstractC9294Q;
import p163j$.util.function.BiConsumer;
import p163j$.util.function.Consumer;
import p163j$.util.function.Predicate;
import p163j$.util.function.Supplier;

/* renamed from: j$.util.stream.m */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0578m implements Consumer, Supplier {

    /* renamed from: a */
    public final /* synthetic */ int f20692a;

    /* renamed from: b */
    public final /* synthetic */ Object f20693b;

    /* renamed from: c */
    public final /* synthetic */ Object f20694c;

    public /* synthetic */ C0578m(int i, Object obj, Object obj2) {
        this.f20692a = i;
        this.f20693b = obj;
        this.f20694c = obj2;
    }

    @Override // p163j$.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f20692a;
        Object obj2 = this.f20694c;
        Object obj3 = this.f20693b;
        switch (i) {
            case 0:
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj3;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) obj2;
                if (obj == null) {
                    atomicBoolean.set(true);
                    return;
                } else {
                    concurrentHashMap.putIfAbsent(obj, Boolean.TRUE);
                    return;
                }
            case 5:
                ((BiConsumer) obj3).accept(obj2, obj);
                return;
            default:
                ((C0532b3) obj3).m16388i((Consumer) obj2, obj);
                return;
        }
    }

    @Override // p163j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f20692a) {
            case 0:
                return consumer.getClass();
            case 5:
                return consumer.getClass();
            default:
                return consumer.getClass();
        }
    }

    @Override // p163j$.util.function.Supplier
    public final Object get() {
        int i = this.f20692a;
        Object obj = this.f20694c;
        Object obj2 = this.f20693b;
        switch (i) {
            case 1:
                return new C0579m0((AbstractC9280C) obj, (EnumC0595q0) obj2);
            case 2:
                return new C0575l0((Predicate) obj, (EnumC0595q0) obj2);
            case 3:
                return new C0587o0((AbstractC0498m) obj, (EnumC0595q0) obj2);
            default:
                return new C0583n0((AbstractC9294Q) obj, (EnumC0595q0) obj2);
        }
    }
}
