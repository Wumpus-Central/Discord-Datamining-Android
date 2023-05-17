package com.discord.image.fresco;

import android.content.Context;
import com.discord.image.fresco.config.FrescoConfigKt;
import com.discord.image.fresco.config.FrescoMemoryTrimmer;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.fresco.FrescoModule;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import l4.c;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \n2\u00020\u0001:\u0001\nB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0002¨\u0006\u000b"}, d2 = {"Lcom/discord/image/fresco/FrescoModuleDiscord;", "Lcom/facebook/react/modules/fresco/FrescoModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "canOverrideExistingModule", "", "initialize", "", "initializeSkinny", "Companion", "fresco_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FrescoModuleDiscord extends FrescoModule {
    public static final Companion Companion = new Companion(null);
    private static boolean isFrescoExternallyInitialized;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\b\u0010\t\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/discord/image/fresco/FrescoModuleDiscord$Companion;", "", "()V", "isFrescoExternallyInitialized", "", "initializeFresco", "", "context", "Landroid/content/Context;", "isFrescoInitialized", "fresco_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final synchronized boolean isFrescoInitialized() {
            boolean z10;
            if (!FrescoModuleDiscord.isFrescoExternallyInitialized) {
                if (!FrescoModule.hasBeenInitialized()) {
                    z10 = false;
                }
            }
            z10 = true;
            return z10;
        }

        public final synchronized void initializeFresco(Context context) {
            q.g(context, "context");
            if (!isFrescoInitialized()) {
                FrescoModuleDiscord.isFrescoExternallyInitialized = true;
                c.c(context, FrescoConfigKt.frescoConfig(context));
                FrescoMemoryTrimmer.INSTANCE.initialize(context);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrescoModuleDiscord(ReactApplicationContext reactContext) {
        super(reactContext);
        q.g(reactContext, "reactContext");
    }

    private final void initializeSkinny() {
        getReactApplicationContext().addLifecycleEventListener(this);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public boolean canOverrideExistingModule() {
        return true;
    }

    @Override // com.facebook.react.modules.fresco.FrescoModule, com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        Companion companion = Companion;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        q.f(reactApplicationContext, "reactApplicationContext");
        companion.initializeFresco(reactApplicationContext);
        initializeSkinny();
    }
}
