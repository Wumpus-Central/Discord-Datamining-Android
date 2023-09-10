package com.discord.chat.presentation.list;

import android.animation.Animator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.Pair;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.PathInterpolator;
import androidx.core.content.res.h;
import androidx.recyclerview.widget.RecyclerView;
import bg.j;
import com.discord.chat.R;
import com.discord.device.DeviceAccessibilityModule;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.theme.LightTheme;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.react.uimanager.events.TouchesHelper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0000\u0018\u0000 S2\u00020\u0001:\u0001SB)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\bJ\u0010\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020*H\u0002J\u0018\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\fH\u0002J(\u0010/\u001a\u0002002\u0006\u0010,\u001a\u00020-2\u0006\u00101\u001a\u00020\u00172\u0006\u00102\u001a\u00020\u000e2\u0006\u00103\u001a\u00020\u000eH\u0016J\u0010\u00104\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u000eH\u0002J\u0010\u00106\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u000eH\u0002J$\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e082\u0006\u00109\u001a\u00020\u000e2\u0006\u0010:\u001a\u00020\u000eH\u0016J\u0018\u0010;\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u000eH\u0002J\u0018\u0010=\u001a\u00020\u00172\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\fH\u0016J\b\u0010>\u001a\u00020\u000eH\u0002J@\u0010?\u001a\u00020\u00062\u0006\u0010@\u001a\u00020*2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010A\u001a\u00020\u000e2\u0006\u0010B\u001a\u00020\u00172\u0006\u0010C\u001a\u00020\u0015H\u0016J \u0010D\u001a\u00020\u00152\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\f2\u0006\u0010E\u001a\u00020\fH\u0016J\u001a\u0010F\u001a\u00020\u00062\u0006\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\fH\u0016J\u001a\u0010G\u001a\u00020\u00062\b\u0010.\u001a\u0004\u0018\u00010\f2\u0006\u0010B\u001a\u00020\u0017H\u0016J\u0018\u0010H\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\f2\u0006\u0010I\u001a\u00020\u0017H\u0016J\b\u0010J\u001a\u00020\u0015H\u0016J\u0010\u0010K\u001a\u00020\u00152\u0006\u0010.\u001a\u00020\fH\u0002J\b\u0010L\u001a\u00020\u0015H\u0016J\u0010\u0010M\u001a\u00020\u00062\u0006\u0010,\u001a\u00020-H\u0002J\u0010\u0010N\u001a\u00020\u00062\u0006\u0010,\u001a\u00020-H\u0002J\u0018\u0010O\u001a\u00020\u00062\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\fH\u0002J\u0018\u0010P\u001a\u00020\u00062\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\fH\u0002J\b\u0010Q\u001a\u00020\u0006H\u0002J\u0010\u0010R\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\fH\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006T"}, d2 = {"Lcom/discord/chat/presentation/list/SwipeHelper;", "Lcom/discord/chat/presentation/list/ChatListCallback;", "context", "Landroid/content/Context;", "onStart", "Lkotlin/Function0;", "", "onEnd", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "actionType", "Lcom/discord/chat/presentation/list/SwipeActionType;", "currentItemViewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "dX", "", "easterEggArrowAnimator", "Landroid/animation/ValueAnimator;", "easterEggArrowRotationAnimator", "easterEggArrowRotationDegrees", "easterEggArrowScale", "easterEggIsAnimating", "", "easterEggPullCount", "", "editCircleScale", "editCircleScaleAnimator", "editIcon", "Landroid/graphics/drawable/Drawable;", "editRunnable", "Ljava/lang/Runnable;", "handler", "Landroid/os/Handler;", "isActive", "isCompleted", "mView", "Landroid/view/View;", "replyIcon", "shouldPerformHapticFeedback", "shouldTriggerReply", "swipeBack", "drawContextArea", "canvas", "Landroid/graphics/Canvas;", "easterEggStartAnimation", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "viewHolder", "getAnimationDuration", "", "animationType", "animateDx", "animateDy", "getArrowContainerBaseSize", "contentHeight", "getArrowIconBaseSize", "getEffectiveDxDy", "Landroid/util/Pair;", "rawDx", "rawDy", "getLeftBevelRadius", "progress", "getMovementFlags", "getSwipeProgress", "onChildDraw", "c", "dY", "actionState", "isCurrentlyActive", "onMove", TouchesHelper.TARGET_KEY, "onReleased", "onSelectedChanged", "onSwiped", "direction", "shouldReturnToOriginalPosition", "shouldStartEditEntrance", "shouldUseSpringyExit", "triggerDelayedEditEntranceTransition", "triggerEditExitTransition", "updateEditTransition", "updateHapticFeedbackTrigger", "updateReplyTrigger", "updateShadow", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class SwipeHelper extends ChatListCallback {
    private static final long ANIM_RETURN_DURATION = 300;
    private static final String ANIM_VALUE_ARROW_ROTATION = "arrow-rotation";
    private static final String ANIM_VALUE_ARROW_SCALE = "arrow-scale";
    private static final String ANIM_VALUE_EDIT_CIRCLE_SCALE = "edit-circle-scale";
    private static final int HAPTIC_RESET_X;
    private static final int HAPTIC_TRIGGER_X;
    private static final int MAX_CONTEXT_AREA_WIDTH;
    private static final int REPLY_RESET_X;
    private static final int SWIPE_STOP_OFFSET_X;
    private final Context context;
    private RecyclerView.ViewHolder currentItemViewHolder;
    private float dX;
    private ValueAnimator easterEggArrowAnimator;
    private ValueAnimator easterEggArrowRotationAnimator;
    private float easterEggArrowRotationDegrees;
    private boolean easterEggIsAnimating;
    private int easterEggPullCount;
    private float editCircleScale;
    private ValueAnimator editCircleScaleAnimator;
    private Drawable editIcon;
    private Runnable editRunnable;
    private final Handler handler;
    private boolean isActive;
    private boolean isCompleted;
    private View mView;
    private final Function0<Unit> onEnd;
    private final Function0<Unit> onStart;
    private Drawable replyIcon;
    private boolean shouldTriggerReply;
    private boolean swipeBack;
    public static final Companion Companion = new Companion(null);
    private static final int EDIT_OFFSET_X = SizeUtilsKt.getDpToPx(-90);
    private static final int MAX_RIGHT_BEVEL_WIDTH = SizeUtilsKt.getDpToPx(32);
    private static final int RIGHT_BEVEL_HEIGHT = SizeUtilsKt.getDpToPx(24);
    private static final int MAX_LEFT_BEVEL_RADIUS = SizeUtilsKt.getDpToPx(16);
    private float easterEggArrowScale = 1.0f;
    private boolean shouldPerformHapticFeedback = true;
    private SwipeActionType actionType = SwipeActionType.Reply;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/discord/chat/presentation/list/SwipeHelper$Companion;", "", "()V", "ANIM_RETURN_DURATION", "", "ANIM_VALUE_ARROW_ROTATION", "", "ANIM_VALUE_ARROW_SCALE", "ANIM_VALUE_EDIT_CIRCLE_SCALE", "EDIT_OFFSET_X", "", "HAPTIC_RESET_X", "HAPTIC_TRIGGER_X", "MAX_CONTEXT_AREA_WIDTH", "MAX_LEFT_BEVEL_RADIUS", "MAX_RIGHT_BEVEL_WIDTH", "REPLY_RESET_X", "RIGHT_BEVEL_HEIGHT", "SWIPE_STOP_OFFSET_X", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    
    public  class WhenMappings {
        public static final  int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SwipeActionType.values().length];
            try {
                iArr[SwipeActionType.Reply.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SwipeActionType.Edit.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        int dpToPx = SizeUtilsKt.getDpToPx(80);
        MAX_CONTEXT_AREA_WIDTH = dpToPx;
        int i10 = -dpToPx;
        SWIPE_STOP_OFFSET_X = i10;
        HAPTIC_TRIGGER_X = i10;
        int dpToPx2 = SizeUtilsKt.getDpToPx(-60);
        HAPTIC_RESET_X = dpToPx2;
        REPLY_RESET_X = dpToPx2;
    }

    public SwipeHelper(Context context, Function0<Unit> onStart, Function0<Unit> onEnd) {
        q.h(context, "context");
        q.h(onStart, "onStart");
        q.h(onEnd, "onEnd");
        this.context = context;
        this.onStart = onStart;
        this.onEnd = onEnd;
        this.replyIcon = h.f(context.getResources(), R.drawable.ic_swipe_reply, context.getTheme());
        this.editIcon = h.f(context.getResources(), R.drawable.ic_swipe_edit, context.getTheme());
        this.handler = new Handler(context.getMainLooper());
    }

    private final void drawContextArea(Canvas canvas) {
        boolean z10;
        View view;
        int j10;
        float f10;
        String str;
        float f11;
        float f12;
        float f13;
        if (this.currentItemViewHolder != null) {
            if (this.dX == 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                View view2 = this.mView;
                if (view2 == null) {
                    q.z("mView");
                    view2 = null;
                }
                float abs = Math.abs(view2.getTranslationX());
                View view3 = this.mView;
                if (view3 == null) {
                    q.z("mView");
                    view3 = null;
                }
                float measuredHeight = view3.getMeasuredHeight();
                Paint paint = new Paint();
                paint.setColor(ThemeManagerKt.getTheme().getChatSwipeToReplyBackground());
                paint.setStyle(Paint.Style.FILL);
                canvas.save();
                float swipeProgress = getSwipeProgress();
                float leftBevelRadius = getLeftBevelRadius(swipeProgress, measuredHeight);
                float f14 = MAX_RIGHT_BEVEL_WIDTH * swipeProgress;
                View view4 = this.mView;
                if (view4 == null) {
                    q.z("mView");
                    view4 = null;
                }
                float measuredWidth = view4.getMeasuredWidth();
                View view5 = this.mView;
                if (view5 == null) {
                    q.z("mView");
                    view5 = null;
                }
                float translationX = measuredWidth + view5.getTranslationX();
                float f15 = translationX - leftBevelRadius;
                float f16 = translationX + abs;
                float f17 = f16 - f14;
                View view6 = this.mView;
                if (view6 == null) {
                    q.z("mView");
                    view = null;
                } else {
                    view = view6;
                }
                int i10 = RIGHT_BEVEL_HEIGHT;
                float top = view.getTop() - i10;
                float f18 = i10 + top;
                float f19 = top + measuredHeight + (i10 * 2);
                float f20 = f19 - i10;
                Path path = new Path();
                path.moveTo(f17, f20);
                path.lineTo(translationX, f20);
                path.lineTo(translationX, f18 + leftBevelRadius);
                float f21 = 2;
                path.addArc(f15 - leftBevelRadius, f18, translationX, f18 + (f21 * leftBevelRadius), 0.0f, -90.0f);
                path.lineTo(f17, f18);
                float f22 = (f14 * 0.55f) + f17;
                path.cubicTo(f22, f18, f16, top + (i10 * 0.55f), f16, top);
                path.lineTo(f16, f19);
                path.cubicTo(f16, f19 - (i10 * 0.55f), f22, f20, f17, f20);
                canvas.save();
                canvas.clipPath(path);
                canvas.drawRect(f15, top, f16, f19, paint);
                canvas.restore();
                canvas.save();
                path.reset();
                float f23 = f20 - leftBevelRadius;
                path.addCircle(f15, f23, leftBevelRadius, Path.Direction.CW);
                if (Build.VERSION.SDK_INT >= 26) {
                    canvas.clipOutPath(path);
                } else {
                    canvas.clipPath(path, Region.Op.DIFFERENCE);
                }
                canvas.drawRect(f15, f23, translationX, f20, paint);
                canvas.restore();
                float arrowContainerBaseSize = getArrowContainerBaseSize(measuredHeight) / f21;
                j10 = j.j(((int) (192 * swipeProgress)) + 64, 0, 255);
                canvas.save();
                canvas.clipRect(translationX, 0.0f, f16, canvas.getHeight());
                canvas.translate(((translationX + (abs / f21)) - arrowContainerBaseSize) + arrowContainerBaseSize, ((int) ((f18 + (measuredHeight / f21)) - arrowContainerBaseSize)) + arrowContainerBaseSize);
                float f24 = this.easterEggArrowScale;
                canvas.scale(f24, f24);
                if (this.isCompleted) {
                    f10 = 1.0f;
                } else {
                    f10 = swipeProgress;
                }
                paint.setColor(ColorUtilsKt.interpolateColors(ThemeManagerKt.getTheme().getBgSurfaceOverlay(), ColorUtilsKt.getColorCompat(this.context, R.color.brand_500), f10, 0.8f, 1.0f));
                paint.setStyle(Paint.Style.FILL);
                paint.setAlpha(j10);
                if (ThemeManagerKt.getTheme() instanceof LightTheme) {
                    str = "#16000000";
                } else {
                    str = "#24000000";
                }
                paint.setShadowLayer(10.0f, 0.0f, 5.0f, Color.parseColor(str));
                canvas.drawCircle(0.0f, 0.0f, arrowContainerBaseSize, paint);
                paint.clearShadowLayer();
                if (this.editCircleScale > 0.0f) {
                    canvas.save();
                    float f25 = this.editCircleScale;
                    canvas.scale(f25, f25);
                    if (this.isCompleted) {
                        f13 = 1.0f;
                    } else {
                        f13 = swipeProgress;
                    }
                    paint.setColor(ColorUtilsKt.interpolateColors(ThemeManagerKt.getTheme().getBgSurfaceOverlay(), ColorUtilsKt.getColorCompat(this.context, R.color.yellow_345), f13, 0.8f, 1.0f));
                    paint.setStyle(Paint.Style.FILL);
                    paint.setAlpha(255);
                    f11 = 0.0f;
                    canvas.drawCircle(0.0f, 0.0f, arrowContainerBaseSize, paint);
                    canvas.restore();
                } else {
                    f11 = 0.0f;
                }
                canvas.save();
                float max = Math.max(f11, Math.min(1.0f, 1 - this.editCircleScale));
                float arrowIconBaseSize = getArrowIconBaseSize(measuredHeight);
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(ColorUtilsKt.interpolateColors(ThemeManagerKt.getTheme().getInteractiveNormal(), ColorUtilsKt.getColorCompat(this.context, R.color.white), f10, 0.8f, 1.0f), PorterDuff.Mode.SRC_ATOP);
                Drawable drawable = this.replyIcon;
                if (drawable != null) {
                    drawable.setColorFilter(porterDuffColorFilter);
                }
                if (DeviceAccessibilityModule.Companion.useReducedMotion(this.context)) {
                    f12 = 0.0f;
                } else {
                    f12 = (1.0f - swipeProgress) * 90.0f;
                }
                float f26 = this.easterEggArrowRotationDegrees;
                canvas.translate(-1.0f, -1.0f);
                float f27 = f12 + f26;
                canvas.rotate(f27);
                canvas.scale(max, max);
                int i11 = (int) (arrowIconBaseSize / 2.0f);
                int i12 = -i11;
                Rect rect = new Rect(i12, i12, i11, i11);
                Drawable drawable2 = this.replyIcon;
                if (drawable2 != null) {
                    drawable2.setBounds(rect);
                }
                Drawable drawable3 = this.replyIcon;
                if (drawable3 != null) {
                    drawable3.setAlpha(j10);
                }
                Drawable drawable4 = this.replyIcon;
                if (drawable4 != null) {
                    drawable4.draw(canvas);
                }
                canvas.restore();
                if (this.editCircleScale > 0.0f) {
                    canvas.save();
                    Drawable drawable5 = this.editIcon;
                    if (drawable5 != null) {
                        drawable5.setColorFilter(porterDuffColorFilter);
                    }
                    canvas.rotate(f27);
                    float f28 = this.editCircleScale;
                    canvas.scale(f28, f28);
                    Drawable drawable6 = this.editIcon;
                    if (drawable6 != null) {
                        drawable6.setBounds(rect);
                    }
                    Drawable drawable7 = this.editIcon;
                    if (drawable7 != null) {
                        drawable7.setAlpha(255);
                    }
                    Drawable drawable8 = this.editIcon;
                    if (drawable8 != null) {
                        drawable8.draw(canvas);
                    }
                    canvas.restore();
                }
                canvas.restore();
            }
        }
    }

    private final void easterEggStartAnimation(final RecyclerView recyclerView, final RecyclerView.ViewHolder viewHolder) {
        if (!DeviceAccessibilityModule.Companion.useReducedMotion(this.context)) {
            PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat(ANIM_VALUE_ARROW_SCALE, 1.0f, 1.4f, 1.0f);
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setValues(ofFloat);
            valueAnimator.setDuration(ANIM_RETURN_DURATION);
            valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { 
                @Override 
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    SwipeHelper.easterEggStartAnimation$lambda$7$lambda$6(SwipeHelper.this, recyclerView, valueAnimator2);
                }
            });
            this.easterEggArrowAnimator = valueAnimator;
            valueAnimator.start();
            PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat(ANIM_VALUE_ARROW_ROTATION, 720.0f, 0.0f);
            ValueAnimator valueAnimator2 = new ValueAnimator();
            valueAnimator2.setValues(ofFloat2);
            valueAnimator2.setDuration(800L);
            valueAnimator2.setInterpolator(new PathInterpolator(0.0f, 0.0f, 0.25f, 1.0f));
            valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { 
                @Override 
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    SwipeHelper.easterEggStartAnimation$lambda$10$lambda$8(SwipeHelper.this, recyclerView, valueAnimator3);
                }
            });
            valueAnimator2.addListener(new Animator.AnimatorListener() { 
                @Override 
                public void onAnimationCancel(Animator animator) {
                    q.h(animator, "animator");
                }

                @Override 
                public void onAnimationEnd(Animator animator) {
                    boolean shouldStartEditEntrance;
                    q.h(animator, "animator");
                    SwipeHelper.this.easterEggIsAnimating = false;
                    SwipeHelper.this.easterEggPullCount = 0;
                    shouldStartEditEntrance = SwipeHelper.this.shouldStartEditEntrance(viewHolder);
                    if (shouldStartEditEntrance) {
                        SwipeHelper.this.triggerDelayedEditEntranceTransition(recyclerView);
                    }
                }

                @Override 
                public void onAnimationRepeat(Animator animator) {
                    q.h(animator, "animator");
                }

                @Override 
                public void onAnimationStart(Animator animator) {
                    q.h(animator, "animator");
                }
            });
            this.easterEggArrowRotationAnimator = valueAnimator2;
            valueAnimator2.start();
            this.easterEggIsAnimating = true;
        }
    }

    
    public static final void easterEggStartAnimation$lambda$10$lambda$8(SwipeHelper this$0, RecyclerView recyclerView, ValueAnimator it) {
        q.h(this$0, "this$0");
        q.h(recyclerView, "$recyclerView");
        q.h(it, "it");
        Object animatedValue = it.getAnimatedValue(ANIM_VALUE_ARROW_ROTATION);
        q.f(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this$0.easterEggArrowRotationDegrees = ((Float) animatedValue).floatValue();
        recyclerView.invalidate();
    }

    
    public static final void easterEggStartAnimation$lambda$7$lambda$6(SwipeHelper this$0, RecyclerView recyclerView, ValueAnimator it) {
        q.h(this$0, "this$0");
        q.h(recyclerView, "$recyclerView");
        q.h(it, "it");
        Object animatedValue = it.getAnimatedValue(ANIM_VALUE_ARROW_SCALE);
        q.f(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this$0.easterEggArrowScale = ((Float) animatedValue).floatValue();
        recyclerView.invalidate();
    }

    private final float getArrowContainerBaseSize(float f10) {
        return Math.min(f10 - SizeUtilsKt.getDpToPx(6), SizeUtilsKt.getDpToPx(40));
    }

    private final float getArrowIconBaseSize(float f10) {
        return getArrowContainerBaseSize(f10) * 0.6f;
    }

    private final float getLeftBevelRadius(float f10, float f11) {
        return f10 * Math.min(MAX_LEFT_BEVEL_RADIUS, (f11 - 8) / 2.0f);
    }

    private final float getSwipeProgress() {
        View view = this.mView;
        if (view == null) {
            q.z("mView");
            view = null;
        }
        return Math.max(0.0f, Math.min(view.getTranslationX() / SWIPE_STOP_OFFSET_X, 1.0f));
    }

    
    
    
    
    public final boolean shouldStartEditEntrance(androidx.recyclerview.widget.RecyclerView.ViewHolder r6) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.list.SwipeHelper.shouldStartEditEntrance(androidx.recyclerview.widget.RecyclerView$ViewHolder):boolean");
    }

    
    public final void triggerDelayedEditEntranceTransition(final RecyclerView recyclerView) {
        Runnable gVar = new Runnable() { 
            @Override 
            public final void run() {
                SwipeHelper.triggerDelayedEditEntranceTransition$lambda$5(SwipeHelper.this, recyclerView);
            }
        };
        this.editRunnable = gVar;
        Handler handler = this.handler;
        q.e(gVar);
        handler.postDelayed(gVar, 500L);
    }

    
    public static final void triggerDelayedEditEntranceTransition$lambda$5(final SwipeHelper this$0, final RecyclerView recyclerView) {
        q.h(this$0, "this$0");
        q.h(recyclerView, "$recyclerView");
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat(ANIM_VALUE_EDIT_CIRCLE_SCALE, this$0.editCircleScale, 1.4f, 1.0f);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setValues(ofFloat);
        valueAnimator.setDuration(ANIM_RETURN_DURATION);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { 
            @Override 
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                SwipeHelper.triggerDelayedEditEntranceTransition$lambda$5$lambda$4$lambda$3(SwipeHelper.this, recyclerView, valueAnimator2);
            }
        });
        this$0.editCircleScaleAnimator = valueAnimator;
        valueAnimator.start();
        this$0.actionType = SwipeActionType.Edit;
        View view = this$0.mView;
        if (view == null) {
            q.z("mView");
            view = null;
        }
        view.performHapticFeedback(0);
    }

    
    public static final void triggerDelayedEditEntranceTransition$lambda$5$lambda$4$lambda$3(SwipeHelper this$0, RecyclerView recyclerView, ValueAnimator it) {
        q.h(this$0, "this$0");
        q.h(recyclerView, "$recyclerView");
        q.h(it, "it");
        Object animatedValue = it.getAnimatedValue(ANIM_VALUE_EDIT_CIRCLE_SCALE);
        q.f(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this$0.editCircleScale = ((Float) animatedValue).floatValue();
        recyclerView.invalidate();
    }

    private final void triggerEditExitTransition(final RecyclerView recyclerView) {
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat(ANIM_VALUE_EDIT_CIRCLE_SCALE, this.editCircleScale, 0.0f);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setValues(ofFloat);
        valueAnimator.setDuration(200L);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { 
            @Override 
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                SwipeHelper.triggerEditExitTransition$lambda$2$lambda$0(SwipeHelper.this, recyclerView, valueAnimator2);
            }
        });
        valueAnimator.addListener(new Animator.AnimatorListener() { 
            @Override 
            public void onAnimationCancel(Animator animator) {
                q.h(animator, "animator");
            }

            @Override 
            public void onAnimationEnd(Animator animator) {
                q.h(animator, "animator");
                SwipeHelper.this.actionType = SwipeActionType.Reply;
            }

            @Override 
            public void onAnimationRepeat(Animator animator) {
                q.h(animator, "animator");
            }

            @Override 
            public void onAnimationStart(Animator animator) {
                q.h(animator, "animator");
            }
        });
        this.editCircleScaleAnimator = valueAnimator;
        valueAnimator.start();
    }

    
    public static final void triggerEditExitTransition$lambda$2$lambda$0(SwipeHelper this$0, RecyclerView recyclerView, ValueAnimator it) {
        q.h(this$0, "this$0");
        q.h(recyclerView, "$recyclerView");
        q.h(it, "it");
        Object animatedValue = it.getAnimatedValue(ANIM_VALUE_EDIT_CIRCLE_SCALE);
        q.f(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this$0.editCircleScale = ((Float) animatedValue).floatValue();
        recyclerView.invalidate();
    }

    private final void updateEditTransition(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        if (!this.isCompleted) {
            if (this.actionType == SwipeActionType.Edit) {
                View view = this.mView;
                if (view == null) {
                    q.z("mView");
                    view = null;
                }
                if (view.getTranslationX() > REPLY_RESET_X) {
                    ValueAnimator valueAnimator = this.editCircleScaleAnimator;
                    boolean z10 = false;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        z10 = true;
                    }
                    if (!z10) {
                        triggerEditExitTransition(recyclerView);
                        return;
                    }
                }
            }
            View view2 = this.mView;
            if (view2 == null) {
                q.z("mView");
                view2 = null;
            }
            if (view2.getTranslationX() > EDIT_OFFSET_X && this.editRunnable != null) {
                this.handler.removeCallbacksAndMessages(null);
                this.editRunnable = null;
            } else if (shouldStartEditEntrance(viewHolder)) {
                triggerDelayedEditEntranceTransition(recyclerView);
            }
        }
    }

    private final void updateHapticFeedbackTrigger(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        View view = null;
        if (this.shouldPerformHapticFeedback) {
            View view2 = this.mView;
            if (view2 == null) {
                q.z("mView");
                view2 = null;
            }
            if (view2.getTranslationX() <= HAPTIC_TRIGGER_X) {
                View view3 = this.mView;
                if (view3 == null) {
                    q.z("mView");
                } else {
                    view = view3;
                }
                view.performHapticFeedback(0);
                this.shouldPerformHapticFeedback = false;
                int i10 = this.easterEggPullCount + 1;
                this.easterEggPullCount = i10;
                if (i10 == 3 && !this.easterEggIsAnimating) {
                    easterEggStartAnimation(recyclerView, viewHolder);
                    return;
                }
                return;
            }
        }
        if (!this.shouldPerformHapticFeedback) {
            View view4 = this.mView;
            if (view4 == null) {
                q.z("mView");
            } else {
                view = view4;
            }
            if (view.getTranslationX() >= HAPTIC_RESET_X) {
                this.shouldPerformHapticFeedback = true;
            }
        }
    }

    private final void updateReplyTrigger() {
        View view = null;
        if (this.shouldTriggerReply) {
            View view2 = this.mView;
            if (view2 == null) {
                q.z("mView");
                view2 = null;
            }
            if (view2.getTranslationX() > REPLY_RESET_X) {
                this.shouldTriggerReply = false;
                return;
            }
        }
        if (!this.shouldTriggerReply) {
            View view3 = this.mView;
            if (view3 == null) {
                q.z("mView");
            } else {
                view = view3;
            }
            if (view.getTranslationX() <= HAPTIC_TRIGGER_X) {
                this.shouldTriggerReply = true;
            }
        }
    }

    private final void updateShadow(RecyclerView.ViewHolder viewHolder) {
        SwipeReplyInitiator swipeReplyInitiator;
        String str;
        View view = viewHolder.itemView;
        View view2 = null;
        if (view instanceof SwipeReplyInitiator) {
            swipeReplyInitiator = (SwipeReplyInitiator) view;
        } else {
            swipeReplyInitiator = null;
        }
        if (swipeReplyInitiator != null) {
            float swipeProgress = getSwipeProgress();
            float dpToPx = SizeUtilsKt.getDpToPx(12) * swipeProgress;
            View view3 = this.mView;
            if (view3 == null) {
                q.z("mView");
            } else {
                view2 = view3;
            }
            float leftBevelRadius = getLeftBevelRadius(swipeProgress, view2.getMeasuredHeight());
            if (ThemeManagerKt.getTheme() instanceof LightTheme) {
                str = "#1F000000";
            } else {
                str = "#3E000000";
            }
            swipeReplyInitiator.getShadowView().setParams(dpToPx, leftBevelRadius, str);
        }
    }

    @Override 
    public long getAnimationDuration(RecyclerView recyclerView, int i10, float f10, float f11) {
        q.h(recyclerView, "recyclerView");
        return ANIM_RETURN_DURATION;
    }

    @Override 
    public Pair<Float, Float> getEffectiveDxDy(float f10, float f11) {
        int i10 = SWIPE_STOP_OFFSET_X;
        if (f10 >= i10) {
            return new Pair<>(Float.valueOf(f10), Float.valueOf(f11));
        }
        return new Pair<>(Float.valueOf(i10 - (((float) Math.atan(Math.abs(f10 - i10) / 120.0f)) * 120.0f)), Float.valueOf(f11));
    }

    
    @Override 
    
    public int getMovementFlags(androidx.recyclerview.widget.RecyclerView r2, androidx.recyclerview.widget.RecyclerView.ViewHolder r3) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.list.SwipeHelper.getMovementFlags(androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.RecyclerView$ViewHolder):int");
    }

    @Override 
    public void onChildDraw(Canvas c10, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f10, float f11, int i10, boolean z10) {
        SwipeReplyInitiator swipeReplyInitiator;
        q.h(c10, "c");
        q.h(recyclerView, "recyclerView");
        q.h(viewHolder, "viewHolder");
        super.onChildDraw(c10, recyclerView, viewHolder, f10, f11, i10, z10);
        this.dX = f10;
        this.currentItemViewHolder = viewHolder;
        drawContextArea(c10);
        updateHapticFeedbackTrigger(recyclerView, viewHolder);
        updateReplyTrigger();
        updateShadow(viewHolder);
        updateEditTransition(recyclerView, viewHolder);
        if (this.swipeBack && this.isActive && f10 >= -1.0f) {
            this.onEnd.invoke();
            View view = viewHolder.itemView;
            if (view instanceof SwipeReplyInitiator) {
                swipeReplyInitiator = (SwipeReplyInitiator) view;
            } else {
                swipeReplyInitiator = null;
            }
            if (swipeReplyInitiator != null) {
                swipeReplyInitiator.onSwipeEnd();
            }
            this.isActive = false;
        }
    }

    @Override 
    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
        q.h(recyclerView, "recyclerView");
        q.h(viewHolder, "viewHolder");
        q.h(target, "target");
        return false;
    }

    @Override 
    public void onReleased(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        View view;
        SwipeReplyInitiator swipeReplyInitiator;
        q.h(recyclerView, "recyclerView");
        this.swipeBack = true;
        if (this.shouldTriggerReply) {
            if (viewHolder != null) {
                view = viewHolder.itemView;
            } else {
                view = null;
            }
            if (view instanceof SwipeReplyInitiator) {
                swipeReplyInitiator = (SwipeReplyInitiator) view;
            } else {
                swipeReplyInitiator = null;
            }
            if (swipeReplyInitiator != null) {
                int i10 = WhenMappings.$EnumSwitchMapping$0[this.actionType.ordinal()];
                if (i10 == 1) {
                    swipeReplyInitiator.getOnInitiateReply().invoke();
                } else if (i10 == 2) {
                    swipeReplyInitiator.getOnInitiateEdit().invoke();
                }
                this.isCompleted = true;
            }
        }
        this.handler.removeCallbacksAndMessages(null);
        this.editRunnable = null;
    }

    @Override 
    public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i10) {
        boolean z10;
        View view;
        super.onSelectedChanged(viewHolder, i10);
        if (viewHolder == null && i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.swipeBack = z10;
        if (i10 == 1 && !this.isActive) {
            this.onStart.invoke();
            SwipeReplyInitiator swipeReplyInitiator = null;
            if (viewHolder != null) {
                view = viewHolder.itemView;
            } else {
                view = null;
            }
            if (view instanceof SwipeReplyInitiator) {
                swipeReplyInitiator = (SwipeReplyInitiator) view;
            }
            if (swipeReplyInitiator != null) {
                swipeReplyInitiator.onSwipeStart();
                this.isCompleted = false;
                this.actionType = SwipeActionType.Reply;
                this.editCircleScale = 0.0f;
            }
            this.easterEggPullCount = 0;
            this.isActive = true;
        }
    }

    @Override 
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int i10) {
        q.h(viewHolder, "viewHolder");
    }

    @Override 
    public boolean shouldReturnToOriginalPosition() {
        return true;
    }

    @Override 
    public boolean shouldUseSpringyExit() {
        return this.shouldTriggerReply;
    }
}
