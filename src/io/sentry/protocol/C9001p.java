package io.sentry.protocol;

import io.sentry.AbstractC8806b1;
import io.sentry.AbstractC8869g0;
import io.sentry.AbstractC9030r0;
import io.sentry.C9146x0;
import io.sentry.C9161z0;
import io.sentry.util.C9115o;
import java.util.UUID;

/* renamed from: io.sentry.protocol.p */
/* loaded from: classes8.dex */
public final class C9001p implements AbstractC8806b1 {

    /* renamed from: l */
    public static final C9001p f19786l = new C9001p(new UUID(0, 0));

    /* renamed from: k */
    private final UUID f19787k;

    /* renamed from: io.sentry.protocol.p$a */
    /* loaded from: classes8.dex */
    public static final class C9002a implements AbstractC9030r0<C9001p> {
        /* renamed from: b */
        public C9001p mo16758a(C9146x0 x0Var, AbstractC8869g0 g0Var) {
            return new C9001p(x0Var.m16941f0());
        }
    }

    public C9001p() {
        this((UUID) null);
    }

    /* renamed from: a */
    private UUID m17316a(String str) {
        if (str.length() == 32) {
            str = new StringBuilder(str).insert(8, "-").insert(13, "-").insert(18, "-").insert(23, "-").toString();
        }
        if (str.length() == 36) {
            return UUID.fromString(str);
        }
        throw new IllegalArgumentException("String representation of SentryId has either 32 (UUID no dashes) or 36 characters long (completed UUID). Received: " + str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C9001p.class == obj.getClass() && this.f19787k.compareTo(((C9001p) obj).f19787k) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f19787k.hashCode();
    }

    @Override // io.sentry.AbstractC8806b1
    public void serialize(C9161z0 z0Var, AbstractC8869g0 g0Var) {
        z0Var.m16918f0(toString());
    }

    public String toString() {
        return C9115o.m16982d(this.f19787k.toString()).replace("-", "");
    }

    public C9001p(UUID uuid) {
        this.f19787k = uuid == null ? UUID.randomUUID() : uuid;
    }

    public C9001p(String str) {
        this.f19787k = m17316a(C9115o.m16982d(str));
    }
}
