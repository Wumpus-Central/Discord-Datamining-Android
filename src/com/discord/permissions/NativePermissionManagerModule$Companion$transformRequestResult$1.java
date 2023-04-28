package com.discord.permissions;

import com.discord.permissions.NativePermissionStatus;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9968n;

@Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class NativePermissionManagerModule$Companion$transformRequestResult$1 extends C9968n implements Function1<Object, Serializable> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public NativePermissionManagerModule$Companion$transformRequestResult$1(Object obj) {
        super(1, obj, NativePermissionStatus.Companion.class, "fromAndroidPermissionStatus", "fromAndroidPermissionStatus(Ljava/lang/Object;)Ljava/io/Serializable;", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function1
    public final Serializable invoke(Object obj) {
        return ((NativePermissionStatus.Companion) this.receiver).fromAndroidPermissionStatus(obj);
    }
}
