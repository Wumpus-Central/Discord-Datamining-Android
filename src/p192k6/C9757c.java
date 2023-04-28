package p192k6;

import java.io.Serializable;
import p171j6.AbstractC9498e;

/* renamed from: k6.c */
/* loaded from: classes7.dex */
public class C9757c implements AbstractC9498e, Serializable {

    /* renamed from: l */
    private static final C9756b f21731l = C9756b.m15417a();

    /* renamed from: k */
    protected final String f21732k;

    public C9757c(String str) {
        if (str != null) {
            this.f21732k = str;
            return;
        }
        throw new IllegalStateException("Null String illegal for SerializedString");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return this.f21732k.equals(((C9757c) obj).f21732k);
    }

    public final int hashCode() {
        return this.f21732k.hashCode();
    }

    public final String toString() {
        return this.f21732k;
    }
}
