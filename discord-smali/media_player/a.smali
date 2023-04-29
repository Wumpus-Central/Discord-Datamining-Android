.class public final synthetic Lcom/discord/media_player/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:D

.field public final synthetic l:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(DLkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/discord/media_player/a;->k:D

    iput-object p3, p0, Lcom/discord/media_player/a;->l:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-wide v0, p0, Lcom/discord/media_player/a;->k:D

    iget-object v2, p0, Lcom/discord/media_player/a;->l:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v2}, Lcom/discord/media_player/MediaPlayerManagerModule;->a(DLkotlin/jvm/functions/Function1;)V

    return-void
.end method
