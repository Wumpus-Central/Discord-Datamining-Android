package com.discord.mobile_voice_overlay;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.w0;
import com.discord.mobile_voice_overlay.views.OverlayMenuBubbleDialog;
import com.discord.mobile_voice_overlay.views.OverlayVoiceBubble;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;


@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "menuDialog", "Lcom/discord/mobile_voice_overlay/views/OverlayMenuBubbleDialog;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class MobileVoiceOverlay$voiceBubbleProvider$1$1$1 extends s implements Function1<OverlayMenuBubbleDialog, Unit> {
    final  Rect $marginRect;
    final  OverlayVoiceBubble $voiceBubble;

    
    
    public MobileVoiceOverlay$voiceBubbleProvider$1$1$1(OverlayVoiceBubble overlayVoiceBubble, Rect rect) {
        super(1);
        this.$voiceBubble = overlayVoiceBubble;
        this.$marginRect = rect;
    }

    @Override 
    public   Unit invoke(OverlayMenuBubbleDialog overlayMenuBubbleDialog) {
        invoke2(overlayMenuBubbleDialog);
        return Unit.f20663a;
    }

    
    public final void invoke2(OverlayMenuBubbleDialog menuDialog) {
        q.g(menuDialog, "menuDialog");
        ViewGroup.LayoutParams layoutParams = menuDialog.getLinkedAnchorView().getLayoutParams();
        OverlayVoiceBubble overlayVoiceBubble = this.$voiceBubble;
        Rect rect = this.$marginRect;
        layoutParams.width = (overlayVoiceBubble.getWidth() - rect.left) - rect.right;
        layoutParams.height = overlayVoiceBubble.getHeight();
        menuDialog.getLinkedAnchorView().requestLayout();
        menuDialog.getLinkedAnchorView().setTag("Active Voice Bubble");
        final OverlayVoiceBubble overlayVoiceBubble2 = this.$voiceBubble;
        menuDialog.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { 
            @Override 
            public void onViewAttachedToWindow(final View v10) {
                q.g(v10, "v");
                final OverlayVoiceBubble overlayVoiceBubble3 = OverlayVoiceBubble.this;
                if (!w0.U(v10) || v10.isLayoutRequested()) {
                    v10.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { 
                        @Override 
                        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                            q.g(view, "view");
                            view.removeOnLayoutChangeListener(this);
                            View findViewWithTag = v10.findViewWithTag("Active Voice Bubble");
                            q.f(findViewWithTag, "v.findViewWithTag(ANCHOR_TAG)");
                            overlayVoiceBubble3.anchorOn(findViewWithTag);
                        }
                    });
                    return;
                }
                View findViewWithTag = v10.findViewWithTag("Active Voice Bubble");
                q.f(findViewWithTag, "v.findViewWithTag(ANCHOR_TAG)");
                overlayVoiceBubble3.anchorOn(findViewWithTag);
            }

            @Override 
            public void onViewDetachedFromWindow(View view) {
                if (w0.T(OverlayVoiceBubble.this)) {
                    OverlayVoiceBubble.this.setBubbleTouchable(true);
                    OverlayVoiceBubble.this.anchorOff(true);
                }
            }
        });
    }
}
