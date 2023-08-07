package com.discord.main;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.discord.external_pip.ExternalPipModule;
import com.discord.foreground_service.ForegroundServiceManager;
import com.discord.notifications.client.NotificationClient;
import com.discord.react_activities.ReactActivity;
import com.facebook.react.bridge.ReactContext;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0003J\f\u0010\u0005\u001a\u00060\u0006R\u00020\u0001H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0014¨\u0006\u0010"}, d2 = {"Lcom/discord/main/MainActivity;", "Lcom/discord/react_activities/ReactActivity;", "()V", "currentReactContext", "Lcom/facebook/react/bridge/ReactContext;", "getActivityDelegate", "Lcom/discord/react_activities/ReactActivity$ActivityDelegate;", "getNameOfComponent", "", "onPictureInPictureModeChanged", "", "isInPictureInPictureMode", "", "newConfig", "Landroid/content/res/Configuration;", "onUserLeaveHint", "main_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class MainActivity extends ReactActivity {
    @SuppressLint({"VisibleForTests"})
    private final ReactContext currentReactContext() {
        return getReactInstanceManager().getCurrentReactContext();
    }

    @Override 
    public ReactActivity.ActivityDelegate getActivityDelegate() {
        return new ReactActivity.ActivityDelegate() { 
            
            {
                super(MainActivity.this, MainActivity.this);
            }

            private final void parseIntent(Intent intent) {
                NotificationClient instance = NotificationClient.Companion.getInstance();
                Context context = getContext();
                q.g(context, "context");
                instance.handleIntent(context, intent);
                ForegroundServiceManager instance2 = ForegroundServiceManager.Companion.getInstance();
                Context context2 = getContext();
                q.g(context2, "context");
                instance2.handleIntent(context2, intent);
            }

            
            @Override 
            public void onCreate(Bundle bundle) {
                super.onCreate(bundle);
                Intent intent = MainActivity.this.getIntent();
                q.g(intent, "intent");
                parseIntent(intent);
            }

            @Override 
            public boolean onNewIntent(Intent intent) {
                q.h(intent, "intent");
                parseIntent(intent);
                return super.onNewIntent(intent);
            }
        };
    }

    @Override 
    public String getNameOfComponent() {
        return BuildConfig.MAIN_COMPONENT;
    }

    @Override 
    public void onPictureInPictureModeChanged(boolean z10, Configuration configuration) {
        super.onPictureInPictureModeChanged(z10, configuration);
        ExternalPipModule.Companion.onPipModeChanged(currentReactContext(), z10);
    }

    @Override 
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        ExternalPipModule.Companion.onUserLeaveHint(currentReactContext());
    }
}
