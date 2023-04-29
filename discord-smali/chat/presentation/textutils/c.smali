.class public final synthetic Lcom/discord/chat/presentation/textutils/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/discord/simpleast/core/node/StyleNode$SpanProvider;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get(Ljava/lang/Object;)Ljava/lang/Iterable;
    .locals 0

    check-cast p1, Lcom/discord/chat/presentation/textutils/RenderContext;

    invoke-static {p1}, Lcom/discord/chat/presentation/textutils/CodeStyle;->g(Lcom/discord/chat/presentation/textutils/RenderContext;)Ljava/lang/Iterable;

    move-result-object p1

    return-object p1
.end method
