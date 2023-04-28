.class public final Lcom/discord/chat/ChatModule$withChatView$$inlined$uiManagerResolveView$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/uimanager/UIBlock;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/chat/ChatModule;->withChatView(ILkotlin/jvm/functions/Function1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0000\u001a\u00020\u0001\"\n\u0008\u0000\u0010\u0002\u0018\u0001*\u00020\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n\u00a2\u0006\u0002\u0008\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "<anonymous>",
        "",
        "T",
        "Landroid/view/View;",
        "nativeViewHierarchyManager",
        "Lcom/facebook/react/uimanager/NativeViewHierarchyManager;",
        "kotlin.jvm.PlatformType",
        "execute",
        "com/discord/react/utilities/ReactContextExtensionsKt$uiManagerResolveView$1"
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
.field final synthetic $onView:Lkotlin/jvm/functions/Function1;

.field final synthetic $tag:I


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput-object p1, p0, Lcom/discord/chat/ChatModule$withChatView$$inlined$uiManagerResolveView$1;->$onView:Lkotlin/jvm/functions/Function1;

    iput p2, p0, Lcom/discord/chat/ChatModule$withChatView$$inlined$uiManagerResolveView$1;->$tag:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final execute(Lcom/facebook/react/uimanager/NativeViewHierarchyManager;)V
    .locals 2

    iget-object v0, p0, Lcom/discord/chat/ChatModule$withChatView$$inlined$uiManagerResolveView$1;->$onView:Lkotlin/jvm/functions/Function1;

    iget v1, p0, Lcom/discord/chat/ChatModule$withChatView$$inlined$uiManagerResolveView$1;->$tag:I

    invoke-virtual {p1, v1}, Lcom/facebook/react/uimanager/NativeViewHierarchyManager;->resolveView(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_0

    check-cast p1, Lcom/discord/chat/presentation/root/ChatView;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "null cannot be cast to non-null type com.discord.chat.presentation.root.ChatView"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
