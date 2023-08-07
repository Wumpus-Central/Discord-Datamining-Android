package com.discord.turbomodules;

import com.facebook.jni.HybridData;
import com.facebook.react.ReactPackage;
import com.facebook.react.ReactPackageTurboModuleManagerDelegate;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.soloader.SoLoader;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0002\f\rB\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\b\u001a\u0004\u0018\u00010\tH\u0094 J\b\u0010\n\u001a\u00020\u000bH\u0014¨\u0006\u000e"}, d2 = {"Lcom/discord/turbomodules/DiscordTurboModuleManagerDelegate;", "Lcom/facebook/react/ReactPackageTurboModuleManagerDelegate;", "reactApplicationContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "packages", "", "Lcom/facebook/react/ReactPackage;", "(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/util/List;)V", "initHybrid", "Lcom/facebook/jni/HybridData;", "maybeLoadOtherSoLibraries", "", "Builder", "Companion", "app_canaryRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class DiscordTurboModuleManagerDelegate extends ReactPackageTurboModuleManagerDelegate {
    public static final Companion Companion = new Companion(null);
    private static volatile boolean isSoLibraryLoaded;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0014¨\u0006\n"}, d2 = {"Lcom/discord/turbomodules/DiscordTurboModuleManagerDelegate$Builder;", "Lcom/facebook/react/ReactPackageTurboModuleManagerDelegate$Builder;", "()V", "build", "Lcom/discord/turbomodules/DiscordTurboModuleManagerDelegate;", "context", "Lcom/facebook/react/bridge/ReactApplicationContext;", "packages", "", "Lcom/facebook/react/ReactPackage;", "app_canaryRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Builder extends ReactPackageTurboModuleManagerDelegate.Builder {
        
        @Override 
        public DiscordTurboModuleManagerDelegate build(ReactApplicationContext context, List<? extends ReactPackage> packages) {
            q.h(context, "context");
            q.h(packages, "packages");
            return new DiscordTurboModuleManagerDelegate(context, packages);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/discord/turbomodules/DiscordTurboModuleManagerDelegate$Companion;", "", "()V", "isSoLibraryLoaded", "", "app_canaryRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    
    public DiscordTurboModuleManagerDelegate(ReactApplicationContext reactApplicationContext, List<? extends ReactPackage> packages) {
        super(reactApplicationContext, packages);
        q.h(reactApplicationContext, "reactApplicationContext");
        q.h(packages, "packages");
    }

    @Override 
    protected native HybridData initHybrid();

    @Override 
    protected synchronized void maybeLoadOtherSoLibraries() {
        if (!isSoLibraryLoaded) {
            SoLoader.r("discord_appmodules");
            isSoLibraryLoaded = true;
        }
    }
}
