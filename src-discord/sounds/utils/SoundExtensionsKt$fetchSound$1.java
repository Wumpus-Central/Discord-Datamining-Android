package com.discord.sounds.utils;

import android.content.Context;
import com.discord.file_downloader.DownloadState;
import com.discord.file_downloader.FileDownloader;
import com.discord.logging.Log;
import com.discord.sounds.SoundManager;
import ff.t;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import lf.d;


@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1", f = "SoundExtensions.kt", l = {42}, m = "invokeSuspend")

public final class SoundExtensionsKt$fetchSound$1 extends k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final  Context $context;
    final  String $fileName;
    final  int $key;
    final  File $soundDirectory;
    final  SoundManager $soundManager;
    final  Function1<Integer, Unit> $soundResIdPrepared;
    final  String $url;
    final  int $usage;
    int label;

    
    
    
    public SoundExtensionsKt$fetchSound$1(Context context, String str, String str2, File file, SoundManager soundManager, int i10, int i11, Function1<? super Integer, Unit> function1, Continuation<? super SoundExtensionsKt$fetchSound$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$url = str;
        this.$fileName = str2;
        this.$soundDirectory = file;
        this.$soundManager = soundManager;
        this.$key = i10;
        this.$usage = i11;
        this.$soundResIdPrepared = function1;
    }

    @Override 
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SoundExtensionsKt$fetchSound$1(this.$context, this.$url, this.$fileName, this.$soundDirectory, this.$soundManager, this.$key, this.$usage, this.$soundResIdPrepared, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SoundExtensionsKt$fetchSound$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f20663a);
    }

    @Override 
    public final Object invokeSuspend(Object obj) {
        Object d10;
        d10 = d.d();
        int i10 = this.label;
        if (i10 == 0) {
            t.b(obj);
            Flow downloadFile$default = FileDownloader.downloadFile$default(FileDownloader.INSTANCE, this.$context, this.$url, this.$fileName, this.$soundDirectory, false, 16, null);
            AnonymousClass1 r12 = new AnonymousClass1(this.$soundManager, this.$key, this.$usage, this.$soundResIdPrepared);
            this.label = 1;
            if (downloadFile$default.collect(r12, this) == d10) {
                return d10;
            }
        } else if (i10 == 1) {
            t.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.f20663a;
    }

    
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "downloadState", "Lcom/discord/file_downloader/DownloadState;", "emit", "(Lcom/discord/file_downloader/DownloadState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    
    
    public static final class AnonymousClass1<T> implements FlowCollector {
        final  int $key;
        final  SoundManager $soundManager;
        final  Function1<Integer, Unit> $soundResIdPrepared;
        final  int $usage;

        
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @e(c = "com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1$1$1", f = "SoundExtensions.kt", l = {}, m = "invokeSuspend")
        
        
        public static final class C01061 extends k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final  DownloadState $downloadState;
            final  int $key;
            final  SoundManager $soundManager;
            final  Function1<Integer, Unit> $soundResIdPrepared;
            final  int $usage;
            int label;

            
            
            C01061(SoundManager soundManager, int i10, int i11, DownloadState downloadState, Function1<? super Integer, Unit> function1, Continuation<? super C01061> continuation) {
                super(2, continuation);
                this.$soundManager = soundManager;
                this.$key = i10;
                this.$usage = i11;
                this.$downloadState = downloadState;
                this.$soundResIdPrepared = function1;
            }

            @Override 
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C01061(this.$soundManager, this.$key, this.$usage, this.$downloadState, this.$soundResIdPrepared, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C01061) create(coroutineScope, continuation)).invokeSuspend(Unit.f20663a);
            }

            @Override 
            public final Object invokeSuspend(Object obj) {
                d.d();
                if (this.label == 0) {
                    t.b(obj);
                    this.$soundManager.prepare(this.$key, this.$usage, null, ((DownloadState.Completed) this.$downloadState).getFile().getAbsolutePath(), this.$soundResIdPrepared);
                    return Unit.f20663a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @e(c = "com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1$1$2", f = "SoundExtensions.kt", l = {}, m = "invokeSuspend")
        
        
        public static final class AnonymousClass2 extends k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final  Exception $e;
            int label;

            
            AnonymousClass2(Exception exc, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$e = exc;
            }

            @Override 
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$e, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f20663a);
            }

            @Override 
            public final Object invokeSuspend(Object obj) {
                d.d();
                if (this.label == 0) {
                    t.b(obj);
                    Log.INSTANCE.w(SoundManager.Companion.getLogTag(), "Failed to download sound.", this.$e);
                    return Unit.f20663a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @e(c = "com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1$1$3", f = "SoundExtensions.kt", l = {}, m = "invokeSuspend")
        
        
        public static final class AnonymousClass3 extends k implements Function2<CoroutineScope, Continuation, Object> {
            int label;

            AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
            }

            @Override 
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.f20663a);
            }

            @Override 
            public final Object invokeSuspend(Object obj) {
                d.d();
                if (this.label == 0) {
                    t.b(obj);
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        
        AnonymousClass1(SoundManager soundManager, int i10, int i11, Function1<? super Integer, Unit> function1) {
            this.$soundManager = soundManager;
            this.$key = i10;
            this.$usage = i11;
            this.$soundResIdPrepared = function1;
        }

        
        
        
        
        
        public final java.lang.Object emit(com.discord.file_downloader.DownloadState r17, kotlin.coroutines.Continuation<? super kotlin.Unit> r18) {
            
            throw new UnsupportedOperationException("Method not decompiled: com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1.AnonymousClass1.emit(com.discord.file_downloader.DownloadState, kotlin.coroutines.Continuation):java.lang.Object");
        }

        @Override 
        public   Object emit(Object obj, Continuation continuation) {
            return emit((DownloadState) obj, (Continuation<? super Unit>) continuation);
        }
    }
}
