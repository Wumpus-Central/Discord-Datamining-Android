package p163j$.util;

import java.io.Serializable;
import java.util.Comparator;
import p163j$.util.function.Function;
import p163j$.util.function.ToDoubleFunction;
import p163j$.util.function.ToIntFunction;
import p163j$.util.function.ToLongFunction;

/* renamed from: j$.util.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0478a implements Comparator, Serializable {

    /* renamed from: a */
    public final /* synthetic */ int f20303a;

    /* renamed from: b */
    public final /* synthetic */ Object f20304b;

    public /* synthetic */ C0478a(int i, Object obj) {
        this.f20303a = i;
        this.f20304b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.f20303a;
        Object obj3 = this.f20304b;
        switch (i) {
            case 0:
                ToDoubleFunction toDoubleFunction = (ToDoubleFunction) obj3;
                return Double.compare(toDoubleFunction.applyAsDouble(obj), toDoubleFunction.applyAsDouble(obj2));
            case 1:
                ToIntFunction toIntFunction = (ToIntFunction) obj3;
                return Integer.compare(toIntFunction.applyAsInt(obj), toIntFunction.applyAsInt(obj2));
            case 2:
                ToLongFunction toLongFunction = (ToLongFunction) obj3;
                return Long.compare(toLongFunction.applyAsLong(obj), toLongFunction.applyAsLong(obj2));
            default:
                Function function = (Function) obj3;
                return ((Comparable) function.apply(obj)).compareTo(function.apply(obj2));
        }
    }
}
