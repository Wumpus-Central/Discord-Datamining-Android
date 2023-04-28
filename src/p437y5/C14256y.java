package p437y5;

import com.facebook.imagepipeline.memory.AbstractC4924h;
import com.facebook.imagepipeline.memory.AshmemMemoryChunkPool;
import com.facebook.imagepipeline.memory.BufferMemoryChunkPool;
import com.facebook.imagepipeline.memory.C4918d;
import com.facebook.imagepipeline.memory.C4920f;
import com.facebook.imagepipeline.memory.C4923g;
import com.facebook.imagepipeline.memory.NativeMemoryChunkPool;
import java.lang.reflect.InvocationTargetException;
import p314r5.C12394h;
import p394w3.C13740j;
import p414x3.C13925a;
import p455z3.AbstractC14529a;
import p455z3.AbstractC14531c;
import p455z3.AbstractC14537h;
import p455z3.C14540k;

/* renamed from: y5.y */
/* loaded from: classes7.dex */
public class C14256y {

    /* renamed from: a */
    private final C14253x f32207a;

    /* renamed from: b */
    private AbstractC4924h f32208b;

    /* renamed from: c */
    private AbstractC14235h f32209c;

    /* renamed from: d */
    private AbstractC4924h f32210d;

    /* renamed from: e */
    private C4920f f32211e;

    /* renamed from: f */
    private AbstractC4924h f32212f;

    /* renamed from: g */
    private AbstractC14537h f32213g;

    /* renamed from: h */
    private C14540k f32214h;

    /* renamed from: i */
    private AbstractC14529a f32215i;

    public C14256y(C14253x xVar) {
        this.f32207a = (C14253x) C13740j.m2834g(xVar);
    }

    /* renamed from: a */
    private AbstractC4924h m1233a() {
        if (this.f32208b == null) {
            try {
                this.f32208b = (AbstractC4924h) AshmemMemoryChunkPool.class.getConstructor(AbstractC14531c.class, C14257z.class, AbstractC14227a0.class).newInstance(this.f32207a.m1253i(), this.f32207a.m1255g(), this.f32207a.m1254h());
            } catch (ClassNotFoundException unused) {
                this.f32208b = null;
            } catch (IllegalAccessException unused2) {
                this.f32208b = null;
            } catch (InstantiationException unused3) {
                this.f32208b = null;
            } catch (NoSuchMethodException unused4) {
                this.f32208b = null;
            } catch (InvocationTargetException unused5) {
                this.f32208b = null;
            }
        }
        return this.f32208b;
    }

    /* renamed from: f */
    private AbstractC4924h m1228f(int i) {
        if (i == 0) {
            return m1227g();
        }
        if (i == 1) {
            return m1231c();
        }
        if (i == 2) {
            return m1233a();
        }
        throw new IllegalArgumentException("Invalid MemoryChunkType");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: b */
    public AbstractC14235h m1232b() {
        char c;
        AbstractC14531c cVar;
        if (this.f32209c == null) {
            String e = this.f32207a.m1257e();
            switch (e.hashCode()) {
                case -1868884870:
                    if (e.equals("legacy_default_params")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1106578487:
                    if (e.equals("legacy")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -404562712:
                    if (e.equals("experimental")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -402149703:
                    if (e.equals("dummy_with_tracking")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 95945896:
                    if (e.equals("dummy")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                this.f32209c = new C14244o();
            } else if (c == 1) {
                this.f32209c = new C14245p();
            } else if (c == 2) {
                int b = this.f32207a.m1260b();
                int a = this.f32207a.m1261a();
                C14251v h = C14251v.m1263h();
                if (this.f32207a.m1249m()) {
                    cVar = this.f32207a.m1253i();
                } else {
                    cVar = null;
                }
                this.f32209c = new C14246q(b, a, h, cVar);
            } else if (c != 3) {
                this.f32209c = new C4918d(this.f32207a.m1253i(), this.f32207a.m1259c(), this.f32207a.m1258d(), this.f32207a.m1250l());
            } else {
                this.f32209c = new C4918d(this.f32207a.m1253i(), C14240k.m1301a(), this.f32207a.m1258d(), this.f32207a.m1250l());
            }
        }
        return this.f32209c;
    }

    /* renamed from: c */
    public AbstractC4924h m1231c() {
        if (this.f32210d == null) {
            try {
                this.f32210d = (AbstractC4924h) BufferMemoryChunkPool.class.getConstructor(AbstractC14531c.class, C14257z.class, AbstractC14227a0.class).newInstance(this.f32207a.m1253i(), this.f32207a.m1255g(), this.f32207a.m1254h());
            } catch (ClassNotFoundException unused) {
                this.f32210d = null;
            } catch (IllegalAccessException unused2) {
                this.f32210d = null;
            } catch (InstantiationException unused3) {
                this.f32210d = null;
            } catch (NoSuchMethodException unused4) {
                this.f32210d = null;
            } catch (InvocationTargetException unused5) {
                this.f32210d = null;
            }
        }
        return this.f32210d;
    }

    /* renamed from: d */
    public C4920f m1230d() {
        if (this.f32211e == null) {
            this.f32211e = new C4920f(this.f32207a.m1253i(), this.f32207a.m1256f());
        }
        return this.f32211e;
    }

    /* renamed from: e */
    public int m1229e() {
        return this.f32207a.m1256f().f32222g;
    }

    /* renamed from: g */
    public AbstractC4924h m1227g() {
        if (this.f32212f == null) {
            try {
                this.f32212f = (AbstractC4924h) NativeMemoryChunkPool.class.getConstructor(AbstractC14531c.class, C14257z.class, AbstractC14227a0.class).newInstance(this.f32207a.m1253i(), this.f32207a.m1255g(), this.f32207a.m1254h());
            } catch (ClassNotFoundException e) {
                C13925a.m2287k("PoolFactory", "", e);
                this.f32212f = null;
            } catch (IllegalAccessException e2) {
                C13925a.m2287k("PoolFactory", "", e2);
                this.f32212f = null;
            } catch (InstantiationException e3) {
                C13925a.m2287k("PoolFactory", "", e3);
                this.f32212f = null;
            } catch (NoSuchMethodException e4) {
                C13925a.m2287k("PoolFactory", "", e4);
                this.f32212f = null;
            } catch (InvocationTargetException e5) {
                C13925a.m2287k("PoolFactory", "", e5);
                this.f32212f = null;
            }
        }
        return this.f32212f;
    }

    /* renamed from: h */
    public AbstractC14537h m1226h() {
        return m1225i(!C12394h.m6926a() ? 1 : 0);
    }

    /* renamed from: i */
    public AbstractC14537h m1225i(int i) {
        if (this.f32213g == null) {
            AbstractC4924h f = m1228f(i);
            C13740j.m2833h(f, "failed to get pool for chunk type: " + i);
            this.f32213g = new C14250u(f, m1224j());
        }
        return this.f32213g;
    }

    /* renamed from: j */
    public C14540k m1224j() {
        if (this.f32214h == null) {
            this.f32214h = new C14540k(m1223k());
        }
        return this.f32214h;
    }

    /* renamed from: k */
    public AbstractC14529a m1223k() {
        if (this.f32215i == null) {
            this.f32215i = new C4923g(this.f32207a.m1253i(), this.f32207a.m1252j(), this.f32207a.m1251k());
        }
        return this.f32215i;
    }
}
