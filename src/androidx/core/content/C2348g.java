package androidx.core.content;

import android.content.LocusId;
import android.os.Build;
import androidx.core.util.C2517g;

/* renamed from: androidx.core.content.g */
/* loaded from: classes.dex */
public final class C2348g {

    /* renamed from: a */
    private final String f3234a;

    /* renamed from: b */
    private final LocusId f3235b;

    /* renamed from: androidx.core.content.g$a */
    /* loaded from: classes.dex */
    private static class C2349a {
        /* renamed from: a */
        static LocusId m38101a(String str) {
            return new LocusId(str);
        }

        /* renamed from: b */
        static String m38100b(LocusId locusId) {
            String id2;
            id2 = locusId.getId();
            return id2;
        }
    }

    public C2348g(String str) {
        this.f3234a = (String) C2517g.m37584k(str, "id cannot be empty");
        if (Build.VERSION.SDK_INT >= 29) {
            this.f3235b = C2349a.m38101a(str);
        } else {
            this.f3235b = null;
        }
    }

    /* renamed from: b */
    private String m38104b() {
        int length = this.f3234a.length();
        return length + "_chars";
    }

    /* renamed from: d */
    public static C2348g m38102d(LocusId locusId) {
        C2517g.m37587h(locusId, "locusId cannot be null");
        return new C2348g((String) C2517g.m37584k(C2349a.m38100b(locusId), "id cannot be empty"));
    }

    /* renamed from: a */
    public String m38105a() {
        return this.f3234a;
    }

    /* renamed from: c */
    public LocusId m38103c() {
        return this.f3235b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2348g.class != obj.getClass()) {
            return false;
        }
        C2348g gVar = (C2348g) obj;
        String str = this.f3234a;
        if (str != null) {
            return str.equals(gVar.f3234a);
        }
        if (gVar.f3234a == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f3234a;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "LocusIdCompat[" + m38104b() + "]";
    }
}
