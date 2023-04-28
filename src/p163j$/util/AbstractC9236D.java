package p163j$.util;

/* renamed from: j$.util.D */
/* loaded from: classes2.dex */
public interface AbstractC9236D extends Spliterator {
    void forEachRemaining(Object obj);

    boolean tryAdvance(Object obj);

    @Override // p163j$.util.Spliterator
    AbstractC9236D trySplit();
}
