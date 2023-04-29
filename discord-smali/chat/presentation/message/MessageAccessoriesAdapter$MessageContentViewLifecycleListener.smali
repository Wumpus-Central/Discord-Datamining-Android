.class public interface abstract Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$MessageContentViewLifecycleListener;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "MessageContentViewLifecycleListener"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0008\u0010\u0006\u001a\u00020\u0003H&\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$MessageContentViewLifecycleListener;",
        "",
        "onAttachedToWindow",
        "",
        "messageContentView",
        "Lcom/discord/chat/presentation/message/view/MessageContentView;",
        "onDetachedFromWindow",
        "chat_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract onAttachedToWindow(Lcom/discord/chat/presentation/message/view/MessageContentView;)V
.end method

.method public abstract onDetachedFromWindow()V
.end method
