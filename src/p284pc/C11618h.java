package p284pc;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import mc.AbstractC10585d;
import mc.AbstractC10586e;
import mc.AbstractC10587f;
import mc.C10581b;
import nc.AbstractC10774a;
import nc.AbstractC10775b;
import p284pc.C11618h;

/* renamed from: pc.h */
/* loaded from: classes3.dex */
public class C11618h {

    /* renamed from: a */
    private final Map<Class<?>, AbstractC10585d<?>> f25894a;

    /* renamed from: b */
    private final Map<Class<?>, AbstractC10587f<?>> f25895b;

    /* renamed from: c */
    private final AbstractC10585d<Object> f25896c;

    /* renamed from: pc.h$a */
    /* loaded from: classes3.dex */
    public static final class C11619a implements AbstractC10775b<C11619a> {

        /* renamed from: d */
        private static final AbstractC10585d<Object> f25897d = new AbstractC10585d() { // from class: pc.g
            @Override // mc.AbstractC10585d
            /* renamed from: a */
            public final void mo6853a(Object obj, Object obj2) {
                C11618h.C11619a.m9237e(obj, (AbstractC10586e) obj2);
            }
        };

        /* renamed from: a */
        private final Map<Class<?>, AbstractC10585d<?>> f25898a = new HashMap();

        /* renamed from: b */
        private final Map<Class<?>, AbstractC10587f<?>> f25899b = new HashMap();

        /* renamed from: c */
        private AbstractC10585d<Object> f25900c = f25897d;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static /* synthetic */ void m9237e(Object obj, AbstractC10586e eVar) {
            throw new C10581b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        /* renamed from: c */
        public C11618h m9239c() {
            return new C11618h(new HashMap(this.f25898a), new HashMap(this.f25899b), this.f25900c);
        }

        /* renamed from: d */
        public C11619a m9238d(AbstractC10774a aVar) {
            aVar.mo6860a(this);
            return this;
        }

        /* renamed from: f */
        public <U> C11619a mo9241a(Class<U> cls, AbstractC10585d<? super U> dVar) {
            this.f25898a.put(cls, dVar);
            this.f25899b.remove(cls);
            return this;
        }
    }

    C11618h(Map<Class<?>, AbstractC10585d<?>> map, Map<Class<?>, AbstractC10587f<?>> map2, AbstractC10585d<Object> dVar) {
        this.f25894a = map;
        this.f25895b = map2;
        this.f25896c = dVar;
    }

    /* renamed from: a */
    public static C11619a m9244a() {
        return new C11619a();
    }

    /* renamed from: b */
    public void m9243b(Object obj, OutputStream outputStream) {
        new C11615f(outputStream, this.f25894a, this.f25895b, this.f25896c).m9250q(obj);
    }

    /* renamed from: c */
    public byte[] m9242c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            m9243b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
