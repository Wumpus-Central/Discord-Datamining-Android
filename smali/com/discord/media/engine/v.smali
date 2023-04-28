.class public final synthetic Lcom/discord/media/engine/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/discord/native/engine/NativeSpeedTestConnection$StartSpeedTestReceiverCallback;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/media/engine/v;->a:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public final onReady()V
    .locals 1

    iget-object v0, p0, Lcom/discord/media/engine/v;->a:Lkotlin/jvm/functions/Function0;

    invoke-static {v0}, Lcom/discord/media/engine/MediaEngine;->r(Lkotlin/jvm/functions/Function0;)V

    return-void
.end method
