package p089ek;

import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import p327rj.C12729c;

@Metadata(m15074d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001>B/\u0012\u0006\u0010-\u001a\u00020\n\u0012\u0006\u00103\u001a\u00020.\u0012\u0006\u00107\u001a\u000204\u0012\u0006\u00109\u001a\u00020\n\u0012\u0006\u0010;\u001a\u00020\n¢\u0006\u0004\b<\u0010=J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\u0006\u0010\b\u001a\u00020\u0002J\b\u0010\t\u001a\u00020\u0002H\u0016R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\fR\u0016\u0010\u0017\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u0016\u0010\u0019\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\fR\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010'\u001a\u0004\u0018\u00010$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010+\u001a\u0004\u0018\u00010(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\fR\u0017\u00103\u001a\u00020.8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00109\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010\fR\u0014\u0010;\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010\f¨\u0006?"}, m15073d2 = {"Lek/g;", "Ljava/io/Closeable;", "", "h", "g", "l", "n", "i", "b", "close", "", "k", "Z", "closed", "", "I", "opcode", "", "m", "J", "frameLength", "isFinalFrame", "o", "isControlFrame", "p", "readingCompressedMessage", "Lokio/Buffer;", "q", "Lokio/Buffer;", "controlFrameBuffer", "r", "messageFrameBuffer", "Lek/c;", "s", "Lek/c;", "messageInflater", "", "t", "[B", "maskKey", "Lokio/Buffer$a;", "u", "Lokio/Buffer$a;", "maskCursor", "v", "isClient", "Lokio/BufferedSource;", "w", "Lokio/BufferedSource;", "getSource", "()Lokio/BufferedSource;", "source", "Lek/g$a;", "x", "Lek/g$a;", "frameCallback", "y", "perMessageDeflate", "z", "noContextTakeover", "<init>", "(ZLokio/BufferedSource;Lek/g$a;ZZ)V", "a", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: ek.g */
/* loaded from: classes8.dex */
public final class C6964g implements Closeable {

    /* renamed from: k */
    private boolean f15180k;

    /* renamed from: l */
    private int f15181l;

    /* renamed from: m */
    private long f15182m;

    /* renamed from: n */
    private boolean f15183n;

    /* renamed from: o */
    private boolean f15184o;

    /* renamed from: p */
    private boolean f15185p;

    /* renamed from: q */
    private final Buffer f15186q = new Buffer();

    /* renamed from: r */
    private final Buffer f15187r = new Buffer();

    /* renamed from: s */
    private C6952c f15188s;

    /* renamed from: t */
    private final byte[] f15189t;

    /* renamed from: u */
    private final Buffer.C11434a f15190u;

    /* renamed from: v */
    private final boolean f15191v;

    /* renamed from: w */
    private final BufferedSource f15192w;

    /* renamed from: x */
    private final AbstractC6965a f15193x;

    /* renamed from: y */
    private final boolean f15194y;

    /* renamed from: z */
    private final boolean f15195z;

    @Metadata(m15074d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H&J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H&J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002H&¨\u0006\u0010"}, m15073d2 = {"Lek/g$a;", "", "", "text", "", "d", "Lokio/ByteString;", "bytes", "c", "payload", "e", "f", "", "code", "reason", "h", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: ek.g$a */
    /* loaded from: classes8.dex */
    public interface AbstractC6965a {
        /* renamed from: c */
        void mo23818c(ByteString byteString);

        /* renamed from: d */
        void mo23817d(String str);

        /* renamed from: e */
        void mo23816e(ByteString byteString);

        /* renamed from: f */
        void mo23815f(ByteString byteString);

        /* renamed from: h */
        void mo23814h(int i, String str);
    }

    public C6964g(boolean z, BufferedSource source, AbstractC6965a frameCallback, boolean z2, boolean z3) {
        byte[] bArr;
        C9971q.m14633g(source, "source");
        C9971q.m14633g(frameCallback, "frameCallback");
        this.f15191v = z;
        this.f15192w = source;
        this.f15193x = frameCallback;
        this.f15194y = z2;
        this.f15195z = z3;
        Buffer.C11434a aVar = null;
        if (z) {
            bArr = null;
        } else {
            bArr = new byte[4];
        }
        this.f15189t = bArr;
        this.f15190u = !z ? new Buffer.C11434a() : aVar;
    }

    /* renamed from: g */
    private final void m23823g() {
        String str;
        short s;
        long j = this.f15182m;
        if (j > 0) {
            this.f15192w.mo9722y(this.f15186q, j);
            if (!this.f15191v) {
                Buffer buffer = this.f15186q;
                Buffer.C11434a aVar = this.f15190u;
                C9971q.m14636d(aVar);
                buffer.m9768Y(aVar);
                this.f15190u.m9753h(0L);
                C6963f fVar = C6963f.f15179a;
                Buffer.C11434a aVar2 = this.f15190u;
                byte[] bArr = this.f15189t;
                C9971q.m14636d(bArr);
                fVar.m23826b(aVar2, bArr);
                this.f15190u.close();
            }
        }
        switch (this.f15181l) {
            case 8:
                long size = this.f15186q.size();
                if (size != 1) {
                    if (size != 0) {
                        s = this.f15186q.readShort();
                        str = this.f15186q.mo9726s0();
                        String a = C6963f.f15179a.m23827a(s);
                        if (a != null) {
                            throw new ProtocolException(a);
                        }
                    } else {
                        s = 1005;
                        str = "";
                    }
                    this.f15193x.mo23814h(s, str);
                    this.f15180k = true;
                    return;
                }
                throw new ProtocolException("Malformed close payload length of 1.");
            case 9:
                this.f15193x.mo23816e(this.f15186q.mo9727o0());
                return;
            case 10:
                this.f15193x.mo23815f(this.f15186q.mo9727o0());
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + C12729c.m5629N(this.f15181l));
        }
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: h */
    private final void m23822h() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        String str;
        boolean z6;
        if (!this.f15180k) {
            long h = this.f15192w.timeout().mo9682h();
            this.f15192w.timeout().mo9685b();
            try {
                int b = C12729c.m5616b(this.f15192w.readByte(), 255);
                this.f15192w.timeout().mo9679g(h, TimeUnit.NANOSECONDS);
                int i = b & 15;
                this.f15181l = i;
                boolean z7 = false;
                if ((b & 128) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.f15183n = z;
                if ((b & 8) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.f15184o = z2;
                if (!z2 || z) {
                    if ((b & 64) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (i == 1 || i == 2) {
                        if (!z3) {
                            z6 = false;
                        } else if (this.f15194y) {
                            z6 = true;
                        } else {
                            throw new ProtocolException("Unexpected rsv1 flag");
                        }
                        this.f15185p = z6;
                    } else if (z3) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    if ((b & 32) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z4) {
                        if ((b & 16) != 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (!z5) {
                            int b2 = C12729c.m5616b(this.f15192w.readByte(), 255);
                            if ((b2 & 128) != 0) {
                                z7 = true;
                            }
                            if (z7 == this.f15191v) {
                                if (this.f15191v) {
                                    str = "Server-sent frames must not be masked.";
                                } else {
                                    str = "Client-sent frames must be masked.";
                                }
                                throw new ProtocolException(str);
                            }
                            long j = b2 & 127;
                            this.f15182m = j;
                            if (j == 126) {
                                this.f15182m = C12729c.m5615c(this.f15192w.readShort(), 65535);
                            } else if (j == 127) {
                                long readLong = this.f15192w.readLong();
                                this.f15182m = readLong;
                                if (readLong < 0) {
                                    throw new ProtocolException("Frame length 0x" + C12729c.m5628O(this.f15182m) + " > 0x7FFFFFFFFFFFFFFF");
                                }
                            }
                            if (this.f15184o && this.f15182m > 125) {
                                throw new ProtocolException("Control frame must be less than 125B.");
                            } else if (z7) {
                                BufferedSource bufferedSource = this.f15192w;
                                byte[] bArr = this.f15189t;
                                C9971q.m14636d(bArr);
                                bufferedSource.readFully(bArr);
                            }
                        } else {
                            throw new ProtocolException("Unexpected rsv3 flag");
                        }
                    } else {
                        throw new ProtocolException("Unexpected rsv2 flag");
                    }
                } else {
                    throw new ProtocolException("Control frames must be final.");
                }
            } catch (Throwable th2) {
                this.f15192w.timeout().mo9679g(h, TimeUnit.NANOSECONDS);
                throw th2;
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: i */
    private final void m23821i() {
        while (!this.f15180k) {
            long j = this.f15182m;
            if (j > 0) {
                this.f15192w.mo9722y(this.f15187r, j);
                if (!this.f15191v) {
                    Buffer buffer = this.f15187r;
                    Buffer.C11434a aVar = this.f15190u;
                    C9971q.m14636d(aVar);
                    buffer.m9768Y(aVar);
                    this.f15190u.m9753h(this.f15187r.size() - this.f15182m);
                    C6963f fVar = C6963f.f15179a;
                    Buffer.C11434a aVar2 = this.f15190u;
                    byte[] bArr = this.f15189t;
                    C9971q.m14636d(bArr);
                    fVar.m23826b(aVar2, bArr);
                    this.f15190u.close();
                }
            }
            if (!this.f15183n) {
                m23819n();
                if (this.f15181l != 0) {
                    throw new ProtocolException("Expected continuation opcode. Got: " + C12729c.m5629N(this.f15181l));
                }
            } else {
                return;
            }
        }
        throw new IOException("closed");
    }

    /* renamed from: l */
    private final void m23820l() {
        int i = this.f15181l;
        if (i == 1 || i == 2) {
            m23821i();
            if (this.f15185p) {
                C6952c cVar = this.f15188s;
                if (cVar == null) {
                    cVar = new C6952c(this.f15195z);
                    this.f15188s = cVar;
                }
                cVar.m23855b(this.f15187r);
            }
            if (i == 1) {
                this.f15193x.mo23817d(this.f15187r.mo9726s0());
            } else {
                this.f15193x.mo23818c(this.f15187r.mo9727o0());
            }
        } else {
            throw new ProtocolException("Unknown opcode: " + C12729c.m5629N(i));
        }
    }

    /* renamed from: n */
    private final void m23819n() {
        while (!this.f15180k) {
            m23822h();
            if (this.f15184o) {
                m23823g();
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public final void m23824b() {
        m23822h();
        if (this.f15184o) {
            m23823g();
        } else {
            m23820l();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C6952c cVar = this.f15188s;
        if (cVar != null) {
            cVar.close();
        }
    }
}
