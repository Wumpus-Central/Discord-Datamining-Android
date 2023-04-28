package p217lg;

import kotlin.jvm.internal.C9971q;
import p249nh.C11136b;
import p249nh.C11137c;
import p249nh.C11142f;

/* JADX WARN: Init of enum n can be incorrect */
/* JADX WARN: Init of enum o can be incorrect */
/* JADX WARN: Init of enum p can be incorrect */
/* JADX WARN: Init of enum q can be incorrect */
/* renamed from: lg.n */
/* loaded from: classes8.dex */
public enum EnumC10438n {
    UBYTE(r1),
    USHORT(r1),
    UINT(r1),
    ULONG(r1);
    

    /* renamed from: k */
    private final C11136b f22965k;

    /* renamed from: l */
    private final C11142f f22966l;

    /* renamed from: m */
    private final C11136b f22967m;

    static {
        C9971q.m14634f(C11136b.m10813e("kotlin/UByte"), "fromString(\"kotlin/UByte\")");
        C9971q.m14634f(C11136b.m10813e("kotlin/UShort"), "fromString(\"kotlin/UShort\")");
        C9971q.m14634f(C11136b.m10813e("kotlin/UInt"), "fromString(\"kotlin/UInt\")");
        C9971q.m14634f(C11136b.m10813e("kotlin/ULong"), "fromString(\"kotlin/ULong\")");
    }

    EnumC10438n(C11136b bVar) {
        this.f22965k = bVar;
        C11142f j = bVar.m10808j();
        C9971q.m14634f(j, "classId.shortClassName");
        this.f22966l = j;
        C11137c h = bVar.m10810h();
        this.f22967m = new C11136b(h, C11142f.m10767f(j.m10771b() + "Array"));
    }

    /* renamed from: b */
    public final C11136b m13318b() {
        return this.f22967m;
    }

    /* renamed from: c */
    public final C11136b m13317c() {
        return this.f22965k;
    }

    /* renamed from: d */
    public final C11142f m13316d() {
        return this.f22966l;
    }
}
