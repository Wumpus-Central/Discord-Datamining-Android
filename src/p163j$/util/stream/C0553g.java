package p163j$.util.stream;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.stream.BaseStream;
import p163j$.util.Spliterator;
import p163j$.util.stream.Stream;

/* renamed from: j$.util.stream.g */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0553g implements BaseStream {

    /* renamed from: a */
    public final /* synthetic */ AbstractC0558h f20658a;

    private /* synthetic */ C0553g(AbstractC0558h hVar) {
        this.f20658a = hVar;
    }

    /* renamed from: l */
    public static /* synthetic */ BaseStream m16368l(AbstractC0558h hVar) {
        if (hVar == null) {
            return null;
        }
        return hVar instanceof AbstractC9328D ? C9323C.m16470l((AbstractC9328D) hVar) : hVar instanceof IntStream ? C0534c0.m16378l((IntStream) hVar) : hVar instanceof AbstractC0571k0 ? C0567j0.m16344l((AbstractC0571k0) hVar) : hVar instanceof Stream ? Stream.Wrapper.convert((Stream) hVar) : new C0553g(hVar);
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f20658a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        AbstractC0558h hVar = this.f20658a;
        if (obj instanceof C0553g) {
            obj = ((C0553g) obj).f20658a;
        }
        return hVar.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20658a.hashCode();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.f20658a.isParallel();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Iterator iterator() {
        return this.f20658a.iterator();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return m16368l(this.f20658a.onClose(runnable));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream parallel() {
        return m16368l(this.f20658a.parallel());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream sequential() {
        return m16368l(this.f20658a.sequential());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Spliterator spliterator() {
        return Spliterator.Wrapper.convert(this.f20658a.spliterator());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        return m16368l(this.f20658a.unordered());
    }
}
