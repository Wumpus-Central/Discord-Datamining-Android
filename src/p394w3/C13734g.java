package p394w3;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: w3.g */
/* loaded from: classes7.dex */
public class C13734g<E> extends HashSet<E> {
    private C13734g(Set<E> set) {
        super(set);
    }

    /* renamed from: a */
    public static <E> C13734g<E> m2850a(E... eArr) {
        HashSet hashSet = new HashSet(eArr.length);
        Collections.addAll(hashSet, eArr);
        return new C13734g<>(hashSet);
    }
}
