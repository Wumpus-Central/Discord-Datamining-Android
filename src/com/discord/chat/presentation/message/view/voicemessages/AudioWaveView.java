package com.discord.chat.presentation.message.view.voicemessages;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.discord.misc.utilities.coroutines.CoroutineViewUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.react_gesture_handler.GetDiscordGestureHandlerEnabledRootViewKt;
import com.discord.theme.ThemeManagerKt;
import com.facebook.react.uimanager.ViewProps;
import eg.C6884j;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C10129j;
import kotlinx.coroutines.Job;
import si.C12905a;
import si.C12907c;
import si.EnumC12908d;

@Metadata(m15074d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 Y2\u00020\u0001:\u0002YZB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010A\u001a\u000202H\u0002J\u0010\u0010B\u001a\u0002022\u0006\u0010C\u001a\u00020DH\u0014J0\u0010E\u001a\u0002022\u0006\u0010F\u001a\u00020<2\u0006\u0010G\u001a\u00020\u00072\u0006\u0010H\u001a\u00020\u00072\u0006\u0010I\u001a\u00020\u00072\u0006\u0010J\u001a\u00020\u0007H\u0014J\u0018\u0010K\u001a\u0002022\u0006\u0010L\u001a\u00020\u00072\u0006\u0010M\u001a\u00020\u0007H\u0014J\u0010\u0010N\u001a\u00020<2\u0006\u0010O\u001a\u00020PH\u0017J$\u0010Q\u001a\u0002022\b\b\u0002\u00107\u001a\u00020\"2\b\b\u0002\u0010-\u001a\u00020\u00072\u0006\u0010R\u001a\u00020<H\u0002J\u0006\u0010S\u001a\u000202J\u001a\u0010\u0014\u001a\u0002022\b\b\u0001\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010A\u001a\u00020<J&\u0010T\u001a\u000202*\u00020D2\u0006\u0010U\u001a\u00020\u00122\u0006\u0010V\u001a\u00020\u00182\b\b\u0002\u0010W\u001a\u00020<H\u0002J\f\u0010X\u001a\u00020\u0018*\u00020\u0018H\u0002R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0002@BX\u0083\u000e¢\u0006\n\n\u0002\u0010\u0016\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00078\u0006@FX\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00078\u0006@FX\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001dR\u001e\u0010#\u001a\u00020\"2\u0006\u0010\u0011\u001a\u00020\"@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b$\u0010%R*\u0010'\u001a\u0004\u0018\u00010&2\b\u0010\u0011\u001a\u0004\u0018\u00010&@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010,\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001e\u0010-\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b.\u0010\u001dR(\u0010/\u001a\u0010\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u000202\u0018\u000100X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u00107\u001a\u00020\"2\u0006\u0010\u0011\u001a\u00020\"@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010%R\u001a\u0010;\u001a\u00020<X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@¨\u0006["}, m15073d2 = {"Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "animationJob", "Lkotlinx/coroutines/Job;", "getAnimationJob", "()Lkotlinx/coroutines/Job;", "setAnimationJob", "(Lkotlinx/coroutines/Job;)V", "animationManager", "Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveAnimationManager;", "value", "", "audioProgress", "setAudioProgress", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "audioProgressPaint", "Landroid/graphics/Paint;", "audioProgressPaintColor", "getAudioProgressPaintColor", "()I", "setAudioProgressPaintColor", "(I)V", "defaultPaint", "defaultPaintColor", "getDefaultPaintColor", "setDefaultPaintColor", "", "downSampleData", "setDownSampleData", "([B)V", "", "duration", "getDuration", "()Ljava/lang/Long;", "setDuration", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "numChunks", "setNumChunks", "onAudioProgressChange", "Lkotlin/Function1;", "Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView$ProgressEvent;", "", "getOnAudioProgressChange", "()Lkotlin/jvm/functions/Function1;", "setOnAudioProgressChange", "(Lkotlin/jvm/functions/Function1;)V", "originalSampleData", "getOriginalSampleData", "()[B", "setOriginalSampleData", "shouldAnimate", "", "getShouldAnimate", "()Z", "setShouldAnimate", "(Z)V", "finishAnimation", "onDraw", "canvas", "Landroid/graphics/Canvas;", ViewProps.ON_LAYOUT, "changed", ViewProps.LEFT, ViewProps.TOP, ViewProps.RIGHT, ViewProps.BOTTOM, "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "recalculateSampleData", "downSample", "reset", "draw", "progress", "paint", "animate", "init", "Companion", "ProgressEvent", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class AudioWaveView extends View {
    private static final int CHUNK_SIZE;
    private static final int CHUNK_SPACING;
    private static final int CHUNK_WIDTH;
    private static final int MIN_CHUNK_NUMBER = 5;
    private static final int MIN_WIDTH;
    private Job animationJob;
    private final AudioWaveAnimationManager animationManager;
    private Float audioProgress;
    private final Paint audioProgressPaint;
    private int audioProgressPaintColor;
    private final Paint defaultPaint;
    private int defaultPaintColor;
    private byte[] downSampleData;
    private Long duration;
    private int numChunks;
    private Function1<? super ProgressEvent, Unit> onAudioProgressChange;
    private byte[] originalSampleData;
    private boolean shouldAnimate;
    public static final Companion Companion = new Companion(null);
    private static final int CHUNK_RADIUS = SizeUtilsKt.getDpToPx(8);
    private static final float CHUNK_MIN_HEIGHT = SizeUtilsKt.getDpToPx(1);
    private static final float CHUNK_MAX_HEIGHT = SizeUtilsKt.getDpToPx(12);
    private static final long MAX_DURATION = C12905a.m5124n(C12907c.m5090s(30, EnumC12908d.SECONDS));
    private static final int MAX_WIDTH = SizeUtilsKt.getDpToPx(600);
    private static final int FINISH_ANIMATION_NUM_REPEAT = 10;

    @Metadata(m15074d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m15073d2 = {"Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView$Companion;", "", "()V", "CHUNK_MAX_HEIGHT", "", "CHUNK_MIN_HEIGHT", "CHUNK_RADIUS", "", "CHUNK_SIZE", "CHUNK_SPACING", "CHUNK_WIDTH", "FINISH_ANIMATION_NUM_REPEAT", "MAX_DURATION", "", "MAX_WIDTH", "MIN_CHUNK_NUMBER", "MIN_WIDTH", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m15074d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m15073d2 = {"Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView$ProgressEvent;", "", "progress", "", "eventAction", "", "(FI)V", "getEventAction", "()I", "getProgress", "()F", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
    public static final class ProgressEvent {
        private final int eventAction;
        private final float progress;

        public ProgressEvent(float f, int i) {
            this.progress = f;
            this.eventAction = i;
        }

        public static /* synthetic */ ProgressEvent copy$default(ProgressEvent progressEvent, float f, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                f = progressEvent.progress;
            }
            if ((i2 & 2) != 0) {
                i = progressEvent.eventAction;
            }
            return progressEvent.copy(f, i);
        }

        public final float component1() {
            return this.progress;
        }

        public final int component2() {
            return this.eventAction;
        }

        public final ProgressEvent copy(float f, int i) {
            return new ProgressEvent(f, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProgressEvent)) {
                return false;
            }
            ProgressEvent progressEvent = (ProgressEvent) obj;
            return Float.compare(this.progress, progressEvent.progress) == 0 && this.eventAction == progressEvent.eventAction;
        }

        public final int getEventAction() {
            return this.eventAction;
        }

        public final float getProgress() {
            return this.progress;
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.progress) * 31) + this.eventAction;
        }

        public String toString() {
            float f = this.progress;
            int i = this.eventAction;
            return "ProgressEvent(progress=" + f + ", eventAction=" + i + ")";
        }
    }

    static {
        int dpToPx = SizeUtilsKt.getDpToPx(2);
        CHUNK_WIDTH = dpToPx;
        int dpToPx2 = SizeUtilsKt.getDpToPx(4);
        CHUNK_SPACING = dpToPx2;
        int i = dpToPx + dpToPx2;
        CHUNK_SIZE = i;
        C12905a.C0415a aVar = C12905a.f28981l;
        MIN_WIDTH = i * 5;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AudioWaveView(Context context) {
        this(context, null, 0, 6, null);
        C9971q.m14633g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AudioWaveView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C9971q.m14633g(context, "context");
    }

    public /* synthetic */ AudioWaveView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void draw(Canvas canvas, float f, Paint paint, boolean z) {
        boolean z2;
        Long l;
        int i;
        int i2 = 0;
        if (f == 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 && (l = this.duration) != null) {
            l.longValue();
            int height = canvas.getHeight() / 2;
            byte[] bArr = this.downSampleData;
            float length = 1 / bArr.length;
            int length2 = bArr.length;
            int i3 = 0;
            while (i2 < length2) {
                byte b = bArr[i2];
                int i4 = i3 + 1;
                float f2 = i3;
                float f3 = f2 * length;
                if (f3 > f) {
                    this.animationManager.resetIndex(i3);
                    return;
                }
                float abs = (SamplerKt.getAbs(b) / 127) * CHUNK_MAX_HEIGHT;
                float f4 = CHUNK_MIN_HEIGHT;
                float max = f4 + (Math.max(abs, f4) - f4);
                paint.setAlpha(255);
                if (z) {
                    max = this.animationManager.getAnimationValues(i3, (f - f3) / length, max);
                }
                float f5 = f2 * CHUNK_SIZE;
                float f6 = height;
                int i5 = CHUNK_RADIUS;
                canvas.drawRoundRect(f5, f6 - max, (i3 * i) + CHUNK_WIDTH, f6 + max, i5, i5, paint);
                i2++;
                i3 = i4;
            }
        }
    }

    static /* synthetic */ void draw$default(AudioWaveView audioWaveView, Canvas canvas, float f, Paint paint, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        audioWaveView.draw(canvas, f, paint, z);
    }

    private final void finishAnimation() {
        Job job = this.animationJob;
        if (job != null) {
            Job.C9996a.m14571a(job, null, 1, null);
        }
        this.animationJob = C10129j.m14195d(CoroutineViewUtilsKt.getAttachedScope(this), null, null, new AudioWaveView$finishAnimation$1(this, null), 3, null);
    }

    private final Paint init(Paint paint) {
        paint.setAntiAlias(true);
        paint.setStrokeWidth(0.0f);
        return paint;
    }

    private final void recalculateSampleData(byte[] bArr, int i, boolean z) {
        if (!z || i == this.downSampleData.length) {
            invalidate();
        } else {
            C10129j.m14195d(CoroutineViewUtilsKt.getAttachedScope(this), null, null, new AudioWaveView$recalculateSampleData$1(this, bArr, i, null), 3, null);
        }
    }

    static /* synthetic */ void recalculateSampleData$default(AudioWaveView audioWaveView, byte[] bArr, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bArr = audioWaveView.originalSampleData;
        }
        if ((i2 & 2) != 0) {
            i = audioWaveView.numChunks;
        }
        audioWaveView.recalculateSampleData(bArr, i, z);
    }

    private final void setAudioProgress(Float f) {
        this.audioProgress = f;
        postInvalidate();
    }

    public static /* synthetic */ void setAudioProgress$default(AudioWaveView audioWaveView, float f, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        audioWaveView.setAudioProgress(f, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDownSampleData(byte[] bArr) {
        this.animationManager.setData(bArr);
        this.downSampleData = bArr;
    }

    private final void setNumChunks(int i) {
        boolean z;
        if (this.numChunks != i) {
            z = true;
        } else {
            z = false;
        }
        recalculateSampleData$default(this, null, i, z, 1, null);
        this.numChunks = i;
    }

    public final Job getAnimationJob() {
        return this.animationJob;
    }

    public final int getAudioProgressPaintColor() {
        return this.audioProgressPaintColor;
    }

    public final int getDefaultPaintColor() {
        return this.defaultPaintColor;
    }

    public final Long getDuration() {
        return this.duration;
    }

    public final Function1<ProgressEvent, Unit> getOnAudioProgressChange() {
        return this.onAudioProgressChange;
    }

    public final byte[] getOriginalSampleData() {
        return this.originalSampleData;
    }

    public final boolean getShouldAnimate() {
        return this.shouldAnimate;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float f;
        C9971q.m14633g(canvas, "canvas");
        super.onDraw(canvas);
        if (this.numChunks != this.downSampleData.length) {
            recalculateSampleData$default(this, null, 0, true, 3, null);
            return;
        }
        canvas.save();
        draw(canvas, 1.0f, this.defaultPaint, false);
        Float f2 = this.audioProgress;
        if (f2 != null) {
            f = f2.floatValue();
        } else {
            f = 0.0f;
        }
        draw(canvas, f, this.audioProgressPaint, this.shouldAnimate);
        canvas.restore();
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int c;
        boolean z2;
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            int width = getWidth();
            int i6 = CHUNK_SIZE;
            if (width % i6 > CHUNK_WIDTH) {
                i5 = 1;
            } else {
                i5 = 0;
            }
            int i7 = this.numChunks;
            c = C6884j.m23961c((getWidth() / i6) + i5, 5);
            setNumChunks(c);
            if (i7 != this.numChunks) {
                z2 = true;
            } else {
                z2 = false;
            }
            recalculateSampleData$default(this, null, 0, z2, 3, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            java.lang.Long r0 = r5.duration
            r1 = 0
            if (r0 == 0) goto L_0x000b
            long r3 = r0.longValue()
            goto L_0x000c
        L_0x000b:
            r3 = r1
        L_0x000c:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x001b
            long r0 = com.discord.chat.presentation.message.view.voicemessages.AudioWaveView.MAX_DURATION
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0017
            goto L_0x001b
        L_0x0017:
            float r2 = (float) r3
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L_0x001d
        L_0x001b:
            r2 = 1065353216(0x3f800000, float:1.0)
        L_0x001d:
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r1) goto L_0x004e
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            boolean r1 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            r3 = 0
            if (r1 == 0) goto L_0x0039
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r0 = androidx.core.view.C2731w.m37076b(r0)
            goto L_0x003a
        L_0x0039:
            r0 = r3
        L_0x003a:
            int r6 = r6 - r0
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            boolean r1 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r1 == 0) goto L_0x0049
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r3 = androidx.core.view.C2731w.m37077a(r0)
        L_0x0049:
            int r6 = r6 - r3
            float r6 = (float) r6
            float r6 = r6 * r2
            int r6 = (int) r6
            goto L_0x0052
        L_0x004e:
            int r6 = android.view.View.MeasureSpec.getSize(r6)
        L_0x0052:
            int r0 = com.discord.chat.presentation.message.view.voicemessages.AudioWaveView.MAX_WIDTH
            int r6 = eg.C6882h.m23974g(r6, r0)
            int r0 = com.discord.chat.presentation.message.view.voicemessages.AudioWaveView.MIN_WIDTH
            int r6 = eg.C6882h.m23978c(r6, r0)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            r5.setMeasuredDimension(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.view.voicemessages.AudioWaveView.onMeasure(int, int):void");
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent event) {
        float i;
        C9971q.m14633g(event, "event");
        if (!isEnabled()) {
            return super.onTouchEvent(event);
        }
        if (event.getAction() == 0) {
            GetDiscordGestureHandlerEnabledRootViewKt.getDiscordGestureHandlerEnabledRootView(this).requestDisallowInterceptTouchEvent(true);
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
        i = C6884j.m23955i(event.getX(), 0.0f, getWidth());
        float width = i / getWidth();
        int action = event.getAction();
        if (action != 0 && action != 1 && action != 2) {
            return super.onTouchEvent(event);
        }
        Function1<? super ProgressEvent, Unit> function1 = this.onAudioProgressChange;
        if (function1 != null) {
            function1.invoke(new ProgressEvent(width, event.getAction()));
        }
        return true;
    }

    public final void reset() {
        this.animationManager.reset();
    }

    public final void setAnimationJob(Job job) {
        this.animationJob = job;
    }

    public final void setAudioProgressPaintColor(int i) {
        if (i != this.audioProgressPaintColor) {
            this.audioProgressPaint.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
            postInvalidate();
        }
        this.audioProgressPaintColor = i;
    }

    public final void setDefaultPaintColor(int i) {
        if (i != this.defaultPaintColor) {
            this.defaultPaint.setColor(i);
            postInvalidate();
        }
        this.defaultPaintColor = i;
    }

    public final void setDuration(Long l) {
        this.duration = l;
        requestLayout();
    }

    public final void setOnAudioProgressChange(Function1<? super ProgressEvent, Unit> function1) {
        this.onAudioProgressChange = function1;
    }

    public final void setOriginalSampleData(byte[] value) {
        C9971q.m14633g(value, "value");
        recalculateSampleData$default(this, value, 0, !Arrays.equals(this.originalSampleData, value), 2, null);
        this.originalSampleData = value;
    }

    public final void setShouldAnimate(boolean z) {
        this.shouldAnimate = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioWaveView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C9971q.m14633g(context, "context");
        this.animationManager = new AudioWaveAnimationManager();
        this.downSampleData = new byte[0];
        this.originalSampleData = new byte[0];
        this.onAudioProgressChange = AudioWaveView$onAudioProgressChange$1.INSTANCE;
        this.shouldAnimate = true;
        Paint init = init(new Paint());
        this.defaultPaint = init;
        this.defaultPaintColor = ThemeManagerKt.getTheme().getInteractiveNormal();
        Paint init2 = init(new Paint());
        this.audioProgressPaint = init2;
        this.audioProgressPaintColor = ThemeManagerKt.getTheme().getInteractiveActive();
        init.setColor(ThemeManagerKt.getTheme().getInteractiveNormal());
        init2.setColorFilter(new PorterDuffColorFilter(ThemeManagerKt.getTheme().getInteractiveActive(), PorterDuff.Mode.SRC_IN));
    }

    public final void setAudioProgress(float f, boolean z) {
        setAudioProgress(Float.valueOf(f));
        if (this.shouldAnimate && z) {
            finishAnimation();
        }
    }
}
