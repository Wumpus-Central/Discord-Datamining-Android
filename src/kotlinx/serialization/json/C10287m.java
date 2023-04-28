package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p045cj.C4066r0;

@Metadata(m15074d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B%\b\u0000\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0017R\u001a\u0010\u000e\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, m15073d2 = {"Lkotlinx/serialization/json/m;", "Lkotlinx/serialization/json/JsonPrimitive;", "", "toString", "", "other", "", "equals", "", "hashCode", "k", "Z", "b", "()Z", "isString", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "l", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "f", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "coerceToInlineType", "m", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "content", "body", "<init>", "(Ljava/lang/Object;ZLkotlinx/serialization/descriptors/SerialDescriptor;)V", "kotlinx-serialization-json"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: kotlinx.serialization.json.m */
/* loaded from: classes8.dex */
public final class C10287m extends JsonPrimitive {

    /* renamed from: k */
    private final boolean f22593k;

    /* renamed from: l */
    private final SerialDescriptor f22594l;

    /* renamed from: m */
    private final String f22595m;

    public /* synthetic */ C10287m(Object obj, boolean z, SerialDescriptor serialDescriptor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, z, (i & 4) != 0 ? null : serialDescriptor);
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    /* renamed from: a */
    public String mo13692a() {
        return this.f22595m;
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    /* renamed from: b */
    public boolean mo13691b() {
        return this.f22593k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10287m.class != obj.getClass()) {
            return false;
        }
        C10287m mVar = (C10287m) obj;
        if (mo13691b() == mVar.mo13691b() && C9971q.m14638b(mo13692a(), mVar.mo13692a())) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final SerialDescriptor m13690f() {
        return this.f22594l;
    }

    public int hashCode() {
        return (C10286l.m13693a(mo13691b()) * 31) + mo13692a().hashCode();
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public String toString() {
        if (!mo13691b()) {
            return mo13692a();
        }
        StringBuilder sb2 = new StringBuilder();
        C4066r0.m32893c(sb2, mo13692a());
        String sb3 = sb2.toString();
        C9971q.m14634f(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10287m(Object body, boolean z, SerialDescriptor serialDescriptor) {
        super(null);
        C9971q.m14633g(body, "body");
        this.f22593k = z;
        this.f22594l = serialDescriptor;
        this.f22595m = body.toString();
        if (serialDescriptor != null && !serialDescriptor.isInline()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }
}
