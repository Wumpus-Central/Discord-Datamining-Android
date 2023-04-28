package p158ig;

import java.util.Comparator;
import kotlin.jvm.functions.Function2;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ig.o */
/* loaded from: classes8.dex */
public class C8492o implements Comparator {

    /* renamed from: k */
    private final Function2 f18478k;

    public C8492o(Function2 function2) {
        this.f18478k = function2;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        int x;
        x = AbstractC8494p.m19669x(this.f18478k, obj, obj2);
        return x;
    }
}
