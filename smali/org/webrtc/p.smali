.class public final synthetic Lorg/webrtc/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lorg/webrtc/HardwareVideoEncoder;

.field public final synthetic l:I


# direct methods
.method public synthetic constructor <init>(Lorg/webrtc/HardwareVideoEncoder;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/webrtc/p;->k:Lorg/webrtc/HardwareVideoEncoder;

    iput p2, p0, Lorg/webrtc/p;->l:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lorg/webrtc/p;->k:Lorg/webrtc/HardwareVideoEncoder;

    iget v1, p0, Lorg/webrtc/p;->l:I

    invoke-static {v0, v1}, Lorg/webrtc/HardwareVideoEncoder;->a(Lorg/webrtc/HardwareVideoEncoder;I)V

    return-void
.end method
