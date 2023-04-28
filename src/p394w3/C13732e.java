package p394w3;

import java.util.ArrayList;
import java.util.Collections;

/* renamed from: w3.e */
/* loaded from: classes7.dex */
public class C13732e<E> extends ArrayList<E> {
    private C13732e(int i) {
        super(i);
    }

    /* renamed from: a */
    public static <E> C13732e<E> m2854a(E... eArr) {
        C13732e<E> eVar = new C13732e<>(eArr.length);
        Collections.addAll(eVar, eArr);
        return eVar;
    }
}
