package com.discord.permissions;

import androidx.core.app.NotificationManagerCompat;
import com.discord.react.utilities.PromiseWrapper;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.permissions.PermissionsModule;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@ReactModule(name = "NativePermissionManager")
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u0017\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u0018\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u0019\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u001a\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u001b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u001c\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007R\u0014\u0010\u0005\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u001e"}, d2 = {"Lcom/discord/permissions/NativePermissionManagerModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "permissionsModule", "Lcom/facebook/react/modules/permissions/PermissionsModule;", "getPermissionsModule", "()Lcom/facebook/react/modules/permissions/PermissionsModule;", "getName", "", "getNotificationAuthorizationStatus", "", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "hasBluetoothAuthorization", "hasCameraAuthorization", "hasContactAuthorization", "hasExternalStorageAuthorization", "hasMicrophoneAuthorization", "hasModifyAudioAuthorization", "hasPhotoAuthorization", "requestBluetoothAuthorization", "requestCameraAuthorization", "requestContactsAuthorization", "requestExternalStorageAuthorization", "requestMicrophoneAuthorization", "requestModifyAudioAuthorization", "requestPhotoAuthorization", "Companion", "permissions_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NativePermissionManagerModule extends ReactContextBaseJavaModule {
    public static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0002J\f\u0010\u0006\u001a\u00020\u0004*\u00020\u0005H\u0002¨\u0006\u0007"}, d2 = {"Lcom/discord/permissions/NativePermissionManagerModule$Companion;", "", "()V", "transformHasAuthorizationResult", "Lcom/discord/react/utilities/PromiseWrapper;", "Lcom/facebook/react/bridge/Promise;", "transformRequestResult", "permissions_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final PromiseWrapper transformHasAuthorizationResult(Promise promise) {
            return new PromiseWrapper(promise, new NativePermissionManagerModule$Companion$transformHasAuthorizationResult$1(NativePermissionStatus.Companion), null, 4, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final PromiseWrapper transformRequestResult(Promise promise) {
            return new PromiseWrapper(promise, new NativePermissionManagerModule$Companion$transformRequestResult$1(NativePermissionStatus.Companion), null, 4, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativePermissionManagerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        q.g(reactContext, "reactContext");
    }

    private final PermissionsModule getPermissionsModule() {
        NativeModule nativeModule = getReactApplicationContext().getNativeModule(PermissionsModule.class);
        q.d(nativeModule);
        return (PermissionsModule) nativeModule;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "NativePermissionManager";
    }

    @ReactMethod
    public final void getNotificationAuthorizationStatus(Promise promise) {
        q.g(promise, "promise");
        if (NotificationManagerCompat.g(getReactApplicationContext()).a()) {
            promise.resolve(2);
        } else {
            promise.resolve(1);
        }
    }

    @ReactMethod
    public final void hasBluetoothAuthorization(Promise promise) {
        q.g(promise, "promise");
        getPermissionsModule().checkPermission("android.permission.BLUETOOTH", Companion.transformHasAuthorizationResult(promise));
    }

    @ReactMethod
    public final void hasCameraAuthorization(Promise promise) {
        q.g(promise, "promise");
        getPermissionsModule().checkPermission("android.permission.CAMERA", Companion.transformHasAuthorizationResult(promise));
    }

    @ReactMethod
    public final void hasContactAuthorization(Promise promise) {
        q.g(promise, "promise");
        getPermissionsModule().checkPermission("android.permission.READ_CONTACTS", Companion.transformHasAuthorizationResult(promise));
    }

    @ReactMethod
    public final void hasExternalStorageAuthorization(Promise promise) {
        q.g(promise, "promise");
        getPermissionsModule().checkPermission("android.permission.WRITE_EXTERNAL_STORAGE", Companion.transformHasAuthorizationResult(promise));
    }

    @ReactMethod
    public final void hasMicrophoneAuthorization(Promise promise) {
        q.g(promise, "promise");
        getPermissionsModule().checkPermission("android.permission.RECORD_AUDIO", Companion.transformHasAuthorizationResult(promise));
    }

    @ReactMethod
    public final void hasModifyAudioAuthorization(Promise promise) {
        q.g(promise, "promise");
        getPermissionsModule().checkPermission("android.permission.MODIFY_AUDIO_SETTINGS", Companion.transformHasAuthorizationResult(promise));
    }

    @ReactMethod
    public final void hasPhotoAuthorization(Promise promise) {
        q.g(promise, "promise");
        getPermissionsModule().checkPermission("android.permission.READ_EXTERNAL_STORAGE", Companion.transformHasAuthorizationResult(promise));
    }

    @ReactMethod
    public final void requestBluetoothAuthorization(Promise promise) {
        q.g(promise, "promise");
        getPermissionsModule().requestPermission("android.permission.BLUETOOTH", Companion.transformRequestResult(promise));
    }

    @ReactMethod
    public final void requestCameraAuthorization(Promise promise) {
        q.g(promise, "promise");
        getPermissionsModule().requestPermission("android.permission.CAMERA", Companion.transformRequestResult(promise));
    }

    @ReactMethod
    public final void requestContactsAuthorization(Promise promise) {
        q.g(promise, "promise");
        getPermissionsModule().requestPermission("android.permission.READ_CONTACTS", Companion.transformRequestResult(promise));
    }

    @ReactMethod
    public final void requestExternalStorageAuthorization(Promise promise) {
        q.g(promise, "promise");
        getPermissionsModule().requestPermission("android.permission.WRITE_EXTERNAL_STORAGE", Companion.transformRequestResult(promise));
    }

    @ReactMethod
    public final void requestMicrophoneAuthorization(Promise promise) {
        q.g(promise, "promise");
        getPermissionsModule().requestPermission("android.permission.RECORD_AUDIO", Companion.transformRequestResult(promise));
    }

    @ReactMethod
    public final void requestModifyAudioAuthorization(Promise promise) {
        q.g(promise, "promise");
        getPermissionsModule().requestPermission("android.permission.MODIFY_AUDIO_SETTINGS", Companion.transformRequestResult(promise));
    }

    @ReactMethod
    public final void requestPhotoAuthorization(Promise promise) {
        q.g(promise, "promise");
        getPermissionsModule().requestPermission("android.permission.READ_EXTERNAL_STORAGE", Companion.transformRequestResult(promise));
    }
}
