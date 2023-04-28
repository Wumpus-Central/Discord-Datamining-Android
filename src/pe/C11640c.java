package pe;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Log;
import android.view.Surface;
import ie.AbstractC8391b;
import ie.C8392c;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import ke.AbstractC9850a;
import kotlin.Metadata;
import kotlin.collections.C9906j;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import re.C12572a;
import re.C12577f;

@Metadata(m15074d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0011B#\b\u0007\u0012\u0006\u0010A\u001a\u00020>\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010B¢\u0006\u0004\bC\u0010DJ&\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016J\u001c\u0010\t\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016J\u001a\u0010\u000e\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u0007H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0016R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0016\u0010!\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001cR\u0016\u0010#\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001cR\u0016\u0010%\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\u0018R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u00101\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\n068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010=\u001a\u00060:R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010A\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006E"}, m15073d2 = {"Lpe/c;", "Lpe/i;", "Landroid/view/Surface;", "outputSurface", "Landroid/media/MediaFormat;", "sourceMediaFormat", "targetMediaFormat", "", "b", "d", "Lie/c;", "inputFrame", "", "presentationTimeNs", "c", "release", "", "a", "", "Lke/a;", "Ljava/util/List;", "filters", "Landroid/media/MediaFormat;", "", "D", "targetSampleDurationUs", "", "e", "I", "sourceChannelCount", "f", "targetChannelCount", "g", "sourceSampleRate", "h", "targetSampleRate", "i", "samplingRatio", "Lre/a;", "j", "Lre/a;", "bufferPool", "Lpe/b;", "k", "Lpe/b;", "audioProcessorFactory", "Lpe/a;", "l", "Lpe/a;", "audioProcessor", "Ljava/util/concurrent/atomic/AtomicBoolean;", "m", "Ljava/util/concurrent/atomic/AtomicBoolean;", "released", "Ljava/util/concurrent/LinkedBlockingDeque;", "n", "Ljava/util/concurrent/LinkedBlockingDeque;", "renderQueue", "Lpe/c$a;", "o", "Lpe/c$a;", "renderThread", "Lie/b;", "p", "Lie/b;", "encoder", "", "<init>", "(Lie/b;Ljava/util/List;)V", "litr_release"}, m15072k = 1, m15071mv = {1, 4, 2})
/* renamed from: pe.c */
/* loaded from: classes6.dex */
public final class C11640c implements AbstractC11647i {

    /* renamed from: a */
    private final List<AbstractC9850a> f25954a;

    /* renamed from: b */
    private MediaFormat f25955b;

    /* renamed from: c */
    private MediaFormat f25956c;

    /* renamed from: d */
    private double f25957d;

    /* renamed from: e */
    private int f25958e;

    /* renamed from: f */
    private int f25959f;

    /* renamed from: g */
    private int f25960g;

    /* renamed from: h */
    private int f25961h;

    /* renamed from: i */
    private double f25962i;

    /* renamed from: j */
    private final C12572a f25963j;

    /* renamed from: k */
    private final C11639b f25964k;

    /* renamed from: l */
    private AbstractC11638a f25965l;

    /* renamed from: m */
    private AtomicBoolean f25966m;

    /* renamed from: n */
    private final LinkedBlockingDeque<C8392c> f25967n;

    /* renamed from: o */
    private final C11641a f25968o;

    /* renamed from: p */
    private final AbstractC8391b f25969p;

    @Metadata(m15074d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0016¨\u0006\u000b"}, m15073d2 = {"Lpe/c$a;", "Ljava/lang/Thread;", "", "tag", "Lie/c;", "inputFrame", "", "a", "run", "<init>", "(Lpe/c;)V", "litr_release"}, m15072k = 1, m15071mv = {1, 4, 2})
    /* renamed from: pe.c$a */
    /* loaded from: classes6.dex */
    private final class C11641a extends Thread {
        public C11641a() {
        }

        /* renamed from: a */
        private final void m9167a(int i, C8392c cVar) {
            ByteBuffer byteBuffer;
            boolean z;
            C8392c b = C11640c.this.f25969p.mo19859b(i);
            if (!(b == null || b.f18294b == null || (byteBuffer = cVar.f18294b) == null)) {
                MediaCodec.BufferInfo bufferInfo = b.f18295c;
                bufferInfo.offset = 0;
                MediaCodec.BufferInfo bufferInfo2 = cVar.f18295c;
                bufferInfo.flags = bufferInfo2.flags;
                bufferInfo.presentationTimeUs = bufferInfo2.presentationTimeUs + ((long) ((byteBuffer.position() / (C11640c.this.f25959f * 2)) * C11640c.this.f25957d));
                if (b.f18294b.limit() >= cVar.f18294b.remaining()) {
                    b.f18295c.size = cVar.f18294b.remaining();
                    z = true;
                } else {
                    b.f18295c.size = b.f18294b.limit();
                    b.f18295c.flags &= -5;
                    z = false;
                }
                int i2 = b.f18295c.size;
                for (int i3 = 0; i3 < i2; i3++) {
                    b.f18294b.put(cVar.f18294b.get());
                }
                if (z) {
                    C11640c.this.f25967n.removeFirst();
                    C11640c.this.f25963j.m6501d(cVar.f18294b);
                }
                C11640c.this.f25969p.mo19860a(b);
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (!C11640c.this.f25966m.get()) {
                C8392c cVar = (C8392c) C11640c.this.f25967n.peekFirst();
                if (cVar != null) {
                    int e = C11640c.this.f25969p.mo19856e(0L);
                    if (e >= 0) {
                        m9167a(e, cVar);
                    } else if (e != -1) {
                        Log.e("AudioRenderer", "Unhandled value " + e + " when receiving decoded input frame");
                    }
                }
            }
            C11640c.this.f25967n.clear();
        }
    }

    public C11640c(AbstractC8391b bVar) {
        this(bVar, null, 2, null);
    }

    public C11640c(AbstractC8391b encoder, List<AbstractC9850a> list) {
        C9971q.m14633g(encoder, "encoder");
        this.f25969p = encoder;
        this.f25954a = list == null ? C9906j.m14820i() : list;
        this.f25958e = -1;
        this.f25959f = -1;
        this.f25960g = -1;
        this.f25961h = -1;
        this.f25962i = 1.0d;
        this.f25963j = new C12572a(true);
        this.f25964k = new C11639b();
        this.f25966m = new AtomicBoolean(false);
        this.f25967n = new LinkedBlockingDeque<>();
        this.f25968o = new C11641a();
    }

    @Override // pe.AbstractC11647i
    /* renamed from: a */
    public boolean mo9157a() {
        return !this.f25954a.isEmpty();
    }

    @Override // pe.AbstractC11647i
    /* renamed from: b */
    public void mo9156b(Surface surface, MediaFormat mediaFormat, MediaFormat mediaFormat2) {
        mo9154d(mediaFormat, mediaFormat2);
        this.f25966m.set(false);
        this.f25968o.start();
        for (AbstractC9850a aVar : this.f25954a) {
            aVar.m15199d(mediaFormat2);
        }
    }

    @Override // pe.AbstractC11647i
    /* renamed from: c */
    public void mo9155c(C8392c cVar, long j) {
        if (!(this.f25966m.get() || cVar == null)) {
            C8392c cVar2 = new C8392c(cVar.f18293a, this.f25963j.m6502c(((int) Math.ceil((cVar.f18295c.size / (this.f25958e * 2)) * this.f25962i)) * this.f25959f * 2), new MediaCodec.BufferInfo());
            AbstractC11638a aVar = this.f25965l;
            if (aVar != null) {
                aVar.mo9158a(cVar, cVar2);
            }
            for (AbstractC9850a aVar2 : this.f25954a) {
                aVar2.m15200a(cVar2);
            }
            this.f25967n.add(cVar2);
        }
    }

    @Override // pe.AbstractC11647i
    /* renamed from: d */
    public void mo9154d(MediaFormat mediaFormat, MediaFormat mediaFormat2) {
        Number number;
        Number number2;
        Number number3;
        Number d;
        Integer num = -1;
        if (mediaFormat == null || (number = C12577f.f28278a.m6488a(mediaFormat, num)) == null) {
            number = num;
        }
        if (mediaFormat2 == null || (number2 = C12577f.f28278a.m6488a(mediaFormat2, num)) == null) {
            number2 = num;
        }
        if (mediaFormat == null || (number3 = C12577f.f28278a.m6485d(mediaFormat, num)) == null) {
            number3 = num;
        }
        if (!(mediaFormat2 == null || (d = C12577f.f28278a.m6485d(mediaFormat2, num)) == null)) {
            num = d;
        }
        int i = this.f25958e;
        if ((number instanceof Integer) && i == ((Integer) number).intValue()) {
            int i2 = this.f25959f;
            if ((number2 instanceof Integer) && i2 == ((Integer) number2).intValue()) {
                int i3 = this.f25960g;
                if ((number3 instanceof Integer) && i3 == ((Integer) number3).intValue()) {
                    int i4 = this.f25961h;
                    if ((num instanceof Integer) && i4 == num.intValue()) {
                        return;
                    }
                }
            }
        }
        AbstractC11638a aVar = this.f25965l;
        if (aVar != null) {
            aVar.release();
        }
        this.f25965l = this.f25964k.m9174a(mediaFormat, mediaFormat2);
        this.f25958e = number.intValue();
        this.f25959f = number2.intValue();
        this.f25960g = number3.intValue();
        this.f25961h = num.intValue();
        this.f25957d = 1000000.0d / num.doubleValue();
        this.f25962i = num.doubleValue() / number3.doubleValue();
        this.f25955b = mediaFormat;
        this.f25956c = mediaFormat2;
    }

    @Override // pe.AbstractC11647i
    public void release() {
        this.f25966m.set(true);
        AbstractC11638a aVar = this.f25965l;
        if (aVar != null) {
            aVar.release();
        }
        this.f25963j.m6503b();
        for (AbstractC9850a aVar2 : this.f25954a) {
            aVar2.release();
        }
    }

    public /* synthetic */ C11640c(AbstractC8391b bVar, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, (i & 2) != 0 ? null : list);
    }
}
