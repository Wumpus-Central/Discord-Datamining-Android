package com.discord.theme;

import android.app.Activity;
import com.discord.codegen.NativeThemeManagerSpec;
import com.discord.theme.utils.ActivityThemeUtils;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \n2\u00020\u0001:\u0001\nB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u000b"}, d2 = {"Lcom/discord/theme/ThemeModule;", "Lcom/discord/codegen/NativeThemeManagerSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "updateTheme", "", "theme", "Companion", "theme_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class ThemeModule extends NativeThemeManagerSpec {
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "RTNThemeManager";

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/discord/theme/ThemeModule$Companion;", "", "()V", "NAME", "", "create", "Lcom/facebook/react/bridge/NativeModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "theme_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final NativeModule create(ReactApplicationContext reactContext) {
            q.h(reactContext, "reactContext");
            return new ThemeModule(reactContext);
        }
    }

    
    public ThemeModule(ReactApplicationContext reactContext) {
        super(reactContext);
        q.h(reactContext, "reactContext");
        ThemeManager.INSTANCE.init(reactContext);
    }

    
    public static final void updateTheme$lambda$0(ThemeModule this$0) {
        q.h(this$0, "this$0");
        Activity currentActivity = this$0.getCurrentActivity();
        if (currentActivity != null) {
            ActivityThemeUtils.INSTANCE.updateActivityTheming$theme_release(currentActivity);
        }
    }

    @Override 
    public String getName() {
        return "RTNThemeManager";
    }

    
    
    
    @Override 
    
    public void updateTheme(java.lang.String r4) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.theme.ThemeModule.updateTheme(java.lang.String):void");
    }
}
