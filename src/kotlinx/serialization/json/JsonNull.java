package kotlinx.serialization.json;

import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9973s;
import kotlinx.serialization.KSerializer;
import nf.C11084n;
import nf.EnumC11087p;
import p449yi.AbstractC14435f;

@AbstractC14435f(with = C10291q.class)
@Metadata(m15074d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002HÆ\u0001R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m15073d2 = {"Lkotlinx/serialization/json/JsonNull;", "Lkotlinx/serialization/json/JsonPrimitive;", "Lkotlinx/serialization/KSerializer;", "serializer", "", "k", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "content", "", "b", "()Z", "isString", "<init>", "()V", "kotlinx-serialization-json"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes8.dex */
public final class JsonNull extends JsonPrimitive {
    public static final JsonNull INSTANCE = new JsonNull();

    /* renamed from: k */
    private static final String f22561k = "null";

    /* renamed from: l */
    private static final /* synthetic */ Lazy<KSerializer<Object>> f22562l;

    @Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: kotlinx.serialization.json.JsonNull$a */
    /* loaded from: classes8.dex */
    static final class C10267a extends AbstractC9973s implements Function0<KSerializer<Object>> {

        /* renamed from: k */
        public static final C10267a f22563k = new C10267a();

        C10267a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final KSerializer<Object> invoke() {
            return C10291q.f22598a;
        }
    }

    static {
        Lazy<KSerializer<Object>> b;
        b = C11084n.m10944b(EnumC11087p.PUBLICATION, C10267a.f22563k);
        f22562l = b;
    }

    private JsonNull() {
        super(null);
    }

    /* renamed from: f */
    private final /* synthetic */ Lazy m13755f() {
        return f22562l;
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    /* renamed from: a */
    public String mo13692a() {
        return f22561k;
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    /* renamed from: b */
    public boolean mo13691b() {
        return false;
    }

    public final KSerializer<JsonNull> serializer() {
        return (KSerializer) m13755f().getValue();
    }
}
