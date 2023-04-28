package p264oc;

import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import mc.AbstractC10580a;
import mc.AbstractC10585d;
import mc.AbstractC10586e;
import mc.AbstractC10587f;
import mc.AbstractC10588g;
import mc.C10581b;
import nc.AbstractC10774a;
import nc.AbstractC10775b;
import p163j$.util.DesugarTimeZone;

/* renamed from: oc.d */
/* loaded from: classes3.dex */
public final class C11251d implements AbstractC10775b<C11251d> {

    /* renamed from: e */
    private static final AbstractC10585d<Object> f25149e = new AbstractC10585d() { // from class: oc.a
        @Override // mc.AbstractC10585d
        /* renamed from: a */
        public final void mo6853a(Object obj, Object obj2) {
            C11251d.m10352l(obj, (AbstractC10586e) obj2);
        }
    };

    /* renamed from: f */
    private static final AbstractC10587f<String> f25150f = new AbstractC10587f() { // from class: oc.b
        @Override // mc.AbstractC10587f
        /* renamed from: a */
        public final void mo10346a(Object obj, Object obj2) {
            ((AbstractC10588g) obj2).mo9234b((String) obj);
        }
    };

    /* renamed from: g */
    private static final AbstractC10587f<Boolean> f25151g = new AbstractC10587f() { // from class: oc.c
        @Override // mc.AbstractC10587f
        /* renamed from: a */
        public final void mo10346a(Object obj, Object obj2) {
            C11251d.m10350n((Boolean) obj, (AbstractC10588g) obj2);
        }
    };

    /* renamed from: h */
    private static final C11253b f25152h = new C11253b(null);

    /* renamed from: a */
    private final Map<Class<?>, AbstractC10585d<?>> f25153a = new HashMap();

    /* renamed from: b */
    private final Map<Class<?>, AbstractC10587f<?>> f25154b = new HashMap();

    /* renamed from: c */
    private AbstractC10585d<Object> f25155c = f25149e;

    /* renamed from: d */
    private boolean f25156d = false;

    /* renamed from: oc.d$a */
    /* loaded from: classes3.dex */
    class C11252a implements AbstractC10580a {
        C11252a() {
        }

        @Override // mc.AbstractC10580a
        /* renamed from: a */
        public void mo10347a(Object obj, Writer writer) {
            C11254e eVar = new C11254e(writer, C11251d.this.f25153a, C11251d.this.f25154b, C11251d.this.f25155c, C11251d.this.f25156d);
            eVar.m10342h(obj, false);
            eVar.m10334p();
        }
    }

    /* renamed from: oc.d$b */
    /* loaded from: classes3.dex */
    private static final class C11253b implements AbstractC10587f<Date> {

        /* renamed from: a */
        private static final DateFormat f25158a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f25158a = simpleDateFormat;
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        }

        private C11253b() {
        }

        /* synthetic */ C11253b(C11252a aVar) {
            this();
        }

        /* renamed from: b */
        public void mo10346a(Date date, AbstractC10588g gVar) {
            gVar.mo9234b(f25158a.format(date));
        }
    }

    public C11251d() {
        m10348p(String.class, f25150f);
        m10348p(Boolean.class, f25151g);
        m10348p(Date.class, f25152h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static /* synthetic */ void m10352l(Object obj, AbstractC10586e eVar) {
        throw new C10581b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static /* synthetic */ void m10350n(Boolean bool, AbstractC10588g gVar) {
        gVar.mo9233c(bool.booleanValue());
    }

    /* renamed from: i */
    public AbstractC10580a m10355i() {
        return new C11252a();
    }

    /* renamed from: j */
    public C11251d m10354j(AbstractC10774a aVar) {
        aVar.mo6860a(this);
        return this;
    }

    /* renamed from: k */
    public C11251d m10353k(boolean z) {
        this.f25156d = z;
        return this;
    }

    /* renamed from: o */
    public <T> C11251d mo9241a(Class<T> cls, AbstractC10585d<? super T> dVar) {
        this.f25153a.put(cls, dVar);
        this.f25154b.remove(cls);
        return this;
    }

    /* renamed from: p */
    public <T> C11251d m10348p(Class<T> cls, AbstractC10587f<? super T> fVar) {
        this.f25154b.put(cls, fVar);
        this.f25153a.remove(cls);
        return this;
    }
}
