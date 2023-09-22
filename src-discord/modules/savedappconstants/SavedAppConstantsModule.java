package com.discord.modules.savedappconstants;

import android.content.SharedPreferences;
import com.discord.codegen.NativeSavedAppConstantsSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import pf.x;
import qf.v;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0016J\b\u0010\f\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/discord/modules/savedappconstants/SavedAppConstantsModule;", "Lcom/discord/codegen/NativeSavedAppConstantsSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "sharedPrefs", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "getConstants", "", "", "", "getName", "setMaxMessagesExperimentId", "", "experimentId", "", "Companion", "app_canaryRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class SavedAppConstantsModule extends NativeSavedAppConstantsSpec {
    public static final Companion Companion = new Companion(null);
    public static final String MAX_MESSAGES_EXPERIMENT_CONST_KEY = "maxMessagesExperimentId";
    public static final String MAX_MESSAGES_EXPERIMENT_PREFS_KEY = "max_messages_experiment_id";
    public static final String NAME = "RTNSavedAppConstants";
    public static final String SHARED_APP_CONSTANTS_CACHE_STORE_NAME = "shared_app_constants";
    private final SharedPreferences sharedPrefs;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/discord/modules/savedappconstants/SavedAppConstantsModule$Companion;", "", "()V", "MAX_MESSAGES_EXPERIMENT_CONST_KEY", "", "MAX_MESSAGES_EXPERIMENT_PREFS_KEY", "NAME", "SHARED_APP_CONSTANTS_CACHE_STORE_NAME", "create", "Lcom/facebook/react/bridge/NativeModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "app_canaryRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final NativeModule create(ReactApplicationContext reactContext) {
            q.h(reactContext, "reactContext");
            return new SavedAppConstantsModule(reactContext);
        }
    }

    
    public SavedAppConstantsModule(ReactApplicationContext reactContext) {
        super(reactContext);
        q.h(reactContext, "reactContext");
        this.sharedPrefs = reactContext.getSharedPreferences(SHARED_APP_CONSTANTS_CACHE_STORE_NAME, 0);
    }

    @Override 
    public Map<String, Integer> getConstants() {
        Map<String, Integer> l10;
        l10 = v.l(x.a(MAX_MESSAGES_EXPERIMENT_CONST_KEY, Integer.valueOf(this.sharedPrefs.getInt(MAX_MESSAGES_EXPERIMENT_PREFS_KEY, -1))));
        return l10;
    }

    @Override 
    public String getName() {
        return "RTNSavedAppConstants";
    }

    @Override 
    public void setMaxMessagesExperimentId(double d10) {
        SharedPreferences sharedPrefs = this.sharedPrefs;
        q.g(sharedPrefs, "sharedPrefs");
        SharedPreferences.Editor editor = sharedPrefs.edit();
        q.g(editor, "editor");
        editor.putInt(MAX_MESSAGES_EXPERIMENT_PREFS_KEY, (int) d10);
        editor.apply();
    }
}
