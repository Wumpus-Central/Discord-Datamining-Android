package p193k7;

import android.annotation.SuppressLint;
import android.media.MediaDrm;
import android.media.UnsupportedSchemeException;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p030bc.C3452d;
import p079e7.C6713c;
import p119g9.C7510a;
import p119g9.C7557q0;
import p119g9.C7558r;
import p119g9.C7570y;
import p193k7.AbstractC9763c0;
import p193k7.C9798l;
import p348t7.C12993l;

/* renamed from: k7.g0 */
/* loaded from: classes7.dex */
public final class C9776g0 implements AbstractC9763c0 {

    /* renamed from: d */
    public static final AbstractC9763c0.AbstractC9767d f21747d = new AbstractC9763c0.AbstractC9767d() { // from class: k7.e0
        @Override // p193k7.AbstractC9763c0.AbstractC9767d
        /* renamed from: a */
        public final AbstractC9763c0 mo15408a(UUID uuid) {
            AbstractC9763c0 x;
            x = C9776g0.m15395x(uuid);
            return x;
        }
    };

    /* renamed from: a */
    private final UUID f21748a;

    /* renamed from: b */
    private final MediaDrm f21749b;

    /* renamed from: c */
    private int f21750c = 1;

    private C9776g0(UUID uuid) {
        C7510a.m22367e(uuid);
        C7510a.m22370b(!C6713c.f14278b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f21748a = uuid;
        MediaDrm mediaDrm = new MediaDrm(m15401r(uuid));
        this.f21749b = mediaDrm;
        if (C6713c.f14280d.equals(uuid) && m15394y()) {
            m15399t(mediaDrm);
        }
    }

    /* renamed from: n */
    private static byte[] m15405n(byte[] bArr) {
        int indexOf;
        C7570y yVar = new C7570y(bArr);
        int q = yVar.m21999q();
        short s = yVar.m21997s();
        short s2 = yVar.m21997s();
        if (s == 1 && s2 == 1) {
            short s3 = yVar.m21997s();
            Charset charset = C3452d.f5597e;
            String B = yVar.m22031B(s3, charset);
            if (B.contains("<LA_URL>")) {
                return bArr;
            }
            if (B.indexOf("</DATA>") == -1) {
                C7558r.m22104h("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
            }
            String str = B.substring(0, indexOf) + "<LA_URL>https://x</LA_URL>" + B.substring(indexOf);
            int i = q + 52;
            ByteBuffer allocate = ByteBuffer.allocate(i);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(i);
            allocate.putShort(s);
            allocate.putShort(s2);
            allocate.putShort((short) (str.length() * 2));
            allocate.put(str.getBytes(charset));
            return allocate.array();
        }
        C7558r.m22106f("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
        return bArr;
    }

    /* renamed from: o */
    private static byte[] m15404o(UUID uuid, byte[] bArr) {
        if (C6713c.f14279c.equals(uuid)) {
            return C9758a.m15416a(bArr);
        }
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
        if ("AFTT".equals(r0) == false) goto L_0x005f;
     */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static byte[] m15403p(java.util.UUID r3, byte[] r4) {
        /*
            java.util.UUID r0 = p079e7.C6713c.f14281e
            boolean r1 = r0.equals(r3)
            if (r1 == 0) goto L_0x0018
            byte[] r1 = p348t7.C12993l.m4792e(r4, r3)
            if (r1 != 0) goto L_0x000f
            goto L_0x0010
        L_0x000f:
            r4 = r1
        L_0x0010:
            byte[] r4 = m15405n(r4)
            byte[] r4 = p348t7.C12993l.m4796a(r0, r4)
        L_0x0018:
            int r1 = p119g9.C7557q0.f16368a
            r2 = 23
            if (r1 >= r2) goto L_0x0026
            java.util.UUID r1 = p079e7.C6713c.f14280d
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0058
        L_0x0026:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x005f
            java.lang.String r0 = "Amazon"
            java.lang.String r1 = p119g9.C7557q0.f16370c
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x005f
            java.lang.String r0 = p119g9.C7557q0.f16371d
            java.lang.String r1 = "AFTB"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0058
            java.lang.String r1 = "AFTS"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0058
            java.lang.String r1 = "AFTM"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0058
            java.lang.String r1 = "AFTT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005f
        L_0x0058:
            byte[] r3 = p348t7.C12993l.m4792e(r4, r3)
            if (r3 == 0) goto L_0x005f
            return r3
        L_0x005f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p193k7.C9776g0.m15403p(java.util.UUID, byte[]):byte[]");
    }

    /* renamed from: q */
    private static String m15402q(UUID uuid, String str) {
        if (C7557q0.f16368a >= 26 || !C6713c.f14279c.equals(uuid) || (!"video/mp4".equals(str) && !"audio/mp4".equals(str))) {
            return str;
        }
        return "cenc";
    }

    /* renamed from: r */
    private static UUID m15401r(UUID uuid) {
        return (C7557q0.f16368a >= 27 || !C6713c.f14279c.equals(uuid)) ? uuid : C6713c.f14278b;
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: t */
    private static void m15399t(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    /* renamed from: v */
    private static C9798l.C9800b m15397v(UUID uuid, List<C9798l.C9800b> list) {
        boolean z;
        if (!C6713c.f14280d.equals(uuid)) {
            return list.get(0);
        }
        if (C7557q0.f16368a >= 28 && list.size() > 1) {
            C9798l.C9800b bVar = list.get(0);
            int i = 0;
            for (int i2 = 0; i2 < list.size(); i2++) {
                C9798l.C9800b bVar2 = list.get(i2);
                byte[] bArr = (byte[]) C7510a.m22367e(bVar2.f21839o);
                if (!C7557q0.m22159c(bVar2.f21838n, bVar.f21838n) || !C7557q0.m22159c(bVar2.f21837m, bVar.f21837m) || !C12993l.m4794c(bArr)) {
                    z = false;
                    break;
                }
                i += bArr.length;
            }
            z = true;
            if (z) {
                byte[] bArr2 = new byte[i];
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    byte[] bArr3 = (byte[]) C7510a.m22367e(list.get(i4).f21839o);
                    int length = bArr3.length;
                    System.arraycopy(bArr3, 0, bArr2, i3, length);
                    i3 += length;
                }
                return bVar.m15322b(bArr2);
            }
        }
        for (int i5 = 0; i5 < list.size(); i5++) {
            C9798l.C9800b bVar3 = list.get(i5);
            int g = C12993l.m4790g((byte[]) C7510a.m22367e(bVar3.f21839o));
            int i6 = C7557q0.f16368a;
            if (i6 < 23 && g == 0) {
                return bVar3;
            }
            if (i6 >= 23 && g == 1) {
                return bVar3;
            }
        }
        return list.get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ void m15396w(AbstractC9763c0.AbstractC9766c cVar, MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
        cVar.mo15342a(this, bArr, i, i2, bArr2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public static /* synthetic */ AbstractC9763c0 m15395x(UUID uuid) {
        try {
            return m15393z(uuid);
        } catch (C9802l0 unused) {
            C7558r.m22109c("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new C9821z();
        }
    }

    /* renamed from: y */
    private static boolean m15394y() {
        return "ASUS_Z00AD".equals(C7557q0.f16371d);
    }

    /* renamed from: z */
    public static C9776g0 m15393z(UUID uuid) {
        try {
            return new C9776g0(uuid);
        } catch (UnsupportedSchemeException e) {
            throw new C9802l0(1, e);
        } catch (Exception e2) {
            throw new C9802l0(2, e2);
        }
    }

    @Override // p193k7.AbstractC9763c0
    /* renamed from: a */
    public void mo15274a(final AbstractC9763c0.AbstractC9766c cVar) {
        MediaDrm.OnEventListener onEventListener;
        MediaDrm mediaDrm = this.f21749b;
        if (cVar == null) {
            onEventListener = null;
        } else {
            onEventListener = new MediaDrm.OnEventListener() { // from class: k7.f0
                @Override // android.media.MediaDrm.OnEventListener
                public final void onEvent(MediaDrm mediaDrm2, byte[] bArr, int i, int i2, byte[] bArr2) {
                    C9776g0.this.m15396w(cVar, mediaDrm2, bArr, i, i2, bArr2);
                }
            };
        }
        mediaDrm.setOnEventListener(onEventListener);
    }

    @Override // p193k7.AbstractC9763c0
    public synchronized void acquire() {
        boolean z;
        if (this.f21750c > 0) {
            z = true;
        } else {
            z = false;
        }
        C7510a.m22366f(z);
        this.f21750c++;
    }

    @Override // p193k7.AbstractC9763c0
    /* renamed from: b */
    public Class<C9770d0> mo15273b() {
        return C9770d0.class;
    }

    @Override // p193k7.AbstractC9763c0
    /* renamed from: c */
    public Map<String, String> mo15272c(byte[] bArr) {
        return this.f21749b.queryKeyStatus(bArr);
    }

    @Override // p193k7.AbstractC9763c0
    /* renamed from: e */
    public AbstractC9763c0.C9768e mo15270e() {
        MediaDrm.ProvisionRequest provisionRequest = this.f21749b.getProvisionRequest();
        return new AbstractC9763c0.C9768e(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // p193k7.AbstractC9763c0
    /* renamed from: f */
    public byte[] mo15269f() {
        return this.f21749b.openSession();
    }

    @Override // p193k7.AbstractC9763c0
    /* renamed from: g */
    public void mo15268g(byte[] bArr, byte[] bArr2) {
        this.f21749b.restoreKeys(bArr, bArr2);
    }

    @Override // p193k7.AbstractC9763c0
    /* renamed from: h */
    public void mo15267h(byte[] bArr) {
        this.f21749b.provideProvisionResponse(bArr);
    }

    @Override // p193k7.AbstractC9763c0
    /* renamed from: i */
    public void mo15266i(byte[] bArr) {
        this.f21749b.closeSession(bArr);
    }

    @Override // p193k7.AbstractC9763c0
    /* renamed from: j */
    public byte[] mo15265j(byte[] bArr, byte[] bArr2) {
        if (C6713c.f14279c.equals(this.f21748a)) {
            bArr2 = C9758a.m15415b(bArr2);
        }
        return this.f21749b.provideKeyResponse(bArr, bArr2);
    }

    @Override // p193k7.AbstractC9763c0
    /* renamed from: k */
    public AbstractC9763c0.C9765b mo15264k(byte[] bArr, List<C9798l.C9800b> list, int i, HashMap<String, String> hashMap) {
        C9798l.C9800b bVar;
        String str;
        byte[] bArr2;
        int i2;
        if (list != null) {
            bVar = m15397v(this.f21748a, list);
            bArr2 = m15403p(this.f21748a, (byte[]) C7510a.m22367e(bVar.f21839o));
            str = m15402q(this.f21748a, bVar.f21838n);
        } else {
            bVar = null;
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f21749b.getKeyRequest(bArr, bArr2, str, i, hashMap);
        byte[] o = m15404o(this.f21748a, keyRequest.getData());
        String defaultUrl = keyRequest.getDefaultUrl();
        if ("https://x".equals(defaultUrl)) {
            defaultUrl = "";
        }
        if (TextUtils.isEmpty(defaultUrl) && bVar != null && !TextUtils.isEmpty(bVar.f21837m)) {
            defaultUrl = bVar.f21837m;
        }
        if (C7557q0.f16368a >= 23) {
            i2 = keyRequest.getRequestType();
        } else {
            i2 = Integer.MIN_VALUE;
        }
        return new AbstractC9763c0.C9765b(o, defaultUrl, i2);
    }

    @Override // p193k7.AbstractC9763c0
    public synchronized void release() {
        int i = this.f21750c - 1;
        this.f21750c = i;
        if (i == 0) {
            this.f21749b.release();
        }
    }

    /* renamed from: s */
    public C9770d0 mo15271d(byte[] bArr) {
        boolean z;
        if (C7557q0.f16368a >= 21 || !C6713c.f14280d.equals(this.f21748a) || !"L3".equals(m15398u("securityLevel"))) {
            z = false;
        } else {
            z = true;
        }
        return new C9770d0(m15401r(this.f21748a), bArr, z);
    }

    /* renamed from: u */
    public String m15398u(String str) {
        return this.f21749b.getPropertyString(str);
    }
}
