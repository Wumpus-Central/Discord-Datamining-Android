package p117g7;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import p119g9.C7557q0;

/* renamed from: g7.t */
/* loaded from: classes7.dex */
final class C7487t {

    /* renamed from: a */
    private final C7488a f16200a;

    /* renamed from: b */
    private int f16201b;

    /* renamed from: c */
    private long f16202c;

    /* renamed from: d */
    private long f16203d;

    /* renamed from: e */
    private long f16204e;

    /* renamed from: f */
    private long f16205f;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g7.t$a */
    /* loaded from: classes7.dex */
    public static final class C7488a {

        /* renamed from: a */
        private final AudioTrack f16206a;

        /* renamed from: b */
        private final AudioTimestamp f16207b = new AudioTimestamp();

        /* renamed from: c */
        private long f16208c;

        /* renamed from: d */
        private long f16209d;

        /* renamed from: e */
        private long f16210e;

        public C7488a(AudioTrack audioTrack) {
            this.f16206a = audioTrack;
        }

        /* renamed from: a */
        public long m22443a() {
            return this.f16210e;
        }

        /* renamed from: b */
        public long m22442b() {
            return this.f16207b.nanoTime / 1000;
        }

        /* renamed from: c */
        public boolean m22441c() {
            boolean timestamp = this.f16206a.getTimestamp(this.f16207b);
            if (timestamp) {
                long j = this.f16207b.framePosition;
                if (this.f16209d > j) {
                    this.f16208c++;
                }
                this.f16209d = j;
                this.f16210e = j + (this.f16208c << 32);
            }
            return timestamp;
        }
    }

    public C7487t(AudioTrack audioTrack) {
        if (C7557q0.f16368a >= 19) {
            this.f16200a = new C7488a(audioTrack);
            m22445g();
            return;
        }
        this.f16200a = null;
        m22444h(3);
    }

    /* renamed from: h */
    private void m22444h(int i) {
        this.f16201b = i;
        if (i == 0) {
            this.f16204e = 0L;
            this.f16205f = -1L;
            this.f16202c = System.nanoTime() / 1000;
            this.f16203d = 10000L;
        } else if (i == 1) {
            this.f16203d = 10000L;
        } else if (i == 2 || i == 3) {
            this.f16203d = 10000000L;
        } else if (i == 4) {
            this.f16203d = 500000L;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public void m22451a() {
        if (this.f16201b == 4) {
            m22445g();
        }
    }

    @TargetApi(19)
    /* renamed from: b */
    public long m22450b() {
        C7488a aVar = this.f16200a;
        if (aVar != null) {
            return aVar.m22443a();
        }
        return -1L;
    }

    @TargetApi(19)
    /* renamed from: c */
    public long m22449c() {
        C7488a aVar = this.f16200a;
        if (aVar != null) {
            return aVar.m22442b();
        }
        return -9223372036854775807L;
    }

    /* renamed from: d */
    public boolean m22448d() {
        return this.f16201b == 2;
    }

    @TargetApi(19)
    /* renamed from: e */
    public boolean m22447e(long j) {
        C7488a aVar = this.f16200a;
        if (aVar == null || j - this.f16204e < this.f16203d) {
            return false;
        }
        this.f16204e = j;
        boolean c = aVar.m22441c();
        int i = this.f16201b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (c) {
                        m22445g();
                    }
                } else if (!c) {
                    m22445g();
                }
            } else if (!c) {
                m22445g();
            } else if (this.f16200a.m22443a() > this.f16205f) {
                m22444h(2);
            }
        } else if (c) {
            if (this.f16200a.m22442b() < this.f16202c) {
                return false;
            }
            this.f16205f = this.f16200a.m22443a();
            m22444h(1);
        } else if (j - this.f16202c > 500000) {
            m22444h(3);
        }
        return c;
    }

    /* renamed from: f */
    public void m22446f() {
        m22444h(4);
    }

    /* renamed from: g */
    public void m22445g() {
        if (this.f16200a != null) {
            m22444h(0);
        }
    }
}
