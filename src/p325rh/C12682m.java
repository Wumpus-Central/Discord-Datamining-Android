package p325rh;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.LinkedList;
import kotlin.Unit;
import kotlin.collections.C9914r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import p268og.AbstractC11297a;
import p286pi.C11773f;

/* renamed from: rh.m */
/* loaded from: classes8.dex */
public final class C12682m {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rh.m$a */
    /* loaded from: classes8.dex */
    public static final class C12683a extends AbstractC9973s implements Function1<H, Unit> {

        /* renamed from: k */
        final /* synthetic */ C11773f<H> f28533k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12683a(C11773f<H> fVar) {
            super(1);
            this.f28533k = fVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(H it) {
            AbstractCollection abstractCollection = this.f28533k;
            C9971q.m14634f(it, "it");
            abstractCollection.add(it);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static final <H> Collection<H> m5878a(Collection<? extends H> collection, Function1<? super H, ? extends AbstractC11297a> descriptorByHandle) {
        Object U;
        Object q0;
        C9971q.m14633g(collection, "<this>");
        C9971q.m14633g(descriptorByHandle, "descriptorByHandle");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        C11773f a = C11773f.f26275m.m8654a();
        while (!linkedList.isEmpty()) {
            U = C9914r.m14770U(linkedList);
            C11773f a2 = C11773f.f26275m.m8654a();
            Collection<? super H> p = C12669k.m5990p(U, linkedList, descriptorByHandle, new C12683a(a2));
            C9971q.m14634f(p, "conflictedHandles = Smar…nflictedHandles.add(it) }");
            if (p.size() != 1 || !a2.isEmpty()) {
                Object obj = (Object) C12669k.m6006L(p, descriptorByHandle);
                C9971q.m14634f(obj, "selectMostSpecificMember…roup, descriptorByHandle)");
                AbstractC11297a aVar = (AbstractC11297a) descriptorByHandle.invoke(obj);
                for (Object it : p) {
                    C9971q.m14634f(it, "it");
                    if (!C12669k.m6016B(aVar, (AbstractC11297a) descriptorByHandle.invoke(it))) {
                        a2.add(it);
                    }
                }
                if (!a2.isEmpty()) {
                    a.addAll(a2);
                }
                a.add(obj);
            } else {
                q0 = C9914r.m14748q0(p);
                C9971q.m14634f(q0, "overridableGroup.single()");
                a.add(q0);
            }
        }
        return a;
    }
}
