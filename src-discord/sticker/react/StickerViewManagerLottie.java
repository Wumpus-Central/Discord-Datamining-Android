package com.discord.sticker.react;

import com.discord.sticker.StickerView;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\"\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016¨\u0006\u0012"}, d2 = {"Lcom/discord/sticker/react/StickerViewManagerLottie;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/discord/sticker/StickerView;", "()V", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getName", "", "onDropViewInstance", "", "view", "receiveCommand", "node", "commandId", "args", "Lcom/facebook/react/bridge/ReadableArray;", "Companion", "sticker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StickerViewManagerLottie extends SimpleViewManager<StickerView> {
    public static final Companion Companion = new Companion(null);
    private static final String SETUP_COMMAND_ID = "setup";

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/discord/sticker/react/StickerViewManagerLottie$Companion;", "", "()V", "SETUP_COMMAND_ID", "", "sticker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "NativeLottieNode";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public StickerView createViewInstance(ThemedReactContext reactContext) {
        q.g(reactContext, "reactContext");
        StickerView stickerView = new StickerView(reactContext, null, 0, 6, null);
        stickerView.inflateLottieView();
        return stickerView;
    }

    public void onDropViewInstance(StickerView view) {
        q.g(view, "view");
        super.onDropViewInstance((StickerViewManagerLottie) view);
        view.recycle();
    }

    public void receiveCommand(StickerView node, String commandId, ReadableArray readableArray) {
        q.g(node, "node");
        q.g(commandId, "commandId");
        if (q.b(commandId, SETUP_COMMAND_ID) && readableArray != null) {
            String string = readableArray.getString(0);
            String string2 = readableArray.getString(1);
            int i10 = readableArray.getInt(2);
            int i11 = readableArray.getInt(3);
            int i12 = readableArray.getInt(4);
            boolean z10 = readableArray.getBoolean(5);
            q.f(string2, "getString(1)");
            q.f(string, "getString(0)");
            node.asLottie(string2, i10, i11, z10, string, i12);
        }
    }
}
