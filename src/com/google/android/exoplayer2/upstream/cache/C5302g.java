package com.google.android.exoplayer2.upstream.cache;

import java.io.File;
import java.util.ArrayList;
import java.util.TreeSet;
import p100f9.C7092d;
import p100f9.C7095g;
import p100f9.C7096h;
import p119g9.C7510a;
import p119g9.C7558r;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.exoplayer2.upstream.cache.g */
/* loaded from: classes5.dex */
public final class C5302g {

    /* renamed from: a */
    public final int f9829a;

    /* renamed from: b */
    public final String f9830b;

    /* renamed from: c */
    private final TreeSet<C5308i> f9831c;

    /* renamed from: d */
    private final ArrayList<C5303a> f9832d;

    /* renamed from: e */
    private C7096h f9833e;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.exoplayer2.upstream.cache.g$a */
    /* loaded from: classes5.dex */
    public static final class C5303a {

        /* renamed from: a */
        public final long f9834a;

        /* renamed from: b */
        public final long f9835b;

        public C5303a(long j, long j2) {
            this.f9834a = j;
            this.f9835b = j2;
        }

        /* renamed from: a */
        public boolean m29542a(long j, long j2) {
            long j3 = this.f9835b;
            if (j3 == -1) {
                if (j >= this.f9834a) {
                    return true;
                }
                return false;
            } else if (j2 == -1) {
                return false;
            } else {
                long j4 = this.f9834a;
                if (j4 > j || j + j2 > j4 + j3) {
                    return false;
                }
                return true;
            }
        }

        /* renamed from: b */
        public boolean m29541b(long j, long j2) {
            long j3 = this.f9834a;
            if (j3 <= j) {
                long j4 = this.f9835b;
                if (j4 == -1 || j3 + j4 > j) {
                    return true;
                }
                return false;
            } else if (j2 == -1 || j + j2 > j3) {
                return true;
            } else {
                return false;
            }
        }
    }

    public C5302g(int i, String str) {
        this(i, str, C7096h.f15479c);
    }

    /* renamed from: a */
    public void m29554a(C5308i iVar) {
        this.f9831c.add(iVar);
    }

    /* renamed from: b */
    public boolean m29553b(C7095g gVar) {
        C7096h hVar = this.f9833e;
        C7096h e = hVar.m23415e(gVar);
        this.f9833e = e;
        return !e.equals(hVar);
    }

    /* renamed from: c */
    public C7096h m29552c() {
        return this.f9833e;
    }

    /* renamed from: d */
    public C5308i m29551d(long j, long j2) {
        C5308i h = C5308i.m29496h(this.f9830b, j);
        C5308i floor = this.f9831c.floor(h);
        if (floor != null && floor.f15472l + floor.f15473m > j) {
            return floor;
        }
        C5308i ceiling = this.f9831c.ceiling(h);
        if (ceiling != null) {
            long j3 = ceiling.f15472l - j;
            if (j2 == -1) {
                j2 = j3;
            } else {
                j2 = Math.min(j3, j2);
            }
        }
        return C5308i.m29497g(this.f9830b, j, j2);
    }

    /* renamed from: e */
    public TreeSet<C5308i> m29550e() {
        return this.f9831c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5302g.class != obj.getClass()) {
            return false;
        }
        C5302g gVar = (C5302g) obj;
        if (this.f9829a != gVar.f9829a || !this.f9830b.equals(gVar.f9830b) || !this.f9831c.equals(gVar.f9831c) || !this.f9833e.equals(gVar.f9833e)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public boolean m29549f() {
        return this.f9831c.isEmpty();
    }

    /* renamed from: g */
    public boolean m29548g(long j, long j2) {
        for (int i = 0; i < this.f9832d.size(); i++) {
            if (this.f9832d.get(i).m29542a(j, j2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public boolean m29547h() {
        return this.f9832d.isEmpty();
    }

    public int hashCode() {
        return (((this.f9829a * 31) + this.f9830b.hashCode()) * 31) + this.f9833e.hashCode();
    }

    /* renamed from: i */
    public boolean m29546i(long j, long j2) {
        for (int i = 0; i < this.f9832d.size(); i++) {
            if (this.f9832d.get(i).m29541b(j, j2)) {
                return false;
            }
        }
        this.f9832d.add(new C5303a(j, j2));
        return true;
    }

    /* renamed from: j */
    public boolean m29545j(C7092d dVar) {
        if (!this.f9831c.remove(dVar)) {
            return false;
        }
        File file = dVar.f15475o;
        if (file == null) {
            return true;
        }
        file.delete();
        return true;
    }

    /* renamed from: k */
    public C5308i m29544k(C5308i iVar, long j, boolean z) {
        C7510a.m22366f(this.f9831c.remove(iVar));
        File file = (File) C7510a.m22367e(iVar.f15475o);
        if (z) {
            File i = C5308i.m29495i((File) C7510a.m22367e(file.getParentFile()), this.f9829a, iVar.f15472l, j);
            if (file.renameTo(i)) {
                file = i;
            } else {
                C7558r.m22104h("CachedContent", "Failed to rename " + file + " to " + i);
            }
        }
        C5308i d = iVar.m29500d(file, j);
        this.f9831c.add(d);
        return d;
    }

    /* renamed from: l */
    public void m29543l(long j) {
        for (int i = 0; i < this.f9832d.size(); i++) {
            if (this.f9832d.get(i).f9834a == j) {
                this.f9832d.remove(i);
                return;
            }
        }
        throw new IllegalStateException();
    }

    public C5302g(int i, String str, C7096h hVar) {
        this.f9829a = i;
        this.f9830b = str;
        this.f9833e = hVar;
        this.f9831c = new TreeSet<>();
        this.f9832d = new ArrayList<>();
    }
}
