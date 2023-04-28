package kotlin.collections;

import java.util.Collections;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import pf.C11663h;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0004\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0005H\u0001\u001a\"\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0001¨\u0006\n"}, m15073d2 = {"T", "element", "", "c", "(Ljava/lang/Object;)Ljava/util/Set;", "E", "", "b", "builder", "a", "kotlin-stdlib"}, m15072k = 5, m15071mv = {1, 8, 0}, m15068xs = "kotlin/collections/SetsKt")
/* renamed from: kotlin.collections.v */
/* loaded from: classes8.dex */
public class C9920v {
    /* renamed from: a */
    public static <E> Set<E> m14725a(Set<E> builder) {
        C9971q.m14633g(builder, "builder");
        return ((C11663h) builder).m9058b();
    }

    /* renamed from: b */
    public static <E> Set<E> m14724b() {
        return new C11663h();
    }

    /* renamed from: c */
    public static <T> Set<T> m14723c(T t) {
        Set<T> singleton = Collections.singleton(t);
        C9971q.m14634f(singleton, "singleton(element)");
        return singleton;
    }
}
