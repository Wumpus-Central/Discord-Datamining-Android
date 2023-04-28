package bi;

import eg.C6884j;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kh.AbstractC9869a;
import kh.AbstractC9874c;
import kotlin.collections.C9907k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9971q;
import p159ih.C8544c;
import p159ih.C8578m;
import p249nh.C11136b;
import p267of.C11288u;
import p268og.AbstractC11299a1;

/* renamed from: bi.y */
/* loaded from: classes8.dex */
public final class C3614y implements AbstractC3578h {

    /* renamed from: a */
    private final AbstractC9874c f5898a;

    /* renamed from: b */
    private final AbstractC9869a f5899b;

    /* renamed from: c */
    private final Function1<C11136b, AbstractC11299a1> f5900c;

    /* renamed from: d */
    private final Map<C11136b, C8544c> f5901d;

    /* JADX WARN: Multi-variable type inference failed */
    public C3614y(C8578m proto, AbstractC9874c nameResolver, AbstractC9869a metadataVersion, Function1<? super C11136b, ? extends AbstractC11299a1> classSource) {
        int t;
        int d;
        int c;
        C9971q.m14633g(proto, "proto");
        C9971q.m14633g(nameResolver, "nameResolver");
        C9971q.m14633g(metadataVersion, "metadataVersion");
        C9971q.m14633g(classSource, "classSource");
        this.f5898a = nameResolver;
        this.f5899b = metadataVersion;
        this.f5900c = classSource;
        List<C8544c> K = proto.m19012K();
        C9971q.m14634f(K, "proto.class_List");
        t = C9907k.m14809t(K, 10);
        d = C11288u.m10255d(t);
        c = C6884j.m23961c(d, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(c);
        for (Object obj : K) {
            linkedHashMap.put(C3613x.m33980a(this.f5898a, ((C8544c) obj).m19440F0()), obj);
        }
        this.f5901d = linkedHashMap;
    }

    @Override // bi.AbstractC3578h
    /* renamed from: a */
    public C3577g mo21860a(C11136b classId) {
        C9971q.m14633g(classId, "classId");
        C8544c cVar = this.f5901d.get(classId);
        if (cVar == null) {
            return null;
        }
        return new C3577g(this.f5898a, cVar, this.f5899b, this.f5900c.invoke(classId));
    }

    /* renamed from: b */
    public final Collection<C11136b> m33978b() {
        return this.f5901d.keySet();
    }
}
