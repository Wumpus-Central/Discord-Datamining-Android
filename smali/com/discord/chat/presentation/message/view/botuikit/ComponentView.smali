.class public interface abstract Lcom/discord/chat/presentation/message/view/botuikit/ComponentView;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/discord/chat/bridge/botuikit/Component;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008f\u0018\u0000*\u0008\u0008\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J%\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\nH&\u00a2\u0006\u0002\u0010\u000bJ\u000e\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\rH&\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/discord/chat/presentation/message/view/botuikit/ComponentView;",
        "T",
        "Lcom/discord/chat/bridge/botuikit/Component;",
        "",
        "configure",
        "",
        "component",
        "componentProvider",
        "Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;",
        "componentActionListener",
        "Lcom/discord/chat/presentation/message/view/botuikit/ComponentActionListener;",
        "(Lcom/discord/chat/bridge/botuikit/Component;Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;Lcom/discord/chat/presentation/message/view/botuikit/ComponentActionListener;)V",
        "getComponentType",
        "Lkotlin/reflect/KClass;",
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
.method public abstract configure(Lcom/discord/chat/bridge/botuikit/Component;Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;Lcom/discord/chat/presentation/message/view/botuikit/ComponentActionListener;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;",
            "Lcom/discord/chat/presentation/message/view/botuikit/ComponentActionListener;",
            ")V"
        }
    .end annotation
.end method

.method public abstract getComponentType()Lkotlin/reflect/KClass;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/reflect/KClass<",
            "TT;>;"
        }
    .end annotation
.end method
