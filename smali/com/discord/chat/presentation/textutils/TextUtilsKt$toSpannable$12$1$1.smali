.class final Lcom/discord/chat/presentation/textutils/TextUtilsKt$toSpannable$12$1$1;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/chat/presentation/textutils/TextUtilsKt;->toSpannable(Ljava/util/List;Lcom/discord/chat/presentation/textutils/RenderContext;Lcom/facebook/drawee/span/DraweeSpanStringBuilder;)Lcom/facebook/drawee/span/DraweeSpanStringBuilder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/discord/chat/presentation/textutils/RenderContext$Insets;",
        "Lcom/discord/chat/presentation/textutils/RenderContext$Insets;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Lcom/discord/chat/presentation/textutils/RenderContext$Insets;",
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


# instance fields
.field final synthetic $quote:Lcom/discord/span/utilities/spannable/QuoteSpan;


# direct methods
.method constructor <init>(Lcom/discord/span/utilities/spannable/QuoteSpan;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/chat/presentation/textutils/TextUtilsKt$toSpannable$12$1$1;->$quote:Lcom/discord/span/utilities/spannable/QuoteSpan;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Lcom/discord/chat/presentation/textutils/RenderContext$Insets;)Lcom/discord/chat/presentation/textutils/RenderContext$Insets;
    .locals 8

    const-string v0, "$this$updateInsets"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 2
    invoke-virtual {p1}, Lcom/discord/chat/presentation/textutils/RenderContext$Insets;->getStart()I

    move-result v0

    iget-object v1, p0, Lcom/discord/chat/presentation/textutils/TextUtilsKt$toSpannable$12$1$1;->$quote:Lcom/discord/span/utilities/spannable/QuoteSpan;

    invoke-virtual {v1}, Lcom/discord/span/utilities/spannable/QuoteSpan;->getInsetStart()I

    move-result v1

    add-int v4, v0, v1

    const/4 v5, 0x0

    const/16 v6, 0xb

    const/4 v7, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Lcom/discord/chat/presentation/textutils/RenderContext$Insets;->copy$default(Lcom/discord/chat/presentation/textutils/RenderContext$Insets;IIIIILjava/lang/Object;)Lcom/discord/chat/presentation/textutils/RenderContext$Insets;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/discord/chat/presentation/textutils/RenderContext$Insets;

    invoke-virtual {p0, p1}, Lcom/discord/chat/presentation/textutils/TextUtilsKt$toSpannable$12$1$1;->invoke(Lcom/discord/chat/presentation/textutils/RenderContext$Insets;)Lcom/discord/chat/presentation/textutils/RenderContext$Insets;

    move-result-object p1

    return-object p1
.end method
