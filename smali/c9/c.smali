.class public final synthetic Lc9/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;


# instance fields
.field public final synthetic k:Lc9/d;


# direct methods
.method public synthetic constructor <init>(Lc9/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc9/c;->k:Lc9/d;

    return-void
.end method


# virtual methods
.method public final onFrameAvailable(Landroid/graphics/SurfaceTexture;)V
    .locals 1

    iget-object v0, p0, Lc9/c;->k:Lc9/d;

    invoke-static {v0, p1}, Lc9/d;->d(Lc9/d;Landroid/graphics/SurfaceTexture;)V

    return-void
.end method
