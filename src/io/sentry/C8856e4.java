package io.sentry;

import io.sentry.util.C9111k;
import io.sentry.util.C9115o;
import java.util.UUID;

/* renamed from: io.sentry.e4 */
/* loaded from: classes8.dex */
public final class C8856e4 implements AbstractC8806b1 {

    /* renamed from: l */
    public static final C8856e4 f19548l = new C8856e4(new UUID(0, 0));

    /* renamed from: k */
    private final String f19549k;

    /* renamed from: io.sentry.e4$a */
    /* loaded from: classes8.dex */
    public static final class C8857a implements AbstractC9030r0<C8856e4> {
        /* renamed from: b */
        public C8856e4 mo16758a(C9146x0 x0Var, AbstractC8869g0 g0Var) {
            return new C8856e4(x0Var.m16941f0());
        }
    }

    public C8856e4(String str) {
        this.f19549k = (String) C9111k.m16995a(str, "value is required");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8856e4.class != obj.getClass()) {
            return false;
        }
        return this.f19549k.equals(((C8856e4) obj).f19549k);
    }

    public int hashCode() {
        return this.f19549k.hashCode();
    }

    @Override // io.sentry.AbstractC8806b1
    public void serialize(C9161z0 z0Var, AbstractC8869g0 g0Var) {
        z0Var.m16918f0(this.f19549k);
    }

    public String toString() {
        return this.f19549k;
    }

    public C8856e4() {
        this(UUID.randomUUID());
    }

    private C8856e4(UUID uuid) {
        this(C9115o.m16982d(uuid.toString()).replace("-", "").substring(0, 16));
    }
}
