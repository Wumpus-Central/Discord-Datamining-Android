package com.discord.mobile_voice_overlay;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.discord.mobile_voice_overlay.utils.OverlayViewProvider;
import com.discord.mobile_voice_overlay.views.OverlayTrashWrap;
import com.discord.mobile_voice_overlay.views.OverlayVoiceBubble;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/discord/mobile_voice_overlay/views/OverlayVoiceBubble;", "it", "Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MobileVoiceOverlay$voiceBubbleProvider$1 extends s implements Function1<OverlayViewProvider<OverlayVoiceBubble>, OverlayVoiceBubble> {
    final /* synthetic */ MobileVoiceOverlay this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "event", "Landroid/view/MotionEvent;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.discord.mobile_voice_overlay.MobileVoiceOverlay$voiceBubbleProvider$1$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass2 extends s implements Function1<MotionEvent, Unit> {
        final /* synthetic */ OverlayVoiceBubble $voiceBubble;
        final /* synthetic */ MobileVoiceOverlay this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "trashWrap", "Lcom/discord/mobile_voice_overlay/views/OverlayTrashWrap;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.discord.mobile_voice_overlay.MobileVoiceOverlay$voiceBubbleProvider$1$2$1  reason: invalid class name */
        /* loaded from: classes6.dex */
        public static final class AnonymousClass1 extends s implements Function1<OverlayTrashWrap, Unit> {
            final /* synthetic */ MotionEvent $event;
            final /* synthetic */ OverlayVoiceBubble $voiceBubble;
            final /* synthetic */ MobileVoiceOverlay this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OverlayVoiceBubble overlayVoiceBubble, MotionEvent motionEvent, MobileVoiceOverlay mobileVoiceOverlay) {
                super(1);
                this.$voiceBubble = overlayVoiceBubble;
                this.$event = motionEvent;
                this.this$0 = mobileVoiceOverlay;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(OverlayTrashWrap overlayTrashWrap) {
                invoke2(overlayTrashWrap);
                return Unit.f20663a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(OverlayTrashWrap trashWrap) {
                q.g(trashWrap, "trashWrap");
                if (trashWrap.processMotionEvent(this.$voiceBubble, this.$event)) {
                    this.this$0.onTrashVoiceBubble();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(MobileVoiceOverlay mobileVoiceOverlay, OverlayVoiceBubble overlayVoiceBubble) {
            super(1);
            this.this$0 = mobileVoiceOverlay;
            this.$voiceBubble = overlayVoiceBubble;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MotionEvent motionEvent) {
            invoke2(motionEvent);
            return Unit.f20663a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(MotionEvent event) {
            q.g(event, "event");
            this.this$0.trashWrapProvider.withView(new AnonymousClass1(this.$voiceBubble, event, this.this$0));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isMoving", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.discord.mobile_voice_overlay.MobileVoiceOverlay$voiceBubbleProvider$1$3  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass3 extends s implements Function1<Boolean, Unit> {
        final /* synthetic */ OverlayVoiceBubble $voiceBubble;
        final /* synthetic */ MobileVoiceOverlay this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "trashWrap", "Lcom/discord/mobile_voice_overlay/views/OverlayTrashWrap;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.discord.mobile_voice_overlay.MobileVoiceOverlay$voiceBubbleProvider$1$3$1  reason: invalid class name */
        /* loaded from: classes6.dex */
        public static final class AnonymousClass1 extends s implements Function1<OverlayTrashWrap, Unit> {
            final /* synthetic */ boolean $isMoving;
            final /* synthetic */ OverlayVoiceBubble $voiceBubble;
            final /* synthetic */ MobileVoiceOverlay this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(boolean z10, MobileVoiceOverlay mobileVoiceOverlay, OverlayVoiceBubble overlayVoiceBubble) {
                super(1);
                this.$isMoving = z10;
                this.this$0 = mobileVoiceOverlay;
                this.$voiceBubble = overlayVoiceBubble;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(OverlayTrashWrap overlayTrashWrap) {
                invoke2(overlayTrashWrap);
                return Unit.f20663a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(OverlayTrashWrap trashWrap) {
                q.g(trashWrap, "trashWrap");
                if (this.$isMoving) {
                    trashWrap.show();
                    return;
                }
                trashWrap.hide();
                this.this$0.floatBubbleToHorizontalEdge(this.$voiceBubble);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(MobileVoiceOverlay mobileVoiceOverlay, OverlayVoiceBubble overlayVoiceBubble) {
            super(1);
            this.this$0 = mobileVoiceOverlay;
            this.$voiceBubble = overlayVoiceBubble;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.f20663a;
        }

        public final void invoke(boolean z10) {
            this.this$0.trashWrapProvider.withView(new AnonymousClass1(z10, this.this$0, this.$voiceBubble));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobileVoiceOverlay$voiceBubbleProvider$1(MobileVoiceOverlay mobileVoiceOverlay) {
        super(1);
        this.this$0 = mobileVoiceOverlay;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$2(OverlayVoiceBubble voiceBubble, MobileVoiceOverlay this$0, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i10;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        int i11;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        int i12;
        int i13;
        q.g(voiceBubble, "$voiceBubble");
        q.g(this$0, "this$0");
        SimpleDraweeView imageView$mobile_voice_overlay_release = voiceBubble.getImageView$mobile_voice_overlay_release();
        q.e(imageView$mobile_voice_overlay_release, "null cannot be cast to non-null type android.view.View");
        ViewGroup.LayoutParams layoutParams = imageView$mobile_voice_overlay_release.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = null;
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            i10 = marginLayoutParams.leftMargin;
        } else {
            i10 = 0;
        }
        ViewGroup.LayoutParams layoutParams2 = imageView$mobile_voice_overlay_release.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        } else {
            marginLayoutParams2 = null;
        }
        if (marginLayoutParams2 != null) {
            i11 = marginLayoutParams2.topMargin;
        } else {
            i11 = 0;
        }
        ViewGroup.LayoutParams layoutParams3 = imageView$mobile_voice_overlay_release.getLayoutParams();
        if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
        } else {
            marginLayoutParams3 = null;
        }
        if (marginLayoutParams3 != null) {
            i12 = marginLayoutParams3.rightMargin;
        } else {
            i12 = 0;
        }
        ViewGroup.LayoutParams layoutParams4 = imageView$mobile_voice_overlay_release.getLayoutParams();
        if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
        }
        if (marginLayoutParams4 != null) {
            i13 = marginLayoutParams4.bottomMargin;
        } else {
            i13 = 0;
        }
        this$0.menuDialogProvider.withView(new MobileVoiceOverlay$voiceBubbleProvider$1$1$1(voiceBubble, new Rect(i10, i11, i12, i13)));
        voiceBubble.setBubbleTouchable(false);
    }

    public final OverlayVoiceBubble invoke(OverlayViewProvider<OverlayVoiceBubble> it) {
        ReactApplicationContext reactApplicationContext;
        ReactApplicationContext reactApplicationContext2;
        q.g(it, "it");
        reactApplicationContext = this.this$0.context;
        int dimensionPixelOffset = reactApplicationContext.getResources().getDimensionPixelOffset(R.dimen.overlay_safe_margin);
        reactApplicationContext2 = this.this$0.context;
        final OverlayVoiceBubble overlayVoiceBubble = new OverlayVoiceBubble(reactApplicationContext2);
        int i10 = -dimensionPixelOffset;
        overlayVoiceBubble.getInsetMargins().set(i10, dimensionPixelOffset, i10, dimensionPixelOffset);
        final MobileVoiceOverlay mobileVoiceOverlay = this.this$0;
        overlayVoiceBubble.setOnClickListener(new View.OnClickListener() { // from class: com.discord.mobile_voice_overlay.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MobileVoiceOverlay$voiceBubbleProvider$1.invoke$lambda$2(OverlayVoiceBubble.this, mobileVoiceOverlay, view);
            }
        });
        overlayVoiceBubble.setTouchDispatchSideEffectHandler$mobile_voice_overlay_release(new AnonymousClass2(this.this$0, overlayVoiceBubble));
        overlayVoiceBubble.setOnMovingStateChanged(new AnonymousClass3(this.this$0, overlayVoiceBubble));
        return overlayVoiceBubble;
    }
}
