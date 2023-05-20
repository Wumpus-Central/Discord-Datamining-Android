package com.discord.modules.keycommands;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.views.view.ReactViewGroup;
import java.util.Map;
import jg.x;
import kg.v;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \n2\u00020\u0001:\u0002\n\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016¨\u0006\f"}, d2 = {"Lcom/discord/modules/keycommands/KeyCommandsViewManagerModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getConstants", "", "", "", "getName", "Companion", KeyCommandsViewManagerModule.MODULE_NAME, "app_canaryRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class KeyCommandsViewManagerModule extends ReactContextBaseJavaModule {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String MODULE_NAME = "KeyCommandsView";

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/discord/modules/keycommands/KeyCommandsViewManagerModule$Companion;", "", "()V", "MODULE_NAME", "", "app_canaryRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/discord/modules/keycommands/KeyCommandsViewManagerModule$KeyCommandsView;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/facebook/react/views/view/ReactViewGroup;", "()V", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getName", "", "app_canaryRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class KeyCommandsView extends ViewGroupManager<ReactViewGroup> {
        @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
        public String getName() {
            return KeyCommandsViewManagerModule.MODULE_NAME;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.uimanager.ViewManager
        public ReactViewGroup createViewInstance(ThemedReactContext reactContext) {
            q.g(reactContext, "reactContext");
            return new ReactViewGroup(reactContext);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyCommandsViewManagerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        q.g(reactContext, "reactContext");
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        Map<String, Object> l10;
        l10 = v.l(x.a("keyModifierAlphaShift", 65536), x.a("keyModifierShift", 131072), x.a("keyModifierControl", 262144), x.a("keyModifierAlternate", 524288), x.a("keyModifierCommand", 1048576), x.a("keyModifierNumericPad", 2097152));
        return l10;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return MODULE_NAME;
    }
}
