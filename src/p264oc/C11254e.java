package p264oc;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import mc.AbstractC10585d;
import mc.AbstractC10586e;
import mc.AbstractC10587f;
import mc.AbstractC10588g;
import mc.C10581b;
import mc.C10582c;

/* renamed from: oc.e */
/* loaded from: classes3.dex */
final class C11254e implements AbstractC10586e, AbstractC10588g {

    /* renamed from: a */
    private C11254e f25159a = null;

    /* renamed from: b */
    private boolean f25160b = true;

    /* renamed from: c */
    private final JsonWriter f25161c;

    /* renamed from: d */
    private final Map<Class<?>, AbstractC10585d<?>> f25162d;

    /* renamed from: e */
    private final Map<Class<?>, AbstractC10587f<?>> f25163e;

    /* renamed from: f */
    private final AbstractC10585d<Object> f25164f;

    /* renamed from: g */
    private final boolean f25165g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11254e(Writer writer, Map<Class<?>, AbstractC10585d<?>> map, Map<Class<?>, AbstractC10587f<?>> map2, AbstractC10585d<Object> dVar, boolean z) {
        this.f25161c = new JsonWriter(writer);
        this.f25162d = map;
        this.f25163e = map2;
        this.f25164f = dVar;
        this.f25165g = z;
    }

    /* renamed from: o */
    private boolean m10335o(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    /* renamed from: r */
    private C11254e m10332r(String str, Object obj) {
        m10330t();
        this.f25161c.name(str);
        if (obj != null) {
            return m10342h(obj, false);
        }
        this.f25161c.nullValue();
        return this;
    }

    /* renamed from: s */
    private C11254e m10331s(String str, Object obj) {
        if (obj == null) {
            return this;
        }
        m10330t();
        this.f25161c.name(str);
        return m10342h(obj, false);
    }

    /* renamed from: t */
    private void m10330t() {
        if (this.f25160b) {
            C11254e eVar = this.f25159a;
            if (eVar != null) {
                eVar.m10330t();
                this.f25159a.f25160b = false;
                this.f25159a = null;
                this.f25161c.endObject();
                return;
            }
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }

    @Override // mc.AbstractC10586e
    /* renamed from: a */
    public AbstractC10586e mo9266a(C10582c cVar, Object obj) {
        return m10338l(cVar.m12799b(), obj);
    }

    @Override // mc.AbstractC10586e
    /* renamed from: d */
    public AbstractC10586e mo9263d(C10582c cVar, int i) {
        return m10340j(cVar.m12799b(), i);
    }

    @Override // mc.AbstractC10586e
    /* renamed from: e */
    public AbstractC10586e mo9262e(C10582c cVar, long j) {
        return m10339k(cVar.m12799b(), j);
    }

    /* renamed from: f */
    public C11254e m10344f(int i) {
        m10330t();
        this.f25161c.value(i);
        return this;
    }

    /* renamed from: g */
    public C11254e m10343g(long j) {
        m10330t();
        this.f25161c.value(j);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public C11254e m10342h(Object obj, boolean z) {
        int[] iArr;
        Class<?> cls;
        int i = 0;
        if (z && m10335o(obj)) {
            Object[] objArr = new Object[1];
            if (obj == null) {
                cls = null;
            } else {
                cls = obj.getClass();
            }
            objArr[0] = cls;
            throw new C10581b(String.format("%s cannot be encoded inline", objArr));
        } else if (obj == null) {
            this.f25161c.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.f25161c.value((Number) obj);
            return this;
        } else if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                return m10336n((byte[]) obj);
            }
            this.f25161c.beginArray();
            if (obj instanceof int[]) {
                int length = ((int[]) obj).length;
                while (i < length) {
                    this.f25161c.value(iArr[i]);
                    i++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i < length2) {
                    m10343g(jArr[i]);
                    i++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i < length3) {
                    this.f25161c.value(dArr[i]);
                    i++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i < length4) {
                    this.f25161c.value(zArr[i]);
                    i++;
                }
            } else if (obj instanceof Number[]) {
                for (Number number : (Number[]) obj) {
                    m10342h(number, false);
                }
            } else {
                for (Object obj2 : (Object[]) obj) {
                    m10342h(obj2, false);
                }
            }
            this.f25161c.endArray();
            return this;
        } else if (obj instanceof Collection) {
            this.f25161c.beginArray();
            for (Object obj3 : (Collection) obj) {
                m10342h(obj3, false);
            }
            this.f25161c.endArray();
            return this;
        } else if (obj instanceof Map) {
            this.f25161c.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    m10338l((String) key, entry.getValue());
                } catch (ClassCastException e) {
                    throw new C10581b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                }
            }
            this.f25161c.endObject();
            return this;
        } else {
            AbstractC10585d<?> dVar = this.f25162d.get(obj.getClass());
            if (dVar != null) {
                return m10333q(dVar, obj, z);
            }
            AbstractC10587f<?> fVar = this.f25163e.get(obj.getClass());
            if (fVar != null) {
                fVar.mo10346a(obj, this);
                return this;
            } else if (!(obj instanceof Enum)) {
                return m10333q(this.f25164f, obj, z);
            } else {
                mo9234b(((Enum) obj).name());
                return this;
            }
        }
    }

    /* renamed from: i */
    public C11254e mo9234b(String str) {
        m10330t();
        this.f25161c.value(str);
        return this;
    }

    /* renamed from: j */
    public C11254e m10340j(String str, int i) {
        m10330t();
        this.f25161c.name(str);
        return m10344f(i);
    }

    /* renamed from: k */
    public C11254e m10339k(String str, long j) {
        m10330t();
        this.f25161c.name(str);
        return m10343g(j);
    }

    /* renamed from: l */
    public C11254e m10338l(String str, Object obj) {
        if (this.f25165g) {
            return m10331s(str, obj);
        }
        return m10332r(str, obj);
    }

    /* renamed from: m */
    public C11254e mo9233c(boolean z) {
        m10330t();
        this.f25161c.value(z);
        return this;
    }

    /* renamed from: n */
    public C11254e m10336n(byte[] bArr) {
        m10330t();
        if (bArr == null) {
            this.f25161c.nullValue();
        } else {
            this.f25161c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m10334p() {
        m10330t();
        this.f25161c.flush();
    }

    /* renamed from: q */
    C11254e m10333q(AbstractC10585d<Object> dVar, Object obj, boolean z) {
        if (!z) {
            this.f25161c.beginObject();
        }
        dVar.mo6853a(obj, this);
        if (!z) {
            this.f25161c.endObject();
        }
        return this;
    }
}
