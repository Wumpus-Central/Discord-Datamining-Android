package com.google.android.exoplayer2.upstream.cache;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p100f9.C7092d;
import p119g9.C7510a;
import p119g9.C7557q0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.exoplayer2.upstream.cache.i */
/* loaded from: classes5.dex */
public final class C5308i extends C7092d {

    /* renamed from: q */
    private static final Pattern f9854q = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);

    /* renamed from: r */
    private static final Pattern f9855r = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);

    /* renamed from: s */
    private static final Pattern f9856s = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    private C5308i(String str, long j, long j2, long j3, File file) {
        super(str, j, j2, j3, file);
    }

    /* renamed from: e */
    public static C5308i m29499e(File file, long j, long j2, C5304h hVar) {
        File file2;
        String k;
        long j3;
        long j4;
        String name = file.getName();
        if (!name.endsWith(".v3.exo")) {
            File j5 = m29494j(file, hVar);
            if (j5 == null) {
                return null;
            }
            file2 = j5;
            name = j5.getName();
        } else {
            file2 = file;
        }
        Matcher matcher = f9856s.matcher(name);
        if (!matcher.matches() || (k = hVar.m29530k(Integer.parseInt((String) C7510a.m22367e(matcher.group(1))))) == null) {
            return null;
        }
        if (j == -1) {
            j3 = file2.length();
        } else {
            j3 = j;
        }
        if (j3 == 0) {
            return null;
        }
        long parseLong = Long.parseLong((String) C7510a.m22367e(matcher.group(2)));
        if (j2 == -9223372036854775807L) {
            j4 = Long.parseLong((String) C7510a.m22367e(matcher.group(3)));
        } else {
            j4 = j2;
        }
        return new C5308i(k, parseLong, j3, j4, file2);
    }

    /* renamed from: f */
    public static C5308i m29498f(File file, long j, C5304h hVar) {
        return m29499e(file, j, -9223372036854775807L, hVar);
    }

    /* renamed from: g */
    public static C5308i m29497g(String str, long j, long j2) {
        return new C5308i(str, j, j2, -9223372036854775807L, null);
    }

    /* renamed from: h */
    public static C5308i m29496h(String str, long j) {
        return new C5308i(str, j, -1L, -9223372036854775807L, null);
    }

    /* renamed from: i */
    public static File m29495i(File file, int i, long j, long j2) {
        return new File(file, i + "." + j + "." + j2 + ".v3.exo");
    }

    /* renamed from: j */
    private static File m29494j(File file, C5304h hVar) {
        String str;
        String name = file.getName();
        Matcher matcher = f9855r.matcher(name);
        if (matcher.matches()) {
            str = C7557q0.m22166Y0((String) C7510a.m22367e(matcher.group(1)));
        } else {
            matcher = f9854q.matcher(name);
            if (matcher.matches()) {
                str = (String) C7510a.m22367e(matcher.group(1));
            } else {
                str = null;
            }
        }
        if (str == null) {
            return null;
        }
        File i = m29495i((File) C7510a.m22364h(file.getParentFile()), hVar.m29535f(str), Long.parseLong((String) C7510a.m22367e(matcher.group(2))), Long.parseLong((String) C7510a.m22367e(matcher.group(3))));
        if (!file.renameTo(i)) {
            return null;
        }
        return i;
    }

    /* renamed from: d */
    public C5308i m29500d(File file, long j) {
        C7510a.m22366f(this.f15474n);
        return new C5308i(this.f15471k, this.f15472l, this.f15473m, j, file);
    }
}
