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
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlin.time.Duration;
import kotlin.time.a;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.j;
import ui.c;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 Y2\u00020\u0001:\u0002YZB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010A\u001a\u000202H\u0002J\u0010\u0010B\u001a\u0002022\u0006\u0010C\u001a\u00020DH\u0014J0\u0010E\u001a\u0002022\u0006\u0010F\u001a\u00020<2\u0006\u0010G\u001a\u00020\u00072\u0006\u0010H\u001a\u00020\u00072\u0006\u0010I\u001a\u00020\u00072\u0006\u0010J\u001a\u00020\u0007H\u0014J\u0018\u0010K\u001a\u0002022\u0006\u0010L\u001a\u00020\u00072\u0006\u0010M\u001a\u00020\u0007H\u0014J\u0010\u0010N\u001a\u00020<2\u0006\u0010O\u001a\u00020PH\u0017J$\u0010Q\u001a\u0002022\b\b\u0002\u00107\u001a\u00020\"2\b\b\u0002\u0010-\u001a\u00020\u00072\u0006\u0010R\u001a\u00020<H\u0002J\u0006\u0010S\u001a\u000202J\u001a\u0010\u0014\u001a\u0002022\b\b\u0001\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010A\u001a\u00020<J&\u0010T\u001a\u000202*\u00020D2\u0006\u0010U\u001a\u00020\u00122\u0006\u0010V\u001a\u00020\u00182\b\b\u0002\u0010W\u001a\u00020<H\u0002J\f\u0010X\u001a\u00020\u0018*\u00020\u0018H\u0002R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0002@BX\u0083\u000e¢\u0006\n\n\u0002\u0010\u0016\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00078\u0006@FX\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00078\u0006@FX\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001dR\u001e\u0010#\u001a\u00020\"2\u0006\u0010\u0011\u001a\u00020\"@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b$\u0010%R*\u0010'\u001a\u0004\u0018\u00010&2\b\u0010\u0011\u001a\u0004\u0018\u00010&@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010,\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001e\u0010-\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b.\u0010\u001dR(\u0010/\u001a\u0010\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u000202\u0018\u000100X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u00107\u001a\u00020\"2\u0006\u0010\u0011\u001a\u00020\"@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010%R\u001a\u0010;\u001a\u00020<X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@¨\u0006["}, d2 = {"Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "animationJob", "Lkotlinx/coroutines/Job;", "getAnimationJob", "()Lkotlinx/coroutines/Job;", "setAnimationJob", "(Lkotlinx/coroutines/Job;)V", "animationManager", "Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveAnimationManager;", "value", "", "audioProgress", "setAudioProgress", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "audioProgressPaint", "Landroid/graphics/Paint;", "audioProgressPaintColor", "getAudioProgressPaintColor", "()I", "setAudioProgressPaintColor", "(I)V", "defaultPaint", "defaultPaintColor", "getDefaultPaintColor", "setDefaultPaintColor", "", "downSampleData", "setDownSampleData", "([B)V", "", "duration", "getDuration", "()Ljava/lang/Long;", "setDuration", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "numChunks", "setNumChunks", "onAudioProgressChange", "Lkotlin/Function1;", "Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView$ProgressEvent;", "", "getOnAudioProgressChange", "()Lkotlin/jvm/functions/Function1;", "setOnAudioProgressChange", "(Lkotlin/jvm/functions/Function1;)V", "originalSampleData", "getOriginalSampleData", "()[B", "setOriginalSampleData", "shouldAnimate", "", "getShouldAnimate", "()Z", "setShouldAnimate", "(Z)V", "finishAnimation", "onDraw", "canvas", "Landroid/graphics/Canvas;", ViewProps.ON_LAYOUT, "changed", ViewProps.LEFT, ViewProps.TOP, ViewProps.RIGHT, ViewProps.BOTTOM, "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "recalculateSampleData", "downSample", "reset", "draw", "progress", "paint", "animate", "init", "Companion", "ProgressEvent", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

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
    private static final long MAX_DURATION = Duration.p(a.s(30, c.SECONDS));
    private static final int MAX_WIDTH = SizeUtilsKt.getDpToPx(600);
    private static final int FINISH_ANIMATION_NUM_REPEAT = 10;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView$Companion;", "", "()V", "CHUNK_MAX_HEIGHT", "", "CHUNK_MIN_HEIGHT", "CHUNK_RADIUS", "", "CHUNK_SIZE", "CHUNK_SPACING", "CHUNK_WIDTH", "FINISH_ANIMATION_NUM_REPEAT", "MAX_DURATION", "", "MAX_WIDTH", "MIN_CHUNK_NUMBER", "MIN_WIDTH", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveView$ProgressEvent;", "", "progress", "", "eventAction", "", "(FI)V", "getEventAction", "()I", "getProgress", "()F", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class ProgressEvent {
        private final int eventAction;
        private final float progress;

        public ProgressEvent(float f10, int i10) {
            this.progress = f10;
            this.eventAction = i10;
        }

        public static  ProgressEvent copy$default(ProgressEvent progressEvent, float f10, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                f10 = progressEvent.progress;
            }
            if ((i11 & 2) != 0) {
                i10 = progressEvent.eventAction;
            }
            return progressEvent.copy(f10, i10);
        }

        public final float component1() {
            return this.progress;
        }

        public final int component2() {
            return this.eventAction;
        }

        public final ProgressEvent copy(float f10, int i10) {
            return new ProgressEvent(f10, i10);
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
            float f10 = this.progress;
            int i10 = this.eventAction;
            return "ProgressEvent(progress=" + f10 + ", eventAction=" + i10 + ")";
        }
    }

    static {
        int dpToPx = SizeUtilsKt.getDpToPx(2);
        CHUNK_WIDTH = dpToPx;
        int dpToPx2 = SizeUtilsKt.getDpToPx(4);
        CHUNK_SPACING = dpToPx2;
        int i10 = dpToPx + dpToPx2;
        CHUNK_SIZE = i10;
        Duration.a aVar = Duration.f21696k;
        MIN_WIDTH = i10 * 5;
    }

    
    public AudioWaveView(Context context) {
        this(context, null, 0, 6, null);
        q.h(context, "context");
    }

    
    public AudioWaveView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        q.h(context, "context");
    }

    public  AudioWaveView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final void draw(Canvas canvas, float f10, Paint paint, boolean z10) {
        boolean z11;
        Long l10;
        int i10;
        int i11 = 0;
        if (f10 == 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11 && (l10 = this.duration) != null) {
            l10.longValue();
            int height = canvas.getHeight() / 2;
            byte[] bArr = this.downSampleData;
            float length = 1 / bArr.length;
            int length2 = bArr.length;
            int i12 = 0;
            while (i11 < length2) {
                byte b10 = bArr[i11];
                int i13 = i12 + 1;
                float f11 = i12;
                float f12 = f11 * length;
                if (f12 > f10) {
                    this.animationManager.resetIndex(i12);
                    return;
                }
                float abs = (SamplerKt.getAbs(b10) / 127) * CHUNK_MAX_HEIGHT;
                float f13 = CHUNK_MIN_HEIGHT;
                float max = f13 + (Math.max(abs, f13) - f13);
                paint.setAlpha(255);
                if (z10) {
                    max = this.animationManager.getAnimationValues(i12, (f10 - f12) / length, max);
                }
                float f14 = f11 * CHUNK_SIZE;
                float f15 = height;
                int i14 = CHUNK_RADIUS;
                canvas.drawRoundRect(f14, f15 - max, (i12 * i10) + CHUNK_WIDTH, f15 + max, i14, i14, paint);
                i11++;
                i12 = i13;
            }
        }
    }

    static  void draw$default(AudioWaveView audioWaveView, Canvas canvas, float f10, Paint paint, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        audioWaveView.draw(canvas, f10, paint, z10);
    }

    private final void finishAnimation() {
        Job job = this.animationJob;
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
        this.animationJob = j.d(CoroutineViewUtilsKt.getAttachedScope(this), null, null, new AudioWaveView$finishAnimation$1(this, null), 3, null);
    }

    private final Paint init(Paint paint) {
        paint.setAntiAlias(true);
        paint.setStrokeWidth(0.0f);
        return paint;
    }

    private final void recalculateSampleData(byte[] bArr, int i10, boolean z10) {
        if (!z10 || i10 == this.downSampleData.length) {
            invalidate();
        } else {
            j.d(CoroutineViewUtilsKt.getAttachedScope(this), null, null, new AudioWaveView$recalculateSampleData$1(this, bArr, i10, null), 3, null);
        }
    }

    static  void recalculateSampleData$default(AudioWaveView audioWaveView, byte[] bArr, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bArr = audioWaveView.originalSampleData;
        }
        if ((i11 & 2) != 0) {
            i10 = audioWaveView.numChunks;
        }
        audioWaveView.recalculateSampleData(bArr, i10, z10);
    }

    private final void setAudioProgress(Float f10) {
        this.audioProgress = f10;
        postInvalidate();
    }

    public static  void setAudioProgress$default(AudioWaveView audioWaveView, float f10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        audioWaveView.setAudioProgress(f10, z10);
    }

    
    public final void setDownSampleData(byte[] bArr) {
        this.animationManager.setData(bArr);
        this.downSampleData = bArr;
    }

    private final void setNumChunks(int i10) {
        boolean z10;
        if (this.numChunks != i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        recalculateSampleData$default(this, null, i10, z10, 1, null);
        this.numChunks = i10;
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

    @Override 
    protected void onDraw(Canvas canvas) {
        float f10;
        q.h(canvas, "canvas");
        super.onDraw(canvas);
        if (this.numChunks != this.downSampleData.length) {
            recalculateSampleData$default(this, null, 0, true, 3, null);
            return;
        }
        canvas.save();
        draw(canvas, 1.0f, this.defaultPaint, false);
        Float f11 = this.audioProgress;
        if (f11 != null) {
            f10 = f11.floatValue();
        } else {
            f10 = 0.0f;
        }
        draw(canvas, f10, this.audioProgressPaint, this.shouldAnimate);
        canvas.restore();
    }

    @Override 
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int c10;
        boolean z11;
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            int width = getWidth();
            int i15 = CHUNK_SIZE;
            if (width % i15 > CHUNK_WIDTH) {
                i14 = 1;
            } else {
                i14 = 0;
            }
            int i16 = this.numChunks;
            c10 = gg.j.c((getWidth() / i15) + i14, 5);
            setNumChunks(c10);
            if (i16 != this.numChunks) {
                z11 = true;
            } else {
                z11 = false;
            }
            recalculateSampleData$default(this, null, 0, z11, 3, null);
        }
    }

    
    
    @Override 
    
    protected void onMeasure(int r6, int r7) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.view.voicemessages.AudioWaveView.onMeasure(int, int):void");
    }

    @Override 
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent event) {
        float i10;
        q.h(event, "event");
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
        i10 = gg.j.i(event.getX(), 0.0f, getWidth());
        float width = i10 / getWidth();
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

    public final void setAudioProgressPaintColor(int i10) {
        if (i10 != this.audioProgressPaintColor) {
            this.audioProgressPaint.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
            postInvalidate();
        }
        this.audioProgressPaintColor = i10;
    }

    public final void setDefaultPaintColor(int i10) {
        if (i10 != this.defaultPaintColor) {
            this.defaultPaint.setColor(i10);
            postInvalidate();
        }
        this.defaultPaintColor = i10;
    }

    public final void setDuration(Long l10) {
        this.duration = l10;
        requestLayout();
    }

    public final void setOnAudioProgressChange(Function1<? super ProgressEvent, Unit> function1) {
        this.onAudioProgressChange = function1;
    }

    public final void setOriginalSampleData(byte[] value) {
        q.h(value, "value");
        recalculateSampleData$default(this, value, 0, !Arrays.equals(this.originalSampleData, value), 2, null);
        this.originalSampleData = value;
    }

    public final void setShouldAnimate(boolean z10) {
        this.shouldAnimate = z10;
    }

    
    public AudioWaveView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        q.h(context, "context");
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

    public final void setAudioProgress(float f10, boolean z10) {
        setAudioProgress(Float.valueOf(f10));
        if (this.shouldAnimate && z10) {
            finishAnimation();
        }
    }
}
