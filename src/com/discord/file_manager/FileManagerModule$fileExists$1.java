package com.discord.file_manager;

import com.facebook.react.bridge.Promise;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9636e;
import kotlin.coroutines.jvm.internal.AbstractC9643k;
import kotlin.coroutines.jvm.internal.C9633b;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nf.C10848t;
import tf.C12962d;

@Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
@AbstractC9636e(m14702c = "com.discord.file_manager.FileManagerModule$fileExists$1", m14701f = "FileManagerModule.kt", m14700l = {}, m14699m = "invokeSuspend")
/* loaded from: classes4.dex */
final class FileManagerModule$fileExists$1 extends AbstractC9643k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $path;
    final /* synthetic */ Promise $promise;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileManagerModule$fileExists$1(Promise promise, String str, Continuation<? super FileManagerModule$fileExists$1> continuation) {
        super(2, continuation);
        this.$promise = promise;
        this.$path = str;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FileManagerModule$fileExists$1(this.$promise, this.$path, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FileManagerModule$fileExists$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f25780a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
    public final Object invokeSuspend(Object obj) {
        C12962d.m4646d();
        if (this.label == 0) {
            C10848t.m10930b(obj);
            try {
                this.$promise.resolve(C9633b.m14706a(new File(this.$path).exists()));
            } catch (Throwable th2) {
                this.$promise.reject(th2);
            }
            return Unit.f25780a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
