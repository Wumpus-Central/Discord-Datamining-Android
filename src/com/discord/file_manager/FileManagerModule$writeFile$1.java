package com.discord.file_manager;

import android.util.Base64;
import com.facebook.react.bridge.Promise;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9636e;
import kotlin.coroutines.jvm.internal.AbstractC9643k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9677q;
import kotlinx.coroutines.CoroutineScope;
import nf.C10848t;
import p327ri.C12563d;
import p427xf.C14001c;
import tf.C12962d;

@Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
@AbstractC9636e(m14702c = "com.discord.file_manager.FileManagerModule$writeFile$1", m14701f = "FileManagerModule.kt", m14700l = {}, m14699m = "invokeSuspend")
/* loaded from: classes4.dex */
final class FileManagerModule$writeFile$1 extends AbstractC9643k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $data;
    final /* synthetic */ String $encoding;
    final /* synthetic */ String $path;
    final /* synthetic */ Promise $promise;
    final /* synthetic */ String $storageDir;
    int label;
    final /* synthetic */ FileManagerModule this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileManagerModule$writeFile$1(FileManagerModule fileManagerModule, String str, Promise promise, String str2, String str3, String str4, Continuation<? super FileManagerModule$writeFile$1> continuation) {
        super(2, continuation);
        this.this$0 = fileManagerModule;
        this.$storageDir = str;
        this.$promise = promise;
        this.$path = str2;
        this.$encoding = str3;
        this.$data = str4;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FileManagerModule$writeFile$1(this.this$0, this.$storageDir, this.$promise, this.$path, this.$encoding, this.$data, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FileManagerModule$writeFile$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f25780a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
    public final Object invokeSuspend(Object obj) {
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        C12962d.m4646d();
        if (this.label == 0) {
            C10848t.m10930b(obj);
            hashMap = this.this$0.storageDirs;
            if (!hashMap.containsKey(this.$storageDir)) {
                Promise promise = this.$promise;
                String str = this.$storageDir;
                hashMap3 = this.this$0.storageDirs;
                promise.reject("err", "Unknown storage directory " + str + ". Supported storage directories: " + hashMap3.keySet());
                return Unit.f25780a;
            }
            try {
                hashMap2 = this.this$0.storageDirs;
                Object obj2 = hashMap2.get(this.$storageDir);
                C9677q.m14636d(obj2);
                File file = new File((String) obj2, this.$path);
                File parentFile = file.getParentFile();
                boolean z = true;
                if (parentFile != null && !parentFile.exists()) {
                    File parentFile2 = file.getParentFile();
                    if (parentFile2 == null || parentFile2.mkdirs()) {
                        z = false;
                    }
                    if (z) {
                        Promise promise2 = this.$promise;
                        File parentFile3 = file.getParentFile();
                        promise2.reject((String) null, "Failed to create parent directory " + (parentFile3 != null ? parentFile3.toString() : null));
                    }
                }
                if (C9677q.m14638b(this.$encoding, "base64")) {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    fileOutputStream.write(Base64.decode(this.$data, 0));
                    Unit unit = Unit.f25780a;
                    C14001c.m1713a(fileOutputStream, null);
                } else {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                    byte[] bytes = this.$data.getBytes(C12563d.f32852b);
                    C9677q.m14634f(bytes, "this as java.lang.String).getBytes(charset)");
                    fileOutputStream2.write(bytes);
                    Unit unit2 = Unit.f25780a;
                    C14001c.m1713a(fileOutputStream2, null);
                }
                this.$promise.resolve(file.getAbsolutePath());
            } catch (Throwable th2) {
                this.$promise.reject(th2);
            }
            return Unit.f25780a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
