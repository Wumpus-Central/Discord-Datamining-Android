.class public final synthetic Lorg/webrtc/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lorg/webrtc/SurfaceTextureHelper;

.field public final synthetic l:I

.field public final synthetic m:I


# direct methods
.method public synthetic constructor <init>(Lorg/webrtc/SurfaceTextureHelper;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/webrtc/y;->k:Lorg/webrtc/SurfaceTextureHelper;

    iput p2, p0, Lorg/webrtc/y;->l:I

    iput p3, p0, Lorg/webrtc/y;->m:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lorg/webrtc/y;->k:Lorg/webrtc/SurfaceTextureHelper;

    iget v1, p0, Lorg/webrtc/y;->l:I

    iget v2, p0, Lorg/webrtc/y;->m:I

    invoke-static {v0, v1, v2}, Lorg/webrtc/SurfaceTextureHelper;->c(Lorg/webrtc/SurfaceTextureHelper;II)V

    return-void
.end method
