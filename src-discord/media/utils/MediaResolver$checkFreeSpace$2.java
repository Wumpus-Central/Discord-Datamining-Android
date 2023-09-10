package com.discord.media.utils;

import com.discord.media.utils.MediaResolver;
import java.io.File;
import kf.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.q;
import kotlin.text.o;
import kotlinx.coroutines.CoroutineScope;
import qf.d;


@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.discord.media.utils.MediaResolver$checkFreeSpace$2", f = "MediaResolver.kt", l = {}, m = "invokeSuspend")

public final class MediaResolver$checkFreeSpace$2 extends k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final  MediaResolver this$0;

    
    
    public MediaResolver$checkFreeSpace$2(MediaResolver mediaResolver, Continuation<? super MediaResolver$checkFreeSpace$2> continuation) {
        super(2, continuation);
        this.this$0 = mediaResolver;
    }

    @Override 
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MediaResolver$checkFreeSpace$2(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MediaResolver$checkFreeSpace$2) create(coroutineScope, continuation)).invokeSuspend(Unit.f21442a);
    }

    @Override 
    public final Object invokeSuspend(Object obj) {
        File file;
        File file2;
        MediaResolver.Companion companion;
        File file3;
        File[] listFiles;
        boolean H;
        d.d();
        if (this.label == 0) {
            t.b(obj);
            file = this.this$0.cacheDir;
            file2 = this.this$0.cacheDir;
            if (file.getUsableSpace() / file2.getTotalSpace() < 0.2d) {
                long currentTimeMillis = System.currentTimeMillis();
                companion = MediaResolver.Companion;
                long half_day_millis = currentTimeMillis - companion.getHALF_DAY_MILLIS();
                file3 = this.this$0.cacheDir;
                File[] listFiles2 = file3.listFiles();
                if (listFiles2 != null) {
                    for (File file4 : listFiles2) {
                        if (file4.isFile()) {
                            String name = file4.getName();
                            q.g(name, "cacheItem.name");
                            H = o.H(name, "temp_", false, 2, null);
                            if (H && file4.lastModified() < half_day_millis) {
                                file4.delete();
                            }
                        }
                        if (file4.isDirectory() && q.c(file4.getName(), "compressor") && (listFiles = file4.listFiles()) != null) {
                            q.g(listFiles, "listFiles()");
                            for (File file5 : listFiles) {
                                if (file5.isFile() && file5.lastModified() < half_day_millis) {
                                    file5.delete();
                                }
                            }
                        }
                    }
                }
            }
            return Unit.f21442a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
