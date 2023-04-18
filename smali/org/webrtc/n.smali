.class public final synthetic Lorg/webrtc/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lorg/webrtc/EglRenderer;

.field public final synthetic l:F

.field public final synthetic m:F

.field public final synthetic n:F

.field public final synthetic o:F


# direct methods
.method public synthetic constructor <init>(Lorg/webrtc/EglRenderer;FFFF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/webrtc/n;->k:Lorg/webrtc/EglRenderer;

    iput p2, p0, Lorg/webrtc/n;->l:F

    iput p3, p0, Lorg/webrtc/n;->m:F

    iput p4, p0, Lorg/webrtc/n;->n:F

    iput p5, p0, Lorg/webrtc/n;->o:F

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lorg/webrtc/n;->k:Lorg/webrtc/EglRenderer;

    iget v1, p0, Lorg/webrtc/n;->l:F

    iget v2, p0, Lorg/webrtc/n;->m:F

    iget v3, p0, Lorg/webrtc/n;->n:F

    iget v4, p0, Lorg/webrtc/n;->o:F

    invoke-static {v0, v1, v2, v3, v4}, Lorg/webrtc/EglRenderer;->b(Lorg/webrtc/EglRenderer;FFFF)V

    return-void
.end method
