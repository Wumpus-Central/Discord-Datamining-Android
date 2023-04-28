package com.discord.media.utils;

import com.discord.media.utils.MediaResolver;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9636e;
import kotlin.coroutines.jvm.internal.AbstractC9643k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9677q;
import kotlinx.coroutines.CoroutineScope;
import nf.C10848t;
import p327ri.C12587u;
import tf.C12962d;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
@AbstractC9636e(m14702c = "com.discord.media.utils.MediaResolver$checkFreeSpace$2", m14701f = "MediaResolver.kt", m14700l = {}, m14699m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class MediaResolver$checkFreeSpace$2 extends AbstractC9643k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ MediaResolver this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaResolver$checkFreeSpace$2(MediaResolver mediaResolver, Continuation<? super MediaResolver$checkFreeSpace$2> continuation) {
        super(2, continuation);
        this.this$0 = mediaResolver;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MediaResolver$checkFreeSpace$2(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MediaResolver$checkFreeSpace$2) create(coroutineScope, continuation)).invokeSuspend(Unit.f25780a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
    public final Object invokeSuspend(Object obj) {
        File file;
        File file2;
        MediaResolver.Companion companion;
        File file3;
        File[] listFiles;
        boolean H;
        C12962d.m4646d();
        if (this.label == 0) {
            C10848t.m10930b(obj);
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
                            C9677q.m14634f(name, "cacheItem.name");
                            H = C12587u.m5736H(name, "temp_", false, 2, null);
                            if (H && file4.lastModified() < half_day_millis) {
                                file4.delete();
                            }
                        }
                        if (file4.isDirectory() && C9677q.m14638b(file4.getName(), "compressor") && (listFiles = file4.listFiles()) != null) {
                            C9677q.m14634f(listFiles, "listFiles()");
                            for (File file5 : listFiles) {
                                if (file5.isFile() && file5.lastModified() < half_day_millis) {
                                    file5.delete();
                                }
                            }
                        }
                    }
                }
            }
            return Unit.f25780a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
