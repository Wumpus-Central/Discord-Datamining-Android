package com.discord.mobile_voice_overlay;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C2733w0;
import com.discord.mobile_voice_overlay.views.OverlayMenuBubbleDialog;
import com.discord.mobile_voice_overlay.views.OverlayVoiceBubble;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m15073d2 = {"<anonymous>", "", "menuDialog", "Lcom/discord/mobile_voice_overlay/views/OverlayMenuBubbleDialog;", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
public final class MobileVoiceOverlay$voiceBubbleProvider$1$1$1 extends AbstractC9973s implements Function1<OverlayMenuBubbleDialog, Unit> {
    final /* synthetic */ Rect $marginRect;
    final /* synthetic */ OverlayVoiceBubble $voiceBubble;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobileVoiceOverlay$voiceBubbleProvider$1$1$1(OverlayVoiceBubble overlayVoiceBubble, Rect rect) {
        super(1);
        this.$voiceBubble = overlayVoiceBubble;
        this.$marginRect = rect;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OverlayMenuBubbleDialog overlayMenuBubbleDialog) {
        invoke2(overlayMenuBubbleDialog);
        return Unit.f22042a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OverlayMenuBubbleDialog menuDialog) {
        C9971q.m14633g(menuDialog, "menuDialog");
        ViewGroup.LayoutParams layoutParams = menuDialog.getLinkedAnchorView().getLayoutParams();
        OverlayVoiceBubble overlayVoiceBubble = this.$voiceBubble;
        Rect rect = this.$marginRect;
        layoutParams.width = (overlayVoiceBubble.getWidth() - rect.left) - rect.right;
        layoutParams.height = overlayVoiceBubble.getHeight();
        menuDialog.getLinkedAnchorView().requestLayout();
        menuDialog.getLinkedAnchorView().setTag("Active Voice Bubble");
        final OverlayVoiceBubble overlayVoiceBubble2 = this.$voiceBubble;
        menuDialog.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.discord.mobile_voice_overlay.MobileVoiceOverlay$voiceBubbleProvider$1$1$1.2
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(final View v) {
                C9971q.m14633g(v, "v");
                final OverlayVoiceBubble overlayVoiceBubble3 = OverlayVoiceBubble.this;
                if (!C2733w0.m37029U(v) || v.isLayoutRequested()) {
                    v.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.discord.mobile_voice_overlay.MobileVoiceOverlay$voiceBubbleProvider$1$1$1$2$onViewAttachedToWindow$$inlined$doOnLayout$1
                        @Override // android.view.View.OnLayoutChangeListener
                        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                            C9971q.m14633g(view, "view");
                            view.removeOnLayoutChangeListener(this);
                            View findViewWithTag = v.findViewWithTag("Active Voice Bubble");
                            C9971q.m14634f(findViewWithTag, "v.findViewWithTag(ANCHOR_TAG)");
                            overlayVoiceBubble3.anchorOn(findViewWithTag);
                        }
                    });
                    return;
                }
                View findViewWithTag = v.findViewWithTag("Active Voice Bubble");
                C9971q.m14634f(findViewWithTag, "v.findViewWithTag(ANCHOR_TAG)");
                overlayVoiceBubble3.anchorOn(findViewWithTag);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                if (C2733w0.m37030T(OverlayVoiceBubble.this)) {
                    OverlayVoiceBubble.this.setBubbleTouchable(true);
                    OverlayVoiceBubble.this.anchorOff(true);
                }
            }
        });
    }
}
