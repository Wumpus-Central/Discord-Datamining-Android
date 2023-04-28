package p163j$.util.stream;

import java.util.Comparator;
import p163j$.util.Spliterator;
import p163j$.util.concurrent.ConcurrentHashMap;
import p163j$.util.function.Consumer;

/* renamed from: j$.util.stream.b3 */
/* loaded from: classes2.dex */
final class C0532b3 implements Spliterator, Consumer {

    /* renamed from: d */
    private static final Object f20618d = new Object();

    /* renamed from: a */
    private final Spliterator f20619a;

    /* renamed from: b */
    private final ConcurrentHashMap f20620b;

    /* renamed from: c */
    private Object f20621c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0532b3(Spliterator spliterator) {
        this(spliterator, new ConcurrentHashMap());
    }

    private C0532b3(Spliterator spliterator, ConcurrentHashMap concurrentHashMap) {
        this.f20619a = spliterator;
        this.f20620b = concurrentHashMap;
    }

    @Override // p163j$.util.function.Consumer
    public final void accept(Object obj) {
        this.f20621c = obj;
    }

    @Override // p163j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return consumer.getClass();
    }

    @Override // p163j$.util.Spliterator
    public final int characteristics() {
        return (this.f20619a.characteristics() & (-16469)) | 1;
    }

    @Override // p163j$.util.Spliterator
    public final long estimateSize() {
        return this.f20619a.estimateSize();
    }

    @Override // p163j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        this.f20619a.forEachRemaining(new C0578m(6, this, consumer));
    }

    @Override // p163j$.util.Spliterator
    public final Comparator getComparator() {
        return this.f20619a.getComparator();
    }

    @Override // p163j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    @Override // p163j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public final void m16388i(Consumer consumer, Object obj) {
        if (this.f20620b.putIfAbsent(obj != null ? obj : f20618d, Boolean.TRUE) == null) {
            consumer.accept(obj);
        }
    }

    @Override // p163j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        while (this.f20619a.tryAdvance(this)) {
            Object obj = this.f20621c;
            if (obj == null) {
                obj = f20618d;
            }
            if (this.f20620b.putIfAbsent(obj, Boolean.TRUE) == null) {
                consumer.accept(this.f20621c);
                this.f20621c = null;
                return true;
            }
        }
        return false;
    }

    @Override // p163j$.util.Spliterator
    public final Spliterator trySplit() {
        Spliterator trySplit = this.f20619a.trySplit();
        if (trySplit != null) {
            return new C0532b3(trySplit, this.f20620b);
        }
        return null;
    }
}
