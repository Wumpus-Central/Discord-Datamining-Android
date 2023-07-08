package com.discord.file_manager;

import com.facebook.react.bridge.Promise;
import ff.t;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import lf.d;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.discord.file_manager.FileManagerModule$fileExists$1", f = "FileManagerModule.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class FileManagerModule$fileExists$1 extends k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
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

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FileManagerModule$fileExists$1(this.$promise, this.$path, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FileManagerModule$fileExists$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f20663a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        d.d();
        if (this.label == 0) {
            t.b(obj);
            try {
                this.$promise.resolve(b.a(new File(this.$path).exists()));
            } catch (Throwable th2) {
                this.$promise.reject(th2);
            }
            return Unit.f20663a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
