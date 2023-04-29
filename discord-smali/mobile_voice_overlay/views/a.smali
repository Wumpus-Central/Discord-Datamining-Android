.class public final synthetic Lcom/discord/mobile_voice_overlay/views/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic k:Lcom/discord/mobile_voice_overlay/views/OverlayDialog;


# direct methods
.method public synthetic constructor <init>(Lcom/discord/mobile_voice_overlay/views/OverlayDialog;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/mobile_voice_overlay/views/a;->k:Lcom/discord/mobile_voice_overlay/views/OverlayDialog;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lcom/discord/mobile_voice_overlay/views/a;->k:Lcom/discord/mobile_voice_overlay/views/OverlayDialog;

    invoke-static {v0, p1}, Lcom/discord/mobile_voice_overlay/views/OverlayDialog;->a(Lcom/discord/mobile_voice_overlay/views/OverlayDialog;Landroid/view/View;)V

    return-void
.end method
