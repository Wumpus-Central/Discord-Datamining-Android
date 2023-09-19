package com.discord.mobile_voice_overlay.views;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import com.discord.mobile_voice_overlay.MobileVoiceOverlayAssets;
import com.discord.mobile_voice_overlay.MobileVoiceOverlayData;
import com.discord.mobile_voice_overlay.R;
import com.discord.mobile_voice_overlay.databinding.TrashWrapBinding;
import com.discord.mobile_voice_overlay.utils.WindowUtils;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0018\u001a\u00020\u0017H\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001aH\u0002J\u0006\u0010\u001e\u001a\u00020\u001aJ0\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020\t2\u0006\u0010%\u001a\u00020\tH\u0014J\u0016\u0010&\u001a\u00020!2\u0006\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020)J\u0010\u0010*\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020,H\u0016J\u0010\u0010-\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020/H\u0016J\u0006\u00100\u001a\u00020\u001aR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/discord/mobile_voice_overlay/views/OverlayTrashWrap;", "Lcom/discord/mobile_voice_overlay/views/OverlayView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "attributeSetId", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/discord/mobile_voice_overlay/databinding/TrashWrapBinding;", "hideAnimator", "Landroid/animation/Animator;", "locationOnScreen", "", "previousBubbleOverTrashZone", "Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;", "showAnimator", "trashZoneRect", "Landroid/graphics/Rect;", "windowLayoutParams", "Landroid/view/WindowManager$LayoutParams;", "getInitialLayoutParams", "handleViewDraggedIntoTrashZone", "", "view", "Landroid/view/View;", "handleViewDraggedOutOfTrashZone", "hide", ViewProps.ON_LAYOUT, "changed", "", ViewProps.LEFT, ViewProps.TOP, ViewProps.RIGHT, ViewProps.BOTTOM, "processMotionEvent", "bubble", "motionEvent", "Landroid/view/MotionEvent;", "setAssets", "assets", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayAssets;", "setData", "data", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;", "show", "mobile_voice_overlay_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class OverlayTrashWrap extends OverlayView {
    private final TrashWrapBinding binding;
    private final Animator hideAnimator;
    private OverlayBubbleWrap previousBubbleOverTrashZone;
    private final Animator showAnimator;
    private WindowManager.LayoutParams windowLayoutParams;
    private final Rect trashZoneRect = new Rect();
    private final int[] locationOnScreen = {0, 0};

    
    public OverlayTrashWrap(Context context) {
        super(context);
        q.h(context, "context");
        WindowUtils windowUtils = WindowUtils.INSTANCE;
        WindowManager.LayoutParams createWindowLayoutParams = windowUtils.createWindowLayoutParams();
        createWindowLayoutParams.width = -1;
        createWindowLayoutParams.gravity = 81;
        windowUtils.addFlag(createWindowLayoutParams, 16);
        this.windowLayoutParams = createWindowLayoutParams;
        TrashWrapBinding inflate = TrashWrapBinding.inflate(LayoutInflater.from(getContext()), this);
        q.g(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        setBackgroundResource(R.drawable.trash_bg);
        setVisibility(4);
        inflate.trashWrapTargetContainer.setActivated(false);
        AnimatorSet animatorSet = new AnimatorSet();
        Animator loadAnimator = AnimatorInflater.loadAnimator(getContext(), R.animator.fade_in);
        loadAnimator.setTarget(this);
        Unit unit = Unit.f21444a;
        Animator loadAnimator2 = AnimatorInflater.loadAnimator(getContext(), R.animator.slide_in_bottom);
        loadAnimator2.setTarget(inflate.trashWrapTargetZone);
        animatorSet.playTogether(loadAnimator, loadAnimator2);
        animatorSet.addListener(new Animator.AnimatorListener() { 
            @Override 
            public void onAnimationCancel(Animator animator) {
                q.h(animator, "animator");
            }

            @Override 
            public void onAnimationEnd(Animator animator) {
                q.h(animator, "animator");
            }

            @Override 
            public void onAnimationRepeat(Animator animator) {
                q.h(animator, "animator");
            }

            @Override 
            public void onAnimationStart(Animator animator) {
                q.h(animator, "animator");
                OverlayTrashWrap.this.setVisibility(0);
            }
        });
        this.showAnimator = animatorSet;
        AnimatorSet animatorSet2 = new AnimatorSet();
        Animator loadAnimator3 = AnimatorInflater.loadAnimator(getContext(), R.animator.fade_out);
        loadAnimator3.setTarget(this);
        Animator loadAnimator4 = AnimatorInflater.loadAnimator(getContext(), R.animator.slide_out_bottom);
        loadAnimator4.setTarget(inflate.trashWrapTargetZone);
        animatorSet2.playTogether(loadAnimator3, loadAnimator4);
        animatorSet2.addListener(new Animator.AnimatorListener() { 
            @Override 
            public void onAnimationCancel(Animator animator) {
                q.h(animator, "animator");
            }

            @Override 
            public void onAnimationEnd(Animator animator) {
                q.h(animator, "animator");
                OverlayTrashWrap.this.setVisibility(4);
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
        this.hideAnimator = animatorSet2;
    }

    private final void handleViewDraggedIntoTrashZone(View view) {
        this.binding.trashWrapTargetContainer.setActivated(true);
        float max = (Math.max(Math.max(view.getWidth(), view.getHeight()), this.binding.trashWrapTargetContainer.getWidth()) / this.binding.trashWrapTargetContainer.getWidth()) + 0.5f;
        ScaleAnimation scaleAnimation = new ScaleAnimation(this.binding.trashWrapTargetContainer.getScaleX(), max, this.binding.trashWrapTargetContainer.getScaleY(), max, this.binding.trashWrapTargetContainer.getPivotX(), this.binding.trashWrapTargetContainer.getPivotY());
        scaleAnimation.setDuration(200L);
        scaleAnimation.setInterpolator(new OvershootInterpolator());
        scaleAnimation.setFillAfter(true);
        this.binding.trashWrapTargetContainer.startAnimation(scaleAnimation);
    }

    private final void handleViewDraggedOutOfTrashZone() {
        this.binding.trashWrapTargetContainer.setActivated(false);
        setActivated(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(this.binding.trashWrapTargetContainer.getScaleX(), 1.0f, this.binding.trashWrapTargetContainer.getScaleY(), 1.0f);
        scaleAnimation.setDuration(200L);
        scaleAnimation.setInterpolator(getContext(), 17563655);
        scaleAnimation.setFillAfter(true);
        this.binding.trashWrapTargetContainer.startAnimation(scaleAnimation);
    }

    @Override 
    public WindowManager.LayoutParams getInitialLayoutParams() {
        return this.windowLayoutParams;
    }

    public final void hide() {
        this.hideAnimator.start();
    }

    @Override 
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            this.binding.trashWrapTargetZone.getLocationOnScreen(this.locationOnScreen);
            int[] iArr = this.locationOnScreen;
            int i14 = iArr[0];
            int i15 = iArr[1];
            this.trashZoneRect.set(i14, i15, this.binding.trashWrapTargetZone.getWidth() + i14, this.binding.trashWrapTargetZone.getHeight() + i15);
        }
    }

    public final boolean processMotionEvent(OverlayBubbleWrap bubble, MotionEvent motionEvent) {
        q.h(bubble, "bubble");
        q.h(motionEvent, "motionEvent");
        if (!this.trashZoneRect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
            bubble = null;
        }
        boolean isActivated = this.binding.trashWrapTargetContainer.isActivated();
        if (bubble != null && !isActivated) {
            handleViewDraggedIntoTrashZone(bubble);
        } else if (bubble == null && isActivated) {
            handleViewDraggedOutOfTrashZone();
        }
        if (!q.c(bubble, this.previousBubbleOverTrashZone)) {
            if (bubble != null) {
                SimpleDraweeView simpleDraweeView = this.binding.trashWrapIcon;
                q.g(simpleDraweeView, "binding.trashWrapIcon");
                bubble.anchorOn(simpleDraweeView);
            }
            performHapticFeedback(6);
            OverlayBubbleWrap overlayBubbleWrap = this.previousBubbleOverTrashZone;
            if (overlayBubbleWrap != null) {
                OverlayBubbleWrap.anchorOff$default(overlayBubbleWrap, false, 1, null);
            }
            this.previousBubbleOverTrashZone = bubble;
        }
        if (bubble == null || motionEvent.getAction() != 1) {
            return false;
        }
        return true;
    }

    @Override 
    public void setAssets(MobileVoiceOverlayAssets assets) {
        q.h(assets, "assets");
        super.setAssets(assets);
        SimpleDraweeView simpleDraweeView = this.binding.trashWrapIcon;
        q.g(simpleDraweeView, "binding.trashWrapIcon");
        ReactAssetUtilsKt.setReactAsset(simpleDraweeView, ReactAsset.Close);
        SimpleDraweeView simpleDraweeView2 = this.binding.trashWrapIcon;
        q.g(simpleDraweeView2, "binding.trashWrapIcon");
        ColorUtilsKt.setTintColor(simpleDraweeView2, Integer.valueOf(ThemeManagerKt.getTheme().getInteractiveNormal()));
    }

    @Override 
    public void setData(MobileVoiceOverlayData data) {
        q.h(data, "data");
    }

    public final void show() {
        this.showAnimator.start();
    }

    
    public OverlayTrashWrap(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.h(context, "context");
        WindowUtils windowUtils = WindowUtils.INSTANCE;
        WindowManager.LayoutParams createWindowLayoutParams = windowUtils.createWindowLayoutParams();
        createWindowLayoutParams.width = -1;
        createWindowLayoutParams.gravity = 81;
        windowUtils.addFlag(createWindowLayoutParams, 16);
        this.windowLayoutParams = createWindowLayoutParams;
        TrashWrapBinding inflate = TrashWrapBinding.inflate(LayoutInflater.from(getContext()), this);
        q.g(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        setBackgroundResource(R.drawable.trash_bg);
        setVisibility(4);
        inflate.trashWrapTargetContainer.setActivated(false);
        AnimatorSet animatorSet = new AnimatorSet();
        Animator loadAnimator = AnimatorInflater.loadAnimator(getContext(), R.animator.fade_in);
        loadAnimator.setTarget(this);
        Unit unit = Unit.f21444a;
        Animator loadAnimator2 = AnimatorInflater.loadAnimator(getContext(), R.animator.slide_in_bottom);
        loadAnimator2.setTarget(inflate.trashWrapTargetZone);
        animatorSet.playTogether(loadAnimator, loadAnimator2);
        animatorSet.addListener(new Animator.AnimatorListener() { 
            @Override 
            public void onAnimationCancel(Animator animator) {
                q.h(animator, "animator");
            }

            @Override 
            public void onAnimationEnd(Animator animator) {
                q.h(animator, "animator");
            }

            @Override 
            public void onAnimationRepeat(Animator animator) {
                q.h(animator, "animator");
            }

            @Override 
            public void onAnimationStart(Animator animator) {
                q.h(animator, "animator");
                OverlayTrashWrap.this.setVisibility(0);
            }
        });
        this.showAnimator = animatorSet;
        AnimatorSet animatorSet2 = new AnimatorSet();
        Animator loadAnimator3 = AnimatorInflater.loadAnimator(getContext(), R.animator.fade_out);
        loadAnimator3.setTarget(this);
        Animator loadAnimator4 = AnimatorInflater.loadAnimator(getContext(), R.animator.slide_out_bottom);
        loadAnimator4.setTarget(inflate.trashWrapTargetZone);
        animatorSet2.playTogether(loadAnimator3, loadAnimator4);
        animatorSet2.addListener(new Animator.AnimatorListener() { 
            @Override 
            public void onAnimationCancel(Animator animator) {
                q.h(animator, "animator");
            }

            @Override 
            public void onAnimationEnd(Animator animator) {
                q.h(animator, "animator");
                OverlayTrashWrap.this.setVisibility(4);
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
        this.hideAnimator = animatorSet2;
    }

    
    public OverlayTrashWrap(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        q.h(context, "context");
        WindowUtils windowUtils = WindowUtils.INSTANCE;
        WindowManager.LayoutParams createWindowLayoutParams = windowUtils.createWindowLayoutParams();
        createWindowLayoutParams.width = -1;
        createWindowLayoutParams.gravity = 81;
        windowUtils.addFlag(createWindowLayoutParams, 16);
        this.windowLayoutParams = createWindowLayoutParams;
        TrashWrapBinding inflate = TrashWrapBinding.inflate(LayoutInflater.from(getContext()), this);
        q.g(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        setBackgroundResource(R.drawable.trash_bg);
        setVisibility(4);
        inflate.trashWrapTargetContainer.setActivated(false);
        AnimatorSet animatorSet = new AnimatorSet();
        Animator loadAnimator = AnimatorInflater.loadAnimator(getContext(), R.animator.fade_in);
        loadAnimator.setTarget(this);
        Unit unit = Unit.f21444a;
        Animator loadAnimator2 = AnimatorInflater.loadAnimator(getContext(), R.animator.slide_in_bottom);
        loadAnimator2.setTarget(inflate.trashWrapTargetZone);
        animatorSet.playTogether(loadAnimator, loadAnimator2);
        animatorSet.addListener(new Animator.AnimatorListener() { 
            @Override 
            public void onAnimationCancel(Animator animator) {
                q.h(animator, "animator");
            }

            @Override 
            public void onAnimationEnd(Animator animator) {
                q.h(animator, "animator");
            }

            @Override 
            public void onAnimationRepeat(Animator animator) {
                q.h(animator, "animator");
            }

            @Override 
            public void onAnimationStart(Animator animator) {
                q.h(animator, "animator");
                OverlayTrashWrap.this.setVisibility(0);
            }
        });
        this.showAnimator = animatorSet;
        AnimatorSet animatorSet2 = new AnimatorSet();
        Animator loadAnimator3 = AnimatorInflater.loadAnimator(getContext(), R.animator.fade_out);
        loadAnimator3.setTarget(this);
        Animator loadAnimator4 = AnimatorInflater.loadAnimator(getContext(), R.animator.slide_out_bottom);
        loadAnimator4.setTarget(inflate.trashWrapTargetZone);
        animatorSet2.playTogether(loadAnimator3, loadAnimator4);
        animatorSet2.addListener(new Animator.AnimatorListener() { 
            @Override 
            public void onAnimationCancel(Animator animator) {
                q.h(animator, "animator");
            }

            @Override 
            public void onAnimationEnd(Animator animator) {
                q.h(animator, "animator");
                OverlayTrashWrap.this.setVisibility(4);
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
        this.hideAnimator = animatorSet2;
    }
}
