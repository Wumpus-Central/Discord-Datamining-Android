package p163j$.util.stream;

import java.util.Set;
import java.util.stream.Collector;
import p163j$.util.function.BiConsumer;
import p163j$.util.function.C0488c;
import p163j$.util.function.C9309g0;
import p163j$.util.function.Function;

/* renamed from: j$.util.stream.j */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0566j implements AbstractC0570k {

    /* renamed from: a */
    public final /* synthetic */ Collector f20676a;

    private /* synthetic */ C0566j(Collector collector) {
        this.f20676a = collector;
    }

    /* renamed from: d */
    public static /* synthetic */ C0566j m16347d(Collector collector) {
        if (collector == null) {
            return null;
        }
        return new C0566j(collector);
    }

    /* renamed from: a */
    public final /* synthetic */ BiConsumer m16350a() {
        return BiConsumer.VivifiedWrapper.convert(this.f20676a.accumulator());
    }

    /* renamed from: b */
    public final /* synthetic */ Set m16349b() {
        return this.f20676a.characteristics();
    }

    /* renamed from: c */
    public final /* synthetic */ C0488c m16348c() {
        return C0488c.m16530a(this.f20676a.combiner());
    }

    /* renamed from: e */
    public final /* synthetic */ Function m16346e() {
        return Function.VivifiedWrapper.convert(this.f20676a.finisher());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0566j) {
            obj = ((C0566j) obj).f20676a;
        }
        return this.f20676a.equals(obj);
    }

    /* renamed from: f */
    public final /* synthetic */ C9309g0 m16345f() {
        return C9309g0.m16525a(this.f20676a.supplier());
    }

    public final /* synthetic */ int hashCode() {
        return this.f20676a.hashCode();
    }
}
