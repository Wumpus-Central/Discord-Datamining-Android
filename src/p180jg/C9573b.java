package p180jg;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: jg.b */
/* loaded from: classes8.dex */
public class C9573b implements InvocationHandler {

    /* renamed from: a */
    private final Class f21249a;

    /* renamed from: b */
    private final Map f21250b;

    /* renamed from: c */
    private final Lazy f21251c;

    /* renamed from: d */
    private final Lazy f21252d;

    /* renamed from: e */
    private final List f21253e;

    public C9573b(Class cls, Map map, Lazy lazy, Lazy lazy2, List list) {
        this.f21249a = cls;
        this.f21250b = map;
        this.f21251c = lazy;
        this.f21252d = lazy2;
        this.f21253e = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        Object i;
        i = C9574c.m15957i(this.f21249a, this.f21250b, this.f21251c, this.f21252d, this.f21253e, obj, method, objArr);
        return i;
    }
}
