package p163j$.util;

import java.io.Serializable;
import java.util.Comparator;
import p163j$.util.function.Function;

/* renamed from: j$.util.b */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0479b implements Comparator, Serializable {

    /* renamed from: a */
    public final /* synthetic */ int f20305a;

    /* renamed from: b */
    public final /* synthetic */ Comparator f20306b;

    /* renamed from: c */
    public final /* synthetic */ Object f20307c;

    public /* synthetic */ C0479b(Comparator comparator, Object obj, int i) {
        this.f20305a = i;
        this.f20306b = comparator;
        this.f20307c = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.f20305a;
        Comparator comparator = this.f20306b;
        Object obj3 = this.f20307c;
        switch (i) {
            case 0:
                Comparator comparator2 = (Comparator) obj3;
                int compare = comparator.compare(obj, obj2);
                return compare != 0 ? compare : comparator2.compare(obj, obj2);
            default:
                Function function = (Function) obj3;
                return comparator.compare(function.apply(obj), function.apply(obj2));
        }
    }
}
