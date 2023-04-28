.class public final synthetic Lcom/discord/sounds/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaPlayer$OnCompletionListener;


# instance fields
.field public final synthetic a:Lcom/discord/sounds/SoundPlayer;


# direct methods
.method public synthetic constructor <init>(Lcom/discord/sounds/SoundPlayer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/sounds/a;->a:Lcom/discord/sounds/SoundPlayer;

    return-void
.end method


# virtual methods
.method public final onCompletion(Landroid/media/MediaPlayer;)V
    .locals 1

    iget-object v0, p0, Lcom/discord/sounds/a;->a:Lcom/discord/sounds/SoundPlayer;

    invoke-static {v0, p1}, Lcom/discord/sounds/SoundPlayer;->a(Lcom/discord/sounds/SoundPlayer;Landroid/media/MediaPlayer;)V

    return-void
.end method
