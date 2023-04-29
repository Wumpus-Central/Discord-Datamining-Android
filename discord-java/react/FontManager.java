package com.discord.react;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.w;
import kotlin.properties.ReadWriteProperty;
import kotlin.properties.a;
import kotlin.reflect.KProperty;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u0011J\"\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u0013J\u0014\u0010\u001a\u001a\n \u001c*\u0004\u0018\u00010\u001b0\u001b*\u00020\u0011H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R+\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/discord/react/FontManager;", "", "()V", FontManager.FONT_SCALE_CHAT_CLASSIC_KEY, "", FontManager.FONT_SCALE_KEY, "<set-?>", "", "initialFontSize", "getInitialFontSize", "()F", "setInitialFontSize", "(F)V", "initialFontSize$delegate", "Lkotlin/properties/ReadWriteProperty;", "getFontScale", "context", "Landroid/content/Context;", "getIsClassicChatFontScaleEnabled", "", "getScaledFontSize", "init", "", "setFontSize", "fontScale", "isClassicChatFontScaleEnabled", "getCache", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "fonts_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FontManager {
    private static final String FONT_SCALE_CHAT_CLASSIC_KEY = "FONT_SCALE_CHAT_CLASSIC_KEY";
    private static final String FONT_SCALE_KEY = "FONT_SCALE_KEY";
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {f0.e(new w(FontManager.class, "initialFontSize", "getInitialFontSize()F", 0))};
    public static final FontManager INSTANCE = new FontManager();
    private static final ReadWriteProperty initialFontSize$delegate = a.f22090a.a();

    private FontManager() {
    }

    private final SharedPreferences getCache(Context context) {
        return context.getSharedPreferences("FontScaleManager", 0);
    }

    private final float getInitialFontSize() {
        return ((Number) initialFontSize$delegate.getValue(this, $$delegatedProperties[0])).floatValue();
    }

    public static /* synthetic */ void setFontSize$default(FontManager fontManager, Context context, float f10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = fontManager.getFontScale(context);
        }
        if ((i10 & 4) != 0) {
            z10 = fontManager.getIsClassicChatFontScaleEnabled(context);
        }
        fontManager.setFontSize(context, f10, z10);
    }

    private final void setInitialFontSize(float f10) {
        initialFontSize$delegate.setValue(this, $$delegatedProperties[0], Float.valueOf(f10));
    }

    public final synchronized float getFontScale(Context context) {
        q.g(context, "context");
        return getCache(context).getFloat(FONT_SCALE_KEY, 1.0f);
    }

    public final synchronized boolean getIsClassicChatFontScaleEnabled(Context context) {
        q.g(context, "context");
        if (!getCache(context).contains(FONT_SCALE_CHAT_CLASSIC_KEY)) {
            SharedPreferences cache = getCache(context);
            q.f(cache, "context.getCache()");
            SharedPreferences.Editor editor = cache.edit();
            q.f(editor, "editor");
            editor.putBoolean(FONT_SCALE_CHAT_CLASSIC_KEY, true);
            editor.apply();
        }
        return getCache(context).getBoolean(FONT_SCALE_CHAT_CLASSIC_KEY, true);
    }

    public final synchronized float getScaledFontSize(Context context) {
        q.g(context, "context");
        return getInitialFontSize() * getFontScale(context);
    }

    public final void init(Context context) {
        q.g(context, "context");
        setInitialFontSize(context.getResources().getConfiguration().fontScale);
    }

    public final synchronized void setFontSize(Context context, float f10, boolean z10) {
        q.g(context, "context");
        SharedPreferences cache = getCache(context);
        q.f(cache, "context.getCache()");
        SharedPreferences.Editor editor = cache.edit();
        q.f(editor, "editor");
        editor.putFloat(FONT_SCALE_KEY, f10);
        editor.putBoolean(FONT_SCALE_CHAT_CLASSIC_KEY, z10);
        editor.commit();
    }
}
