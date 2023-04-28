package p163j$.util.stream;

import p163j$.util.Spliterator;
import p163j$.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.H0 */
/* loaded from: classes2.dex */
public final class C9349H0 extends C9357J0 {

    /* renamed from: k */
    public static final /* synthetic */ int f20499k = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9349H0(int i, Spliterator spliterator, AbstractC0606t0 t0Var) {
        super(t0Var, spliterator, new C0528b(27), new C0528b(28));
        if (i == 1) {
            super(t0Var, spliterator, new C0528b(29), new C9353I0(0));
        } else if (i != 2) {
        } else {
            super(t0Var, spliterator, new C9353I0(1), new C9353I0(2));
        }
    }

    public /* synthetic */ C9349H0(Spliterator spliterator, IntFunction intFunction, AbstractC0606t0 t0Var) {
        super(t0Var, spliterator, new C0523a(2, intFunction), new C9353I0(3));
    }
}
