package p448yh;

import java.util.Collection;
import kotlin.jvm.functions.Function1;
import p249nh.C11142f;
import p268og.AbstractC11326h;
import p268og.AbstractC11346m;
import p406wg.AbstractC13878b;

/* renamed from: yh.k */
/* loaded from: classes8.dex */
public interface AbstractC14416k {

    /* renamed from: yh.k$a */
    /* loaded from: classes8.dex */
    public static final class C14417a {
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public static /* synthetic */ Collection m645a(AbstractC14416k kVar, C14403d dVar, Function1 function1, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    dVar = C14403d.f32597o;
                }
                Function1<C11142f, Boolean> function12 = function1;
                if ((i & 2) != 0) {
                    function12 = AbstractC14411h.f32622a.m648a();
                }
                return kVar.mo625f(dVar, function12);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContributedDescriptors");
        }
    }

    /* renamed from: e */
    AbstractC11326h mo636e(C11142f fVar, AbstractC13878b bVar);

    /* renamed from: f */
    Collection<AbstractC11346m> mo625f(C14403d dVar, Function1<? super C11142f, Boolean> function1);
}
