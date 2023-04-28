package p448yh;

import fi.AbstractC7267g0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C9906j;
import kotlin.collections.C9911o;
import kotlin.collections.C9914r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9944c0;
import kotlin.jvm.internal.C9951f0;
import kotlin.jvm.internal.C9971q;
import kotlin.reflect.KProperty;
import p087ei.AbstractC6938i;
import p087ei.AbstractC6944n;
import p087ei.C6943m;
import p249nh.C11142f;
import p268og.AbstractC11301b;
import p268og.AbstractC11313e;
import p268og.AbstractC11346m;
import p268og.AbstractC11388u0;
import p268og.AbstractC11397y;
import p268og.AbstractC11404z0;
import p286pi.C11754a;
import p286pi.C11768e;
import p325rh.AbstractC12667i;
import p325rh.C12669k;
import p406wg.AbstractC13878b;
import p448yh.AbstractC14416k;

/* renamed from: yh.e */
/* loaded from: classes8.dex */
public abstract class AbstractC14405e extends AbstractC14414i {

    /* renamed from: d */
    static final /* synthetic */ KProperty<Object>[] f32613d = {C9951f0.m14679g(new C9944c0(C9951f0.m14684b(AbstractC14405e.class), "allDescriptors", "getAllDescriptors()Ljava/util/List;"))};

    /* renamed from: b */
    private final AbstractC11313e f32614b;

    /* renamed from: c */
    private final AbstractC6938i f32615c;

    /* renamed from: yh.e$a */
    /* loaded from: classes8.dex */
    static final class C14406a extends AbstractC9973s implements Function0<List<? extends AbstractC11346m>> {
        C14406a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends AbstractC11346m> invoke() {
            List<? extends AbstractC11346m> o0;
            List<AbstractC11397y> i = AbstractC14405e.this.mo656i();
            o0 = C9914r.m14750o0(i, AbstractC14405e.this.m655j(i));
            return o0;
        }
    }

    /* renamed from: yh.e$b */
    /* loaded from: classes8.dex */
    public static final class C14407b extends AbstractC12667i {

        /* renamed from: a */
        final /* synthetic */ ArrayList<AbstractC11346m> f32617a;

        /* renamed from: b */
        final /* synthetic */ AbstractC14405e f32618b;

        C14407b(ArrayList<AbstractC11346m> arrayList, AbstractC14405e eVar) {
            this.f32617a = arrayList;
            this.f32618b = eVar;
        }

        @Override // p325rh.AbstractC12668j
        /* renamed from: a */
        public void mo652a(AbstractC11301b fakeOverride) {
            C9971q.m14633g(fakeOverride, "fakeOverride");
            C12669k.m6007K(fakeOverride, null);
            this.f32617a.add(fakeOverride);
        }

        @Override // p325rh.AbstractC12667i
        /* renamed from: e */
        protected void mo651e(AbstractC11301b fromSuper, AbstractC11301b fromCurrent) {
            C9971q.m14633g(fromSuper, "fromSuper");
            C9971q.m14633g(fromCurrent, "fromCurrent");
            throw new IllegalStateException(("Conflict in scope of " + this.f32618b.m653l() + ": " + fromSuper + " vs " + fromCurrent).toString());
        }
    }

    public AbstractC14405e(AbstractC6944n storageManager, AbstractC11313e containingClass) {
        C9971q.m14633g(storageManager, "storageManager");
        C9971q.m14633g(containingClass, "containingClass");
        this.f32614b = containingClass;
        this.f32615c = storageManager.mo23898c(new C14406a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: j */
    public final List<AbstractC11346m> m655j(List<? extends AbstractC11397y> list) {
        Collection<? extends AbstractC11301b> collection;
        ArrayList arrayList = new ArrayList(3);
        Collection<AbstractC7267g0> m = this.f32614b.mo6111k().mo4568m();
        C9971q.m14634f(m, "containingClass.typeConstructor.supertypes");
        ArrayList arrayList2 = new ArrayList();
        for (AbstractC7267g0 g0Var : m) {
            C9911o.m14801y(arrayList2, AbstractC14416k.C14417a.m645a(g0Var.mo5161o(), null, null, 3, null));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (obj instanceof AbstractC11301b) {
                arrayList3.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList3) {
            C11142f name = ((AbstractC11301b) obj2).getName();
            Object obj3 = linkedHashMap.get(name);
            if (obj3 == null) {
                obj3 = new ArrayList();
                linkedHashMap.put(name, obj3);
            }
            ((List) obj3).add(obj2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            C11142f fVar = (C11142f) entry.getKey();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj4 : (List) entry.getValue()) {
                Boolean valueOf = Boolean.valueOf(((AbstractC11301b) obj4) instanceof AbstractC11397y);
                Object obj5 = linkedHashMap2.get(valueOf);
                if (obj5 == null) {
                    obj5 = new ArrayList();
                    linkedHashMap2.put(valueOf, obj5);
                }
                ((List) obj5).add(obj4);
            }
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                boolean booleanValue = ((Boolean) entry2.getKey()).booleanValue();
                List list2 = (List) entry2.getValue();
                C12669k kVar = C12669k.f28507f;
                if (booleanValue) {
                    collection = new ArrayList<>();
                    for (Object obj6 : list) {
                        if (C9971q.m14638b(((AbstractC11397y) obj6).getName(), fVar)) {
                            collection.add(obj6);
                        }
                    }
                } else {
                    collection = C9906j.m14820i();
                }
                kVar.m5984v(fVar, list2, collection, this.f32614b, new C14407b(arrayList, this));
            }
        }
        return C11754a.m8687c(arrayList);
    }

    /* renamed from: k */
    private final List<AbstractC11346m> m654k() {
        return (List) C6943m.m23902a(this.f32615c, this, f32613d[0]);
    }

    @Override // p448yh.AbstractC14414i, p448yh.AbstractC14411h
    /* renamed from: a */
    public Collection<AbstractC11388u0> mo627a(C11142f name, AbstractC13878b location) {
        C9971q.m14633g(name, "name");
        C9971q.m14633g(location, "location");
        List<AbstractC11346m> k = m654k();
        C11768e eVar = new C11768e();
        for (Object obj : k) {
            if ((obj instanceof AbstractC11388u0) && C9971q.m14638b(((AbstractC11388u0) obj).getName(), name)) {
                eVar.add(obj);
            }
        }
        return eVar;
    }

    @Override // p448yh.AbstractC14414i, p448yh.AbstractC14411h
    /* renamed from: d */
    public Collection<AbstractC11404z0> mo626d(C11142f name, AbstractC13878b location) {
        C9971q.m14633g(name, "name");
        C9971q.m14633g(location, "location");
        List<AbstractC11346m> k = m654k();
        C11768e eVar = new C11768e();
        for (Object obj : k) {
            if ((obj instanceof AbstractC11404z0) && C9971q.m14638b(((AbstractC11404z0) obj).getName(), name)) {
                eVar.add(obj);
            }
        }
        return eVar;
    }

    @Override // p448yh.AbstractC14414i, p448yh.AbstractC14416k
    /* renamed from: f */
    public Collection<AbstractC11346m> mo625f(C14403d kindFilter, Function1<? super C11142f, Boolean> nameFilter) {
        List i;
        C9971q.m14633g(kindFilter, "kindFilter");
        C9971q.m14633g(nameFilter, "nameFilter");
        if (kindFilter.m683a(C14403d.f32598p.m671m())) {
            return m654k();
        }
        i = C9906j.m14820i();
        return i;
    }

    /* renamed from: i */
    protected abstract List<AbstractC11397y> mo656i();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public final AbstractC11313e m653l() {
        return this.f32614b;
    }
}
