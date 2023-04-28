package p163j$.lang;

import java.util.Collection;
import p163j$.util.function.Consumer;

/* renamed from: j$.lang.Iterable$-EL */
/* loaded from: classes2.dex */
public final /* synthetic */ class Iterable$EL {
    public static void forEach(Iterable iterable, Consumer consumer) {
        if (iterable instanceof AbstractC9165a) {
            ((AbstractC9165a) iterable).forEach(consumer);
        } else if (iterable instanceof Collection) {
            consumer.getClass();
            for (Object obj : (Collection) iterable) {
                consumer.accept(obj);
            }
        } else {
            Iterable$CC.$default$forEach(iterable, consumer);
        }
    }
}
