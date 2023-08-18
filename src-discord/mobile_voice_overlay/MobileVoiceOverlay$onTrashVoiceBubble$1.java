package com.discord.mobile_voice_overlay;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.os.Handler;
import com.discord.misc.utilities.threading.ThreadUtilsKt;
import com.discord.mobile_voice_overlay.views.OverlayBubbleWrap;
import com.discord.mobile_voice_overlay.views.OverlayVoiceBubble;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "voiceBubble", "Lcom/discord/mobile_voice_overlay/views/OverlayVoiceBubble;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

final class MobileVoiceOverlay$onTrashVoiceBubble$1 extends s implements Function1<OverlayVoiceBubble, Unit> {
    final  MobileVoiceOverlay this$0;

    
    
    public MobileVoiceOverlay$onTrashVoiceBubble$1(MobileVoiceOverlay mobileVoiceOverlay) {
        super(1);
        this.this$0 = mobileVoiceOverlay;
    }

    @Override 
    public   Unit invoke(OverlayVoiceBubble overlayVoiceBubble) {
        invoke2(overlayVoiceBubble);
        return Unit.f21210a;
    }

    
    public final void invoke2(OverlayVoiceBubble voiceBubble) {
        q.h(voiceBubble, "voiceBubble");
        voiceBubble.moveToAnchorPoint();
        Animator invoke$lambda$2 = AnimatorInflater.loadAnimator(voiceBubble.getContext(), R.animator.fade_out);
        final MobileVoiceOverlay mobileVoiceOverlay = this.this$0;
        invoke$lambda$2.setTarget(voiceBubble);
        q.g(invoke$lambda$2, "invoke$lambda$2");
        invoke$lambda$2.addListener(new Animator.AnimatorListener() { 
            @Override 
            public void onAnimationCancel(Animator animator) {
                q.h(animator, "animator");
            }

            @Override 
            public void onAnimationEnd(Animator animator) {
                q.h(animator, "animator");
                if (ThreadUtilsKt.isOnMainThread()) {
                    MobileVoiceOverlay.invokeJs$default(MobileVoiceOverlay.this, "onLayoutTrashed", null, 2, null);
                    return;
                }
                Handler uiHandler = ThreadUtilsKt.getUiHandler();
                final MobileVoiceOverlay mobileVoiceOverlay2 = MobileVoiceOverlay.this;
                uiHandler.post(new Runnable() { 
                    @Override 
                    public final void run() {
                        MobileVoiceOverlay.invokeJs$default(MobileVoiceOverlay.this, "onLayoutTrashed", null, 2, null);
                    }
                });
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
        invoke$lambda$2.start();
        OverlayBubbleWrap.animateToCoordinate$default(voiceBubble, (int) voiceBubble.getX(), ((int) voiceBubble.getY()) + (voiceBubble.getHeight() / 2), null, 4, null);
    }
}
