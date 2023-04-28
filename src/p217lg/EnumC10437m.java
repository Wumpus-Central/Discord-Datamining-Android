package p217lg;

import kotlin.jvm.internal.C9971q;
import p249nh.C11136b;
import p249nh.C11142f;

/* JADX WARN: Init of enum m can be incorrect */
/* JADX WARN: Init of enum n can be incorrect */
/* JADX WARN: Init of enum o can be incorrect */
/* JADX WARN: Init of enum p can be incorrect */
/* renamed from: lg.m */
/* loaded from: classes8.dex */
public enum EnumC10437m {
    UBYTEARRAY(r1),
    USHORTARRAY(r1),
    UINTARRAY(r1),
    ULONGARRAY(r1);
    

    /* renamed from: k */
    private final C11136b f22958k;

    /* renamed from: l */
    private final C11142f f22959l;

    static {
        C9971q.m14634f(C11136b.m10813e("kotlin/UByteArray"), "fromString(\"kotlin/UByteArray\")");
        C9971q.m14634f(C11136b.m10813e("kotlin/UShortArray"), "fromString(\"kotlin/UShortArray\")");
        C9971q.m14634f(C11136b.m10813e("kotlin/UIntArray"), "fromString(\"kotlin/UIntArray\")");
        C9971q.m14634f(C11136b.m10813e("kotlin/ULongArray"), "fromString(\"kotlin/ULongArray\")");
    }

    EnumC10437m(C11136b bVar) {
        this.f22958k = bVar;
        C11142f j = bVar.m10808j();
        C9971q.m14634f(j, "classId.shortClassName");
        this.f22959l = j;
    }

    /* renamed from: b */
    public final C11142f m13320b() {
        return this.f22959l;
    }
}
