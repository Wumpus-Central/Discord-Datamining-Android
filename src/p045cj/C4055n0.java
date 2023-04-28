package p045cj;

import bj.AbstractC3623b;
import dj.AbstractC6514c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractC10246a;
import kotlinx.serialization.encoding.AbstractC10248c;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.AbstractC10273e;
import kotlinx.serialization.json.C10271c;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import nf.C11075i;
import p014aj.AbstractC1429h;
import p449yi.C14429a;

@Metadata(m15074d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001<B1\u0012\u0006\u0010@\u001a\u00020;\u0012\u0006\u0010C\u001a\u00020A\u0012\u0006\u0010F\u001a\u00020D\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010O\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\bV\u0010WJ\u0016\u0010\b\u001a\u00020\u0007*\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010\r\u001a\u00020\u000bH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\u0018\u0010\u0011\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0005H\u0002J\b\u0010\u0015\u001a\u00020\u000eH\u0002J\b\u0010\u0016\u001a\u00020\u0005H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0016J#\u0010\u001c\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00192\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010 \u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010!\u001a\u00020\u0007H\u0016J\n\u0010#\u001a\u0004\u0018\u00010\"H\u0016J=\u0010%\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00192\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000e2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a2\b\u0010$\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010(\u001a\u00020\u0007H\u0016J\b\u0010*\u001a\u00020)H\u0016J\b\u0010,\u001a\u00020+H\u0016J\b\u0010-\u001a\u00020\u000eH\u0016J\b\u0010/\u001a\u00020.H\u0016J\b\u00101\u001a\u000200H\u0016J\b\u00103\u001a\u000202H\u0016J\b\u00105\u001a\u000204H\u0016J\b\u00106\u001a\u00020\u0005H\u0016J\u0010\u00108\u001a\u0002072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010:\u001a\u00020\u000e2\u0006\u00109\u001a\u00020\tH\u0016R\u0017\u0010@\u001a\u00020;8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0014\u0010C\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010BR\u0014\u0010F\u001a\u00020D8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b \u0010ER\u001a\u0010J\u001a\u00020G8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010H\u001a\u0004\b<\u0010IR\u0016\u0010L\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010KR\u0018\u0010O\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010R\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010QR\u0016\u0010U\u001a\u0004\u0018\u00010S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010T¨\u0006X"}, m15073d2 = {"Lcj/n0;", "Lkotlinx/serialization/json/e;", "", "Lkotlinx/serialization/encoding/a;", "Lcj/n0$a;", "", "unknownKey", "", "S", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "R", "K", "", "N", "index", "L", "O", "key", "Q", "M", "P", "Lkotlinx/serialization/json/JsonElement;", "g", "T", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "G", "(Lkotlinx/serialization/DeserializationStrategy;)Ljava/lang/Object;", "Lkotlinx/serialization/encoding/c;", "b", "c", "D", "", "j", "previousValue", "y", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;", "o", "w", "", "H", "", "s", "h", "", "l", "", "t", "", "v", "", "x", "z", "Lkotlinx/serialization/encoding/Decoder;", "q", "enumDescriptor", "e", "Lkotlinx/serialization/json/Json;", "a", "Lkotlinx/serialization/json/Json;", "d", "()Lkotlinx/serialization/json/Json;", "json", "Lcj/t0;", "Lcj/t0;", "mode", "Lcj/a;", "Lcj/a;", "lexer", "Ldj/c;", "Ldj/c;", "()Ldj/c;", "serializersModule", "I", "currentIndex", "f", "Lcj/n0$a;", "discriminatorHolder", "Lkotlinx/serialization/json/c;", "Lkotlinx/serialization/json/c;", "configuration", "Lcj/x;", "Lcj/x;", "elementMarker", "<init>", "(Lkotlinx/serialization/json/Json;Lcj/t0;Lcj/a;Lkotlinx/serialization/descriptors/SerialDescriptor;Lcj/n0$a;)V", "kotlinx-serialization-json"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: cj.n0 */
/* loaded from: classes8.dex */
public class C4055n0 extends AbstractC10246a implements AbstractC10273e {

    /* renamed from: a */
    private final Json f6668a;

    /* renamed from: b */
    private final EnumC4070t0 f6669b;

    /* renamed from: c */
    public final AbstractC4024a f6670c;

    /* renamed from: d */
    private final AbstractC6514c f6671d;

    /* renamed from: e */
    private int f6672e = -1;

    /* renamed from: f */
    private C4056a f6673f;

    /* renamed from: g */
    private final C10271c f6674g;

    /* renamed from: h */
    private final C4076x f6675h;

    @Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b"}, m15073d2 = {"Lcj/n0$a;", "", "", "a", "Ljava/lang/String;", "discriminatorToSkip", "<init>", "(Ljava/lang/String;)V", "kotlinx-serialization-json"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: cj.n0$a */
    /* loaded from: classes8.dex */
    public static final class C4056a {

        /* renamed from: a */
        public String f6676a;

        public C4056a(String str) {
            this.f6676a = str;
        }
    }

    @Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: cj.n0$b */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C4057b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f6677a;

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
            try {
                iArr[EnumC4070t0.OBJ.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f6677a = iArr;
        }
    }

    public C4055n0(Json json, EnumC4070t0 mode, AbstractC4024a lexer, SerialDescriptor descriptor, C4056a aVar) {
        C4076x xVar;
        C9971q.m14633g(json, "json");
        C9971q.m14633g(mode, "mode");
        C9971q.m14633g(lexer, "lexer");
        C9971q.m14633g(descriptor, "descriptor");
        this.f6668a = json;
        this.f6669b = mode;
        this.f6670c = lexer;
        this.f6671d = json.mo611a();
        this.f6673f = aVar;
        C10271c e = json.m13765e();
        this.f6674g = e;
        if (e.m13738f()) {
            xVar = null;
        } else {
            xVar = new C4076x(descriptor);
        }
        this.f6675h = xVar;
    }

    /* renamed from: K */
    private final void m32927K() {
        if (this.f6670c.m33067E() == 4) {
            AbstractC4024a.m33039y(this.f6670c, "Unexpected leading comma", 0, null, 6, null);
            throw new C11075i();
        }
    }

    /* renamed from: L */
    private final boolean m32926L(SerialDescriptor serialDescriptor, int i) {
        String F;
        Json json = this.f6668a;
        SerialDescriptor h = serialDescriptor.mo13677h(i);
        if (!h.mo13683b() && this.f6670c.m33062M(true)) {
            return true;
        }
        if (!C9971q.m14638b(h.mo13678g(), AbstractC1429h.C1431b.f480a) || ((h.mo13683b() && this.f6670c.m33062M(false)) || (F = this.f6670c.m33066F(this.f6674g.m13731m())) == null || C4027b0.m33019g(h, json, F) != -3)) {
            return false;
        }
        this.f6670c.m33047q();
        return true;
    }

    /* renamed from: M */
    private final int m32925M() {
        boolean L = this.f6670c.mo32906L();
        if (this.f6670c.mo32904f()) {
            int i = this.f6672e;
            if (i == -1 || L) {
                int i2 = i + 1;
                this.f6672e = i2;
                return i2;
            }
            AbstractC4024a.m33039y(this.f6670c, "Expected end of the array or comma", 0, null, 6, null);
            throw new C11075i();
        } else if (!L) {
            return -1;
        } else {
            AbstractC4024a.m33039y(this.f6670c, "Unexpected trailing comma", 0, null, 6, null);
            throw new C11075i();
        }
    }

    /* renamed from: N */
    private final int m32924N() {
        boolean z;
        int i;
        int i2;
        int i3 = this.f6672e;
        boolean z2 = false;
        if (i3 % 2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.f6670c.mo32900o(':');
        } else if (i3 != -1) {
            z2 = this.f6670c.mo32906L();
        }
        if (this.f6670c.mo32904f()) {
            if (z) {
                if (this.f6672e == -1) {
                    AbstractC4024a aVar = this.f6670c;
                    boolean z3 = !z2;
                    i2 = aVar.f6613a;
                    if (!z3) {
                        AbstractC4024a.m33039y(aVar, "Unexpected trailing comma", i2, null, 4, null);
                        throw new C11075i();
                    }
                } else {
                    AbstractC4024a aVar2 = this.f6670c;
                    i = aVar2.f6613a;
                    if (!z2) {
                        AbstractC4024a.m33039y(aVar2, "Expected comma after the key-value pair", i, null, 4, null);
                        throw new C11075i();
                    }
                }
            }
            int i4 = this.f6672e + 1;
            this.f6672e = i4;
            return i4;
        } else if (!z2) {
            return -1;
        } else {
            AbstractC4024a.m33039y(this.f6670c, "Expected '}', but had ',' instead", 0, null, 6, null);
            throw new C11075i();
        }
    }

    /* renamed from: O */
    private final int m32923O(SerialDescriptor serialDescriptor) {
        boolean z;
        boolean L = this.f6670c.mo32906L();
        while (this.f6670c.mo32904f()) {
            String P = m32922P();
            this.f6670c.mo32900o(':');
            int g = C4027b0.m33019g(serialDescriptor, this.f6668a, P);
            boolean z2 = false;
            if (g == -3) {
                z2 = true;
                z = false;
            } else if (!this.f6674g.m13740d() || !m32926L(serialDescriptor, g)) {
                C4076x xVar = this.f6675h;
                if (xVar != null) {
                    xVar.m32878c(g);
                }
                return g;
            } else {
                z = this.f6670c.mo32906L();
            }
            if (z2) {
                L = m32921Q(P);
            } else {
                L = z;
            }
        }
        if (!L) {
            C4076x xVar2 = this.f6675h;
            if (xVar2 != null) {
                return xVar2.m32877d();
            }
            return -1;
        }
        AbstractC4024a.m33039y(this.f6670c, "Unexpected trailing comma", 0, null, 6, null);
        throw new C11075i();
    }

    /* renamed from: P */
    private final String m32922P() {
        if (this.f6674g.m13731m()) {
            return this.f6670c.m33044t();
        }
        return this.f6670c.mo32903k();
    }

    /* renamed from: Q */
    private final boolean m32921Q(String str) {
        if (this.f6674g.m13737g() || m32919S(this.f6673f, str)) {
            this.f6670c.m33065H(this.f6674g.m13731m());
        } else {
            this.f6670c.m33070A(str);
        }
        return this.f6670c.mo32906L();
    }

    /* renamed from: R */
    private final void m32920R(SerialDescriptor serialDescriptor) {
        do {
        } while (mo13851o(serialDescriptor) != -1);
    }

    /* renamed from: S */
    private final boolean m32919S(C4056a aVar, String str) {
        if (aVar == null || !C9971q.m14638b(aVar.f6676a, str)) {
            return false;
        }
        aVar.f6676a = null;
        return true;
    }

    @Override // kotlinx.serialization.encoding.AbstractC10246a, kotlinx.serialization.encoding.Decoder
    /* renamed from: D */
    public boolean mo13910D() {
        C4076x xVar = this.f6675h;
        return !(xVar != null ? xVar.m32879b() : false) && !AbstractC4024a.m33061N(this.f6670c, false, 1, null);
    }

    @Override // kotlinx.serialization.encoding.AbstractC10246a, kotlinx.serialization.encoding.Decoder
    /* renamed from: G */
    public <T> T mo13909G(DeserializationStrategy<? extends T> deserializer) {
        DeserializationStrategy<T> deserializationStrategy;
        C9971q.m14633g(deserializer, "deserializer");
        try {
            if ((deserializer instanceof AbstractC3623b) && !this.f6668a.m13765e().m13732l()) {
                String c = C4051l0.m32935c(deserializer.getDescriptor(), this.f6668a);
                String l = this.f6670c.mo32902l(c, this.f6674g.m13731m());
                if (l != null) {
                    deserializationStrategy = ((AbstractC3623b) deserializer).mo13932c(this, l);
                } else {
                    deserializationStrategy = null;
                }
                if (deserializationStrategy == null) {
                    return (T) C4051l0.m32934d(this, deserializer);
                }
                this.f6673f = new C4056a(c);
                return deserializationStrategy.deserialize(this);
            }
            return (T) deserializer.deserialize(this);
        } catch (C14429a e) {
            List<String> a = e.m618a();
            throw new C14429a(a, e.getMessage() + " at path: " + this.f6670c.f6614b.m32993a(), e);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractC10246a, kotlinx.serialization.encoding.Decoder
    /* renamed from: H */
    public byte mo13908H() {
        long p = this.f6670c.m33048p();
        byte b = (byte) p;
        if (p == b) {
            return b;
        }
        AbstractC4024a aVar = this.f6670c;
        AbstractC4024a.m33039y(aVar, "Failed to parse byte for input '" + p + '\'', 0, null, 6, null);
        throw new C11075i();
    }

    @Override // kotlinx.serialization.encoding.AbstractC10248c
    /* renamed from: a */
    public AbstractC6514c mo13858a() {
        return this.f6671d;
    }

    @Override // kotlinx.serialization.encoding.AbstractC10246a, kotlinx.serialization.encoding.Decoder
    /* renamed from: b */
    public AbstractC10248c mo13905b(SerialDescriptor descriptor) {
        C9971q.m14633g(descriptor, "descriptor");
        EnumC4070t0 b = C4073u0.m32881b(this.f6668a, descriptor);
        this.f6670c.f6614b.m32991c(descriptor);
        this.f6670c.mo32900o(b.f6699k);
        m32927K();
        int i = C4057b.f6677a[b.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return new C4055n0(this.f6668a, b, this.f6670c, descriptor, this.f6673f);
        }
        if (this.f6669b != b || !this.f6668a.m13765e().m13738f()) {
            return new C4055n0(this.f6668a, b, this.f6670c, descriptor, this.f6673f);
        }
        return this;
    }

    @Override // kotlinx.serialization.encoding.AbstractC10246a, kotlinx.serialization.encoding.AbstractC10248c
    /* renamed from: c */
    public void mo13857c(SerialDescriptor descriptor) {
        C9971q.m14633g(descriptor, "descriptor");
        if (this.f6668a.m13765e().m13737g() && descriptor.mo13681d() == 0) {
            m32920R(descriptor);
        }
        this.f6670c.mo32900o(this.f6669b.f6700l);
        this.f6670c.f6614b.m32992b();
    }

    @Override // kotlinx.serialization.json.AbstractC10273e
    /* renamed from: d */
    public final Json mo13730d() {
        return this.f6668a;
    }

    @Override // kotlinx.serialization.encoding.AbstractC10246a, kotlinx.serialization.encoding.Decoder
    /* renamed from: e */
    public int mo13904e(SerialDescriptor enumDescriptor) {
        C9971q.m14633g(enumDescriptor, "enumDescriptor");
        Json json = this.f6668a;
        String z = mo13894z();
        return C4027b0.m33017i(enumDescriptor, json, z, " at path " + this.f6670c.f6614b.m32993a());
    }

    @Override // kotlinx.serialization.json.AbstractC10273e
    /* renamed from: g */
    public JsonElement mo13729g() {
        return new C4045j0(this.f6668a.m13765e(), this.f6670c).m32949e();
    }

    @Override // kotlinx.serialization.encoding.AbstractC10246a, kotlinx.serialization.encoding.Decoder
    /* renamed from: h */
    public int mo13903h() {
        long p = this.f6670c.m33048p();
        int i = (int) p;
        if (p == i) {
            return i;
        }
        AbstractC4024a aVar = this.f6670c;
        AbstractC4024a.m33039y(aVar, "Failed to parse int for input '" + p + '\'', 0, null, 6, null);
        throw new C11075i();
    }

    @Override // kotlinx.serialization.encoding.AbstractC10246a, kotlinx.serialization.encoding.Decoder
    /* renamed from: j */
    public Void mo13902j() {
        return null;
    }

    @Override // kotlinx.serialization.encoding.AbstractC10246a, kotlinx.serialization.encoding.Decoder
    /* renamed from: l */
    public long mo13901l() {
        return this.f6670c.m33048p();
    }

    @Override // kotlinx.serialization.encoding.AbstractC10248c
    /* renamed from: o */
    public int mo13851o(SerialDescriptor descriptor) {
        int i;
        C9971q.m14633g(descriptor, "descriptor");
        int i2 = C4057b.f6677a[this.f6669b.ordinal()];
        if (i2 == 2) {
            i = m32924N();
        } else if (i2 != 4) {
            i = m32925M();
        } else {
            i = m32923O(descriptor);
        }
        if (this.f6669b != EnumC4070t0.MAP) {
            this.f6670c.f6614b.m32987g(i);
        }
        return i;
    }

    @Override // kotlinx.serialization.encoding.AbstractC10246a, kotlinx.serialization.encoding.Decoder
    /* renamed from: q */
    public Decoder mo13900q(SerialDescriptor descriptor) {
        C9971q.m14633g(descriptor, "descriptor");
        if (C4062p0.m32914b(descriptor)) {
            return new C4074v(this.f6670c, this.f6668a);
        }
        return super.mo13900q(descriptor);
    }

    @Override // kotlinx.serialization.encoding.AbstractC10246a, kotlinx.serialization.encoding.Decoder
    /* renamed from: s */
    public short mo13899s() {
        long p = this.f6670c.m33048p();
        short s = (short) p;
        if (p == s) {
            return s;
        }
        AbstractC4024a aVar = this.f6670c;
        AbstractC4024a.m33039y(aVar, "Failed to parse short for input '" + p + '\'', 0, null, 6, null);
        throw new C11075i();
    }

    @Override // kotlinx.serialization.encoding.AbstractC10246a, kotlinx.serialization.encoding.Decoder
    /* renamed from: t */
    public float mo13898t() {
        boolean z;
        AbstractC4024a aVar = this.f6670c;
        String s = aVar.m33045s();
        try {
            float parseFloat = Float.parseFloat(s);
            if (!this.f6668a.m13765e().m13743a()) {
                if (Float.isInfinite(parseFloat) || Float.isNaN(parseFloat)) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    C4025a0.m33029i(this.f6670c, Float.valueOf(parseFloat));
                    throw new C11075i();
                }
            }
            return parseFloat;
        } catch (IllegalArgumentException unused) {
            AbstractC4024a.m33039y(aVar, "Failed to parse type 'float' for input '" + s + '\'', 0, null, 6, null);
            throw new C11075i();
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractC10246a, kotlinx.serialization.encoding.Decoder
    /* renamed from: v */
    public double mo13897v() {
        boolean z;
        AbstractC4024a aVar = this.f6670c;
        String s = aVar.m33045s();
        try {
            double parseDouble = Double.parseDouble(s);
            if (!this.f6668a.m13765e().m13743a()) {
                if (Double.isInfinite(parseDouble) || Double.isNaN(parseDouble)) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    C4025a0.m33029i(this.f6670c, Double.valueOf(parseDouble));
                    throw new C11075i();
                }
            }
            return parseDouble;
        } catch (IllegalArgumentException unused) {
            AbstractC4024a.m33039y(aVar, "Failed to parse type 'double' for input '" + s + '\'', 0, null, 6, null);
            throw new C11075i();
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractC10246a, kotlinx.serialization.encoding.Decoder
    /* renamed from: w */
    public boolean mo13896w() {
        if (this.f6674g.m13731m()) {
            return this.f6670c.m33051i();
        }
        return this.f6670c.m33053g();
    }

    @Override // kotlinx.serialization.encoding.AbstractC10246a, kotlinx.serialization.encoding.Decoder
    /* renamed from: x */
    public char mo13895x() {
        String s = this.f6670c.m33045s();
        if (s.length() == 1) {
            return s.charAt(0);
        }
        AbstractC4024a aVar = this.f6670c;
        AbstractC4024a.m33039y(aVar, "Expected single char, but got '" + s + '\'', 0, null, 6, null);
        throw new C11075i();
    }

    @Override // kotlinx.serialization.encoding.AbstractC10246a, kotlinx.serialization.encoding.AbstractC10248c
    /* renamed from: y */
    public <T> T mo13847y(SerialDescriptor descriptor, int i, DeserializationStrategy<? extends T> deserializer, T t) {
        boolean z;
        C9971q.m14633g(descriptor, "descriptor");
        C9971q.m14633g(deserializer, "deserializer");
        if (this.f6669b == EnumC4070t0.MAP && (i & 1) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f6670c.f6614b.m32990d();
        }
        T t2 = (T) super.mo13847y(descriptor, i, deserializer, t);
        if (z) {
            this.f6670c.f6614b.m32988f(t2);
        }
        return t2;
    }

    @Override // kotlinx.serialization.encoding.AbstractC10246a, kotlinx.serialization.encoding.Decoder
    /* renamed from: z */
    public String mo13894z() {
        if (this.f6674g.m13731m()) {
            return this.f6670c.m33044t();
        }
        return this.f6670c.m33047q();
    }
}
