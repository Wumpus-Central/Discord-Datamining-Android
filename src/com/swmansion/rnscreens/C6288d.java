package com.swmansion.rnscreens;

import android.content.Context;
import androidx.appcompat.widget.Toolbar;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, m15073d2 = {"Lcom/swmansion/rnscreens/d;", "Landroidx/appcompat/widget/Toolbar;", "Lcom/swmansion/rnscreens/u;", "e0", "Lcom/swmansion/rnscreens/u;", "getConfig", "()Lcom/swmansion/rnscreens/u;", "config", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Lcom/swmansion/rnscreens/u;)V", "react-native-screens_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: com.swmansion.rnscreens.d */
/* loaded from: classes8.dex */
public class C6288d extends Toolbar {

    /* renamed from: e0 */
    private final C6336u f12736e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6288d(Context context, C6336u config) {
        super(context);
        C9971q.m14633g(context, "context");
        C9971q.m14633g(config, "config");
        this.f12736e0 = config;
    }

    public final C6336u getConfig() {
        return this.f12736e0;
    }
}
