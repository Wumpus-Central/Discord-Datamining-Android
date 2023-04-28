package com.google.android.datatransport.cct;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import p279p6.C11572b;
import p315r6.AbstractC12418g;

/* renamed from: com.google.android.datatransport.cct.a */
/* loaded from: classes7.dex */
public final class C5138a implements AbstractC12418g {

    /* renamed from: c */
    static final String f8931c;

    /* renamed from: d */
    static final String f8932d;

    /* renamed from: e */
    private static final String f8933e;

    /* renamed from: f */
    private static final Set<C11572b> f8934f = Collections.unmodifiableSet(new HashSet(Arrays.asList(C11572b.m9324b("proto"), C11572b.m9324b("json"))));

    /* renamed from: g */
    public static final C5138a f8935g;

    /* renamed from: h */
    public static final C5138a f8936h;

    /* renamed from: a */
    private final String f8937a;

    /* renamed from: b */
    private final String f8938b;

    static {
        String a = C5144e.m30566a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f8931c = a;
        String a2 = C5144e.m30566a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f8932d = a2;
        String a3 = C5144e.m30566a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f8933e = a3;
        f8935g = new C5138a(a, null);
        f8936h = new C5138a(a2, a3);
    }

    public C5138a(String str, String str2) {
        this.f8937a = str;
        this.f8938b = str2;
    }

    /* renamed from: c */
    public static C5138a m30582c(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new C5138a(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    @Override // p315r6.AbstractC12418g
    /* renamed from: a */
    public Set<C11572b> mo6848a() {
        return f8934f;
    }

    /* renamed from: b */
    public byte[] m30583b() {
        String str = this.f8938b;
        if (str == null && this.f8937a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f8937a;
        objArr[2] = "\\";
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }

    /* renamed from: d */
    public String m30581d() {
        return this.f8938b;
    }

    /* renamed from: e */
    public String m30580e() {
        return this.f8937a;
    }

    @Override // p315r6.AbstractC12417f
    public byte[] getExtras() {
        return m30583b();
    }

    @Override // p315r6.AbstractC12417f
    public String getName() {
        return "cct";
    }
}
