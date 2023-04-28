package p100f9;

import java.io.File;

/* renamed from: f9.d */
/* loaded from: classes5.dex */
public class C7092d implements Comparable<C7092d> {

    /* renamed from: k */
    public final String f15471k;

    /* renamed from: l */
    public final long f15472l;

    /* renamed from: m */
    public final long f15473m;

    /* renamed from: n */
    public final boolean f15474n;

    /* renamed from: o */
    public final File f15475o;

    /* renamed from: p */
    public final long f15476p;

    public C7092d(String str, long j, long j2, long j3, File file) {
        boolean z;
        this.f15471k = str;
        this.f15472l = j;
        this.f15473m = j2;
        if (file != null) {
            z = true;
        } else {
            z = false;
        }
        this.f15474n = z;
        this.f15475o = file;
        this.f15476p = j3;
    }

    /* renamed from: a */
    public int compareTo(C7092d dVar) {
        if (!this.f15471k.equals(dVar.f15471k)) {
            return this.f15471k.compareTo(dVar.f15471k);
        }
        int i = ((this.f15472l - dVar.f15472l) > 0L ? 1 : ((this.f15472l - dVar.f15472l) == 0L ? 0 : -1));
        if (i == 0) {
            return 0;
        }
        if (i < 0) {
            return -1;
        }
        return 1;
    }

    /* renamed from: b */
    public boolean m23431b() {
        return !this.f15474n;
    }

    /* renamed from: c */
    public boolean m23430c() {
        return this.f15473m == -1;
    }

    public String toString() {
        return "[" + this.f15472l + ", " + this.f15473m + "]";
    }
}
