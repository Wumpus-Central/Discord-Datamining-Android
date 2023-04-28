package net.time4j.p248tz;

import java.io.Serializable;

/* renamed from: net.time4j.tz.e */
/* loaded from: classes8.dex */
class C10995e implements AbstractC11001k, Serializable {
    private static final long serialVersionUID = -4889632013137688471L;
    private final String tzid;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10995e(String str) {
        this.tzid = str;
    }

    @Override // net.time4j.p248tz.AbstractC11001k
    /* renamed from: a */
    public String mo11196a() {
        return this.tzid;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C10995e) {
            return this.tzid.equals(((C10995e) obj).tzid);
        }
        return false;
    }

    public int hashCode() {
        return this.tzid.hashCode();
    }

    public String toString() {
        return getClass().getName() + "@" + this.tzid;
    }
}
