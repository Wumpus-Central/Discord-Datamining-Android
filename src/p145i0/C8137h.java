package p145i0;

import android.net.Uri;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: i0.h */
/* loaded from: classes.dex */
public final class C8137h extends AbstractC8190t {

    /* renamed from: a */
    private final Uri f17599a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8137h(Uri uri) {
        if (uri != null) {
            this.f17599a = uri;
            return;
        }
        throw new NullPointerException("Null outputUri");
    }

    @Override // p145i0.AbstractC8190t
    /* renamed from: a */
    public Uri mo20344a() {
        return this.f17599a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8190t) {
            return this.f17599a.equals(((AbstractC8190t) obj).mo20344a());
        }
        return false;
    }

    public int hashCode() {
        return this.f17599a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "OutputResults{outputUri=" + this.f17599a + "}";
    }
}
