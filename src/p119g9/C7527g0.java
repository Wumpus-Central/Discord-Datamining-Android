package p119g9;

import android.os.SystemClock;
import com.google.android.exoplayer2.upstream.C5320h;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.ConcurrentModificationException;

/* renamed from: g9.g0 */
/* loaded from: classes5.dex */
public final class C7527g0 {

    /* renamed from: a */
    private static final Object f16315a = new Object();

    /* renamed from: b */
    private static final Object f16316b = new Object();

    /* renamed from: c */
    private static boolean f16317c = false;

    /* renamed from: d */
    private static long f16318d = 0;

    /* renamed from: e */
    private static String f16319e = "time.android.com";

    /* renamed from: g9.g0$b */
    /* loaded from: classes5.dex */
    public interface AbstractC7529b {
        /* renamed from: a */
        void mo22310a(IOException iOException);

        /* renamed from: b */
        void mo22309b();
    }

    /* renamed from: g9.g0$c */
    /* loaded from: classes5.dex */
    private static final class C7530c implements C5320h.AbstractC5322b<C5320h.AbstractC5325e> {

        /* renamed from: k */
        private final AbstractC7529b f16320k;

        public C7530c(AbstractC7529b bVar) {
            this.f16320k = bVar;
        }

        @Override // com.google.android.exoplayer2.upstream.C5320h.AbstractC5322b
        /* renamed from: i */
        public void mo10446i(C5320h.AbstractC5325e eVar, long j, long j2, boolean z) {
        }

        @Override // com.google.android.exoplayer2.upstream.C5320h.AbstractC5322b
        /* renamed from: k */
        public void mo10444k(C5320h.AbstractC5325e eVar, long j, long j2) {
            if (this.f16320k == null) {
                return;
            }
            if (!C7527g0.m22315k()) {
                this.f16320k.mo22310a(new IOException(new ConcurrentModificationException()));
            } else {
                this.f16320k.mo22309b();
            }
        }

        @Override // com.google.android.exoplayer2.upstream.C5320h.AbstractC5322b
        /* renamed from: o */
        public C5320h.C5323c mo10440o(C5320h.AbstractC5325e eVar, long j, long j2, IOException iOException, int i) {
            AbstractC7529b bVar = this.f16320k;
            if (bVar != null) {
                bVar.mo22310a(iOException);
            }
            return C5320h.f9876f;
        }
    }

    /* renamed from: g9.g0$d */
    /* loaded from: classes5.dex */
    private static final class C7531d implements C5320h.AbstractC5325e {
        private C7531d() {
        }

        @Override // com.google.android.exoplayer2.upstream.C5320h.AbstractC5325e
        /* renamed from: a */
        public void mo12497a() {
            synchronized (C7527g0.f16315a) {
                synchronized (C7527g0.f16316b) {
                    if (!C7527g0.f16317c) {
                        long l = C7527g0.m22314l();
                        synchronized (C7527g0.f16316b) {
                            long unused = C7527g0.f16318d = l;
                            boolean unused2 = C7527g0.f16317c = true;
                        }
                    }
                }
            }
        }

        @Override // com.google.android.exoplayer2.upstream.C5320h.AbstractC5325e
        /* renamed from: c */
        public void mo12496c() {
        }
    }

    /* renamed from: g */
    private static void m22319g(byte b, byte b2, int i, long j) {
        if (b == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        } else if (b2 != 4 && b2 != 5) {
            throw new IOException("SNTP: Untrusted mode: " + ((int) b2));
        } else if (i == 0 || i > 15) {
            throw new IOException("SNTP: Untrusted stratum: " + i);
        } else if (j == 0) {
            throw new IOException("SNTP: Zero transmitTime");
        }
    }

    /* renamed from: h */
    public static long m22318h() {
        long j;
        synchronized (f16316b) {
            if (f16317c) {
                j = f16318d;
            } else {
                j = -9223372036854775807L;
            }
        }
        return j;
    }

    /* renamed from: i */
    public static String m22317i() {
        String str;
        synchronized (f16316b) {
            str = f16319e;
        }
        return str;
    }

    /* renamed from: j */
    public static void m22316j(C5320h hVar, AbstractC7529b bVar) {
        if (!m22315k()) {
            if (hVar == null) {
                hVar = new C5320h("SntpClient");
            }
            hVar.m29473n(new C7531d(), new C7530c(bVar), 1);
        } else if (bVar != null) {
            bVar.mo22309b();
        }
    }

    /* renamed from: k */
    public static boolean m22315k() {
        boolean z;
        synchronized (f16316b) {
            z = f16317c;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static long m22314l() {
        InetAddress byName = InetAddress.getByName(m22317i());
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long currentTimeMillis = System.currentTimeMillis();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            m22311o(bArr, 40, currentTimeMillis);
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            long j = currentTimeMillis + (elapsedRealtime2 - elapsedRealtime);
            byte b = bArr[0];
            long n = m22312n(bArr, 24);
            long n2 = m22312n(bArr, 32);
            long n3 = m22312n(bArr, 40);
            m22319g((byte) ((b >> 6) & 3), (byte) (b & 7), bArr[1] & 255, n3);
            long j2 = (j + (((n2 - n) + (n3 - j)) / 2)) - elapsedRealtime2;
            datagramSocket.close();
            return j2;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                try {
                    datagramSocket.close();
                } catch (Throwable th4) {
                    th2.addSuppressed(th4);
                }
                throw th3;
            }
        }
    }

    /* renamed from: m */
    private static long m22313m(byte[] bArr, int i) {
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        byte b3 = bArr[i + 2];
        byte b4 = bArr[i + 3];
        int i2 = b & 128;
        byte b5 = b;
        if (i2 == 128) {
            b5 = (b & Byte.MAX_VALUE) + 128;
        }
        int i3 = b2 & 128;
        byte b6 = b2;
        if (i3 == 128) {
            b6 = (b2 & Byte.MAX_VALUE) + 128;
        }
        int i4 = b3 & 128;
        byte b7 = b3;
        if (i4 == 128) {
            b7 = (b3 & Byte.MAX_VALUE) + 128;
        }
        int i5 = b4 & 128;
        byte b8 = b4;
        if (i5 == 128) {
            b8 = (b4 & Byte.MAX_VALUE) + 128;
        }
        return ((b5 == 1 ? 1L : 0L) << 24) + ((b6 == 1 ? 1L : 0L) << 16) + ((b7 == 1 ? 1L : 0L) << 8) + (b8 == 1 ? 1L : 0L);
    }

    /* renamed from: n */
    private static long m22312n(byte[] bArr, int i) {
        long m = m22313m(bArr, i);
        long m2 = m22313m(bArr, i + 4);
        if (m == 0 && m2 == 0) {
            return 0L;
        }
        return ((m - 2208988800L) * 1000) + ((m2 * 1000) / 4294967296L);
    }

    /* renamed from: o */
    private static void m22311o(byte[] bArr, int i, long j) {
        if (j == 0) {
            Arrays.fill(bArr, i, i + 8, (byte) 0);
            return;
        }
        long j2 = j / 1000;
        long j3 = j2 + 2208988800L;
        int i2 = i + 1;
        bArr[i] = (byte) (j3 >> 24);
        int i3 = i2 + 1;
        bArr[i2] = (byte) (j3 >> 16);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (j3 >> 8);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (j3 >> 0);
        long j4 = ((j - (j2 * 1000)) * 4294967296L) / 1000;
        int i6 = i5 + 1;
        bArr[i5] = (byte) (j4 >> 24);
        int i7 = i6 + 1;
        bArr[i6] = (byte) (j4 >> 16);
        bArr[i7] = (byte) (j4 >> 8);
        bArr[i7 + 1] = (byte) (Math.random() * 255.0d);
    }
}
