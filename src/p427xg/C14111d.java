package p427xg;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.C9905i;
import kotlin.collections.C9906j;
import kotlin.collections.C9911o;
import kotlin.jvm.internal.C9971q;
import p249nh.C11137c;
import p249nh.C11142f;
import p268og.AbstractC11313e;
import p388vh.C13508c;
import pg.AbstractC11666c;
import pg.AbstractC11672g;
import th.AbstractC13104g;
import th.C13099b;
import th.C13109j;

/* renamed from: xg.d */
/* loaded from: classes8.dex */
public final class C14111d extends AbstractC14104a<AbstractC11666c> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14111d(C14161x javaTypeEnhancementState) {
        super(javaTypeEnhancementState);
        C9971q.m14633g(javaTypeEnhancementState, "javaTypeEnhancementState");
    }

    /* renamed from: y */
    private final List<String> m1614y(AbstractC13104g<?> gVar) {
        List<String> i;
        List<String> d;
        if (gVar instanceof C13099b) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC13104g<?> gVar2 : ((C13099b) gVar).mo4590b()) {
                C9911o.m14801y(arrayList, m1614y(gVar2));
            }
            return arrayList;
        } else if (gVar instanceof C13109j) {
            d = C9905i.m14825d(((C13109j) gVar).m4591c().m10769d());
            return d;
        } else {
            i = C9906j.m14820i();
            return i;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u */
    public Iterable<String> mo1622b(AbstractC11666c cVar, boolean z) {
        List<String> list;
        C9971q.m14633g(cVar, "<this>");
        Map<C11142f, AbstractC13104g<?>> a = cVar.mo700a();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<C11142f, AbstractC13104g<?>> entry : a.entrySet()) {
            C11142f key = entry.getKey();
            AbstractC13104g<?> value = entry.getValue();
            if (!z || C9971q.m14638b(key, C14108b0.f31848c)) {
                list = m1614y(value);
            } else {
                list = C9906j.m14820i();
            }
            C9911o.m14801y(arrayList, list);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: v */
    public C11137c mo1621i(AbstractC11666c cVar) {
        C9971q.m14633g(cVar, "<this>");
        return cVar.mo722e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: w */
    public Object mo1620j(AbstractC11666c cVar) {
        C9971q.m14633g(cVar, "<this>");
        AbstractC11313e i = C13508c.m3532i(cVar);
        C9971q.m14636d(i);
        return i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: x */
    public Iterable<AbstractC11666c> mo1619k(AbstractC11666c cVar) {
        List i;
        AbstractC11672g annotations;
        C9971q.m14633g(cVar, "<this>");
        AbstractC11313e i2 = C13508c.m3532i(cVar);
        if (i2 != null && (annotations = i2.getAnnotations()) != null) {
            return annotations;
        }
        i = C9906j.m14820i();
        return i;
    }
}
