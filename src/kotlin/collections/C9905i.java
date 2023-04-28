package kotlin.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import pf.C11651b;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000&\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0005H\u0001\u001a\"\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0001\u001a3\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\r0\n\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m15073d2 = {"T", "element", "", "d", "(Ljava/lang/Object;)Ljava/util/List;", "E", "", "c", "builder", "a", "", "", "isVarargs", "", "b", "([Ljava/lang/Object;Z)[Ljava/lang/Object;", "kotlin-stdlib"}, m15072k = 5, m15071mv = {1, 8, 0}, m15068xs = "kotlin/collections/CollectionsKt")
/* renamed from: kotlin.collections.i */
/* loaded from: classes8.dex */
public class C9905i {
    /* renamed from: a */
    public static <E> List<E> m14828a(List<E> builder) {
        C9971q.m14633g(builder, "builder");
        return ((C11651b) builder).m9132r();
    }

    /* renamed from: b */
    public static final <T> Object[] m14827b(T[] tArr, boolean z) {
        C9971q.m14633g(tArr, "<this>");
        if (z && C9971q.m14638b(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        C9971q.m14634f(copyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
        return copyOf;
    }

    /* renamed from: c */
    public static <E> List<E> m14826c() {
        return new C11651b();
    }

    /* renamed from: d */
    public static <T> List<T> m14825d(T t) {
        List<T> singletonList = Collections.singletonList(t);
        C9971q.m14634f(singletonList, "singletonList(element)");
        return singletonList;
    }
}
