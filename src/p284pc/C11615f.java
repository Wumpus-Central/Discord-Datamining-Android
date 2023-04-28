package p284pc;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;
import mc.AbstractC10585d;
import mc.AbstractC10586e;
import mc.AbstractC10587f;
import mc.C10581b;
import mc.C10582c;
import p284pc.AbstractC11612d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: pc.f */
/* loaded from: classes3.dex */
public final class C11615f implements AbstractC10586e {

    /* renamed from: f */
    private static final Charset f25884f = Charset.forName("UTF-8");

    /* renamed from: g */
    private static final C10582c f25885g = C10582c.m12800a("key").m12795b(C11609a.m9269b().m9268c(1).m9270a()).m12796a();

    /* renamed from: h */
    private static final C10582c f25886h = C10582c.m12800a("value").m12795b(C11609a.m9269b().m9268c(2).m9270a()).m12796a();

    /* renamed from: i */
    private static final AbstractC10585d<Map.Entry<Object, Object>> f25887i = new AbstractC10585d() { // from class: pc.e
        @Override // mc.AbstractC10585d
        /* renamed from: a */
        public final void mo6853a(Object obj, Object obj2) {
            C11615f.m9247t((Map.Entry) obj, (AbstractC10586e) obj2);
        }
    };

    /* renamed from: a */
    private OutputStream f25888a;

    /* renamed from: b */
    private final Map<Class<?>, AbstractC10585d<?>> f25889b;

    /* renamed from: c */
    private final Map<Class<?>, AbstractC10587f<?>> f25890c;

    /* renamed from: d */
    private final AbstractC10585d<Object> f25891d;

    /* renamed from: e */
    private final C11620i f25892e = new C11620i(this);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: pc.f$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C11616a {

        /* renamed from: a */
        static final /* synthetic */ int[] f25893a;

        static {
            int[] iArr = new int[AbstractC11612d.EnumC11613a.values().length];
            f25893a = iArr;
            try {
                iArr[AbstractC11612d.EnumC11613a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25893a[AbstractC11612d.EnumC11613a.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25893a[AbstractC11612d.EnumC11613a.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11615f(OutputStream outputStream, Map<Class<?>, AbstractC10585d<?>> map, Map<Class<?>, AbstractC10587f<?>> map2, AbstractC10585d<Object> dVar) {
        this.f25888a = outputStream;
        this.f25889b = map;
        this.f25890c = map2;
        this.f25891d = dVar;
    }

    /* renamed from: m */
    private static ByteBuffer m9254m(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: n */
    private <T> long m9253n(AbstractC10585d<T> dVar, T t) {
        C11610b bVar = new C11610b();
        try {
            OutputStream outputStream = this.f25888a;
            this.f25888a = bVar;
            dVar.mo6853a(t, this);
            this.f25888a = outputStream;
            long b = bVar.m9267b();
            bVar.close();
            return b;
        } catch (Throwable th2) {
            try {
                bVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* renamed from: o */
    private <T> C11615f m9252o(AbstractC10585d<T> dVar, C10582c cVar, T t, boolean z) {
        long n = m9253n(dVar, t);
        if (z && n == 0) {
            return this;
        }
        m9246u((m9248s(cVar) << 3) | 2);
        m9245v(n);
        dVar.mo6853a(t, this);
        return this;
    }

    /* renamed from: p */
    private <T> C11615f m9251p(AbstractC10587f<T> fVar, C10582c cVar, T t, boolean z) {
        this.f25892e.m9232d(cVar, z);
        fVar.mo10346a(t, this.f25892e);
        return this;
    }

    /* renamed from: r */
    private static AbstractC11612d m9249r(C10582c cVar) {
        AbstractC11612d dVar = (AbstractC11612d) cVar.m12798c(AbstractC11612d.class);
        if (dVar != null) {
            return dVar;
        }
        throw new C10581b("Field has no @Protobuf config");
    }

    /* renamed from: s */
    private static int m9248s(C10582c cVar) {
        AbstractC11612d dVar = (AbstractC11612d) cVar.m12798c(AbstractC11612d.class);
        if (dVar != null) {
            return dVar.tag();
        }
        throw new C10581b("Field has no @Protobuf config");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static /* synthetic */ void m9247t(Map.Entry entry, AbstractC10586e eVar) {
        eVar.mo9266a(f25885g, entry.getKey());
        eVar.mo9266a(f25886h, entry.getValue());
    }

    /* renamed from: u */
    private void m9246u(int i) {
        while ((i & (-128)) != 0) {
            this.f25888a.write((i & 127) | 128);
            i >>>= 7;
        }
        this.f25888a.write(i & 127);
    }

    /* renamed from: v */
    private void m9245v(long j) {
        while (((-128) & j) != 0) {
            this.f25888a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.f25888a.write(((int) j) & 127);
    }

    @Override // mc.AbstractC10586e
    /* renamed from: a */
    public AbstractC10586e mo9266a(C10582c cVar, Object obj) {
        return m9260g(cVar, obj, true);
    }

    /* renamed from: c */
    AbstractC10586e m9264c(C10582c cVar, double d, boolean z) {
        if (z && d == 0.0d) {
            return this;
        }
        m9246u((m9248s(cVar) << 3) | 1);
        this.f25888a.write(m9254m(8).putDouble(d).array());
        return this;
    }

    /* renamed from: f */
    AbstractC10586e m9261f(C10582c cVar, float f, boolean z) {
        if (z && f == 0.0f) {
            return this;
        }
        m9246u((m9248s(cVar) << 3) | 5);
        this.f25888a.write(m9254m(4).putFloat(f).array());
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public AbstractC10586e m9260g(C10582c cVar, Object obj, boolean z) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            m9246u((m9248s(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f25884f);
            m9246u(bytes.length);
            this.f25888a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                m9260g(cVar, obj2, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                m9252o(f25887i, cVar, entry, false);
            }
            return this;
        } else if (obj instanceof Double) {
            return m9264c(cVar, ((Double) obj).doubleValue(), z);
        } else {
            if (obj instanceof Float) {
                return m9261f(cVar, ((Float) obj).floatValue(), z);
            }
            if (obj instanceof Number) {
                return m9256k(cVar, ((Number) obj).longValue(), z);
            }
            if (obj instanceof Boolean) {
                return m9255l(cVar, ((Boolean) obj).booleanValue(), z);
            }
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (z && bArr.length == 0) {
                    return this;
                }
                m9246u((m9248s(cVar) << 3) | 2);
                m9246u(bArr.length);
                this.f25888a.write(bArr);
                return this;
            }
            AbstractC10585d<?> dVar = this.f25889b.get(obj.getClass());
            if (dVar != null) {
                return m9252o(dVar, cVar, obj, z);
            }
            AbstractC10587f<?> fVar = this.f25890c.get(obj.getClass());
            if (fVar != null) {
                return m9251p(fVar, cVar, obj, z);
            }
            if (obj instanceof AbstractC11611c) {
                return mo9263d(cVar, ((AbstractC11611c) obj).getNumber());
            }
            if (obj instanceof Enum) {
                return mo9263d(cVar, ((Enum) obj).ordinal());
            }
            return m9252o(this.f25891d, cVar, obj, z);
        }
    }

    /* renamed from: h */
    public C11615f mo9263d(C10582c cVar, int i) {
        return m9258i(cVar, i, true);
    }

    /* renamed from: i */
    C11615f m9258i(C10582c cVar, int i, boolean z) {
        if (z && i == 0) {
            return this;
        }
        AbstractC11612d r = m9249r(cVar);
        int i2 = C11616a.f25893a[r.intEncoding().ordinal()];
        if (i2 == 1) {
            m9246u(r.tag() << 3);
            m9246u(i);
        } else if (i2 == 2) {
            m9246u(r.tag() << 3);
            m9246u((i << 1) ^ (i >> 31));
        } else if (i2 == 3) {
            m9246u((r.tag() << 3) | 5);
            this.f25888a.write(m9254m(4).putInt(i).array());
        }
        return this;
    }

    /* renamed from: j */
    public C11615f mo9262e(C10582c cVar, long j) {
        return m9256k(cVar, j, true);
    }

    /* renamed from: k */
    C11615f m9256k(C10582c cVar, long j, boolean z) {
        if (z && j == 0) {
            return this;
        }
        AbstractC11612d r = m9249r(cVar);
        int i = C11616a.f25893a[r.intEncoding().ordinal()];
        if (i == 1) {
            m9246u(r.tag() << 3);
            m9245v(j);
        } else if (i == 2) {
            m9246u(r.tag() << 3);
            m9245v((j >> 63) ^ (j << 1));
        } else if (i == 3) {
            m9246u((r.tag() << 3) | 1);
            this.f25888a.write(m9254m(8).putLong(j).array());
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public C11615f m9255l(C10582c cVar, boolean z, boolean z2) {
        return m9258i(cVar, z ? 1 : 0, z2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public C11615f m9250q(Object obj) {
        if (obj == null) {
            return this;
        }
        AbstractC10585d<?> dVar = this.f25889b.get(obj.getClass());
        if (dVar != null) {
            dVar.mo6853a(obj, this);
            return this;
        }
        throw new C10581b("No encoder for " + obj.getClass());
    }
}
