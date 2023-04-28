package kotlinx.serialization.json;

import dj.AbstractC6514c;
import dj.C6515d;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.DeserializationStrategy;
import p045cj.C4035e0;
import p045cj.C4037f0;
import p045cj.C4055n0;
import p045cj.C4064q0;
import p045cj.C4068s0;
import p045cj.C4071u;
import p045cj.EnumC4070t0;
import p449yi.AbstractC14437h;
import p449yi.AbstractC14446m;

@Metadata(m15074d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00102\u00020\u0001:\u0001\u0013B\u0019\b\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b#\u0010$J)\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001b\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u0013\u0010\u001aR \u0010\"\u001a\u00020\u001c8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001f\u0082\u0001\u0002%&¨\u0006'"}, m15073d2 = {"Lkotlinx/serialization/json/Json;", "Lyi/m;", "T", "Lyi/h;", "serializer", "value", "", "c", "(Lyi/h;Ljava/lang/Object;)Ljava/lang/String;", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "string", "b", "(Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;", "Lkotlinx/serialization/json/JsonElement;", "element", "d", "(Lkotlinx/serialization/DeserializationStrategy;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;", "Lkotlinx/serialization/json/c;", "a", "Lkotlinx/serialization/json/c;", "e", "()Lkotlinx/serialization/json/c;", "configuration", "Ldj/c;", "Ldj/c;", "()Ldj/c;", "serializersModule", "Lcj/u;", "Lcj/u;", "f", "()Lcj/u;", "get_schemaCache$kotlinx_serialization_json$annotations", "()V", "_schemaCache", "<init>", "(Lkotlinx/serialization/json/c;Ldj/c;)V", "Lkotlinx/serialization/json/Json$a;", "Lkotlinx/serialization/json/j;", "kotlinx-serialization-json"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes8.dex */
public abstract class Json implements AbstractC14446m {

    /* renamed from: d */
    public static final C10266a f22543d = new C10266a(null);

    /* renamed from: a */
    private final C10271c f22544a;

    /* renamed from: b */
    private final AbstractC6514c f22545b;

    /* renamed from: c */
    private final C4071u f22546c;

    @Metadata(m15074d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m15073d2 = {"Lkotlinx/serialization/json/Json$a;", "Lkotlinx/serialization/json/Json;", "<init>", "()V", "kotlinx-serialization-json"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: kotlinx.serialization.json.Json$a */
    /* loaded from: classes8.dex */
    public static final class C10266a extends Json {
        private C10266a() {
            super(new C10271c(false, false, false, false, false, false, null, false, false, null, false, false, null, 8191, null), C6515d.m25386a(), null);
        }

        public /* synthetic */ C10266a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private Json(C10271c cVar, AbstractC6514c cVar2) {
        this.f22544a = cVar;
        this.f22545b = cVar2;
        this.f22546c = new C4071u();
    }

    public /* synthetic */ Json(C10271c cVar, AbstractC6514c cVar2, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, cVar2);
    }

    @Override // p449yi.AbstractC14434e
    /* renamed from: a */
    public AbstractC6514c mo611a() {
        return this.f22545b;
    }

    @Override // p449yi.AbstractC14446m
    /* renamed from: b */
    public final <T> T mo578b(DeserializationStrategy<? extends T> deserializer, String string) {
        C9971q.m14633g(deserializer, "deserializer");
        C9971q.m14633g(string, "string");
        C4064q0 q0Var = new C4064q0(string);
        T t = (T) new C4055n0(this, EnumC4070t0.OBJ, q0Var, deserializer.getDescriptor(), null).mo13909G(deserializer);
        q0Var.m33041w();
        return t;
    }

    @Override // p449yi.AbstractC14446m
    /* renamed from: c */
    public final <T> String mo577c(AbstractC14437h<? super T> serializer, T t) {
        C9971q.m14633g(serializer, "serializer");
        C4037f0 f0Var = new C4037f0();
        try {
            C4035e0.m32982a(this, f0Var, serializer, t);
            return f0Var.toString();
        } finally {
            f0Var.m32976g();
        }
    }

    /* renamed from: d */
    public final <T> T m13766d(DeserializationStrategy<? extends T> deserializer, JsonElement element) {
        C9971q.m14633g(deserializer, "deserializer");
        C9971q.m14633g(element, "element");
        return (T) C4068s0.m32889a(this, element, deserializer);
    }

    /* renamed from: e */
    public final C10271c m13765e() {
        return this.f22544a;
    }

    /* renamed from: f */
    public final C4071u m13764f() {
        return this.f22546c;
    }
}
