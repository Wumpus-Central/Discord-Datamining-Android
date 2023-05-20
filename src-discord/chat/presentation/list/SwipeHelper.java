package com.discord.chat.presentation.list;

import ah.j;
import android.animation.Animator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.core.content.res.h;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.b;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.R;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.react.uimanager.events.TouchesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0000\u0018\u0000 @2\u00020\u0001:\u0001@B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0002J(\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u000bH\u0016J$\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0*2\u0006\u0010+\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\u000bH\u0016J\u0018\u0010-\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020%2\u0006\u0010.\u001a\u00020\u0011H\u0016J@\u0010/\u001a\u00020\u001f2\u0006\u00100\u001a\u00020!2\u0006\u0010$\u001a\u00020%2\u0006\u0010.\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\u000e2\u0006\u00103\u001a\u00020\u001bH\u0016J \u00104\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020%2\u0006\u0010.\u001a\u00020\u00112\u0006\u00105\u001a\u00020\u0011H\u0016J\u001a\u00106\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020%2\b\u0010.\u001a\u0004\u0018\u00010\u0011H\u0016J\u001a\u00107\u001a\u00020\u001f2\b\u0010.\u001a\u0004\u0018\u00010\u00112\u0006\u00102\u001a\u00020\u000eH\u0016J\u0018\u00108\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020\u00112\u0006\u00109\u001a\u00020\u000eH\u0016J\b\u0010:\u001a\u00020\u001bH\u0016J\b\u0010;\u001a\u00020\u001bH\u0016J\u0010\u0010<\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u0010=\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u0010>\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020%H\u0002J\b\u0010?\u001a\u00020\u001fH\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006A"}, d2 = {"Lcom/discord/chat/presentation/list/SwipeHelper;", "Lcom/discord/chat/presentation/list/ChatListCallback;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "arrowAnimator", "Landroid/animation/ValueAnimator;", "arrowRotationAnimator", "arrowRotationSpringAnimation", "Landroidx/dynamicanimation/animation/SpringAnimation;", "curArrowRotationRadians", "", "curArrowScale", "curRippleAlpha", "", "curRippleRadius", "currentItemViewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "dX", "mView", "Landroid/view/View;", "replyIcon", "Landroid/graphics/drawable/Drawable;", "replyIconOutline", "rippleAnimator", "rippleFadeAnimator", "shouldPerformHapticFeedback", "", "shouldTriggerReply", "swipeBack", "drawContextArea", "", "canvas", "Landroid/graphics/Canvas;", "getAnimationDuration", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "animationType", "animateDx", "animateDy", "getEffectiveDxDy", "Landroid/util/Pair;", "rawDx", "rawDy", "getMovementFlags", "viewHolder", "onChildDraw", "c", "dY", "actionState", "isCurrentlyActive", "onMove", TouchesHelper.TARGET_KEY, "onReleased", "onSelectedChanged", "onSwiped", "direction", "shouldReturnToOriginalPosition", "shouldUseSpringyExit", "startArrowPulseAnimation", "startRippleAnimation", "updateHapticFeedbackTrigger", "updateReplyTrigger", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SwipeHelper extends ChatListCallback {
    private static final long ANIM_RETURN_DURATION = 300;
    private static final String ANIM_VALUE_ARROW_ROTATION = "arrow-rotation";
    private static final String ANIM_VALUE_ARROW_SCALE = "arrow-scale";
    private static final String ANIM_VALUE_RIPPLE_FADE = "ripple-fade";
    private static final String ANIM_VALUE_RIPPLE_SCALE = "ripple-scale";
    private static final int HAPTIC_RESET_X;
    private static final int HAPTIC_TRIGGER_X;
    private static final int INITIAL_BG_ALPHA = 20;
    private static final int MAX_CONTEXT_AREA_WIDTH;
    private static final int REPLY_RESET_X;
    private static final int SWIPE_STOP_OFFSET_X;
    private ValueAnimator arrowAnimator;
    private ValueAnimator arrowRotationAnimator;
    private SpringAnimation arrowRotationSpringAnimation;
    private final Context context;
    private float curArrowRotationRadians;
    private RecyclerView.ViewHolder currentItemViewHolder;
    private float dX;
    private View mView;
    private Drawable replyIcon;
    private Drawable replyIconOutline;
    private ValueAnimator rippleAnimator;
    private ValueAnimator rippleFadeAnimator;
    private boolean shouldTriggerReply;
    private boolean swipeBack;
    public static final Companion Companion = new Companion(null);
    private static final int MAX_BORDER_RADIUS = SizeUtilsKt.getDpToPx(100);
    private float curArrowScale = 1.0f;
    private float curRippleRadius = 1.0f;
    private int curRippleAlpha = 255;
    private boolean shouldPerformHapticFeedback = true;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/discord/chat/presentation/list/SwipeHelper$Companion;", "", "()V", "ANIM_RETURN_DURATION", "", "ANIM_VALUE_ARROW_ROTATION", "", "ANIM_VALUE_ARROW_SCALE", "ANIM_VALUE_RIPPLE_FADE", "ANIM_VALUE_RIPPLE_SCALE", "HAPTIC_RESET_X", "", "HAPTIC_TRIGGER_X", "INITIAL_BG_ALPHA", "MAX_BORDER_RADIUS", "MAX_CONTEXT_AREA_WIDTH", "REPLY_RESET_X", "SWIPE_STOP_OFFSET_X", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
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

    public SwipeHelper(Context context) {
        q.g(context, "context");
        this.context = context;
        this.replyIcon = h.f(context.getResources(), R.drawable.ic_swipe_reply, context.getTheme());
        this.replyIconOutline = h.f(context.getResources(), R.drawable.ic_swipe_reply_outline, context.getTheme());
    }

    private final void drawContextArea(Canvas canvas) {
        int j10;
        float f10;
        int j11;
        if (this.currentItemViewHolder != null) {
            View view = this.mView;
            View view2 = null;
            if (view == null) {
                q.y("mView");
                view = null;
            }
            float abs = Math.abs(view.getTranslationX());
            View view3 = this.mView;
            if (view3 == null) {
                q.y("mView");
                view3 = null;
            }
            float measuredHeight = view3.getMeasuredHeight();
            View view4 = this.mView;
            if (view4 == null) {
                q.y("mView");
                view4 = null;
            }
            float measuredWidth = view4.getMeasuredWidth();
            View view5 = this.mView;
            if (view5 == null) {
                q.y("mView");
                view5 = null;
            }
            float translationX = measuredWidth + view5.getTranslationX();
            View view6 = this.mView;
            if (view6 == null) {
                q.y("mView");
                view6 = null;
            }
            float top = view6.getTop();
            float f11 = 20;
            float f12 = 235;
            View view7 = this.mView;
            if (view7 == null) {
                q.y("mView");
                view7 = null;
            }
            float translationX2 = view7.getTranslationX();
            int i10 = SWIPE_STOP_OFFSET_X;
            j10 = j.j((int) (f11 + (f12 * (translationX2 / i10))), 0, 255);
            Paint paint = new Paint();
            paint.setColor(ColorUtilsKt.getColorCompat(this.context, R.color.brand_500));
            paint.setAlpha(j10);
            paint.setStyle(Paint.Style.FILL);
            canvas.save();
            View view8 = this.mView;
            if (view8 == null) {
                q.y("mView");
            } else {
                view2 = view8;
            }
            float max = Math.max(0.0f, Math.min(view2.getTranslationX() / i10, 1.0f));
            float f13 = measuredHeight / 2.0f;
            float min = Math.min(f13, MAX_BORDER_RADIUS) * max;
            float[] fArr = {min, min, 0.0f, 0.0f, 0.0f, 0.0f, min, min};
            Path path = new Path();
            float f14 = translationX + abs;
            float f15 = top + measuredHeight;
            path.addRoundRect(translationX, top, f14, f15, fArr, Path.Direction.CW);
            canvas.clipPath(path);
            canvas.drawRect(translationX, top, f14, f15, paint);
            f10 = j.f(measuredHeight - SizeUtilsKt.getDpToPx(6), SizeUtilsKt.getDpToPx(24));
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(ColorUtilsKt.getColorCompat(this.context, R.color.white), PorterDuff.Mode.SRC_ATOP);
            Drawable drawable = this.replyIcon;
            if (drawable != null) {
                drawable.setColorFilter(porterDuffColorFilter);
            }
            Drawable drawable2 = this.replyIconOutline;
            if (drawable2 != null) {
                drawable2.setColorFilter(porterDuffColorFilter);
            }
            canvas.save();
            canvas.translate(translationX + 4.0f + (abs / 2.0f), top + f13);
            paint.setColor(ColorUtilsKt.getColorCompat(this.context, R.color.white_500));
            paint.setAlpha(this.curRippleAlpha);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(0.0f, 0.0f, this.curRippleRadius, paint);
            float f16 = this.curArrowScale;
            canvas.scale(f16, f16);
            canvas.rotate(((1.0f - max) * 90.0f) + ((float) (((this.curArrowRotationRadians / 300.0d) * 180.0d) / 3.141592653589793d)));
            int i11 = (int) (f10 / 2.0f);
            int i12 = -i11;
            Rect rect = new Rect(i12, i12, i11, i11);
            Drawable drawable3 = this.replyIcon;
            if (drawable3 != null) {
                drawable3.setBounds(rect);
            }
            Drawable drawable4 = this.replyIconOutline;
            if (drawable4 != null) {
                drawable4.setBounds(rect);
            }
            float pow = (float) Math.pow(max, 5);
            Drawable drawable5 = this.replyIcon;
            if (drawable5 != null) {
                j11 = j.j((int) (j10 * pow), 0, 255);
                drawable5.setAlpha(j11);
            }
            Drawable drawable6 = this.replyIconOutline;
            if (drawable6 != null) {
                drawable6.setAlpha(j10);
            }
            Drawable drawable7 = this.replyIcon;
            if (drawable7 != null) {
                drawable7.draw(canvas);
            }
            Drawable drawable8 = this.replyIconOutline;
            if (drawable8 != null) {
                drawable8.draw(canvas);
            }
            canvas.restore();
            canvas.restore();
        }
    }

    private final void startArrowPulseAnimation(final RecyclerView recyclerView) {
        ValueAnimator valueAnimator = this.rippleAnimator;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat(ANIM_VALUE_ARROW_SCALE, 1.0f, 1.4f, 1.0f);
        ValueAnimator valueAnimator2 = new ValueAnimator();
        valueAnimator2.setValues(ofFloat);
        valueAnimator2.setDuration(ANIM_RETURN_DURATION);
        valueAnimator2.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.discord.chat.presentation.list.e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                SwipeHelper.startArrowPulseAnimation$lambda$1$lambda$0(SwipeHelper.this, recyclerView, valueAnimator3);
            }
        });
        this.arrowAnimator = valueAnimator2;
        valueAnimator2.start();
        PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat(ANIM_VALUE_ARROW_ROTATION, 0.0f, -0.31415927f);
        ValueAnimator valueAnimator3 = new ValueAnimator();
        valueAnimator3.setValues(ofFloat2);
        valueAnimator3.setDuration(125L);
        valueAnimator3.setInterpolator(new LinearInterpolator());
        valueAnimator3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.discord.chat.presentation.list.f
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                SwipeHelper.startArrowPulseAnimation$lambda$5$lambda$2(SwipeHelper.this, recyclerView, valueAnimator4);
            }
        });
        valueAnimator3.addListener(new Animator.AnimatorListener() { // from class: com.discord.chat.presentation.list.SwipeHelper$startArrowPulseAnimation$lambda$5$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                q.g(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                SpringAnimation springAnimation;
                SpringAnimation springAnimation2;
                b bVar;
                SpringAnimation springAnimation3;
                q.g(animator, "animator");
                SwipeHelper swipeHelper = SwipeHelper.this;
                SpringAnimation springAnimation4 = new SpringAnimation(new j1.b(r2 * 300.0f));
                springAnimation4.t(new b().d(0.2f).f(200.0f));
                final SwipeHelper swipeHelper2 = SwipeHelper.this;
                final RecyclerView recyclerView2 = recyclerView;
                springAnimation4.b(new DynamicAnimation.r() { // from class: com.discord.chat.presentation.list.SwipeHelper$startArrowPulseAnimation$2$2$1$1
                    @Override // androidx.dynamicanimation.animation.DynamicAnimation.r
                    public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f10, float f11) {
                        SwipeHelper.this.curArrowRotationRadians = f10;
                        recyclerView2.invalidate();
                    }
                });
                swipeHelper.arrowRotationSpringAnimation = springAnimation4;
                springAnimation = SwipeHelper.this.arrowRotationSpringAnimation;
                if (springAnimation != null) {
                    springAnimation.c();
                }
                springAnimation2 = SwipeHelper.this.arrowRotationSpringAnimation;
                if (springAnimation2 != null) {
                    bVar = springAnimation2.q();
                } else {
                    bVar = null;
                }
                if (bVar != null) {
                    bVar.e(0.0f);
                }
                springAnimation3 = SwipeHelper.this.arrowRotationSpringAnimation;
                if (springAnimation3 != null) {
                    springAnimation3.l();
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                q.g(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                q.g(animator, "animator");
            }
        });
        this.arrowRotationAnimator = valueAnimator3;
        valueAnimator3.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startArrowPulseAnimation$lambda$1$lambda$0(SwipeHelper this$0, RecyclerView recyclerView, ValueAnimator valueAnimator) {
        q.g(this$0, "this$0");
        q.g(recyclerView, "$recyclerView");
        Object animatedValue = valueAnimator.getAnimatedValue(ANIM_VALUE_ARROW_SCALE);
        q.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this$0.curArrowScale = ((Float) animatedValue).floatValue();
        recyclerView.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startArrowPulseAnimation$lambda$5$lambda$2(SwipeHelper this$0, RecyclerView recyclerView, ValueAnimator valueAnimator) {
        q.g(this$0, "this$0");
        q.g(recyclerView, "$recyclerView");
        Object animatedValue = valueAnimator.getAnimatedValue(ANIM_VALUE_ARROW_ROTATION);
        q.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this$0.curArrowRotationRadians = ((Float) animatedValue).floatValue();
        recyclerView.invalidate();
    }

    private final void startRippleAnimation(final RecyclerView recyclerView) {
        ValueAnimator valueAnimator = this.rippleAnimator;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
        ValueAnimator valueAnimator2 = this.rippleFadeAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.end();
        }
        this.curRippleRadius = 1.0f;
        this.curRippleAlpha = 26;
        View view = this.mView;
        if (view == null) {
            q.y("mView");
            view = null;
        }
        float max = Math.max(view.getMeasuredHeight(), Math.abs(MAX_CONTEXT_AREA_WIDTH) + SizeUtilsKt.getDpToPx(50));
        long j10 = ((max / 6700.0f) + 0.28f) * 1000.0f;
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat(ANIM_VALUE_RIPPLE_SCALE, 1.0f, max);
        ValueAnimator valueAnimator3 = new ValueAnimator();
        valueAnimator3.setValues(ofFloat);
        valueAnimator3.setDuration(j10);
        valueAnimator3.setStartDelay(100L);
        valueAnimator3.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.discord.chat.presentation.list.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                SwipeHelper.startRippleAnimation$lambda$7$lambda$6(SwipeHelper.this, recyclerView, valueAnimator4);
            }
        });
        this.rippleAnimator = valueAnimator3;
        PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat(ANIM_VALUE_RIPPLE_FADE, 0.1f, 0.0f);
        ValueAnimator valueAnimator4 = new ValueAnimator();
        valueAnimator4.setValues(ofFloat2);
        valueAnimator4.setDuration(500L);
        valueAnimator4.setStartDelay(j10 + 100);
        valueAnimator4.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.discord.chat.presentation.list.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator5) {
                SwipeHelper.startRippleAnimation$lambda$9$lambda$8(SwipeHelper.this, recyclerView, valueAnimator5);
            }
        });
        this.rippleFadeAnimator = valueAnimator4;
        ValueAnimator valueAnimator5 = this.rippleAnimator;
        if (valueAnimator5 != null) {
            valueAnimator5.start();
        }
        ValueAnimator valueAnimator6 = this.rippleFadeAnimator;
        if (valueAnimator6 != null) {
            valueAnimator6.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startRippleAnimation$lambda$7$lambda$6(SwipeHelper this$0, RecyclerView recyclerView, ValueAnimator valueAnimator) {
        q.g(this$0, "this$0");
        q.g(recyclerView, "$recyclerView");
        Object animatedValue = valueAnimator.getAnimatedValue(ANIM_VALUE_RIPPLE_SCALE);
        q.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this$0.curRippleRadius = ((Float) animatedValue).floatValue();
        recyclerView.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startRippleAnimation$lambda$9$lambda$8(SwipeHelper this$0, RecyclerView recyclerView, ValueAnimator valueAnimator) {
        int j10;
        q.g(this$0, "this$0");
        q.g(recyclerView, "$recyclerView");
        Object animatedValue = valueAnimator.getAnimatedValue(ANIM_VALUE_RIPPLE_FADE);
        q.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        j10 = j.j((int) (((Float) animatedValue).floatValue() * 255), 0, 255);
        this$0.curRippleAlpha = j10;
        recyclerView.invalidate();
    }

    private final void updateHapticFeedbackTrigger(RecyclerView recyclerView) {
        View view = null;
        if (this.shouldPerformHapticFeedback) {
            View view2 = this.mView;
            if (view2 == null) {
                q.y("mView");
                view2 = null;
            }
            if (view2.getTranslationX() <= HAPTIC_TRIGGER_X) {
                View view3 = this.mView;
                if (view3 == null) {
                    q.y("mView");
                } else {
                    view = view3;
                }
                view.performHapticFeedback(0);
                this.shouldPerformHapticFeedback = false;
                startArrowPulseAnimation(recyclerView);
                startRippleAnimation(recyclerView);
                return;
            }
        }
        if (!this.shouldPerformHapticFeedback) {
            View view4 = this.mView;
            if (view4 == null) {
                q.y("mView");
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
                q.y("mView");
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
                q.y("mView");
            } else {
                view = view3;
            }
            if (view.getTranslationX() <= HAPTIC_TRIGGER_X) {
                this.shouldTriggerReply = true;
            }
        }
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.c
    public long getAnimationDuration(RecyclerView recyclerView, int i10, float f10, float f11) {
        q.g(recyclerView, "recyclerView");
        return ANIM_RETURN_DURATION;
    }

    @Override // com.discord.chat.presentation.list.ChatListCallback
    public Pair<Float, Float> getEffectiveDxDy(float f10, float f11) {
        int i10 = SWIPE_STOP_OFFSET_X;
        if (f10 >= i10) {
            return new Pair<>(Float.valueOf(f10), Float.valueOf(f11));
        }
        return new Pair<>(Float.valueOf(i10 - (((float) Math.atan(Math.abs(f10 - i10) / 120.0f)) * 120.0f)), Float.valueOf(f11));
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.c
    public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        int i10;
        q.g(recyclerView, "recyclerView");
        q.g(viewHolder, "viewHolder");
        View view = viewHolder.itemView;
        q.f(view, "viewHolder.itemView");
        this.mView = view;
        View view2 = viewHolder.itemView;
        if (view2 instanceof SwipeReplyInitiator) {
            q.e(view2, "null cannot be cast to non-null type com.discord.chat.presentation.list.SwipeReplyInitiator");
            if (((SwipeReplyInitiator) view2).getEnableSwipeToReply()) {
                i10 = 4;
                return ItemTouchHelper.c.makeMovementFlags(0, i10);
            }
        }
        i10 = 0;
        return ItemTouchHelper.c.makeMovementFlags(0, i10);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.c
    public void onChildDraw(Canvas c10, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f10, float f11, int i10, boolean z10) {
        q.g(c10, "c");
        q.g(recyclerView, "recyclerView");
        q.g(viewHolder, "viewHolder");
        super.onChildDraw(c10, recyclerView, viewHolder, f10, f11, i10, z10);
        this.dX = f10;
        this.currentItemViewHolder = viewHolder;
        drawContextArea(c10);
        updateHapticFeedbackTrigger(recyclerView);
        updateReplyTrigger();
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.c
    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
        q.g(recyclerView, "recyclerView");
        q.g(viewHolder, "viewHolder");
        q.g(target, "target");
        return false;
    }

    @Override // com.discord.chat.presentation.list.ChatListCallback
    public void onReleased(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        q.g(recyclerView, "recyclerView");
        this.swipeBack = true;
        if (this.shouldTriggerReply && viewHolder != null) {
            View view = viewHolder.itemView;
            if (view instanceof SwipeReplyInitiator) {
                q.e(view, "null cannot be cast to non-null type com.discord.chat.presentation.list.SwipeReplyInitiator");
                ((SwipeReplyInitiator) view).getOnInitiateReply().invoke();
            }
        }
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.c
    public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i10) {
        boolean z10;
        super.onSelectedChanged(viewHolder, i10);
        if (viewHolder == null && i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.swipeBack = z10;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.c
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int i10) {
        q.g(viewHolder, "viewHolder");
    }

    @Override // com.discord.chat.presentation.list.ChatListCallback
    public boolean shouldReturnToOriginalPosition() {
        return true;
    }

    @Override // com.discord.chat.presentation.list.ChatListCallback
    public boolean shouldUseSpringyExit() {
        return this.shouldTriggerReply;
    }
}
