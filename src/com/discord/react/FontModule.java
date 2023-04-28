package com.discord.react;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.jakewharton.processphoenix.ProcessPhoenix;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;

@Metadata(m15074d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m15073d2 = {"Lcom/discord/react/FontModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getFontScale", "", "callback", "Lcom/facebook/react/bridge/Callback;", "getName", "", "setFontScale", "fontScale", "", "isClassicChatFontScaleEnabled", "", "fonts_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
public final class FontModule extends ReactContextBaseJavaModule {
    private final ReactApplicationContext reactContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontModule(ReactApplicationContext reactContext) {
        super(reactContext);
        C9677q.m14633g(reactContext, "reactContext");
        this.reactContext = reactContext;
    }

    @ReactMethod
    public final void getFontScale(Callback callback) {
        C9677q.m14633g(callback, "callback");
        FontManager fontManager = FontManager.INSTANCE;
        callback.invoke(Float.valueOf(fontManager.getFontScale(this.reactContext)), Boolean.valueOf(fontManager.getIsClassicChatFontScaleEnabled(this.reactContext)));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "FontModule";
    }

    @ReactMethod
    public final void setFontScale(double d, boolean z) {
        FontManager.INSTANCE.setFontSize(this.reactContext, (float) d, z);
        ProcessPhoenix.m26499b(this.reactContext);
    }
}
