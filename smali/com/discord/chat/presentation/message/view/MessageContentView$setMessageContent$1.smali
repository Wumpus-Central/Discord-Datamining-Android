.class final Lcom/discord/chat/presentation/message/view/MessageContentView$setMessageContent$1;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/chat/presentation/message/view/MessageContentView;->setMessageContent-2i9KL1s$default(Lcom/discord/chat/presentation/message/view/MessageContentView;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;ZZZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILjava/lang/String;Lcom/discord/chat/bridge/truncation/Truncation;Lcom/discord/theme/DiscordTheme;ILjava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/discord/chat/bridge/contentnode/LinkContentNode;",
        "Lcom/discord/chat/presentation/textutils/LinkStyle;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "Lcom/discord/chat/presentation/textutils/LinkStyle;",
        "<anonymous parameter 0>",
        "Lcom/discord/chat/bridge/contentnode/LinkContentNode;",
        "invoke"
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
.field public static final INSTANCE:Lcom/discord/chat/presentation/message/view/MessageContentView$setMessageContent$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/discord/chat/presentation/message/view/MessageContentView$setMessageContent$1;

    invoke-direct {v0}, Lcom/discord/chat/presentation/message/view/MessageContentView$setMessageContent$1;-><init>()V

    sput-object v0, Lcom/discord/chat/presentation/message/view/MessageContentView$setMessageContent$1;->INSTANCE:Lcom/discord/chat/presentation/message/view/MessageContentView$setMessageContent$1;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Lcom/discord/chat/bridge/contentnode/LinkContentNode;)Lcom/discord/chat/presentation/textutils/LinkStyle;
    .locals 3

    const-string v0, "<anonymous parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance p1, Lcom/discord/chat/presentation/textutils/LinkStyle;

    const/4 v0, 0x0

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-direct {p1, v2, v0, v1, v2}, Lcom/discord/chat/presentation/textutils/LinkStyle;-><init>(Lcom/discord/fonts/DiscordFont;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/discord/chat/bridge/contentnode/LinkContentNode;

    invoke-virtual {p0, p1}, Lcom/discord/chat/presentation/message/view/MessageContentView$setMessageContent$1;->invoke(Lcom/discord/chat/bridge/contentnode/LinkContentNode;)Lcom/discord/chat/presentation/textutils/LinkStyle;

    move-result-object p1

    return-object p1
.end method
