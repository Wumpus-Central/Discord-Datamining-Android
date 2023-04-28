package com.linecorp.apng.decoder;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Trace;
import com.linecorp.apng.decoder.ApngException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.collections.C9899f;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 >2\u00020\u0001:\u0002>?BE\u0012\u0006\u0010\u001a\u001a\u00020\u0006\u0012\u0006\u0010\u001d\u001a\u00020\u0006\u0012\u0006\u0010 \u001a\u00020\u0006\u0012\b\b\u0001\u0010#\u001a\u00020\u0006\u0012\u0006\u0010)\u001a\u00020$\u0012\b\b\u0001\u0010,\u001a\u00020\u0006\u0012\b\b\u0001\u00102\u001a\u00020-¢\u0006\u0004\b<\u0010=J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0000J\u0006\u0010\u0005\u001a\u00020\u0002J0\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015R\u0017\u0010\u001d\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017R\u0017\u0010 \u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010\u0017R\u0017\u0010#\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\u0015\u001a\u0004\b\"\u0010\u0017R\u0017\u0010)\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010,\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b*\u0010\u0015\u001a\u0004\b+\u0010\u0017R\u0017\u00102\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0011\u00104\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b3\u0010\u0017R\u0011\u00106\u001a\u0002058F¢\u0006\u0006\u001a\u0004\b6\u00107R\u0011\u0010;\u001a\u0002088F¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006@"}, m15073d2 = {"Lcom/linecorp/apng/decoder/Apng;", "", "", "recycle", "copy", "finalize", "", "frameIndex", "Landroid/graphics/Canvas;", "canvas", "Landroid/graphics/Rect;", "src", "dst", "Landroid/graphics/Paint;", "paint", "drawWithIndex", "Landroid/graphics/Bitmap;", "a", "Landroid/graphics/Bitmap;", "bitmap", "b", "I", "getDuration", "()I", "duration", "c", "id", "d", "getWidth", "width", "e", "getHeight", "height", "f", "getFrameCount", "frameCount", "", "g", "[I", "getFrameDurations", "()[I", "frameDurations", "h", "getLoopCount", "loopCount", "", "i", "J", "getAllFrameByteCount", "()J", "allFrameByteCount", "getByteCount", "byteCount", "", "isRecycled", "()Z", "Landroid/graphics/Bitmap$Config;", "getConfig", "()Landroid/graphics/Bitmap$Config;", "config", "<init>", "(IIII[IIJ)V", "Companion", "DecodeResult", "apng-drawable_release"}, m15072k = 1, m15071mv = {1, 4, 2})
/* loaded from: classes6.dex */
public final class Apng {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final Bitmap f12144a;

    /* renamed from: b */
    private final int f12145b;

    /* renamed from: c */
    private final int f12146c;

    /* renamed from: d */
    private final int f12147d;

    /* renamed from: e */
    private final int f12148e;

    /* renamed from: f */
    private final int f12149f;

    /* renamed from: g */
    private final int[] f12150g;

    /* renamed from: h */
    private final int f12151h;

    /* renamed from: i */
    private final long f12152i;

    @Metadata(m15074d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b¨\u0006\u0010"}, m15073d2 = {"Lcom/linecorp/apng/decoder/Apng$Companion;", "", "", "resultCode", "", "a", "Ljava/io/InputStream;", "stream", "Lcom/linecorp/apng/decoder/Apng;", "decode", "", "isApng", "apng", "copy", "<init>", "()V", "apng-drawable_release"}, m15072k = 1, m15071mv = {1, 4, 2})
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        private final void m26479a(int i) {
            if (i < 0) {
                throw new ApngException(ApngException.ErrorCode.Companion.fromErrorCode$apng_drawable_release(i), null, 2, null);
            }
        }

        /* JADX WARN: Finally extract failed */
        public final Apng copy(Apng apng) {
            C9971q.m14633g(apng, "apng");
            DecodeResult decodeResult = new DecodeResult();
            Trace.beginSection("Apng#copy");
            try {
                int copy = ApngDecoderJni.copy(apng.f12146c, decodeResult);
                Trace.endSection();
                m26479a(copy);
                try {
                    return new Apng(copy, decodeResult.getWidth(), decodeResult.getHeight(), decodeResult.getFrameCount(), decodeResult.getFrameDurations(), decodeResult.getLoopCount(), decodeResult.getAllFrameByteCount());
                } finally {
                    ApngException apngException = new ApngException(th);
                }
            } finally {
                try {
                    throw new ApngException(th);
                } catch (Throwable th2) {
                }
            }
        }

        /* JADX WARN: Finally extract failed */
        public final Apng decode(InputStream stream) {
            C9971q.m14633g(stream, "stream");
            DecodeResult decodeResult = new DecodeResult();
            Trace.beginSection("Apng#decode");
            try {
                int decode = ApngDecoderJni.decode(stream, decodeResult);
                Trace.endSection();
                m26479a(decode);
                try {
                    return new Apng(decode, decodeResult.getWidth(), decodeResult.getHeight(), decodeResult.getFrameCount(), decodeResult.getFrameDurations(), decodeResult.getLoopCount(), decodeResult.getAllFrameByteCount());
                } finally {
                    ApngException apngException = new ApngException(th);
                }
            } finally {
                try {
                    throw new ApngException(th);
                } catch (Throwable th2) {
                }
            }
        }

        public final boolean isApng(InputStream stream) {
            C9971q.m14633g(stream, "stream");
            try {
                return ApngDecoderJni.isApng(stream);
            } catch (Throwable th2) {
                throw new ApngException(th2);
            }
        }
    }

    @Metadata(m15075bv = {1, 0, 3}, m15074d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001a\u0010\u0018\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR\u001a\u0010\u001b\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000e¨\u0006\u001e"}, m15073d2 = {"Lcom/linecorp/apng/decoder/Apng$DecodeResult;", "", "()V", "allFrameByteCount", "", "getAllFrameByteCount", "()J", "setAllFrameByteCount", "(J)V", "frameCount", "", "getFrameCount", "()I", "setFrameCount", "(I)V", "frameDurations", "", "getFrameDurations", "()[I", "setFrameDurations", "([I)V", "height", "getHeight", "setHeight", "loopCount", "getLoopCount", "setLoopCount", "width", "getWidth", "setWidth", "apng-drawable_release"}, m15072k = 1, m15071mv = {1, 4, 2})
    /* loaded from: classes6.dex */
    public static final class DecodeResult {
        private long allFrameByteCount;
        private int frameCount;
        private int[] frameDurations = new int[0];
        private int height;
        private int loopCount;
        private int width;

        public final long getAllFrameByteCount() {
            return this.allFrameByteCount;
        }

        public final int getFrameCount() {
            return this.frameCount;
        }

        public final int[] getFrameDurations() {
            return this.frameDurations;
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getLoopCount() {
            return this.loopCount;
        }

        public final int getWidth() {
            return this.width;
        }

        public final void setAllFrameByteCount(long j) {
            this.allFrameByteCount = j;
        }

        public final void setFrameCount(int i) {
            this.frameCount = i;
        }

        public final void setFrameDurations(int[] iArr) {
            C9971q.m14633g(iArr, "<set-?>");
            this.frameDurations = iArr;
        }

        public final void setHeight(int i) {
            this.height = i;
        }

        public final void setLoopCount(int i) {
            this.loopCount = i;
        }

        public final void setWidth(int i) {
            this.width = i;
        }
    }

    public Apng(int i, int i2, int i3, int i4, int[] frameDurations, int i5, long j) {
        int l0;
        C9971q.m14633g(frameDurations, "frameDurations");
        this.f12146c = i;
        this.f12147d = i2;
        this.f12148e = i3;
        this.f12149f = i4;
        this.f12150g = frameDurations;
        this.f12151h = i5;
        this.f12152i = j;
        Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        C9971q.m14634f(createBitmap, "Bitmap.createBitmap(widt… Bitmap.Config.ARGB_8888)");
        this.f12144a = createBitmap;
        Trace.beginSection("Apng#draw");
        ApngDecoderJni.draw(i, 0, createBitmap);
        Trace.endSection();
        l0 = C9899f.m14925l0(frameDurations);
        this.f12145b = l0;
    }

    public final Apng copy() {
        return Companion.copy(this);
    }

    public final void drawWithIndex(int i, Canvas canvas, Rect rect, Rect dst, Paint paint) {
        C9971q.m14633g(canvas, "canvas");
        C9971q.m14633g(dst, "dst");
        C9971q.m14633g(paint, "paint");
        Trace.beginSection("Apng#draw");
        ApngDecoderJni.draw(this.f12146c, i, this.f12144a);
        Trace.endSection();
        canvas.drawBitmap(this.f12144a, rect, dst, paint);
    }

    public final void finalize() {
        recycle();
    }

    public final long getAllFrameByteCount() {
        return this.f12152i;
    }

    public final int getByteCount() {
        return this.f12144a.getAllocationByteCount();
    }

    public final Bitmap.Config getConfig() {
        Bitmap.Config config = this.f12144a.getConfig();
        C9971q.m14634f(config, "bitmap.config");
        return config;
    }

    public final int getDuration() {
        return this.f12145b;
    }

    public final int getFrameCount() {
        return this.f12149f;
    }

    public final int[] getFrameDurations() {
        return this.f12150g;
    }

    public final int getHeight() {
        return this.f12148e;
    }

    public final int getLoopCount() {
        return this.f12151h;
    }

    public final int getWidth() {
        return this.f12147d;
    }

    public final boolean isRecycled() {
        return this.f12144a.isRecycled();
    }

    public final void recycle() {
        ApngDecoderJni.recycle(this.f12146c);
    }
}
