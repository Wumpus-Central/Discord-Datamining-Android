package com.discord.mobile_voice_overlay;

import android.content.Context;
import android.os.Bundle;
import com.discord.misc.utilities.threading.ThreadUtilsKt;
import com.discord.mobile_voice_overlay.utils.OverlayViewProvider;
import com.discord.mobile_voice_overlay.utils.WindowUtils;
import com.discord.mobile_voice_overlay.views.OverlayBubbleWrap;
import com.discord.mobile_voice_overlay.views.OverlayMenuBubbleDialog;
import com.discord.mobile_voice_overlay.views.OverlayTrashWrap;
import com.discord.mobile_voice_overlay.views.OverlayVoiceBubble;
import com.discord.mobile_voice_overlay.views.OverlayVoiceSelectorBubbleDialog;
import com.discord.react.headless_tasks.api.HeadlessTasks;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.uimanager.ViewDefaults;
import com.facebook.react.util.JSStackTrace;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 $2\u00020\u0001:\u0001$B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\r\u0010\u0013\u001a\u00020\u000fH\u0001¢\u0006\u0002\b\u0014J\u001c\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u000fH\u0002J\u0015\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001eH\u0001¢\u0006\u0002\b\u001fJ\u0015\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\"H\u0001¢\u0006\u0002\b#R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;", "", "context", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "menuDialogProvider", "Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;", "Lcom/discord/mobile_voice_overlay/views/OverlayMenuBubbleDialog;", "selectorDialogProvider", "Lcom/discord/mobile_voice_overlay/views/OverlayVoiceSelectorBubbleDialog;", "trashWrapProvider", "Lcom/discord/mobile_voice_overlay/views/OverlayTrashWrap;", "voiceBubbleProvider", "Lcom/discord/mobile_voice_overlay/views/OverlayVoiceBubble;", "closeMenuDialog", "", "floatBubbleToHorizontalEdge", "bubble", "Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;", "hideOverlay", "hideOverlay$mobile_voice_overlay_release", "invokeJs", JSStackTrace.METHOD_NAME_KEY, "", "query", "isOverlayShowing", "", "onTrashVoiceBubble", "setData", "data", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;", "setData$mobile_voice_overlay_release", "showOverlay", "assets", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayAssets;", "showOverlay$mobile_voice_overlay_release", "Companion", "mobile_voice_overlay_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class MobileVoiceOverlay {
    private static final String ANCHOR_TAG = "Active Voice Bubble";
    public static final Companion Companion = new Companion(null);
    private static final String JS_INTERFACE_NAME = "MobileVoiceOverlayManager";
    private final ReactApplicationContext context;
    private final OverlayViewProvider<OverlayVoiceBubble> voiceBubbleProvider = new OverlayViewProvider<>(new MobileVoiceOverlay$voiceBubbleProvider$1(this));
    private final OverlayViewProvider<OverlayTrashWrap> trashWrapProvider = new OverlayViewProvider<>(new MobileVoiceOverlay$trashWrapProvider$1(this));
    private final OverlayViewProvider<OverlayMenuBubbleDialog> menuDialogProvider = new OverlayViewProvider<>(new MobileVoiceOverlay$menuDialogProvider$1(this));
    private final OverlayViewProvider<OverlayVoiceSelectorBubbleDialog> selectorDialogProvider = new OverlayViewProvider<>(new MobileVoiceOverlay$selectorDialogProvider$1(this));

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$Companion;", "", "()V", "ANCHOR_TAG", "", "JS_INTERFACE_NAME", "startHeadlessTask", "", "context", "Landroid/content/Context;", "taskName", "taskParams", "Landroid/os/Bundle;", "mobile_voice_overlay_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static  void startHeadlessTask$default(Companion companion, Context context, String str, Bundle EMPTY, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                EMPTY = Bundle.EMPTY;
                q.g(EMPTY, "EMPTY");
            }
            companion.startHeadlessTask(context, str, EMPTY);
        }

        public final void startHeadlessTask(Context context, String taskName, Bundle taskParams) {
            q.h(context, "context");
            q.h(taskName, "taskName");
            q.h(taskParams, "taskParams");
            HeadlessTasks.Companion.startHeadlessTask$default(HeadlessTasks.Companion, context, taskName, 0L, false, taskParams, false, 12, null);
        }
    }

    public MobileVoiceOverlay(ReactApplicationContext context) {
        q.h(context, "context");
        this.context = context;
    }

    
    public final void closeMenuDialog() {
        this.menuDialogProvider.removeViewFromOverlay();
    }

    
    public final void floatBubbleToHorizontalEdge(OverlayBubbleWrap overlayBubbleWrap) {
        if (overlayBubbleWrap.getCenterX() > WindowUtils.INSTANCE.getScreenSize(this.context).centerX()) {
            OverlayBubbleWrap.animateToCoordinate$default(overlayBubbleWrap, ViewDefaults.NUMBER_OF_LINES, (int) overlayBubbleWrap.getY(), null, 4, null);
        } else {
            OverlayBubbleWrap.animateToCoordinate$default(overlayBubbleWrap, Integer.MIN_VALUE, (int) overlayBubbleWrap.getY(), null, 4, null);
        }
    }

    
    public final void invokeJs(String str, String str2) {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        if (str2 != null) {
            writableNativeArray.pushString(str2);
        }
        CatalystInstance catalystInstance = this.context.getCatalystInstance();
        if (catalystInstance != null) {
            if (!(!catalystInstance.isDestroyed())) {
                catalystInstance = null;
            }
            if (catalystInstance != null) {
                catalystInstance.callFunction(JS_INTERFACE_NAME, str, writableNativeArray);
            }
        }
    }

    
    public static  void invokeJs$default(MobileVoiceOverlay mobileVoiceOverlay, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        mobileVoiceOverlay.invokeJs(str, str2);
    }

    
    public final boolean isOverlayShowing() {
        return this.trashWrapProvider.isInOverlay() && this.voiceBubbleProvider.isInOverlay();
    }

    
    public final void onTrashVoiceBubble() {
        this.voiceBubbleProvider.withView(new MobileVoiceOverlay$onTrashVoiceBubble$1(this));
    }

    public final void hideOverlay$mobile_voice_overlay_release() {
        if (ThreadUtilsKt.isOnMainThread()) {
            this.selectorDialogProvider.removeViewFromOverlay();
            this.menuDialogProvider.removeViewFromOverlay();
            this.voiceBubbleProvider.removeViewFromOverlay();
            this.trashWrapProvider.removeViewFromOverlay();
            return;
        }
        Thread currentThread = Thread.currentThread();
        throw new IllegalStateException(("Expected to be on android main thread. Current: " + currentThread).toString());
    }

    public final void setData$mobile_voice_overlay_release(MobileVoiceOverlayData data) {
        q.h(data, "data");
        if (ThreadUtilsKt.isOnMainThread()) {
            this.voiceBubbleProvider.setData(data);
            this.menuDialogProvider.setData(data);
            this.selectorDialogProvider.setData(data);
            this.trashWrapProvider.setData(data);
            return;
        }
        Thread currentThread = Thread.currentThread();
        throw new IllegalStateException(("Expected to be on android main thread. Current: " + currentThread).toString());
    }

    public final void showOverlay$mobile_voice_overlay_release(MobileVoiceOverlayAssets assets) {
        q.h(assets, "assets");
        if (ThreadUtilsKt.isOnMainThread()) {
            this.selectorDialogProvider.setAssets(assets);
            this.menuDialogProvider.setAssets(assets);
            this.voiceBubbleProvider.setAssets(assets);
            this.trashWrapProvider.setAssets(assets);
            if (!isOverlayShowing()) {
                this.voiceBubbleProvider.withView(new MobileVoiceOverlay$showOverlay$1$1(this));
                return;
            }
            return;
        }
        Thread currentThread = Thread.currentThread();
        throw new IllegalStateException(("Expected to be on android main thread. Current: " + currentThread).toString());
    }
}
