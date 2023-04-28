package p140hg;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9914r;
import kotlin.jvm.internal.C9951f0;
import kotlin.jvm.internal.C9971q;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import p107fg.AbstractC7139c;
import p107fg.AbstractC7150i;
import p158ig.C8418e0;
import p158ig.C8430h0;
import p268og.AbstractC11313e;
import p268og.AbstractC11326h;
import p268og.EnumC11317f;

@Metadata(m15074d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\"\"\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003\"\u001c\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m15073d2 = {"Lkotlin/reflect/KType;", "Lkotlin/reflect/KClass;", "b", "(Lkotlin/reflect/KType;)Lkotlin/reflect/KClass;", "getJvmErasure$annotations", "(Lkotlin/reflect/KType;)V", "jvmErasure", "Lfg/c;", "a", "(Lfg/c;)Lkotlin/reflect/KClass;", "kotlin-reflection"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: hg.b */
/* loaded from: classes8.dex */
public final class C8015b {
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static final KClass<?> m20854a(AbstractC7139c cVar) {
        AbstractC11313e eVar;
        KClass<?> b;
        Object W;
        boolean z;
        C9971q.m14633g(cVar, "<this>");
        if (cVar instanceof KClass) {
            return (KClass) cVar;
        }
        if (cVar instanceof AbstractC7150i) {
            List<KType> upperBounds = ((AbstractC7150i) cVar).getUpperBounds();
            Iterator<T> it = upperBounds.iterator();
            while (true) {
                eVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                KType kType = (KType) next;
                C9971q.m14635e(kType, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
                AbstractC11326h p = ((C8418e0) kType).m19799o().mo5172N0().mo4565p();
                if (p instanceof AbstractC11313e) {
                    eVar = (AbstractC11313e) p;
                }
                if (eVar == null || eVar.mo6116g() == EnumC11317f.INTERFACE || eVar.mo6116g() == EnumC11317f.ANNOTATION_CLASS) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    eVar = next;
                    break;
                }
            }
            KType kType2 = (KType) eVar;
            if (kType2 == null) {
                W = C9914r.m14768W(upperBounds);
                kType2 = (KType) W;
            }
            if (kType2 == null || (b = m20853b(kType2)) == null) {
                return C9951f0.m14684b(Object.class);
            }
            return b;
        }
        throw new C8430h0("Cannot calculate JVM erasure for type: " + cVar);
    }

    /* renamed from: b */
    public static final KClass<?> m20853b(KType kType) {
        KClass<?> a;
        C9971q.m14633g(kType, "<this>");
        AbstractC7139c d = kType.mo14594d();
        if (d != null && (a = m20854a(d)) != null) {
            return a;
        }
        throw new C8430h0("Cannot calculate JVM erasure for type: " + kType);
    }
}
