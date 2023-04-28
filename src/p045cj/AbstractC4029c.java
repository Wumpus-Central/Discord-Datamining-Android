package p045cj;

import bj.AbstractC3626b1;
import dj.AbstractC6514c;
import kotlin.Metadata;
import kotlin.jvm.internal.C9951f0;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractC10248c;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.AbstractC10273e;
import kotlinx.serialization.json.C10271c;
import kotlinx.serialization.json.C10274f;
import kotlinx.serialization.json.C10287m;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import nf.C11075i;
import p014aj.AbstractC1410d;
import p014aj.AbstractC1413e;
import p014aj.AbstractC1429h;
import p014aj.AbstractC1432i;
import p326ri.C12724x;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0004\u0012\u0006\u0010;\u001a\u000207\u0012\u0006\u0010?\u001a\u00020\u0003¢\u0006\u0004\bH\u0010IJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0014\u0010\f\u001a\u00020\u000b*\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0002J\b\u0010\r\u001a\u00020\u0003H\u0016J#\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005H\u0014J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u001d\u001a\u00020\u001cH\u0016J\u0010\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u0005H\u0004J\u0010\u0010 \u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0005H$J\u0018\u0010#\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0016H\u0014J\u0010\u0010$\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0005H\u0014J\u0010\u0010%\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0005H\u0014J\u0010\u0010'\u001a\u00020&2\u0006\u0010\u001e\u001a\u00020\u0005H\u0014J\u0010\u0010)\u001a\u00020(2\u0006\u0010\u001e\u001a\u00020\u0005H\u0014J\u0010\u0010*\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\u0005H\u0014J\u0010\u0010,\u001a\u00020+2\u0006\u0010\u001e\u001a\u00020\u0005H\u0014J\u0010\u0010.\u001a\u00020-2\u0006\u0010\u001e\u001a\u00020\u0005H\u0014J\u0010\u00100\u001a\u00020/2\u0006\u0010\u001e\u001a\u00020\u0005H\u0014J\u0010\u00102\u001a\u0002012\u0006\u0010\u001e\u001a\u00020\u0005H\u0014J\u0010\u00103\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u0005H\u0014J\u0018\u00106\u001a\u0002052\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u0016H\u0014R\u001a\u0010;\u001a\u0002078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u00108\u001a\u0004\b9\u0010:R\u001a\u0010?\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010<\u001a\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010G\u001a\u00020D8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010F\u0082\u0001\u0003JKL¨\u0006M"}, m15073d2 = {"Lcj/c;", "Lbj/b1;", "Lkotlinx/serialization/json/e;", "Lkotlinx/serialization/json/JsonElement;", "i0", "", "primitive", "", "x0", "Lkotlinx/serialization/json/JsonPrimitive;", "type", "Lkotlinx/serialization/json/m;", "g0", "g", "T", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "G", "(Lkotlinx/serialization/DeserializationStrategy;)Ljava/lang/Object;", "parentName", "childName", "c0", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/encoding/c;", "b", "", "c", "", "D", "tag", "v0", "h0", "enumDescriptor", "", "n0", "s0", "j0", "", "k0", "", "t0", "q0", "", "r0", "", "o0", "", "m0", "", "l0", "u0", "inlineDescriptor", "Lkotlinx/serialization/encoding/Decoder;", "p0", "Lkotlinx/serialization/json/Json;", "Lkotlinx/serialization/json/Json;", "d", "()Lkotlinx/serialization/json/Json;", "json", "Lkotlinx/serialization/json/JsonElement;", "w0", "()Lkotlinx/serialization/json/JsonElement;", "value", "Lkotlinx/serialization/json/c;", "e", "Lkotlinx/serialization/json/c;", "configuration", "Ldj/c;", "a", "()Ldj/c;", "serializersModule", "<init>", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/JsonElement;)V", "Lcj/d0;", "Lcj/g0;", "Lcj/h0;", "kotlinx-serialization-json"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: cj.c */
/* loaded from: classes8.dex */
public abstract class AbstractC4029c extends AbstractC3626b1 implements AbstractC10273e {

    /* renamed from: c */
    private final Json f6621c;

    /* renamed from: d */
    private final JsonElement f6622d;

    /* renamed from: e */
    protected final C10271c f6623e;

    private AbstractC4029c(Json json, JsonElement jsonElement) {
        this.f6621c = json;
        this.f6622d = jsonElement;
        this.f6623e = mo13730d().m13765e();
    }

    public /* synthetic */ AbstractC4029c(Json json, JsonElement jsonElement, DefaultConstructorMarker defaultConstructorMarker) {
        this(json, jsonElement);
    }

    /* renamed from: g0 */
    private final C10287m m33009g0(JsonPrimitive jsonPrimitive, String str) {
        C10287m mVar = jsonPrimitive instanceof C10287m ? (C10287m) jsonPrimitive : null;
        if (mVar != null) {
            return mVar;
        }
        throw C4025a0.m33034d(-1, "Unexpected 'null' when " + str + " was expected");
    }

    /* renamed from: i0 */
    private final JsonElement m33008i0() {
        JsonElement h0;
        String X = m33948X();
        return (X == null || (h0 = mo32956h0(X)) == null) ? mo32955w0() : h0;
    }

    /* renamed from: x0 */
    private final Void m32994x0(String str) {
        throw C4025a0.m33033e(-1, "Failed to parse '" + str + '\'', m33008i0().toString());
    }

    @Override // bj.AbstractC3627b2, kotlinx.serialization.encoding.Decoder
    /* renamed from: D */
    public boolean mo13910D() {
        return !(m33008i0() instanceof JsonNull);
    }

    @Override // bj.AbstractC3627b2, kotlinx.serialization.encoding.Decoder
    /* renamed from: G */
    public <T> T mo13909G(DeserializationStrategy<? extends T> deserializer) {
        C9971q.m14633g(deserializer, "deserializer");
        return (T) C4051l0.m32934d(this, deserializer);
    }

    @Override // kotlinx.serialization.encoding.AbstractC10248c
    /* renamed from: a */
    public AbstractC6514c mo13858a() {
        return mo13730d().mo611a();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: b */
    public AbstractC10248c mo13905b(SerialDescriptor descriptor) {
        boolean z;
        C9971q.m14633g(descriptor, "descriptor");
        JsonElement i0 = m33008i0();
        AbstractC1429h g = descriptor.mo13678g();
        if (C9971q.m14638b(g, AbstractC1432i.C1434b.f482a)) {
            z = true;
        } else {
            z = g instanceof AbstractC1410d;
        }
        if (z) {
            Json d = mo13730d();
            if (i0 instanceof JsonArray) {
                return new C4041h0(d, (JsonArray) i0);
            }
            throw C4025a0.m33034d(-1, "Expected " + C9951f0.m14684b(JsonArray.class) + " as the serialized body of " + descriptor.mo13676i() + ", but had " + C9951f0.m14684b(i0.getClass()));
        } else if (C9971q.m14638b(g, AbstractC1432i.C1435c.f483a)) {
            Json d2 = mo13730d();
            SerialDescriptor a = C4073u0.m32882a(descriptor.mo13677h(0), d2.mo611a());
            AbstractC1429h g2 = a.mo13678g();
            if ((g2 instanceof AbstractC1413e) || C9971q.m14638b(g2, AbstractC1429h.C1431b.f480a)) {
                Json d3 = mo13730d();
                if (i0 instanceof JsonObject) {
                    return new C4043i0(d3, (JsonObject) i0);
                }
                throw C4025a0.m33034d(-1, "Expected " + C9951f0.m14684b(JsonObject.class) + " as the serialized body of " + descriptor.mo13676i() + ", but had " + C9951f0.m14684b(i0.getClass()));
            } else if (d2.m13765e().m13742b()) {
                Json d4 = mo13730d();
                if (i0 instanceof JsonArray) {
                    return new C4041h0(d4, (JsonArray) i0);
                }
                throw C4025a0.m33034d(-1, "Expected " + C9951f0.m14684b(JsonArray.class) + " as the serialized body of " + descriptor.mo13676i() + ", but had " + C9951f0.m14684b(i0.getClass()));
            } else {
                throw C4025a0.m33035c(a);
            }
        } else {
            Json d5 = mo13730d();
            if (i0 instanceof JsonObject) {
                return new C4039g0(d5, (JsonObject) i0, null, null, 12, null);
            }
            throw C4025a0.m33034d(-1, "Expected " + C9951f0.m14684b(JsonObject.class) + " as the serialized body of " + descriptor.mo13676i() + ", but had " + C9951f0.m14684b(i0.getClass()));
        }
    }

    @Override // bj.AbstractC3627b2, kotlinx.serialization.encoding.AbstractC10248c
    /* renamed from: c */
    public void mo13857c(SerialDescriptor descriptor) {
        C9971q.m14633g(descriptor, "descriptor");
    }

    @Override // bj.AbstractC3626b1
    /* renamed from: c0 */
    protected String mo33010c0(String parentName, String childName) {
        C9971q.m14633g(parentName, "parentName");
        C9971q.m14633g(childName, "childName");
        return childName;
    }

    @Override // kotlinx.serialization.json.AbstractC10273e
    /* renamed from: d */
    public Json mo13730d() {
        return this.f6621c;
    }

    @Override // kotlinx.serialization.json.AbstractC10273e
    /* renamed from: g */
    public JsonElement mo13729g() {
        return m33008i0();
    }

    /* renamed from: h0 */
    protected abstract JsonElement mo32956h0(String str);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j0 */
    public boolean mo23884K(String tag) {
        C9971q.m14633g(tag, "tag");
        JsonPrimitive v0 = m32995v0(tag);
        if (mo13730d().m13765e().m13731m() || !m33009g0(v0, "boolean").mo13691b()) {
            try {
                Boolean d = C10274f.m13725d(v0);
                if (d != null) {
                    return d.booleanValue();
                }
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException unused) {
                m32994x0("boolean");
                throw new C11075i();
            }
        } else {
            throw C4025a0.m33033e(-1, "Boolean literal for key '" + tag + "' should be unquoted.\nUse 'isLenient = true' in 'Json {}` builder to accept non-compliant JSON.", m33008i0().toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k0 */
    public byte mo23883L(String tag) {
        Byte b;
        C9971q.m14633g(tag, "tag");
        try {
            int i = C10274f.m13720i(m32995v0(tag));
            boolean z = false;
            if (-128 <= i && i <= 127) {
                z = true;
            }
            if (z) {
                b = Byte.valueOf((byte) i);
            } else {
                b = null;
            }
            if (b != null) {
                return b.byteValue();
            }
            m32994x0("byte");
            throw new C11075i();
        } catch (IllegalArgumentException unused) {
            m32994x0("byte");
            throw new C11075i();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l0 */
    public char mo23882M(String tag) {
        char Z0;
        C9971q.m14633g(tag, "tag");
        try {
            Z0 = C12724x.m5653Z0(m32995v0(tag).mo13692a());
            return Z0;
        } catch (IllegalArgumentException unused) {
            m32994x0("char");
            throw new C11075i();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m0 */
    public double mo23881N(String tag) {
        boolean z;
        C9971q.m14633g(tag, "tag");
        try {
            double f = C10274f.m13723f(m32995v0(tag));
            if (!mo13730d().m13765e().m13743a()) {
                if (Double.isInfinite(f) || Double.isNaN(f)) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    throw C4025a0.m33037a(Double.valueOf(f), tag, m33008i0().toString());
                }
            }
            return f;
        } catch (IllegalArgumentException unused) {
            m32994x0("double");
            throw new C11075i();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n0 */
    public int mo23889O(String tag, SerialDescriptor enumDescriptor) {
        C9971q.m14633g(tag, "tag");
        C9971q.m14633g(enumDescriptor, "enumDescriptor");
        return C4027b0.m33016j(enumDescriptor, mo13730d(), m32995v0(tag).mo13692a(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o0 */
    public float mo23880P(String tag) {
        boolean z;
        C9971q.m14633g(tag, "tag");
        try {
            float h = C10274f.m13721h(m32995v0(tag));
            if (!mo13730d().m13765e().m13743a()) {
                if (Float.isInfinite(h) || Float.isNaN(h)) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    throw C4025a0.m33037a(Float.valueOf(h), tag, m33008i0().toString());
                }
            }
            return h;
        } catch (IllegalArgumentException unused) {
            m32994x0("float");
            throw new C11075i();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p0 */
    public Decoder mo33013Q(String tag, SerialDescriptor inlineDescriptor) {
        C9971q.m14633g(tag, "tag");
        C9971q.m14633g(inlineDescriptor, "inlineDescriptor");
        if (C4062p0.m32914b(inlineDescriptor)) {
            return new C4074v(new C4064q0(m32995v0(tag).mo13692a()), mo13730d());
        }
        return super.mo33013Q(tag, inlineDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: q0 */
    public int mo23879R(String tag) {
        C9971q.m14633g(tag, "tag");
        try {
            return C10274f.m13720i(m32995v0(tag));
        } catch (IllegalArgumentException unused) {
            m32994x0("int");
            throw new C11075i();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r0 */
    public long mo23878S(String tag) {
        C9971q.m14633g(tag, "tag");
        try {
            return C10274f.m13716m(m32995v0(tag));
        } catch (IllegalArgumentException unused) {
            m32994x0("long");
            throw new C11075i();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s0 */
    public boolean mo33012T(String tag) {
        C9971q.m14633g(tag, "tag");
        if (mo32956h0(tag) != JsonNull.INSTANCE) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t0 */
    public short mo23877U(String tag) {
        Short sh2;
        C9971q.m14633g(tag, "tag");
        try {
            int i = C10274f.m13720i(m32995v0(tag));
            boolean z = false;
            if (-32768 <= i && i <= 32767) {
                z = true;
            }
            if (z) {
                sh2 = Short.valueOf((short) i);
            } else {
                sh2 = null;
            }
            if (sh2 != null) {
                return sh2.shortValue();
            }
            m32994x0("short");
            throw new C11075i();
        } catch (IllegalArgumentException unused) {
            m32994x0("short");
            throw new C11075i();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u0 */
    public String mo33011V(String tag) {
        C9971q.m14633g(tag, "tag");
        JsonPrimitive v0 = m32995v0(tag);
        if (!mo13730d().m13765e().m13731m() && !m33009g0(v0, "string").mo13691b()) {
            throw C4025a0.m33033e(-1, "String literal for key '" + tag + "' should be quoted.\nUse 'isLenient = true' in 'Json {}` builder to accept non-compliant JSON.", m33008i0().toString());
        } else if (!(v0 instanceof JsonNull)) {
            return v0.mo13692a();
        } else {
            throw C4025a0.m33033e(-1, "Unexpected 'null' value instead of string literal", m33008i0().toString());
        }
    }

    /* renamed from: v0 */
    protected final JsonPrimitive m32995v0(String tag) {
        JsonPrimitive jsonPrimitive;
        C9971q.m14633g(tag, "tag");
        JsonElement h0 = mo32956h0(tag);
        if (h0 instanceof JsonPrimitive) {
            jsonPrimitive = (JsonPrimitive) h0;
        } else {
            jsonPrimitive = null;
        }
        if (jsonPrimitive != null) {
            return jsonPrimitive;
        }
        throw C4025a0.m33033e(-1, "Expected JsonPrimitive at " + tag + ", found " + h0, m33008i0().toString());
    }

    /* renamed from: w0 */
    public abstract JsonElement mo32955w0();
}
