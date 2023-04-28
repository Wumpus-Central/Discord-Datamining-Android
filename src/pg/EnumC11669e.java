package pg;

import kotlin.jvm.internal.DefaultConstructorMarker;
import ni.C11148a;

/* renamed from: pg.e */
/* loaded from: classes8.dex */
public enum EnumC11669e {
    FIELD(null, 1, null),
    FILE(null, 1, null),
    PROPERTY(null, 1, null),
    PROPERTY_GETTER("get"),
    PROPERTY_SETTER("set"),
    RECEIVER(null, 1, null),
    CONSTRUCTOR_PARAMETER("param"),
    SETTER_PARAMETER("setparam"),
    PROPERTY_DELEGATE_FIELD("delegate");
    

    /* renamed from: k */
    private final String f26037k;

    EnumC11669e(String str) {
        this.f26037k = str == null ? C11148a.m10720f(name()) : str;
    }

    /* renamed from: b */
    public final String m9053b() {
        return this.f26037k;
    }

    /* synthetic */ EnumC11669e(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
