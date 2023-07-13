package com.discord.permissions;

import com.discord.permissions.NativePermissionStatus;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)

 class NativePermissionManagerModule$Companion$transformRequestResult$1 extends n implements Function1<Object, Serializable> {
    
    public NativePermissionManagerModule$Companion$transformRequestResult$1(Object obj) {
        super(1, obj, NativePermissionStatus.Companion.class, "fromAndroidPermissionStatus", "fromAndroidPermissionStatus(Ljava/lang/Object;)Ljava/io/Serializable;", 0);
    }

    
    @Override 
    public final Serializable invoke(Object obj) {
        return ((NativePermissionStatus.Companion) this.receiver).fromAndroidPermissionStatus(obj);
    }
}
