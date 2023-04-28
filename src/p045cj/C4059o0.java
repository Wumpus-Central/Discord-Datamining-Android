package p045cj;

import bj.AbstractC3623b;
import dj.AbstractC6514c;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractC10247b;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.AbstractC10283i;
import kotlinx.serialization.json.C10271c;
import kotlinx.serialization.json.Json;
import p449yi.AbstractC14437h;
import p449yi.C14433d;

@Metadata(m15074d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\u0006\u00100\u001a\u00020-\u0012\u0006\u00105\u001a\u000201\u0012\u0006\u00108\u001a\u000206\u0012\u0010\u0010;\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u000109¢\u0006\u0004\bI\u0010JB1\b\u0010\u0012\u0006\u0010L\u001a\u00020K\u0012\u0006\u00105\u001a\u000201\u0012\u0006\u00108\u001a\u000206\u0012\u000e\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000109¢\u0006\u0004\bI\u0010MJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0016J+\u0010\u000f\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0016JA\u0010\u0016\u001a\u00020\u0005\"\b\b\u0000\u0010\u000b*\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\b\u0010\u000e\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u001a\u001a\u00020\u0005H\u0016J\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\tH\u0016J\u0010\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u001cH\u0016J\u0010\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u001eH\u0016J\u0010\u0010 \u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0007H\u0016J\u0010\u0010\"\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020!H\u0016J\u0010\u0010$\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020#H\u0016J\u0010\u0010&\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020%H\u0016J\u0010\u0010(\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020'H\u0016J\u0010\u0010*\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020)H\u0016J\u0018\u0010,\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u00105\u001a\u0002018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u00102\u001a\u0004\b3\u00104R\u0014\u00108\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00107R\u001e\u0010;\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u0001098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010:R\u001a\u0010@\u001a\u00020<8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b.\u0010?R\u0014\u0010C\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010BR\u0016\u0010E\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010DR\u0018\u0010H\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010G¨\u0006N"}, m15073d2 = {"Lcj/o0;", "Lkotlinx/serialization/json/i;", "Lkotlinx/serialization/encoding/b;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "I", "", "index", "", "A", "T", "Lyi/h;", "serializer", "value", "r", "(Lyi/h;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/CompositeEncoder;", "b", "c", "G", "", "p", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILyi/h;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/Encoder;", "j", "m", "q", "", "g", "", "o", "B", "", "k", "", "u", "", "f", "", "v", "", "F", "enumDescriptor", "i", "Lcj/h;", "a", "Lcj/h;", "composer", "Lkotlinx/serialization/json/Json;", "Lkotlinx/serialization/json/Json;", "d", "()Lkotlinx/serialization/json/Json;", "json", "Lcj/t0;", "Lcj/t0;", "mode", "", "[Lkotlinx/serialization/json/i;", "modeReuseCache", "Ldj/c;", "e", "Ldj/c;", "()Ldj/c;", "serializersModule", "Lkotlinx/serialization/json/c;", "Lkotlinx/serialization/json/c;", "configuration", "Z", "forceQuoting", "h", "Ljava/lang/String;", "polymorphicDiscriminator", "<init>", "(Lcj/h;Lkotlinx/serialization/json/Json;Lcj/t0;[Lkotlinx/serialization/json/i;)V", "Lcj/k0;", "output", "(Lcj/k0;Lkotlinx/serialization/json/Json;Lcj/t0;[Lkotlinx/serialization/json/i;)V", "kotlinx-serialization-json"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: cj.o0 */
/* loaded from: classes8.dex */
public final class C4059o0 extends AbstractC10247b implements AbstractC10283i {

    /* renamed from: a */
    private final C4040h f6678a;

    /* renamed from: b */
    private final Json f6679b;

    /* renamed from: c */
    private final EnumC4070t0 f6680c;

    /* renamed from: d */
    private final AbstractC10283i[] f6681d;

    /* renamed from: e */
    private final AbstractC6514c f6682e;

    /* renamed from: f */
    private final C10271c f6683f;

    /* renamed from: g */
    private boolean f6684g;

    /* renamed from: h */
    private String f6685h;

    @Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: cj.o0$a */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C4060a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f6686a;

        static {
            int[] iArr = new int[EnumC4070t0.values().length];
            try {
                iArr[EnumC4070t0.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4070t0.MAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC4070t0.POLY_OBJ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f6686a = iArr;
        }
    }

    public C4059o0(C4040h composer, Json json, EnumC4070t0 mode, AbstractC10283i[] iVarArr) {
        C9971q.m14633g(composer, "composer");
        C9971q.m14633g(json, "json");
        C9971q.m14633g(mode, "mode");
        this.f6678a = composer;
        this.f6679b = json;
        this.f6680c = mode;
        this.f6681d = iVarArr;
        this.f6682e = mo13697d().mo611a();
        this.f6683f = mo13697d().m13765e();
        int ordinal = mode.ordinal();
        if (iVarArr != null) {
            AbstractC10283i iVar = iVarArr[ordinal];
            if (iVar != null || iVar != this) {
                iVarArr[ordinal] = this;
            }
        }
    }

    /* renamed from: I */
    private final void m32917I(SerialDescriptor serialDescriptor) {
        this.f6678a.mo32898c();
        String str = this.f6685h;
        C9971q.m14636d(str);
        mo13888F(str);
        this.f6678a.m32966e(':');
        this.f6678a.mo32897o();
        mo13888F(serialDescriptor.mo13676i());
    }

    @Override // kotlinx.serialization.encoding.AbstractC10247b, kotlinx.serialization.encoding.CompositeEncoder
    /* renamed from: A */
    public boolean mo13893A(SerialDescriptor descriptor, int i) {
        C9971q.m14633g(descriptor, "descriptor");
        return this.f6683f.m13739e();
    }

    @Override // kotlinx.serialization.encoding.AbstractC10247b, kotlinx.serialization.encoding.Encoder
    /* renamed from: B */
    public void mo13892B(int i) {
        if (this.f6684g) {
            mo13888F(String.valueOf(i));
        } else {
            this.f6678a.mo32912h(i);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractC10247b, kotlinx.serialization.encoding.Encoder
    /* renamed from: F */
    public void mo13888F(String value) {
        C9971q.m14633g(value, "value");
        this.f6678a.mo32959m(value);
    }

    @Override // kotlinx.serialization.encoding.AbstractC10247b
    /* renamed from: G */
    public boolean mo13887G(SerialDescriptor descriptor, int i) {
        C9971q.m14633g(descriptor, "descriptor");
        int i2 = C4060a.f6686a[this.f6680c.ordinal()];
        if (i2 != 1) {
            boolean z = false;
            if (i2 != 2) {
                if (i2 != 3) {
                    if (!this.f6678a.m32967a()) {
                        this.f6678a.m32966e(',');
                    }
                    this.f6678a.mo32898c();
                    mo13888F(C4027b0.m33020f(descriptor, mo13697d(), i));
                    this.f6678a.m32966e(':');
                    this.f6678a.mo32897o();
                } else {
                    if (i == 0) {
                        this.f6684g = true;
                    }
                    if (i == 1) {
                        this.f6678a.m32966e(',');
                        this.f6678a.mo32897o();
                        this.f6684g = false;
                    }
                }
            } else if (!this.f6678a.m32967a()) {
                if (i % 2 == 0) {
                    this.f6678a.m32966e(',');
                    this.f6678a.mo32898c();
                    z = true;
                } else {
                    this.f6678a.m32966e(':');
                    this.f6678a.mo32897o();
                }
                this.f6684g = z;
            } else {
                this.f6684g = true;
                this.f6678a.mo32898c();
            }
        } else {
            if (!this.f6678a.m32967a()) {
                this.f6678a.m32966e(',');
            }
            this.f6678a.mo32898c();
        }
        return true;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: a */
    public AbstractC6514c mo13917a() {
        return this.f6682e;
    }

    @Override // kotlinx.serialization.encoding.AbstractC10247b, kotlinx.serialization.encoding.Encoder
    /* renamed from: b */
    public CompositeEncoder mo13885b(SerialDescriptor descriptor) {
        AbstractC10283i iVar;
        C9971q.m14633g(descriptor, "descriptor");
        EnumC4070t0 b = C4073u0.m32881b(mo13697d(), descriptor);
        char c = b.f6699k;
        if (c != 0) {
            this.f6678a.m32966e(c);
            this.f6678a.mo32899b();
        }
        if (this.f6685h != null) {
            m32917I(descriptor);
            this.f6685h = null;
        }
        if (this.f6680c == b) {
            return this;
        }
        AbstractC10283i[] iVarArr = this.f6681d;
        if (iVarArr == null || (iVar = iVarArr[b.ordinal()]) == null) {
            return new C4059o0(this.f6678a, mo13697d(), b, this.f6681d);
        }
        return iVar;
    }

    @Override // kotlinx.serialization.encoding.AbstractC10247b, kotlinx.serialization.encoding.CompositeEncoder
    /* renamed from: c */
    public void mo13884c(SerialDescriptor descriptor) {
        C9971q.m14633g(descriptor, "descriptor");
        if (this.f6680c.f6700l != 0) {
            this.f6678a.mo32896p();
            this.f6678a.mo32898c();
            this.f6678a.m32966e(this.f6680c.f6700l);
        }
    }

    @Override // kotlinx.serialization.json.AbstractC10283i
    /* renamed from: d */
    public Json mo13697d() {
        return this.f6679b;
    }

    @Override // kotlinx.serialization.encoding.AbstractC10247b, kotlinx.serialization.encoding.Encoder
    /* renamed from: f */
    public void mo13882f(double d) {
        boolean z;
        if (this.f6684g) {
            mo13888F(String.valueOf(d));
        } else {
            this.f6678a.m32965f(d);
        }
        if (!this.f6683f.m13743a()) {
            if (Double.isInfinite(d) || Double.isNaN(d)) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                throw C4025a0.m33036b(Double.valueOf(d), this.f6678a.f6643a.toString());
            }
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractC10247b, kotlinx.serialization.encoding.Encoder
    /* renamed from: g */
    public void mo13881g(byte b) {
        if (this.f6684g) {
            mo13888F(String.valueOf((int) b));
        } else {
            this.f6678a.mo32913d(b);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: i */
    public void mo13916i(SerialDescriptor enumDescriptor, int i) {
        C9971q.m14633g(enumDescriptor, "enumDescriptor");
        mo13888F(enumDescriptor.mo13680e(i));
    }

    @Override // kotlinx.serialization.encoding.AbstractC10247b, kotlinx.serialization.encoding.Encoder
    /* renamed from: j */
    public Encoder mo13879j(SerialDescriptor descriptor) {
        C9971q.m14633g(descriptor, "descriptor");
        if (C4062p0.m32914b(descriptor)) {
            C4040h hVar = this.f6678a;
            if (!(hVar instanceof C4063q)) {
                hVar = new C4063q(hVar.f6643a, this.f6684g);
            }
            return new C4059o0(hVar, mo13697d(), this.f6680c, (AbstractC10283i[]) null);
        } else if (!C4062p0.m32915a(descriptor)) {
            return super.mo13879j(descriptor);
        } else {
            C4040h hVar2 = this.f6678a;
            if (!(hVar2 instanceof C4042i)) {
                hVar2 = new C4042i(hVar2.f6643a, this.f6684g);
            }
            return new C4059o0(hVar2, mo13697d(), this.f6680c, (AbstractC10283i[]) null);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractC10247b, kotlinx.serialization.encoding.Encoder
    /* renamed from: k */
    public void mo13878k(long j) {
        if (this.f6684g) {
            mo13888F(String.valueOf(j));
        } else {
            this.f6678a.mo32911i(j);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: m */
    public void mo13915m() {
        this.f6678a.m32963j("null");
    }

    @Override // kotlinx.serialization.encoding.AbstractC10247b, kotlinx.serialization.encoding.Encoder
    /* renamed from: o */
    public void mo13875o(short s) {
        if (this.f6684g) {
            mo13888F(String.valueOf((int) s));
        } else {
            this.f6678a.mo32910k(s);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractC10247b, kotlinx.serialization.encoding.CompositeEncoder
    /* renamed from: p */
    public <T> void mo13874p(SerialDescriptor descriptor, int i, AbstractC14437h<? super T> serializer, T t) {
        C9971q.m14633g(descriptor, "descriptor");
        C9971q.m14633g(serializer, "serializer");
        if (t != null || this.f6683f.m13738f()) {
            super.mo13874p(descriptor, i, serializer, t);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractC10247b, kotlinx.serialization.encoding.Encoder
    /* renamed from: q */
    public void mo13873q(boolean z) {
        if (this.f6684g) {
            mo13888F(String.valueOf(z));
        } else {
            this.f6678a.m32962l(z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.encoding.AbstractC10247b, kotlinx.serialization.encoding.Encoder
    /* renamed from: r */
    public <T> void mo13872r(AbstractC14437h<? super T> serializer, T t) {
        C9971q.m14633g(serializer, "serializer");
        if (!(serializer instanceof AbstractC3623b) || mo13697d().m13765e().m13732l()) {
            serializer.serialize(this, t);
            return;
        }
        AbstractC3623b bVar = (AbstractC3623b) serializer;
        String c = C4051l0.m32935c(serializer.getDescriptor(), mo13697d());
        C9971q.m14635e(t, "null cannot be cast to non-null type kotlin.Any");
        AbstractC14437h b = C14433d.m612b(bVar, this, t);
        C4051l0.m32932f(bVar, b, c);
        C4051l0.m32936b(b.getDescriptor().mo13678g());
        this.f6685h = c;
        b.serialize(this, t);
    }

    @Override // kotlinx.serialization.encoding.AbstractC10247b, kotlinx.serialization.encoding.Encoder
    /* renamed from: u */
    public void mo13869u(float f) {
        boolean z;
        if (this.f6684g) {
            mo13888F(String.valueOf(f));
        } else {
            this.f6678a.m32964g(f);
        }
        if (!this.f6683f.m13743a()) {
            if (Float.isInfinite(f) || Float.isNaN(f)) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                throw C4025a0.m33036b(Float.valueOf(f), this.f6678a.f6643a.toString());
            }
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractC10247b, kotlinx.serialization.encoding.Encoder
    /* renamed from: v */
    public void mo13868v(char c) {
        mo13888F(String.valueOf(c));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4059o0(AbstractC4049k0 output, Json json, EnumC4070t0 mode, AbstractC10283i[] modeReuseCache) {
        this(C4067s.m32890a(output, json), json, mode, modeReuseCache);
        C9971q.m14633g(output, "output");
        C9971q.m14633g(json, "json");
        C9971q.m14633g(mode, "mode");
        C9971q.m14633g(modeReuseCache, "modeReuseCache");
    }
}
