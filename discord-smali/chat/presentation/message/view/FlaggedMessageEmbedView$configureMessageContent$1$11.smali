.class final Lcom/discord/chat/presentation/message/view/FlaggedMessageEmbedView$configureMessageContent$1$11;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/chat/presentation/message/view/FlaggedMessageEmbedView;->configureMessageContent(Lcom/discord/chat/bridge/Message;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/discord/primitives/MessageId;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Lcom/discord/primitives/MessageId;",
        "invoke-1xi1bu0",
        "(Ljava/lang/String;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/discord/chat/presentation/message/view/FlaggedMessageEmbedView$configureMessageContent$1$11;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/discord/chat/presentation/message/view/FlaggedMessageEmbedView$configureMessageContent$1$11;

    invoke-direct {v0}, Lcom/discord/chat/presentation/message/view/FlaggedMessageEmbedView$configureMessageContent$1$11;-><init>()V

    sput-object v0, Lcom/discord/chat/presentation/message/view/FlaggedMessageEmbedView$configureMessageContent$1$11;->INSTANCE:Lcom/discord/chat/presentation/message/view/FlaggedMessageEmbedView$configureMessageContent$1$11;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/discord/primitives/MessageId;

    invoke-virtual {p1}, Lcom/discord/primitives/MessageId;->unbox-impl()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/discord/chat/presentation/message/view/FlaggedMessageEmbedView$configureMessageContent$1$11;->invoke-1xi1bu0(Ljava/lang/String;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke-1xi1bu0(Ljava/lang/String;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method