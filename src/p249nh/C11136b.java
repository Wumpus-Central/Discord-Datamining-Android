package p249nh;

/* renamed from: nh.b */
/* loaded from: classes8.dex */
public final class C11136b {

    /* renamed from: a */
    private final C11137c f24715a;

    /* renamed from: b */
    private final C11137c f24716b;

    /* renamed from: c */
    private final boolean f24717c;

    public C11136b(C11137c cVar, C11137c cVar2, boolean z) {
        if (cVar == null) {
            m10817a(1);
        }
        if (cVar2 == null) {
            m10817a(2);
        }
        this.f24715a = cVar;
        this.f24716b = cVar2;
        this.f24717c = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a7  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void m10817a(int r10) {
        /*
            r0 = 9
            r1 = 7
            r2 = 6
            r3 = 5
            if (r10 == r3) goto L_0x0013
            if (r10 == r2) goto L_0x0013
            if (r10 == r1) goto L_0x0013
            if (r10 == r0) goto L_0x0013
            switch(r10) {
                case 13: goto L_0x0013;
                case 14: goto L_0x0013;
                case 15: goto L_0x0013;
                case 16: goto L_0x0013;
                default: goto L_0x0010;
            }
        L_0x0010:
            java.lang.String r4 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L_0x0015
        L_0x0013:
            java.lang.String r4 = "@NotNull method %s.%s must not return null"
        L_0x0015:
            r5 = 2
            if (r10 == r3) goto L_0x0023
            if (r10 == r2) goto L_0x0023
            if (r10 == r1) goto L_0x0023
            if (r10 == r0) goto L_0x0023
            switch(r10) {
                case 13: goto L_0x0023;
                case 14: goto L_0x0023;
                case 15: goto L_0x0023;
                case 16: goto L_0x0023;
                default: goto L_0x0021;
            }
        L_0x0021:
            r6 = 3
            goto L_0x0024
        L_0x0023:
            r6 = r5
        L_0x0024:
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r7 = "kotlin/reflect/jvm/internal/impl/name/ClassId"
            r8 = 0
            switch(r10) {
                case 1: goto L_0x004d;
                case 2: goto L_0x0048;
                case 3: goto L_0x004d;
                case 4: goto L_0x0043;
                case 5: goto L_0x0040;
                case 6: goto L_0x0040;
                case 7: goto L_0x0040;
                case 8: goto L_0x003b;
                case 9: goto L_0x0040;
                case 10: goto L_0x0036;
                case 11: goto L_0x0031;
                case 12: goto L_0x0031;
                case 13: goto L_0x0040;
                case 14: goto L_0x0040;
                case 15: goto L_0x0040;
                case 16: goto L_0x0040;
                default: goto L_0x002c;
            }
        L_0x002c:
            java.lang.String r9 = "topLevelFqName"
            r6[r8] = r9
            goto L_0x0051
        L_0x0031:
            java.lang.String r9 = "string"
            r6[r8] = r9
            goto L_0x0051
        L_0x0036:
            java.lang.String r9 = "segment"
            r6[r8] = r9
            goto L_0x0051
        L_0x003b:
            java.lang.String r9 = "name"
            r6[r8] = r9
            goto L_0x0051
        L_0x0040:
            r6[r8] = r7
            goto L_0x0051
        L_0x0043:
            java.lang.String r9 = "topLevelName"
            r6[r8] = r9
            goto L_0x0051
        L_0x0048:
            java.lang.String r9 = "relativeClassName"
            r6[r8] = r9
            goto L_0x0051
        L_0x004d:
            java.lang.String r9 = "packageFqName"
            r6[r8] = r9
        L_0x0051:
            r8 = 1
            if (r10 == r3) goto L_0x0079
            if (r10 == r2) goto L_0x0074
            if (r10 == r1) goto L_0x006f
            if (r10 == r0) goto L_0x006a
            switch(r10) {
                case 13: goto L_0x0065;
                case 14: goto L_0x0065;
                case 15: goto L_0x0060;
                case 16: goto L_0x0060;
                default: goto L_0x005d;
            }
        L_0x005d:
            r6[r8] = r7
            goto L_0x007d
        L_0x0060:
            java.lang.String r7 = "asFqNameString"
            r6[r8] = r7
            goto L_0x007d
        L_0x0065:
            java.lang.String r7 = "asString"
            r6[r8] = r7
            goto L_0x007d
        L_0x006a:
            java.lang.String r7 = "asSingleFqName"
            r6[r8] = r7
            goto L_0x007d
        L_0x006f:
            java.lang.String r7 = "getShortClassName"
            r6[r8] = r7
            goto L_0x007d
        L_0x0074:
            java.lang.String r7 = "getRelativeClassName"
            r6[r8] = r7
            goto L_0x007d
        L_0x0079:
            java.lang.String r7 = "getPackageFqName"
            r6[r8] = r7
        L_0x007d:
            switch(r10) {
                case 1: goto L_0x0094;
                case 2: goto L_0x0094;
                case 3: goto L_0x0094;
                case 4: goto L_0x0094;
                case 5: goto L_0x0098;
                case 6: goto L_0x0098;
                case 7: goto L_0x0098;
                case 8: goto L_0x008f;
                case 9: goto L_0x0098;
                case 10: goto L_0x008a;
                case 11: goto L_0x0085;
                case 12: goto L_0x0085;
                case 13: goto L_0x0098;
                case 14: goto L_0x0098;
                case 15: goto L_0x0098;
                case 16: goto L_0x0098;
                default: goto L_0x0080;
            }
        L_0x0080:
            java.lang.String r7 = "topLevel"
            r6[r5] = r7
            goto L_0x0098
        L_0x0085:
            java.lang.String r7 = "fromString"
            r6[r5] = r7
            goto L_0x0098
        L_0x008a:
            java.lang.String r7 = "startsWith"
            r6[r5] = r7
            goto L_0x0098
        L_0x008f:
            java.lang.String r7 = "createNestedClassId"
            r6[r5] = r7
            goto L_0x0098
        L_0x0094:
            java.lang.String r7 = "<init>"
            r6[r5] = r7
        L_0x0098:
            java.lang.String r4 = java.lang.String.format(r4, r6)
            if (r10 == r3) goto L_0x00ad
            if (r10 == r2) goto L_0x00ad
            if (r10 == r1) goto L_0x00ad
            if (r10 == r0) goto L_0x00ad
            switch(r10) {
                case 13: goto L_0x00ad;
                case 14: goto L_0x00ad;
                case 15: goto L_0x00ad;
                case 16: goto L_0x00ad;
                default: goto L_0x00a7;
            }
        L_0x00a7:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            r10.<init>(r4)
            goto L_0x00b2
        L_0x00ad:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>(r4)
        L_0x00b2:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p249nh.C11136b.m10817a(int):void");
    }

    /* renamed from: e */
    public static C11136b m10813e(String str) {
        if (str == null) {
            m10817a(11);
        }
        return m10812f(str, false);
    }

    /* renamed from: f */
    public static C11136b m10812f(String str, boolean z) {
        String str2;
        if (str == null) {
            m10817a(12);
        }
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf == -1) {
            str2 = "";
        } else {
            String replace = str.substring(0, lastIndexOf).replace('/', '.');
            str = str.substring(lastIndexOf + 1);
            str2 = replace;
        }
        return new C11136b(new C11137c(str2), new C11137c(str), z);
    }

    /* renamed from: m */
    public static C11136b m10805m(C11137c cVar) {
        if (cVar == null) {
            m10817a(0);
        }
        return new C11136b(cVar.m10800e(), cVar.m10798g());
    }

    /* renamed from: b */
    public C11137c m10816b() {
        if (this.f24715a.m10801d()) {
            C11137c cVar = this.f24716b;
            if (cVar == null) {
                m10817a(9);
            }
            return cVar;
        }
        return new C11137c(this.f24715a.m10803b() + "." + this.f24716b.m10803b());
    }

    /* renamed from: c */
    public String m10815c() {
        if (this.f24715a.m10801d()) {
            String b = this.f24716b.m10803b();
            if (b == null) {
                m10817a(13);
            }
            return b;
        }
        String str = this.f24715a.m10803b().replace('.', '/') + "/" + this.f24716b.m10803b();
        if (str == null) {
            m10817a(14);
        }
        return str;
    }

    /* renamed from: d */
    public C11136b m10814d(C11142f fVar) {
        if (fVar == null) {
            m10817a(8);
        }
        return new C11136b(m10810h(), this.f24716b.m10802c(fVar), this.f24717c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11136b.class != obj.getClass()) {
            return false;
        }
        C11136b bVar = (C11136b) obj;
        if (!this.f24715a.equals(bVar.f24715a) || !this.f24716b.equals(bVar.f24716b) || this.f24717c != bVar.f24717c) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public C11136b m10811g() {
        C11137c e = this.f24716b.m10800e();
        if (e.m10801d()) {
            return null;
        }
        return new C11136b(m10810h(), e, this.f24717c);
    }

    /* renamed from: h */
    public C11137c m10810h() {
        C11137c cVar = this.f24715a;
        if (cVar == null) {
            m10817a(5);
        }
        return cVar;
    }

    public int hashCode() {
        return (((this.f24715a.hashCode() * 31) + this.f24716b.hashCode()) * 31) + Boolean.valueOf(this.f24717c).hashCode();
    }

    /* renamed from: i */
    public C11137c m10809i() {
        C11137c cVar = this.f24716b;
        if (cVar == null) {
            m10817a(6);
        }
        return cVar;
    }

    /* renamed from: j */
    public C11142f m10808j() {
        C11142f g = this.f24716b.m10798g();
        if (g == null) {
            m10817a(7);
        }
        return g;
    }

    /* renamed from: k */
    public boolean m10807k() {
        return this.f24717c;
    }

    /* renamed from: l */
    public boolean m10806l() {
        return !this.f24716b.m10800e().m10801d();
    }

    public String toString() {
        if (!this.f24715a.m10801d()) {
            return m10815c();
        }
        return "/" + m10815c();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C11136b(C11137c cVar, C11142f fVar) {
        this(cVar, C11137c.m10794k(fVar), false);
        if (cVar == null) {
            m10817a(3);
        }
        if (fVar == null) {
            m10817a(4);
        }
    }
}
