package p158ig;

import java.lang.ref.SoftReference;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u0016\u0010\u000b\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0005\u001a\u00028\u00002\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\b¨\u0006\u000e"}, m15073d2 = {"Lig/d;", "V", "Lig/a;", "Ljava/lang/Class;", "key", "a", "(Ljava/lang/Class;)Ljava/lang/Object;", "Lig/e;", "Lig/e;", "classValue", "Lkotlin/Function1;", "compute", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: ig.d */
/* loaded from: classes8.dex */
final class C8415d<V> extends AbstractC8395a<V> {

    /* renamed from: a */
    private volatile C8417e<V> f18354a;

    public C8415d(Function1<? super Class<?>, ? extends V> compute) {
        C9971q.m14633g(compute, "compute");
        this.f18354a = new C8417e<>(compute);
    }

    @Override // p158ig.AbstractC8395a
    /* renamed from: a */
    public V mo19794a(Class<?> key) {
        C9971q.m14633g(key, "key");
        C8417e<V> eVar = this.f18354a;
        V v = (V) ((SoftReference) eVar.get(key)).get();
        if (v != null) {
            return v;
        }
        eVar.remove(key);
        V v2 = (V) ((SoftReference) eVar.get(key)).get();
        if (v2 != null) {
            return v2;
        }
        return eVar.f18355a.invoke(key);
    }
}
