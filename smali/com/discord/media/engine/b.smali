.class public final synthetic Lcom/discord/media/engine/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/discord/native/engine/NativeEngine$StartLocalAudioRecordingCallback;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/media/engine/b;->a:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final onStartLocalAudioRecording(Z)V
    .locals 1

    iget-object v0, p0, Lcom/discord/media/engine/b;->a:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, p1}, Lcom/discord/media/engine/MediaEngine;->m(Lkotlin/jvm/functions/Function1;Z)V

    return-void
.end method
