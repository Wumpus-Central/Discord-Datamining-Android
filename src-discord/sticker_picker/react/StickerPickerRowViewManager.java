package com.discord.sticker_picker.react;

import com.discord.reactevents.ReactEvents;
import com.discord.sticker_picker.StickerPickerRowView;
import com.discord.sticker_picker.react_events.OnLongPressStickerEvent;
import com.discord.sticker_picker.react_events.OnPressStickerEvent;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.StickerPickerRowViewManagerDelegate;
import com.facebook.react.viewmanagers.StickerPickerRowViewManagerInterface;
import gf.x;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.q;

@ReactModule(name = StickerPickerRowViewManager.NAME)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0014J$\u0010\r\u001a\u001e\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00000\u00000\u0006H\u0014J\u0014\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0010H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0002H\u0016J\u001a\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0017R*\u0010\u0005\u001a\u001e\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00000\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/discord/sticker_picker/react/StickerPickerRowViewManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/discord/sticker_picker/StickerPickerRowView;", "Lcom/facebook/react/viewmanagers/StickerPickerRowViewManagerInterface;", "()V", "delegate", "Lcom/facebook/react/viewmanagers/StickerPickerRowViewManagerDelegate;", "kotlin.jvm.PlatformType", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getDelegate", "getExportedCustomDirectEventTypeConstants", "", "", "", "getName", "onDropViewInstance", "", "view", "setRowData", "value", "Lcom/facebook/react/bridge/ReadableMap;", "Companion", "sticker_picker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class StickerPickerRowViewManager extends SimpleViewManager<StickerPickerRowView> implements StickerPickerRowViewManagerInterface<StickerPickerRowView> {
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "StickerPickerRowView";
    private final StickerPickerRowViewManagerDelegate<StickerPickerRowView, StickerPickerRowViewManager> delegate = new StickerPickerRowViewManagerDelegate<>(this);
    private final ReactEvents reactEvents = new ReactEvents(x.a("onPressSticker", f0.b(OnPressStickerEvent.class)), x.a("onLongPressSticker", f0.b(OnLongPressStickerEvent.class)));

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/discord/sticker_picker/react/StickerPickerRowViewManager$Companion;", "", "()V", "NAME", "", "sticker_picker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return this.reactEvents.exportEventConstants();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public StickerPickerRowView createViewInstance(ThemedReactContext reactContext) {
        q.g(reactContext, "reactContext");
        StickerPickerRowView stickerPickerRowView = new StickerPickerRowView(reactContext);
        stickerPickerRowView.setOnPressSticker(new StickerPickerRowViewManager$createViewInstance$1$1(this, reactContext, stickerPickerRowView));
        stickerPickerRowView.setOnLongPressSticker(new StickerPickerRowViewManager$createViewInstance$1$2(this, reactContext, stickerPickerRowView));
        return stickerPickerRowView;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public StickerPickerRowViewManagerDelegate<StickerPickerRowView, StickerPickerRowViewManager> getDelegate() {
        return this.delegate;
    }

    public void onDropViewInstance(StickerPickerRowView view) {
        q.g(view, "view");
        super.onDropViewInstance((StickerPickerRowViewManager) view);
        view.clean();
    }

    @ReactProp(name = "rowData")
    public void setRowData(StickerPickerRowView view, ReadableMap readableMap) {
        q.g(view, "view");
        if (readableMap != null) {
            view.setRowData(StickerPickerRowDataSerializationUtilsKt.deserializeStickerPickerRowData(readableMap));
        }
    }
}
