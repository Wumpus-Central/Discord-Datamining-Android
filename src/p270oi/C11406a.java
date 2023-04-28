package p270oi;

import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.C9971q;
import p286pi.C11768e;
import p448yh.AbstractC14411h;

/* renamed from: oi.a */
/* loaded from: classes8.dex */
public final class C11406a {
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static final <T> Collection<T> m10133a(Collection<? extends T> collection, Collection<? extends T> collection2) {
        C9971q.m14633g(collection2, "collection");
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == 0) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static final C11768e<AbstractC14411h> m10132b(Iterable<? extends AbstractC14411h> scopes) {
        boolean z;
        C9971q.m14633g(scopes, "scopes");
        C11768e<AbstractC14411h> eVar = new C11768e<>();
        for (Object obj : scopes) {
            AbstractC14411h hVar = (AbstractC14411h) obj;
            if (hVar == null || hVar == AbstractC14411h.C14413b.f32626b) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                eVar.add(obj);
            }
        }
        return eVar;
    }
}
