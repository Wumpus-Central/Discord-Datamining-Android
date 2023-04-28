package p081e9;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.C5288a;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketException;

/* renamed from: e9.y */
/* loaded from: classes5.dex */
public final class C6796y extends AbstractC6771f {

    /* renamed from: e */
    private final int f14508e;

    /* renamed from: f */
    private final byte[] f14509f;

    /* renamed from: g */
    private final DatagramPacket f14510g;

    /* renamed from: h */
    private Uri f14511h;

    /* renamed from: i */
    private DatagramSocket f14512i;

    /* renamed from: j */
    private MulticastSocket f14513j;

    /* renamed from: k */
    private InetAddress f14514k;

    /* renamed from: l */
    private InetSocketAddress f14515l;

    /* renamed from: m */
    private boolean f14516m;

    /* renamed from: n */
    private int f14517n;

    /* renamed from: e9.y$a */
    /* loaded from: classes5.dex */
    public static final class C6797a extends IOException {
        public C6797a(IOException iOException) {
            super(iOException);
        }
    }

    public C6796y() {
        this(2000);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: b */
    public long mo12542b(C5288a aVar) {
        Uri uri = aVar.f9746a;
        this.f14511h = uri;
        String host = uri.getHost();
        int port = this.f14511h.getPort();
        m24358q(aVar);
        try {
            this.f14514k = InetAddress.getByName(host);
            this.f14515l = new InetSocketAddress(this.f14514k, port);
            if (this.f14514k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(this.f14515l);
                this.f14513j = multicastSocket;
                multicastSocket.joinGroup(this.f14514k);
                this.f14512i = this.f14513j;
            } else {
                this.f14512i = new DatagramSocket(this.f14515l);
            }
            try {
                this.f14512i.setSoTimeout(this.f14508e);
                this.f14516m = true;
                m24357r(aVar);
                return -1L;
            } catch (SocketException e) {
                throw new C6797a(e);
            }
        } catch (IOException e2) {
            throw new C6797a(e2);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
        this.f14511h = null;
        MulticastSocket multicastSocket = this.f14513j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup(this.f14514k);
            } catch (IOException unused) {
            }
            this.f14513j = null;
        }
        DatagramSocket datagramSocket = this.f14512i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f14512i = null;
        }
        this.f14514k = null;
        this.f14515l = null;
        this.f14517n = 0;
        if (this.f14516m) {
            this.f14516m = false;
            m24359p();
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: m */
    public Uri mo12539m() {
        return this.f14511h;
    }

    @Override // p081e9.AbstractC6774h
    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (this.f14517n == 0) {
            try {
                this.f14512i.receive(this.f14510g);
                int length = this.f14510g.getLength();
                this.f14517n = length;
                m24360o(length);
            } catch (IOException e) {
                throw new C6797a(e);
            }
        }
        int length2 = this.f14510g.getLength();
        int i3 = this.f14517n;
        int min = Math.min(i3, i2);
        System.arraycopy(this.f14509f, length2 - i3, bArr, i, min);
        this.f14517n -= min;
        return min;
    }

    public C6796y(int i) {
        this(i, 8000);
    }

    public C6796y(int i, int i2) {
        super(true);
        this.f14508e = i2;
        byte[] bArr = new byte[i];
        this.f14509f = bArr;
        this.f14510g = new DatagramPacket(bArr, 0, i);
    }
}
