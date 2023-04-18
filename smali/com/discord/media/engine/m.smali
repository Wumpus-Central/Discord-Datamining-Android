.class public final synthetic Lcom/discord/media/engine/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/discord/native/engine/NativeConnection$OnVideoCallback;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function4;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/media/engine/m;->a:Lkotlin/jvm/functions/Function4;

    return-void
.end method


# virtual methods
.method public final onVideo(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V
    .locals 6

    iget-object v0, p0, Lcom/discord/media/engine/m;->a:Lkotlin/jvm/functions/Function4;

    move-object v1, p1

    move-wide v2, p2

    move-object v4, p4

    move-object v5, p5

    invoke-static/range {v0 .. v5}, Lcom/discord/media/engine/MediaEngine;->d(Lkotlin/jvm/functions/Function4;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method
