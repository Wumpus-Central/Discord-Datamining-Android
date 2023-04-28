package p268og;

import fi.AbstractC7267g0;
import fi.AbstractC7268g1;
import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9971q;

/* renamed from: og.d1 */
/* loaded from: classes8.dex */
public interface AbstractC11311d1 {

    /* renamed from: og.d1$a */
    /* loaded from: classes8.dex */
    public static final class C11312a implements AbstractC11311d1 {

        /* renamed from: a */
        public static final C11312a f25241a = new C11312a();

        private C11312a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p268og.AbstractC11311d1
        /* renamed from: a */
        public Collection<AbstractC7267g0> mo10221a(AbstractC7268g1 currentTypeConstructor, Collection<? extends AbstractC7267g0> superTypes, Function1<? super AbstractC7268g1, ? extends Iterable<? extends AbstractC7267g0>> neighbors, Function1<? super AbstractC7267g0, Unit> reportLoop) {
            C9971q.m14633g(currentTypeConstructor, "currentTypeConstructor");
            C9971q.m14633g(superTypes, "superTypes");
            C9971q.m14633g(neighbors, "neighbors");
            C9971q.m14633g(reportLoop, "reportLoop");
            return superTypes;
        }
    }

    /* renamed from: a */
    Collection<AbstractC7267g0> mo10221a(AbstractC7268g1 g1Var, Collection<? extends AbstractC7267g0> collection, Function1<? super AbstractC7268g1, ? extends Iterable<? extends AbstractC7267g0>> function1, Function1<? super AbstractC7267g0, Unit> function12);
}
