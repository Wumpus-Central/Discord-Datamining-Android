package com.discord.sticker_picker.react;

import com.discord.reactevents.ReactEvents;
import com.discord.sticker_picker.StickerPickerRowView;
import com.discord.sticker_picker.react_events.OnLongPressStickerEvent;
import com.discord.sticker_picker.react_events.OnPressStickerEvent;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import java.util.Map;
import jg.x;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0014J\u0014\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u0018\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0013H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/discord/sticker_picker/react/StickerPickerRowViewManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/discord/sticker_picker/StickerPickerRowView;", "()V", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getExportedCustomDirectEventTypeConstants", "", "", "", "getName", "onDropViewInstance", "", "view", "setRowData", "data", "Lcom/facebook/react/bridge/ReadableMap;", "sticker_picker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StickerPickerRowViewManager extends SimpleViewManager<StickerPickerRowView> {
    private final ReactEvents reactEvents = new ReactEvents(x.a("onPressSticker", f0.b(OnPressStickerEvent.class)), x.a("onLongPressSticker", f0.b(OnLongPressStickerEvent.class)));

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return this.reactEvents.exportEventConstants();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "StickerPickerRowView";
    }

    @ReactProp(name = "rowData")
    public final void setRowData(StickerPickerRowView view, ReadableMap data) {
        q.g(view, "view");
        q.g(data, "data");
        view.setRowData(StickerPickerRowDataSerializationUtilsKt.deserializeStickerPickerRowData(data));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public StickerPickerRowView createViewInstance(ThemedReactContext reactContext) {
        q.g(reactContext, "reactContext");
        StickerPickerRowView stickerPickerRowView = new StickerPickerRowView(reactContext);
        stickerPickerRowView.setOnPressSticker(new StickerPickerRowViewManager$createViewInstance$1$1(this, stickerPickerRowView));
        stickerPickerRowView.setOnLongPressSticker(new StickerPickerRowViewManager$createViewInstance$1$2(this, stickerPickerRowView));
        return stickerPickerRowView;
    }

    public void onDropViewInstance(StickerPickerRowView view) {
        q.g(view, "view");
        super.onDropViewInstance((StickerPickerRowViewManager) view);
        view.clean();
    }
}
