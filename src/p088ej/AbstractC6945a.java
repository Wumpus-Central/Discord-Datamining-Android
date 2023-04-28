package p088ej;

import bj.AbstractC3623b;
import bj.AbstractC3626b1;
import bj.AbstractC3632c1;
import com.facebook.react.uimanager.ViewDefaults;
import dj.AbstractC6514c;
import dj.C6515d;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractC10248c;
import p014aj.AbstractC1432i;
import p267of.C11289v;
import p326ri.C12718u;
import p326ri.C12724x;
import p449yi.AbstractC14434e;
import p449yi.AbstractC14437h;
import p449yi.C14433d;
import p449yi.C14436g;

@Metadata(m15074d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00192\u00020\u0001:\u0005\u0011\u0019\u001a\u000e\tB\u001b\b\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J7\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\t\u0010\nJ7\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013\u0082\u0001\u0001\u001b¨\u0006\u001c"}, m15073d2 = {"Lej/a;", "Lyi/e;", "T", "Lyi/h;", "serializer", "value", "", "", "", "e", "(Lyi/h;Ljava/lang/Object;)Ljava/util/Map;", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "map", "d", "(Lkotlinx/serialization/DeserializationStrategy;Ljava/util/Map;)Ljava/lang/Object;", "Ldj/c;", "a", "Ldj/c;", "()Ldj/c;", "serializersModule", "", "ctorMarker", "<init>", "(Ldj/c;Ljava/lang/Void;)V", "b", "c", "Lej/a$a;", "kotlinx-serialization-properties"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: ej.a */
/* loaded from: classes8.dex */
public abstract class AbstractC6945a implements AbstractC14434e {

    /* renamed from: b */
    public static final C0210a f15096b = new C0210a(null);

    /* renamed from: a */
    private final AbstractC6514c f15097a;

    @Metadata(m15074d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m15073d2 = {"Lej/a$a;", "Lej/a;", "<init>", "()V", "kotlinx-serialization-properties"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: ej.a$a */
    /* loaded from: classes8.dex */
    public static final class C0210a extends AbstractC6945a {
        private C0210a() {
            super(C6515d.m25386a(), null, null);
        }

        public /* synthetic */ C0210a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m15074d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\b¢\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B#\u0012\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u00000\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b,\u0010-J\u001a\u0010\u0007\u001a\f\u0012\u0004\u0012\u00028\u00000\u0000R\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H$J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004J!\u0010\r\u001a\u00028\u0001\"\u0004\b\u0001\u0010\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0004H\u0004J\u000e\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0004R&\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u00000\u00178\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\"\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0016\u0010%\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010$¨\u0006."}, m15073d2 = {"Lej/a$b;", "", "Value", "Lbj/b1;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lej/a;", "j0", "Lkotlinx/serialization/encoding/c;", "b", "T", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "G", "(Lkotlinx/serialization/DeserializationStrategy;)Ljava/lang/Object;", "", "tag", "h0", "(Ljava/lang/String;)Ljava/lang/Object;", "enumDescriptor", "", "g0", "o", "", "c", "Ljava/util/Map;", "i0", "()Ljava/util/Map;", "map", "Ldj/c;", "d", "Ldj/c;", "a", "()Ldj/c;", "serializersModule", "e", "I", "currentIndex", "", "f", "Z", "isCollection", "g", "size", "<init>", "(Lej/a;Ljava/util/Map;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "kotlinx-serialization-properties"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: ej.a$b */
    /* loaded from: classes8.dex */
    public abstract class AbstractC6946b<Value> extends AbstractC3626b1 {

        /* renamed from: c */
        private final Map<String, Value> f15098c;

        /* renamed from: d */
        private final AbstractC6514c f15099d;

        /* renamed from: e */
        private int f15100e;

        /* renamed from: f */
        private final boolean f15101f;

        /* renamed from: g */
        private final int f15102g;

        /* renamed from: h */
        final /* synthetic */ AbstractC6945a f15103h;

        /* JADX WARN: Multi-variable type inference failed */
        public AbstractC6946b(AbstractC6945a aVar, Map<String, ? extends Value> map, SerialDescriptor descriptor) {
            boolean z;
            int i;
            C9971q.m14633g(map, "map");
            C9971q.m14633g(descriptor, "descriptor");
            this.f15103h = aVar;
            this.f15098c = map;
            this.f15099d = aVar.mo611a();
            if (C9971q.m14638b(descriptor.mo13678g(), AbstractC1432i.C1434b.f482a) || C9971q.m14638b(descriptor.mo13678g(), AbstractC1432i.C1435c.f483a)) {
                z = true;
            } else {
                z = false;
            }
            this.f15101f = z;
            if (z) {
                i = ViewDefaults.NUMBER_OF_LINES;
            } else {
                i = descriptor.mo13681d();
            }
            this.f15102g = i;
        }

        @Override // bj.AbstractC3627b2, kotlinx.serialization.encoding.Decoder
        /* renamed from: G */
        public final <T> T mo13909G(DeserializationStrategy<? extends T> deserializer) {
            String str;
            C9971q.m14633g(deserializer, "deserializer");
            Value value = this.f15098c.get("type");
            if (value != null) {
                str = value.toString();
            } else {
                str = null;
            }
            if (deserializer instanceof AbstractC3623b) {
                return (T) C14433d.m613a((AbstractC3623b) deserializer, this, str).deserialize(this);
            }
            return (T) deserializer.deserialize(this);
        }

        @Override // kotlinx.serialization.encoding.AbstractC10248c
        /* renamed from: a */
        public AbstractC6514c mo13858a() {
            return this.f15099d;
        }

        @Override // kotlinx.serialization.encoding.Decoder
        /* renamed from: b */
        public final AbstractC10248c mo13905b(SerialDescriptor descriptor) {
            C9971q.m14633g(descriptor, "descriptor");
            AbstractC6946b<Value> j0 = mo23876j0(descriptor);
            m33950I(j0);
            return j0;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: g0 */
        public final int mo23889O(String tag, SerialDescriptor enumDescriptor) {
            Object i;
            C9971q.m14633g(tag, "tag");
            C9971q.m14633g(enumDescriptor, "enumDescriptor");
            i = C11289v.m10250i(this.f15098c, tag);
            if (i instanceof Integer) {
                return ((Number) i).intValue();
            }
            if (i instanceof String) {
                int c = enumDescriptor.mo13682c((String) i);
                if (c != -3) {
                    return c;
                }
                throw new C14436g("Enum '" + enumDescriptor.mo13676i() + "' does not contain element with name '" + i + '\'');
            }
            throw new C14436g("Value of enum entry '" + tag + "' is neither an Int nor a String");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: h0 */
        public final Value mo23888W(String tag) {
            Object i;
            C9971q.m14633g(tag, "tag");
            i = C11289v.m10250i(this.f15098c, tag);
            return (Value) i;
        }

        /* renamed from: i0 */
        protected final Map<String, Value> m23885i0() {
            return this.f15098c;
        }

        /* renamed from: j0 */
        protected abstract AbstractC6946b<Value> mo23876j0(SerialDescriptor serialDescriptor);

        @Override // kotlinx.serialization.encoding.AbstractC10248c
        /* renamed from: o */
        public final int mo13851o(SerialDescriptor descriptor) {
            boolean H;
            boolean z;
            C9971q.m14633g(descriptor, "descriptor");
            do {
                int i = this.f15100e;
                if (i >= this.f15102g) {
                    return -1;
                }
                this.f15100e = i + 1;
                String e0 = mo33947Y(descriptor, i);
                Set<String> keySet = this.f15098c.keySet();
                boolean z2 = false;
                if (!(keySet instanceof Collection) || !keySet.isEmpty()) {
                    Iterator<T> it = keySet.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        String str = (String) it.next();
                        H = C12718u.m5736H(str, e0, false, 2, null);
                        if (!H || !(str.length() == e0.length() || str.charAt(e0.length()) == '.')) {
                            z = false;
                            continue;
                        } else {
                            z = true;
                            continue;
                        }
                        if (z) {
                            z2 = true;
                            break;
                        }
                    }
                }
                if (z2) {
                    return this.f15100e - 1;
                }
            } while (!this.f15101f);
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m15074d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\f\u0012\u0004\u0012\u00020\u00020\u0001R\u00020\u0003B#\u0012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0018\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\u0014\u0010\u0006\u001a\u00060\u0000R\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0014J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0002H\u0014J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0002H\u0014J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0002H\u0014J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0002H\u0014J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0002H\u0014J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u0002H\u0014J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u0002H\u0014¨\u0006\u001c"}, m15073d2 = {"Lej/a$c;", "Lej/a$b;", "", "Lej/a;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "s0", "tag", "", "k0", "", "l0", "", "r0", "", "p0", "", "q0", "", "o0", "", "n0", "", "m0", "", "map", "<init>", "(Lej/a;Ljava/util/Map;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "kotlinx-serialization-properties"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: ej.a$c */
    /* loaded from: classes8.dex */
    public final class C6947c extends AbstractC6946b<String> {

        /* renamed from: i */
        final /* synthetic */ AbstractC6945a f15104i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6947c(AbstractC6945a aVar, Map<String, String> map, SerialDescriptor descriptor) {
            super(aVar, map, descriptor);
            C9971q.m14633g(map, "map");
            C9971q.m14633g(descriptor, "descriptor");
            this.f15104i = aVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: k0 */
        public boolean mo23884K(String tag) {
            C9971q.m14633g(tag, "tag");
            return Boolean.parseBoolean(mo23888W(tag));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: l0 */
        public byte mo23883L(String tag) {
            C9971q.m14633g(tag, "tag");
            return Byte.parseByte(mo23888W(tag));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: m0 */
        public char mo23882M(String tag) {
            char Z0;
            C9971q.m14633g(tag, "tag");
            Z0 = C12724x.m5653Z0(mo23888W(tag));
            return Z0;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: n0 */
        public double mo23881N(String tag) {
            C9971q.m14633g(tag, "tag");
            return Double.parseDouble(mo23888W(tag));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: o0 */
        public float mo23880P(String tag) {
            C9971q.m14633g(tag, "tag");
            return Float.parseFloat(mo23888W(tag));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: p0 */
        public int mo23879R(String tag) {
            C9971q.m14633g(tag, "tag");
            return Integer.parseInt(mo23888W(tag));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: q0 */
        public long mo23878S(String tag) {
            C9971q.m14633g(tag, "tag");
            return Long.parseLong(mo23888W(tag));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: r0 */
        public short mo23877U(String tag) {
            C9971q.m14633g(tag, "tag");
            return Short.parseShort(mo23888W(tag));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: s0 */
        public C6947c mo23876j0(SerialDescriptor descriptor) {
            C9971q.m14633g(descriptor, "descriptor");
            return new C6947c(this.f15104i, m23885i0(), descriptor);
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\f\u0012\u0004\u0012\u00020\u00020\u0001R\u00020\u0003B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0014¨\u0006\b"}, m15073d2 = {"Lej/a$d;", "Lej/a$e;", "", "Lej/a;", "value", "g0", "<init>", "(Lej/a;)V", "kotlinx-serialization-properties"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: ej.a$d */
    /* loaded from: classes8.dex */
    private final class C6948d extends AbstractC6949e<Object> {
        public C6948d() {
            super();
        }

        @Override // p088ej.AbstractC6945a.AbstractC6949e
        /* renamed from: g0 */
        protected Object mo23863g0(Object value) {
            C9971q.m14633g(value, "value");
            return value;
        }
    }

    @Metadata(m15074d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\b\b¢\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\"\u0010#J\u0017\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0001H$¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\u000b\u001a\u00020\n\"\u0004\b\u0001\u0010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b2\u0006\u0010\u0004\u001a\u00028\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0001H\u0014J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0014J \u0010\u0015\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0014R\u001a\u0010\u001b\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR#\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00028\u00000\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, m15073d2 = {"Lej/a$e;", "", "Value", "Lbj/c1;", "value", "g0", "(Ljava/lang/Object;)Ljava/lang/Object;", "T", "Lyi/h;", "serializer", "", "r", "(Lyi/h;Ljava/lang/Object;)V", "", "tag", "j0", "i0", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "enumDescriptor", "", "ordinal", "h0", "Ldj/c;", "b", "Ldj/c;", "a", "()Ldj/c;", "serializersModule", "", "c", "Ljava/util/Map;", "k0", "()Ljava/util/Map;", "map", "<init>", "(Lej/a;)V", "kotlinx-serialization-properties"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: ej.a$e */
    /* loaded from: classes8.dex */
    private abstract class AbstractC6949e<Value> extends AbstractC3632c1 {

        /* renamed from: b */
        private final AbstractC6514c f15106b;

        /* renamed from: c */
        private final Map<String, Value> f15107c = new LinkedHashMap();

        public AbstractC6949e() {
            this.f15106b = AbstractC6945a.this.mo611a();
        }

        @Override // kotlinx.serialization.encoding.Encoder
        /* renamed from: a */
        public AbstractC6514c mo13917a() {
            return this.f15106b;
        }

        /* renamed from: g0 */
        protected abstract Value mo23863g0(Object obj);

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: h0 */
        public void mo23866M(String tag, SerialDescriptor enumDescriptor, int i) {
            C9971q.m14633g(tag, "tag");
            C9971q.m14633g(enumDescriptor, "enumDescriptor");
            this.f15107c.put(tag, mo23863g0(enumDescriptor.mo13680e(i)));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: i0 */
        public void mo23865S(String tag) {
            C9971q.m14633g(tag, "tag");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: j0 */
        public void mo23864V(String tag, Object value) {
            C9971q.m14633g(tag, "tag");
            C9971q.m14633g(value, "value");
            this.f15107c.put(tag, mo23863g0(value));
        }

        /* renamed from: k0 */
        public final Map<String, Value> m23859k0() {
            return this.f15107c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // bj.AbstractC3633c2, kotlinx.serialization.encoding.Encoder
        /* renamed from: r */
        public final <T> void mo13872r(AbstractC14437h<? super T> serializer, T t) {
            C9971q.m14633g(serializer, "serializer");
            if (serializer instanceof AbstractC3623b) {
                C9971q.m14635e(t, "null cannot be cast to non-null type kotlin.Any");
                C14433d.m612b((AbstractC3623b) serializer, this, t).serialize(this, t);
                return;
            }
            serializer.serialize(this, t);
        }
    }

    private AbstractC6945a(AbstractC6514c cVar, Void r2) {
        this.f15097a = cVar;
    }

    public /* synthetic */ AbstractC6945a(AbstractC6514c cVar, Void r2, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, r2);
    }

    @Override // p449yi.AbstractC14434e
    /* renamed from: a */
    public AbstractC6514c mo611a() {
        return this.f15097a;
    }

    /* renamed from: d */
    public final <T> T m23891d(DeserializationStrategy<? extends T> deserializer, Map<String, String> map) {
        C9971q.m14633g(deserializer, "deserializer");
        C9971q.m14633g(map, "map");
        return (T) new C6947c(this, map, deserializer.getDescriptor()).mo13909G(deserializer);
    }

    /* renamed from: e */
    public final <T> Map<String, Object> m23890e(AbstractC14437h<? super T> serializer, T t) {
        C9971q.m14633g(serializer, "serializer");
        C6948d dVar = new C6948d();
        dVar.mo13872r(serializer, t);
        return dVar.m23859k0();
    }
}
