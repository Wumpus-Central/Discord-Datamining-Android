package com.linecorp.apng;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.AnimationUtils;
import androidx.vectordrawable.graphics.drawable.AbstractC3285b;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.util.JSStackTrace;
import com.linecorp.apng.decoder.Apng;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9899f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p105fe.AbstractC7121a;

@Metadata(m15074d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 j2\u00020\u00012\u00020\u0002:\u0002\u0010\nB\u0011\b\u0001\u0012\u0006\u0010c\u001a\u00020`¢\u0006\u0004\bh\u0010iJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0005H\u0002J\b\u0010\t\u001a\u00020\u0005H\u0002J\b\u0010\n\u001a\u00020\u0005H\u0002J!\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0082\u0010J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u000bH\u0016J\b\u0010\u0016\u001a\u00020\u000bH\u0016J\u0012\u0010\u0019\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u001a\u001a\u00020\u000bH\u0016J\b\u0010\u001b\u001a\u00020\u000bH\u0016J\b\u0010\u001c\u001a\u00020\u0005H\u0016J\b\u0010\u001d\u001a\u00020\u0003H\u0016J\b\u0010\u001e\u001a\u00020\u0003H\u0016J\n\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010!\u001a\u00020\u0001H\u0016J\u0006\u0010\"\u001a\u00020\u0003R\u001a\u0010'\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010*\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010&R\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020\u000b0+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u00103\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010$\u001a\u0004\b2\u0010&R\u001a\u00108\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R*\u0010>\u001a\u00020\u000b2\u0006\u00109\u001a\u00020\u000b8\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b:\u0010$\u001a\u0004\b;\u0010&\"\u0004\b<\u0010=R\u0017\u0010A\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0014\u0010F\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020H0G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010-R\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020K0G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010-R\u0014\u0010Q\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010S\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010$R\u0016\u0010U\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010$R\u0016\u0010W\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010@R\u0016\u0010Y\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u00105R\u0018\u0010\\\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R$\u0010_\u001a\u00020\u000b2\u0006\u00109\u001a\u00020\u000b8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b]\u0010$\"\u0004\b^\u0010=R\u0016\u0010c\u001a\u00020`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010e\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bd\u0010&R\u0011\u0010g\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bf\u0010&¨\u0006k"}, m15073d2 = {"Lcom/linecorp/apng/ApngDrawable;", "Landroid/graphics/drawable/Drawable;", "", "", "i", "", "f", "h", "g", "e", "b", "", "lowerBoundIndex", "upperBoundIndex", "", "progressMillisInCurrentLoop", "a", "Landroid/graphics/Canvas;", "canvas", "draw", "alpha", "setAlpha", "getOpacity", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "getIntrinsicWidth", "getIntrinsicHeight", "isRunning", ViewProps.START, "stop", "Landroid/graphics/drawable/Drawable$ConstantState;", "getConstantState", "mutate", "j", "k", "I", "getDurationMillis", "()I", "durationMillis", "l", "getFrameCount", "frameCount", "", "m", "Ljava/util/List;", "getFrameDurations", "()Ljava/util/List;", "frameDurations", "n", "getFrameByteCount", "frameByteCount", "o", "J", "getAllocationByteCount", "()J", "allocationByteCount", "value", "p", "getLoopCount", "setLoopCount", "(I)V", "loopCount", "q", "Z", "isRecycled", "()Z", "Landroid/graphics/Paint;", "r", "Landroid/graphics/Paint;", "paint", "", "Landroidx/vectordrawable/graphics/drawable/b;", "s", "animationCallbacks", "Lfe/a;", "t", "repeatAnimationCallbacks", "", "u", "[I", "frameStartTimes", "v", "scaledWidth", "w", "scaledHeight", "x", "isStarted", "y", "animationElapsedTimeMillis", "z", "Ljava/lang/Long;", "animationPrevDrawTimeMillis", "A", "setTargetDensity", "targetDensity", "Lcom/linecorp/apng/ApngDrawable$a;", "B", "Lcom/linecorp/apng/ApngDrawable$a;", "apngState", "d", "currentLoopIndexInternal", "c", "currentFrameIndex", "<init>", "(Lcom/linecorp/apng/ApngDrawable$a;)V", "C", "apng-drawable_release"}, m15072k = 1, m15071mv = {1, 4, 2})
/* loaded from: classes6.dex */
public final class ApngDrawable extends Drawable implements Animatable {

    /* renamed from: C */
    public static final C6004b f37641C = new C6004b(null);

    /* renamed from: B */
    private C6003a f37643B;

    /* renamed from: k */
    private final int f12122k;

    /* renamed from: l */
    private final int f12123l;

    /* renamed from: m */
    private final List<Integer> f12124m;

    /* renamed from: n */
    private final int f12125n;

    /* renamed from: o */
    private final long f12126o;

    /* renamed from: p */
    private int f12127p;

    /* renamed from: q */
    private final boolean f12128q;

    /* renamed from: u */
    private final int[] f12132u;

    /* renamed from: v */
    private int f12133v;

    /* renamed from: w */
    private int f12134w;

    /* renamed from: x */
    private boolean f12135x;

    /* renamed from: y */
    private long f12136y;

    /* renamed from: z */
    private Long f12137z;

    /* renamed from: r */
    private final Paint f12129r = new Paint(6);

    /* renamed from: s */
    private final List<AbstractC3285b> f12130s = new ArrayList();

    /* renamed from: t */
    private final List<AbstractC7121a> f12131t = new ArrayList();

    /* renamed from: A */
    private int f37642A = 160;

    @Metadata(m15074d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u001a\u0010\u001bB\u0011\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u0000¢\u0006\u0004\b\u001a\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u0012\u0010\u000eR\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u000b\u0010\u0018¨\u0006\u001e"}, m15073d2 = {"Lcom/linecorp/apng/ApngDrawable$a;", "Landroid/graphics/drawable/Drawable$ConstantState;", "Landroid/graphics/drawable/Drawable;", "newDrawable", "", "getChangingConfigurations", "Lcom/linecorp/apng/decoder/Apng;", "a", "Lcom/linecorp/apng/decoder/Apng;", "()Lcom/linecorp/apng/decoder/Apng;", "apng", "b", "I", "d", "()I", "width", "c", "height", "getSourceDensity", "sourceDensity", "Lkotlin/Function0;", "", "e", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "currentTimeProvider", "<init>", "(Lcom/linecorp/apng/decoder/Apng;IIILkotlin/jvm/functions/Function0;)V", "apngState", "(Lcom/linecorp/apng/ApngDrawable$a;)V", "apng-drawable_release"}, m15072k = 1, m15071mv = {1, 4, 2})
    /* renamed from: com.linecorp.apng.ApngDrawable$a */
    /* loaded from: classes6.dex */
    public static final class C6003a extends Drawable.ConstantState {

        /* renamed from: a */
        private final Apng f12138a;

        /* renamed from: b */
        private final int f12139b;

        /* renamed from: c */
        private final int f12140c;

        /* renamed from: d */
        private final int f12141d;

        /* renamed from: e */
        private final Function0<Long> f12142e;

        @Metadata(m15074d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m15073d2 = {"", "a", "()J"}, m15072k = 3, m15071mv = {1, 4, 2})
        /* renamed from: com.linecorp.apng.ApngDrawable$a$a */
        /* loaded from: classes6.dex */
        static final class C0172a extends AbstractC9973s implements Function0<Long> {

            /* renamed from: k */
            public static final C0172a f12143k = new C0172a();

            C0172a() {
                super(0);
            }

            /* renamed from: a */
            public final long m26483a() {
                return AnimationUtils.currentAnimationTimeMillis();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Long invoke() {
                return Long.valueOf(m26483a());
            }
        }

        public /* synthetic */ C6003a(Apng apng, int i, int i2, int i3, Function0 function0, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(apng, i, i2, (i4 & 8) != 0 ? 0 : i3, (i4 & 16) != 0 ? C0172a.f12143k : function0);
        }

        /* renamed from: a */
        public final Apng m26487a() {
            return this.f12138a;
        }

        /* renamed from: b */
        public final Function0<Long> m26486b() {
            return this.f12142e;
        }

        /* renamed from: c */
        public final int m26485c() {
            return this.f12140c;
        }

        /* renamed from: d */
        public final int m26484d() {
            return this.f12139b;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new ApngDrawable(new C6003a(this));
        }

        public C6003a(Apng apng, int i, int i2, int i3, Function0<Long> currentTimeProvider) {
            C9971q.m14633g(apng, "apng");
            C9971q.m14633g(currentTimeProvider, "currentTimeProvider");
            this.f12138a = apng;
            this.f12139b = i;
            this.f12140c = i2;
            this.f12141d = i3;
            this.f12142e = currentTimeProvider;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public C6003a(C6003a apngState) {
            this(apngState.f12138a.copy(), apngState.f12139b, apngState.f12140c, apngState.f12141d, apngState.f12142e);
            C9971q.m14633g(apngState, "apngState");
        }
    }

    @Metadata(m15074d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ/\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f¨\u0006\u0013"}, m15073d2 = {"Lcom/linecorp/apng/ApngDrawable$b;", "", "Ljava/io/File;", JSStackTrace.FILE_KEY, "", "width", "height", "Lcom/linecorp/apng/ApngDrawable;", "a", "(Ljava/io/File;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/linecorp/apng/ApngDrawable;", "Ljava/io/InputStream;", "stream", "b", "(Ljava/io/InputStream;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/linecorp/apng/ApngDrawable;", "LOOP_FOREVER", "I", "LOOP_INTRINSIC", "<init>", "()V", "apng-drawable_release"}, m15072k = 1, m15071mv = {1, 4, 2})
    /* renamed from: com.linecorp.apng.ApngDrawable$b */
    /* loaded from: classes6.dex */
    public static final class C6004b {
        private C6004b() {
        }

        public /* synthetic */ C6004b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: c */
        public static /* synthetic */ ApngDrawable m26480c(C6004b bVar, File file, Integer num, Integer num2, int i, Object obj) {
            if ((i & 2) != 0) {
                num = null;
            }
            if ((i & 4) != 0) {
                num2 = null;
            }
            return bVar.m26482a(file, num, num2);
        }

        /* renamed from: a */
        public final ApngDrawable m26482a(File file, Integer num, Integer num2) {
            BufferedInputStream bufferedInputStream;
            C9971q.m14633g(file, "file");
            FileInputStream fileInputStream = new FileInputStream(file);
            if (fileInputStream instanceof BufferedInputStream) {
                bufferedInputStream = (BufferedInputStream) fileInputStream;
            } else {
                bufferedInputStream = new BufferedInputStream(fileInputStream, 8192);
            }
            try {
                ApngDrawable b = ApngDrawable.f37641C.m26481b(bufferedInputStream, num, num2);
                th = null;
                return b;
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        }

        /* renamed from: b */
        public final ApngDrawable m26481b(InputStream stream, Integer num, Integer num2) {
            boolean z;
            boolean z2;
            boolean z3;
            int i;
            int i2;
            C9971q.m14633g(stream, "stream");
            boolean z4 = true;
            int i3 = 0;
            if (num == null) {
                z = true;
            } else {
                z = false;
            }
            if (num2 == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!(z ^ z2)) {
                if (num == null || num.intValue() > 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    if (num2 != null && num2.intValue() <= 0) {
                        z4 = false;
                    }
                    if (z4) {
                        if (num == null && num2 == null) {
                            i3 = 160;
                        }
                        Apng decode = Apng.Companion.decode(stream);
                        if (num != null) {
                            i = num.intValue();
                        } else {
                            i = decode.getWidth();
                        }
                        if (num2 != null) {
                            i2 = num2.intValue();
                        } else {
                            i2 = decode.getHeight();
                        }
                        return new ApngDrawable(new C6003a(decode, i, i2, i3, null, 16, null));
                    }
                    throw new IllegalArgumentException(("Can not specify 0 or negative as height value. height = " + num2).toString());
                }
                throw new IllegalArgumentException(("Can not specify 0 or negative as width value. width = " + num).toString());
            }
            throw new IllegalArgumentException(("Can not specify only one side of size. width = " + num + ", height = " + num2).toString());
        }
    }

    public ApngDrawable(C6003a apngState) {
        List<Integer> s0;
        C9971q.m14633g(apngState, "apngState");
        this.f37643B = apngState;
        this.f12122k = apngState.m26487a().getDuration();
        int frameCount = this.f37643B.m26487a().getFrameCount();
        this.f12123l = frameCount;
        s0 = C9899f.m14918s0(this.f37643B.m26487a().getFrameDurations());
        this.f12124m = s0;
        int byteCount = this.f37643B.m26487a().getByteCount();
        this.f12125n = byteCount;
        this.f12126o = this.f37643B.m26487a().getAllFrameByteCount() + byteCount;
        this.f12127p = this.f37643B.m26487a().getLoopCount();
        this.f12128q = this.f37643B.m26487a().isRecycled();
        this.f12132u = new int[frameCount];
        this.f12133v = this.f37643B.m26484d();
        this.f12134w = this.f37643B.m26485c();
        for (int i = 1; i < frameCount; i++) {
            int[] iArr = this.f12132u;
            int i2 = i - 1;
            iArr[i] = iArr[i2] + this.f37643B.m26487a().getFrameDurations()[i2];
        }
        getBounds().set(0, 0, this.f37643B.m26484d(), this.f37643B.m26485c());
    }

    /* renamed from: a */
    private final int m26497a(int i, int i2, long j) {
        int i3;
        while (true) {
            i3 = (i + i2) / 2;
            int[] iArr = this.f12132u;
            int i4 = i3 + 1;
            if (iArr.length > i4 && j >= iArr[i4]) {
                i = i4;
            } else if (i == i2 || j >= iArr[i3]) {
                break;
            } else {
                i2 = i3;
            }
        }
        return i3;
    }

    /* renamed from: b */
    private final boolean m26496b() {
        if (this.f12127p != 0 && m26494d() > this.f12127p - 1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private final int m26494d() {
        return (int) (this.f12136y / this.f12122k);
    }

    /* renamed from: e */
    private final boolean m26493e() {
        if (this.f12127p != 0 && m26494d() >= this.f12127p - 1) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private final boolean m26492f() {
        return m26495c() == 0;
    }

    /* renamed from: g */
    private final boolean m26491g() {
        return m26494d() == 0;
    }

    /* renamed from: h */
    private final boolean m26490h() {
        return m26495c() == this.f12123l - 1;
    }

    /* renamed from: i */
    private final void m26489i() {
        long j;
        boolean z;
        int c = m26495c();
        long longValue = this.f37643B.m26486b().invoke().longValue();
        Long l = this.f12137z;
        if (l == null) {
            j = this.f12136y;
        } else {
            j = (this.f12136y + longValue) - l.longValue();
        }
        this.f12136y = j;
        this.f12137z = Long.valueOf(longValue);
        if (m26495c() != c) {
            z = true;
        } else {
            z = false;
        }
        if (this.f12135x) {
            if (m26492f() && m26491g() && l == null) {
                for (AbstractC3285b bVar : this.f12130s) {
                    bVar.m34816b(this);
                }
            } else if (m26490h() && m26493e() && z) {
                for (AbstractC7121a aVar : this.f12131t) {
                    aVar.m23339b(this, m26494d() + 2);
                    aVar.m23340a(this, m26494d() + 1);
                }
            }
        }
        if (m26496b()) {
            this.f12135x = false;
            for (AbstractC3285b bVar2 : this.f12130s) {
                bVar2.mo27801a(this);
            }
        }
    }

    /* renamed from: c */
    public final int m26495c() {
        int i;
        long j = this.f12136y % this.f12122k;
        if (m26496b()) {
            i = this.f12122k;
        } else {
            i = 0;
        }
        return m26497a(0, this.f12123l - 1, j + i);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        C9971q.m14633g(canvas, "canvas");
        if (this.f12135x) {
            m26489i();
        }
        Apng a = this.f37643B.m26487a();
        int c = m26495c();
        Rect bounds = getBounds();
        C9971q.m14634f(bounds, "bounds");
        a.drawWithIndex(c, canvas, null, bounds, this.f12129r);
        if (this.f12135x) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f37643B;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f12134w;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f12133v;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f12135x;
    }

    /* renamed from: j */
    public final void m26488j() {
        this.f37643B.m26487a().recycle();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f37643B = new C6003a(this.f37643B);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f12129r.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f12129r.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f12135x = true;
        this.f12137z = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f12135x = false;
        invalidateSelf();
    }
}
