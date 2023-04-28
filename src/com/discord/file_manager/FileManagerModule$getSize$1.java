package com.discord.file_manager;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9636e;
import kotlin.coroutines.jvm.internal.AbstractC9643k;
import kotlin.coroutines.jvm.internal.C9633b;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nf.C10845s;
import nf.C10848t;
import p427xf.C14001c;
import tf.C12962d;

@Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
@AbstractC9636e(m14702c = "com.discord.file_manager.FileManagerModule$getSize$1", m14701f = "FileManagerModule.kt", m14700l = {}, m14699m = "invokeSuspend")
/* loaded from: classes4.dex */
final class FileManagerModule$getSize$1 extends AbstractC9643k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Promise $promise;
    final /* synthetic */ String $uri;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FileManagerModule this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileManagerModule$getSize$1(FileManagerModule fileManagerModule, String str, Promise promise, Continuation<? super FileManagerModule$getSize$1> continuation) {
        super(2, continuation);
        this.this$0 = fileManagerModule;
        this.$uri = str;
        this.$promise = promise;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FileManagerModule$getSize$1 fileManagerModule$getSize$1 = new FileManagerModule$getSize$1(this.this$0, this.$uri, this.$promise, continuation);
        fileManagerModule$getSize$1.L$0 = obj;
        return fileManagerModule$getSize$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FileManagerModule$getSize$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f25780a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        ReactApplicationContext reactApplicationContext;
        long j;
        boolean z;
        C12962d.m4646d();
        if (this.label == 0) {
            C10848t.m10930b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            FileManagerModule fileManagerModule = this.this$0;
            String str = this.$uri;
            Promise promise = this.$promise;
            try {
                C10845s.C10846a aVar = C10845s.f28533l;
                reactApplicationContext = fileManagerModule.getReactApplicationContext();
                ParcelFileDescriptor openFileDescriptor = reactApplicationContext.getContentResolver().openFileDescriptor(Uri.parse(str), "r");
                if (openFileDescriptor != null) {
                    j = openFileDescriptor.getStatSize();
                    C14001c.m1713a(openFileDescriptor, null);
                } else {
                    j = 0;
                }
                if (j >= 0) {
                    z = true;
                } else {
                    z = false;
                }
            } catch (Throwable th2) {
                C10845s.C10846a aVar2 = C10845s.f28533l;
                obj2 = C10845s.m10940b(C10848t.m10931a(th2));
            }
            if (z) {
                promise.resolve(C9633b.m14705b(j));
                obj2 = C10845s.m10940b(Unit.f25780a);
                Promise promise2 = this.$promise;
                Throwable e = C10845s.m10937e(obj2);
                if (e != null) {
                    promise2.reject(e);
                }
                return Unit.f25780a;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
