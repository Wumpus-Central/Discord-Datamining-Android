.class final Lcom/discord/chat/input/views/ChatInputRootView$onAttachedToWindow$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/flow/FlowCollector;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/chat/input/views/ChatInputRootView$onAttachedToWindow$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lkotlinx/coroutines/flow/FlowCollector;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u008a@\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "text",
        "Lcom/discord/chat/input/views/ChatInputRootView$CurrentTextAndSelection;",
        "emit",
        "(Lcom/discord/chat/input/views/ChatInputRootView$CurrentTextAndSelection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lcom/discord/chat/input/views/ChatInputRootView;


# direct methods
.method constructor <init>(Lcom/discord/chat/input/views/ChatInputRootView;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/chat/input/views/ChatInputRootView$onAttachedToWindow$1$1;->this$0:Lcom/discord/chat/input/views/ChatInputRootView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Lcom/discord/chat/input/views/ChatInputRootView$CurrentTextAndSelection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/discord/chat/input/views/ChatInputRootView$CurrentTextAndSelection;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    if-nez p1, :cond_0

    .line 2
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    .line 3
    :cond_0
    iget-object p2, p0, Lcom/discord/chat/input/views/ChatInputRootView$onAttachedToWindow$1$1;->this$0:Lcom/discord/chat/input/views/ChatInputRootView;

    invoke-virtual {p2}, Lcom/discord/chat/input/views/ChatInputRootView;->getListener()Lcom/discord/chat/input/views/ChatInputRootView$ChatInputListener;

    move-result-object p2

    if-eqz p2, :cond_1

    .line 4
    invoke-virtual {p1}, Lcom/discord/chat/input/views/ChatInputRootView$CurrentTextAndSelection;->getSelectionStart()I

    move-result v0

    .line 5
    invoke-virtual {p1}, Lcom/discord/chat/input/views/ChatInputRootView$CurrentTextAndSelection;->getSelectionEnd()I

    move-result v1

    .line 6
    invoke-virtual {p1}, Lcom/discord/chat/input/views/ChatInputRootView$CurrentTextAndSelection;->getText()Ljava/lang/String;

    move-result-object v2

    .line 7
    invoke-virtual {p1}, Lcom/discord/chat/input/views/ChatInputRootView$CurrentTextAndSelection;->getEditId()Ljava/lang/String;

    move-result-object p1

    .line 8
    invoke-interface {p2, v0, v1, v2, p1}, Lcom/discord/chat/input/views/ChatInputRootView$ChatInputListener;->onTextOrSelectionChanged(IILjava/lang/String;Ljava/lang/String;)V

    .line 9
    :cond_1
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/discord/chat/input/views/ChatInputRootView$CurrentTextAndSelection;

    invoke-virtual {p0, p1, p2}, Lcom/discord/chat/input/views/ChatInputRootView$onAttachedToWindow$1$1;->emit(Lcom/discord/chat/input/views/ChatInputRootView$CurrentTextAndSelection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
