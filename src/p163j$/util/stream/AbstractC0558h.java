package p163j$.util.stream;

import java.util.Iterator;
import p163j$.util.Spliterator;

/* renamed from: j$.util.stream.h */
/* loaded from: classes2.dex */
public interface AbstractC0558h extends AutoCloseable {
    @Override // java.lang.AutoCloseable
    void close();

    boolean isParallel();

    Iterator iterator();

    AbstractC0558h onClose(Runnable runnable);

    AbstractC0558h parallel();

    AbstractC0558h sequential();

    Spliterator spliterator();

    AbstractC0558h unordered();
}
