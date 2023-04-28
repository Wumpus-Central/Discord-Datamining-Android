package io.sentry.clientreport;

import java.util.Objects;

/* renamed from: io.sentry.clientreport.c */
/* loaded from: classes8.dex */
final class C8825c {

    /* renamed from: a */
    private final String f19505a;

    /* renamed from: b */
    private final String f19506b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8825c(String str, String str2) {
        this.f19505a = str;
        this.f19506b = str2;
    }

    /* renamed from: a */
    public String m17952a() {
        return this.f19506b;
    }

    /* renamed from: b */
    public String m17951b() {
        return this.f19505a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8825c)) {
            return false;
        }
        C8825c cVar = (C8825c) obj;
        if (!Objects.equals(m17951b(), cVar.m17951b()) || !Objects.equals(m17952a(), cVar.m17952a())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hash(m17951b(), m17952a());
    }
}
