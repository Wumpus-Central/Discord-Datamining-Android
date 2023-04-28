package p193k7;

import java.util.UUID;
import p119g9.C7557q0;

/* renamed from: k7.d0 */
/* loaded from: classes7.dex */
public final class C9770d0 implements AbstractC9761b0 {

    /* renamed from: d */
    public static final boolean f21740d;

    /* renamed from: a */
    public final UUID f21741a;

    /* renamed from: b */
    public final byte[] f21742b;

    /* renamed from: c */
    public final boolean f21743c;

    static {
        boolean z;
        if ("Amazon".equals(C7557q0.f16370c)) {
            String str = C7557q0.f16371d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z = true;
                f21740d = z;
            }
        }
        z = false;
        f21740d = z;
    }

    public C9770d0(UUID uuid, byte[] bArr, boolean z) {
        this.f21741a = uuid;
        this.f21742b = bArr;
        this.f21743c = z;
    }
}
