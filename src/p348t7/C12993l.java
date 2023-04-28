package p348t7;

import java.nio.ByteBuffer;
import java.util.UUID;
import p119g9.C7558r;
import p119g9.C7570y;

/* renamed from: t7.l */
/* loaded from: classes7.dex */
public final class C12993l {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t7.l$a */
    /* loaded from: classes7.dex */
    public static class C12994a {

        /* renamed from: a */
        private final UUID f29175a;

        /* renamed from: b */
        private final int f29176b;

        /* renamed from: c */
        private final byte[] f29177c;

        public C12994a(UUID uuid, int i, byte[] bArr) {
            this.f29175a = uuid;
            this.f29176b = i;
            this.f29177c = bArr;
        }
    }

    /* renamed from: a */
    public static byte[] m4796a(UUID uuid, byte[] bArr) {
        return m4795b(uuid, null, bArr);
    }

    /* renamed from: b */
    public static byte[] m4795b(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int i;
        int i2;
        if (bArr != null) {
            i = bArr.length;
        } else {
            i = 0;
        }
        int i3 = i + 32;
        if (uuidArr != null) {
            i3 += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i3);
        allocate.putInt(i3);
        allocate.putInt(1886614376);
        if (uuidArr != null) {
            i2 = 16777216;
        } else {
            i2 = 0;
        }
        allocate.putInt(i2);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (!(bArr == null || bArr.length == 0)) {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    /* renamed from: c */
    public static boolean m4794c(byte[] bArr) {
        return m4793d(bArr) != null;
    }

    /* renamed from: d */
    private static C12994a m4793d(byte[] bArr) {
        C7570y yVar = new C7570y(bArr);
        if (yVar.m22010f() < 32) {
            return null;
        }
        yVar.m22017P(0);
        if (yVar.m22002n() != yVar.m22015a() + 4 || yVar.m22002n() != 1886614376) {
            return null;
        }
        int c = AbstractC12971a.m4925c(yVar.m22002n());
        if (c > 1) {
            C7558r.m22104h("PsshAtomUtil", "Unsupported pssh version: " + c);
            return null;
        }
        UUID uuid = new UUID(yVar.m21993w(), yVar.m21993w());
        if (c == 1) {
            yVar.m22016Q(yVar.m22025H() * 16);
        }
        int H = yVar.m22025H();
        if (H != yVar.m22015a()) {
            return null;
        }
        byte[] bArr2 = new byte[H];
        yVar.m22006j(bArr2, 0, H);
        return new C12994a(uuid, c, bArr2);
    }

    /* renamed from: e */
    public static byte[] m4792e(byte[] bArr, UUID uuid) {
        C12994a d = m4793d(bArr);
        if (d == null) {
            return null;
        }
        if (uuid.equals(d.f29175a)) {
            return d.f29177c;
        }
        C7558r.m22104h("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + d.f29175a + ".");
        return null;
    }

    /* renamed from: f */
    public static UUID m4791f(byte[] bArr) {
        C12994a d = m4793d(bArr);
        if (d == null) {
            return null;
        }
        return d.f29175a;
    }

    /* renamed from: g */
    public static int m4790g(byte[] bArr) {
        C12994a d = m4793d(bArr);
        if (d == null) {
            return -1;
        }
        return d.f29176b;
    }
}
