.class final Lcom/discord/chat/bridge/embed/EmbedAuthor$1;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/chat/bridge/embed/EmbedAuthor;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "Ljava/lang/String;",
        ">;"
    }
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


# instance fields
.field final synthetic this$0:Lcom/discord/chat/bridge/embed/EmbedAuthor;


# direct methods
.method constructor <init>(Lcom/discord/chat/bridge/embed/EmbedAuthor;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/chat/bridge/embed/EmbedAuthor$1;->this$0:Lcom/discord/chat/bridge/embed/EmbedAuthor;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/discord/chat/bridge/embed/EmbedAuthor$1;->invoke()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Ljava/lang/String;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/discord/chat/bridge/embed/EmbedAuthor$1;->this$0:Lcom/discord/chat/bridge/embed/EmbedAuthor;

    invoke-virtual {v0}, Lcom/discord/chat/bridge/embed/EmbedAuthor;->getIconProxyURL()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
