package com.discord.media.engine;

import android.net.Uri;
import com.facebook.react.bridge.Callback;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "fileName", "", "durationMs", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

final class MediaEngineModule$stopLocalAudioRecording$1 extends s implements Function2<String, Integer, Unit> {
    final  Callback $callback;

    
    
    public MediaEngineModule$stopLocalAudioRecording$1(Callback callback) {
        super(2);
        this.$callback = callback;
    }

    @Override 
    public   Unit invoke(String str, Integer num) {
        invoke(str, num.intValue());
        return Unit.f21442a;
    }

    public final void invoke(String fileName, int i10) {
        q.h(fileName, "fileName");
        Uri fromFile = Uri.fromFile(new File(fileName));
        q.g(fromFile, "fromFile(this)");
        this.$callback.invoke(fromFile.toString(), Integer.valueOf(i10));
    }
}
