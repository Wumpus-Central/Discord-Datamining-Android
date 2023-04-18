.class public final synthetic Lorg/webrtc/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lorg/webrtc/SurfaceTextureHelper;

.field public final synthetic l:I


# direct methods
.method public synthetic constructor <init>(Lorg/webrtc/SurfaceTextureHelper;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/webrtc/a0;->k:Lorg/webrtc/SurfaceTextureHelper;

    iput p2, p0, Lorg/webrtc/a0;->l:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lorg/webrtc/a0;->k:Lorg/webrtc/SurfaceTextureHelper;

    iget v1, p0, Lorg/webrtc/a0;->l:I

    invoke-static {v0, v1}, Lorg/webrtc/SurfaceTextureHelper;->e(Lorg/webrtc/SurfaceTextureHelper;I)V

    return-void
.end method
