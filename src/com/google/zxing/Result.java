package com.google.zxing;

import java.util.EnumMap;
import java.util.Map;
import p066dd.C6446o;
import p066dd.EnumC6432a;
import p066dd.EnumC6445n;

/* loaded from: classes3.dex */
public final class Result {

    /* renamed from: a */
    private final String f11678a;

    /* renamed from: b */
    private final byte[] f11679b;

    /* renamed from: c */
    private final int f11680c;

    /* renamed from: d */
    private C6446o[] f11681d;

    /* renamed from: e */
    private final EnumC6432a f11682e;

    /* renamed from: f */
    private Map<EnumC6445n, Object> f11683f;

    /* renamed from: g */
    private final long f11684g;

    public Result(String str, byte[] bArr, C6446o[] oVarArr, EnumC6432a aVar) {
        this(str, bArr, oVarArr, aVar, System.currentTimeMillis());
    }

    /* renamed from: a */
    public void m27008a(C6446o[] oVarArr) {
        C6446o[] oVarArr2 = this.f11681d;
        if (oVarArr2 == null) {
            this.f11681d = oVarArr;
        } else if (oVarArr != null && oVarArr.length > 0) {
            C6446o[] oVarArr3 = new C6446o[oVarArr2.length + oVarArr.length];
            System.arraycopy(oVarArr2, 0, oVarArr3, 0, oVarArr2.length);
            System.arraycopy(oVarArr, 0, oVarArr3, oVarArr2.length, oVarArr.length);
            this.f11681d = oVarArr3;
        }
    }

    /* renamed from: b */
    public EnumC6432a m27007b() {
        return this.f11682e;
    }

    /* renamed from: c */
    public byte[] m27006c() {
        return this.f11679b;
    }

    /* renamed from: d */
    public Map<EnumC6445n, Object> m27005d() {
        return this.f11683f;
    }

    /* renamed from: e */
    public C6446o[] m27004e() {
        return this.f11681d;
    }

    /* renamed from: f */
    public String m27003f() {
        return this.f11678a;
    }

    /* renamed from: g */
    public void m27002g(Map<EnumC6445n, Object> map) {
        if (map != null) {
            Map<EnumC6445n, Object> map2 = this.f11683f;
            if (map2 == null) {
                this.f11683f = map;
            } else {
                map2.putAll(map);
            }
        }
    }

    /* renamed from: h */
    public void m27001h(EnumC6445n nVar, Object obj) {
        if (this.f11683f == null) {
            this.f11683f = new EnumMap(EnumC6445n.class);
        }
        this.f11683f.put(nVar, obj);
    }

    public String toString() {
        return this.f11678a;
    }

    public Result(String str, byte[] bArr, C6446o[] oVarArr, EnumC6432a aVar, long j) {
        this(str, bArr, bArr == null ? 0 : bArr.length * 8, oVarArr, aVar, j);
    }

    public Result(String str, byte[] bArr, int i, C6446o[] oVarArr, EnumC6432a aVar, long j) {
        this.f11678a = str;
        this.f11679b = bArr;
        this.f11680c = i;
        this.f11681d = oVarArr;
        this.f11682e = aVar;
        this.f11683f = null;
        this.f11684g = j;
    }
}
