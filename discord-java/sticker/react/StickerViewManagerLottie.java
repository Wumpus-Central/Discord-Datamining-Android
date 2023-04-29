package com.discord.sticker.react;

import com.discord.sticker.StickerView;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import nf.x;
import of.u;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\u0014\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0016J\b\u0010\u000b\u001a\u00020\tH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J\"\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016¨\u0006\u0015"}, d2 = {"Lcom/discord/sticker/react/StickerViewManagerLottie;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/discord/sticker/StickerView;", "()V", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getCommandsMap", "", "", "", "getName", "onDropViewInstance", "", "view", "receiveCommand", "node", "commandId", "args", "Lcom/facebook/react/bridge/ReadableArray;", "Companion", "sticker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StickerViewManagerLottie extends SimpleViewManager<StickerView> {
    public static final Companion Companion = new Companion(null);
    private static final int SETUP_COMMAND_INDEX = 1;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/discord/sticker/react/StickerViewManagerLottie$Companion;", "", "()V", "SETUP_COMMAND_INDEX", "", "sticker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        Map<String, Integer> e10;
        e10 = u.e(x.a("setup", 1));
        return e10;
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

    public void receiveCommand(StickerView node, int i10, ReadableArray readableArray) {
        q.g(node, "node");
        if (i10 == 1 && readableArray != null) {
            String string = readableArray.getString(0);
            String string2 = readableArray.getString(1);
            int i11 = readableArray.getInt(2);
            int i12 = readableArray.getInt(3);
            int i13 = readableArray.getInt(4);
            boolean z10 = readableArray.getBoolean(5);
            q.f(string2, "getString(1)");
            q.f(string, "getString(0)");
            node.asLottie(string2, i11, i12, z10, string, i13);
        }
    }
}
