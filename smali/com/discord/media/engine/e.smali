.class public final synthetic Lcom/discord/media/engine/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/discord/native/engine/NativeConnection$OnPingCallback;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function4;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/media/engine/e;->a:Lkotlin/jvm/functions/Function4;

    return-void
.end method


# virtual methods
.method public final onPing(ILjava/lang/String;II)V
    .locals 1

    iget-object v0, p0, Lcom/discord/media/engine/e;->a:Lkotlin/jvm/functions/Function4;

    invoke-static {v0, p1, p2, p3, p4}, Lcom/discord/media/engine/MediaEngine;->u(Lkotlin/jvm/functions/Function4;ILjava/lang/String;II)V

    return-void
.end method
