.class public final Lcom/discord/chat/presentation/message/system/CallSystemMessageView$setMessage$1$1$invokeSuspend$$inlined$map$1$2$1;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/chat/presentation/message/system/CallSystemMessageView$setMessage$1$1$invokeSuspend$$inlined$map$1$2;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/e;
    c = "com.discord.chat.presentation.message.system.CallSystemMessageView$setMessage$1$1$invokeSuspend$$inlined$map$1$2"
    f = "CallSystemMessageView.kt"
    l = {
        0xdf
    }
    m = "emit"
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcom/discord/chat/presentation/message/system/CallSystemMessageView$setMessage$1$1$invokeSuspend$$inlined$map$1$2;


# direct methods
.method public constructor <init>(Lcom/discord/chat/presentation/message/system/CallSystemMessageView$setMessage$1$1$invokeSuspend$$inlined$map$1$2;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/chat/presentation/message/system/CallSystemMessageView$setMessage$1$1$invokeSuspend$$inlined$map$1$2$1;->this$0:Lcom/discord/chat/presentation/message/system/CallSystemMessageView$setMessage$1$1$invokeSuspend$$inlined$map$1$2;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/discord/chat/presentation/message/system/CallSystemMessageView$setMessage$1$1$invokeSuspend$$inlined$map$1$2$1;->result:Ljava/lang/Object;

    iget p1, p0, Lcom/discord/chat/presentation/message/system/CallSystemMessageView$setMessage$1$1$invokeSuspend$$inlined$map$1$2$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/discord/chat/presentation/message/system/CallSystemMessageView$setMessage$1$1$invokeSuspend$$inlined$map$1$2$1;->label:I

    iget-object p1, p0, Lcom/discord/chat/presentation/message/system/CallSystemMessageView$setMessage$1$1$invokeSuspend$$inlined$map$1$2$1;->this$0:Lcom/discord/chat/presentation/message/system/CallSystemMessageView$setMessage$1$1$invokeSuspend$$inlined$map$1$2;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lcom/discord/chat/presentation/message/system/CallSystemMessageView$setMessage$1$1$invokeSuspend$$inlined$map$1$2;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
