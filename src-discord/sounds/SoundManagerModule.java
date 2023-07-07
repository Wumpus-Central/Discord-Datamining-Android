package com.discord.sounds;

import android.content.Context;
import android.webkit.URLUtil;
import com.discord.logging.Log;
import com.discord.sounds.utils.SoundExtensionsKt;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J*\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0018\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\fH\u0007J\u0018\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\fH\u0007J\u0018\u0010\u0017\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\fH\u0007J\u0018\u0010\u0018\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0019H\u0007J\u0010\u0010\u001a\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u001e\u0010\u001b\u001a\u00020\f*\u00020\u001c2\u0006\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u001d\u001a\u00020\bH\u0003R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/discord/sounds/SoundManagerModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "soundManager", "Lcom/discord/sounds/SoundManager;", "getName", "", "pause", "", "key", "", "play", "prepare", "fileName", "usage", "callback", "Lcom/facebook/react/bridge/Callback;", "release", "setCurrentTime", "value", "setNumberOfLoops", "setPan", "setVolume", "", "stop", "resolveRawResId", "Landroid/content/Context;", "type", "sounds_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SoundManagerModule extends ReactContextBaseJavaModule {
    private final SoundManager soundManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SoundManagerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        q.g(reactContext, "reactContext");
        this.soundManager = new SoundManager(reactContext);
    }

    private final int resolveRawResId(Context context, String str, String str2) {
        boolean z10;
        int identifier = context.getResources().getIdentifier(str, str2, context.getPackageName());
        if (identifier > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return identifier;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    static /* synthetic */ int resolveRawResId$default(SoundManagerModule soundManagerModule, Context context, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = "raw";
        }
        return soundManagerModule.resolveRawResId(context, str, str2);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "DCDSoundManager";
    }

    @ReactMethod
    public final void pause(int i10) {
        Log log = Log.INSTANCE;
        String logTag = SoundManager.Companion.getLogTag();
        Log.i$default(log, logTag, "Pause " + i10, (Throwable) null, 4, (Object) null);
        this.soundManager.pause(i10);
    }

    @ReactMethod
    public final void play(int i10) {
        Log log = Log.INSTANCE;
        String logTag = SoundManager.Companion.getLogTag();
        Log.i$default(log, logTag, "Play " + i10, (Throwable) null, 4, (Object) null);
        this.soundManager.play(i10);
    }

    @ReactMethod
    public final void prepare(String fileName, String str, int i10, Callback callback) {
        String str2;
        Integer num;
        q.g(fileName, "fileName");
        q.g(callback, "callback");
        Log.i$default(Log.INSTANCE, SoundManager.Companion.getLogTag(), "Prepare " + fileName + " with " + i10 + ".", (Throwable) null, 4, (Object) null);
        int i11 = 5;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 112386354) {
                if (hashCode != 301372961) {
                    if (hashCode == 595233003) {
                        str.equals("notification");
                    }
                } else if (str.equals("ring_tone")) {
                    i11 = 6;
                }
            } else if (str.equals("voice")) {
                i11 = 2;
            }
        }
        if (URLUtil.isValidUrl(fileName)) {
            String remoteSoundFilename = SoundExtensionsKt.getRemoteSoundFilename(fileName);
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            q.f(reactApplicationContext, "reactApplicationContext");
            File file = new File(SoundExtensionsKt.getSoundsCacheDirectory(reactApplicationContext), remoteSoundFilename);
            if (!file.exists()) {
                ReactApplicationContext reactApplicationContext2 = getReactApplicationContext();
                q.f(reactApplicationContext2, "reactApplicationContext");
                SoundExtensionsKt.fetchSound(reactApplicationContext2, fileName, this.soundManager, i10, i11, new SoundManagerModule$prepare$1(callback));
                return;
            }
            file.setLastModified(System.currentTimeMillis());
            str2 = file.getAbsolutePath();
            num = null;
        } else {
            ReactApplicationContext reactApplicationContext3 = getReactApplicationContext();
            q.f(reactApplicationContext3, "reactApplicationContext");
            num = Integer.valueOf(resolveRawResId$default(this, reactApplicationContext3, fileName, null, 2, null));
            str2 = null;
        }
        this.soundManager.prepare(i10, i11, num, str2, new SoundManagerModule$prepare$2(callback));
    }

    @ReactMethod
    public final void release(int i10) {
        Log log = Log.INSTANCE;
        String logTag = SoundManager.Companion.getLogTag();
        Log.i$default(log, logTag, "Release " + i10, (Throwable) null, 4, (Object) null);
        this.soundManager.release(i10);
    }

    @ReactMethod
    public final void setCurrentTime(int i10, int i11) {
        Log log = Log.INSTANCE;
        String logTag = SoundManager.Companion.getLogTag();
        Log.i$default(log, logTag, "Set current time for " + i10 + " with value " + i11, (Throwable) null, 4, (Object) null);
        this.soundManager.setCurrentTime(i10, i11);
    }

    @ReactMethod
    public final void setNumberOfLoops(int i10, int i11) {
        Log log = Log.INSTANCE;
        String logTag = SoundManager.Companion.getLogTag();
        Log.i$default(log, logTag, "Set number of loops for " + i10 + " with value " + i11, (Throwable) null, 4, (Object) null);
        this.soundManager.setNumberOfLoops(i10, i11);
    }

    @ReactMethod
    public final void setPan(int i10, int i11) {
        Log log = Log.INSTANCE;
        String logTag = SoundManager.Companion.getLogTag();
        Log.i$default(log, logTag, "Set pan for " + i10 + " with value " + i11, (Throwable) null, 4, (Object) null);
        this.soundManager.setPan(i10, (float) i11);
    }

    @ReactMethod
    public final void setVolume(int i10, float f10) {
        Log log = Log.INSTANCE;
        String logTag = SoundManager.Companion.getLogTag();
        Log.i$default(log, logTag, "Set volume for " + i10 + " with value " + f10, (Throwable) null, 4, (Object) null);
        this.soundManager.setVolume(i10, f10);
    }

    @ReactMethod
    public final void stop(int i10) {
        Log log = Log.INSTANCE;
        String logTag = SoundManager.Companion.getLogTag();
        Log.i$default(log, logTag, "Stop " + i10, (Throwable) null, 4, (Object) null);
        this.soundManager.stop(i10);
    }
}
