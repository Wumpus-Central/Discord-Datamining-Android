package p177jc;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p300qc.AbstractC12105c;
import tc.AbstractC13053b;

/* renamed from: jc.d0 */
/* loaded from: classes3.dex */
final class C9526d0 extends AbstractC9517a {

    /* renamed from: a */
    private final Set<Class<?>> f21122a;

    /* renamed from: b */
    private final Set<Class<?>> f21123b;

    /* renamed from: c */
    private final Set<Class<?>> f21124c;

    /* renamed from: d */
    private final Set<Class<?>> f21125d;

    /* renamed from: e */
    private final Set<Class<?>> f21126e;

    /* renamed from: f */
    private final Set<Class<?>> f21127f;

    /* renamed from: g */
    private final AbstractC9528e f21128g;

    /* renamed from: jc.d0$a */
    /* loaded from: classes3.dex */
    private static class C9527a implements AbstractC12105c {

        /* renamed from: a */
        private final Set<Class<?>> f21129a;

        /* renamed from: b */
        private final AbstractC12105c f21130b;

        public C9527a(Set<Class<?>> set, AbstractC12105c cVar) {
            this.f21129a = set;
            this.f21130b = cVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9526d0(C9523d<?> dVar, AbstractC9528e eVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (C9548q qVar : dVar.m16090e()) {
            if (qVar.m16023d()) {
                if (qVar.m16021f()) {
                    hashSet4.add(qVar.m16025b());
                } else {
                    hashSet.add(qVar.m16025b());
                }
            } else if (qVar.m16024c()) {
                hashSet3.add(qVar.m16025b());
            } else if (qVar.m16021f()) {
                hashSet5.add(qVar.m16025b());
            } else {
                hashSet2.add(qVar.m16025b());
            }
        }
        if (!dVar.m16087h().isEmpty()) {
            hashSet.add(AbstractC12105c.class);
        }
        this.f21122a = Collections.unmodifiableSet(hashSet);
        this.f21123b = Collections.unmodifiableSet(hashSet2);
        this.f21124c = Collections.unmodifiableSet(hashSet3);
        this.f21125d = Collections.unmodifiableSet(hashSet4);
        this.f21126e = Collections.unmodifiableSet(hashSet5);
        this.f21127f = dVar.m16087h();
        this.f21128g = eVar;
    }

    @Override // p177jc.AbstractC9517a, p177jc.AbstractC9528e
    /* renamed from: a */
    public <T> T mo16062a(Class<T> cls) {
        if (this.f21122a.contains(cls)) {
            T t = (T) this.f21128g.mo16062a(cls);
            if (!cls.equals(AbstractC12105c.class)) {
                return t;
            }
            return (T) new C9527a(this.f21127f, (AbstractC12105c) t);
        }
        throw new C9550s(String.format("Attempting to request an undeclared dependency %s.", cls));
    }

    @Override // p177jc.AbstractC9528e
    /* renamed from: b */
    public <T> AbstractC13053b<Set<T>> mo16061b(Class<T> cls) {
        if (this.f21126e.contains(cls)) {
            return this.f21128g.mo16061b(cls);
        }
        throw new C9550s(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", cls));
    }

    @Override // p177jc.AbstractC9517a, p177jc.AbstractC9528e
    /* renamed from: c */
    public <T> Set<T> mo16060c(Class<T> cls) {
        if (this.f21125d.contains(cls)) {
            return this.f21128g.mo16060c(cls);
        }
        throw new C9550s(String.format("Attempting to request an undeclared dependency Set<%s>.", cls));
    }

    @Override // p177jc.AbstractC9528e
    /* renamed from: d */
    public <T> AbstractC13053b<T> mo16059d(Class<T> cls) {
        if (this.f21123b.contains(cls)) {
            return this.f21128g.mo16059d(cls);
        }
        throw new C9550s(String.format("Attempting to request an undeclared dependency Provider<%s>.", cls));
    }
}
