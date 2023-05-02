package com.discord.share;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.discord.react_activities.ReactActivity;
import com.discord.share.ShareProps;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001a\u00060\u0004R\u00020\u0001H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/discord/share/ShareActivity;", "Lcom/discord/react_activities/ReactActivity;", "()V", "getActivityDelegate", "Lcom/discord/react_activities/ReactActivity$ActivityDelegate;", "getNameOfComponent", "", "share_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ShareActivity extends ReactActivity {
    @Override // com.discord.react_activities.ReactActivity
    public ReactActivity.ActivityDelegate getActivityDelegate() {
        return new ReactActivity.ActivityDelegate() { // from class: com.discord.share.ShareActivity$getActivityDelegate$1
            private ShareProps shareProps;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(ShareActivity.this, ShareActivity.this);
            }

            @Override // com.facebook.react.ReactActivityDelegate
            protected Bundle getLaunchOptions() {
                ShareProps shareProps = this.shareProps;
                if (shareProps == null) {
                    q.y("shareProps");
                    shareProps = null;
                }
                return shareProps.toBundle();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.facebook.react.ReactActivityDelegate
            public void onCreate(Bundle bundle) {
                ShareProps.Companion companion = ShareProps.Companion;
                Intent intent = ShareActivity.this.getIntent();
                q.f(intent, "intent");
                Context context = getContext();
                q.f(context, "context");
                this.shareProps = companion.createShareProps(intent, context);
                super.onCreate(bundle);
            }
        };
    }

    @Override // com.discord.react_activities.ReactActivity
    public String getNameOfComponent() {
        return BuildConfig.MAIN_COMPONENT;
    }
}
