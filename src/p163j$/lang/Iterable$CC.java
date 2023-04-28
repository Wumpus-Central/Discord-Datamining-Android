package p163j$.lang;

import java.util.Iterator;
import p163j$.util.DesugarCollections;
import p163j$.util.function.Consumer;

/* renamed from: j$.lang.Iterable$-CC */
/* loaded from: classes2.dex */
public final /* synthetic */ class Iterable$CC<T> {
    public static void $default$forEach(Iterable iterable, Consumer consumer) {
        if (DesugarCollections.f20258a.isInstance(iterable)) {
            DesugarCollections.m16602c(iterable, consumer);
            return;
        }
        consumer.getClass();
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }
}
