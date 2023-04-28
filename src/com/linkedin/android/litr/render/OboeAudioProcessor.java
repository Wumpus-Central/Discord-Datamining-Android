package com.linkedin.android.litr.render;

import ie.C8392c;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pe.AbstractC11638a;

@Metadata(m15074d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\n\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\u0012B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b \u0010!J)\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0082 J!\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\tH\u0082 J\t\u0010\u000e\u001a\u00020\u0007H\u0082 J\u0018\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u0007H\u0016R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001e¨\u0006#"}, m15073d2 = {"Lcom/linkedin/android/litr/render/OboeAudioProcessor;", "Lpe/a;", "", "sourceChannelCount", "sourceSampleRate", "targetChannelCount", "targetSampleRate", "", "initProcessor", "Ljava/nio/ByteBuffer;", "sourceBuffer", "sampleCount", "targetBuffer", "processAudioFrame", "releaseProcessor", "Lie/c;", "sourceFrame", "targetFrame", "a", "release", "", "D", "samplingRatio", "b", "sampleDurationUs", "", "c", "J", "presentationTimeNs", "d", "I", "e", "<init>", "(IIII)V", "f", "litr_release"}, m15072k = 1, m15071mv = {1, 4, 2})
/* loaded from: classes6.dex */
public final class OboeAudioProcessor implements AbstractC11638a {

    /* renamed from: f */
    public static final C6013a f12207f = new C6013a(null);

    /* renamed from: a */
    private final double f12208a;

    /* renamed from: b */
    private double f12209b;

    /* renamed from: c */
    private long f12210c = 0;

    /* renamed from: d */
    private final int f12211d;

    /* renamed from: e */
    private final int f12212e;

    @Metadata(m15074d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m15073d2 = {"Lcom/linkedin/android/litr/render/OboeAudioProcessor$a;", "", "<init>", "()V", "litr_release"}, m15072k = 1, m15071mv = {1, 4, 2})
    /* renamed from: com.linkedin.android.litr.render.OboeAudioProcessor$a */
    /* loaded from: classes6.dex */
    public static final class C6013a {
        private C6013a() {
        }

        public /* synthetic */ C6013a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        System.loadLibrary("litr-jni");
    }

    public OboeAudioProcessor(int i, int i2, int i3, int i4) {
        this.f12211d = i;
        this.f12212e = i3;
        initProcessor(i, i2, i3, i4);
        double d = i4;
        this.f12208a = d / i2;
        this.f12209b = 1000000.0d / d;
    }

    private final native void initProcessor(int i, int i2, int i3, int i4);

    private final native int processAudioFrame(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2);

    private final native void releaseProcessor();

    @Override // pe.AbstractC11638a
    /* renamed from: a */
    public void mo9158a(C8392c sourceFrame, C8392c targetFrame) {
        ByteBuffer byteBuffer;
        C9971q.m14633g(sourceFrame, "sourceFrame");
        C9971q.m14633g(targetFrame, "targetFrame");
        ByteBuffer byteBuffer2 = sourceFrame.f18294b;
        if (byteBuffer2 == null || (byteBuffer = targetFrame.f18294b) == null) {
            throw new IllegalArgumentException("Source or target frame doesn't have a buffer, cannot process it!");
        }
        int processAudioFrame = processAudioFrame(byteBuffer2, sourceFrame.f18295c.size / (this.f12211d * 2), byteBuffer);
        int i = processAudioFrame * 2 * this.f12212e;
        targetFrame.f18294b.rewind();
        targetFrame.f18294b.limit(i);
        targetFrame.f18295c.set(0, i, this.f12210c, sourceFrame.f18295c.flags);
        this.f12210c += (long) (processAudioFrame * this.f12209b);
    }

    @Override // pe.AbstractC11638a
    public void release() {
        releaseProcessor();
    }
}
