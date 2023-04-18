.class public final synthetic Lc9/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lc9/h;

.field public final synthetic l:Landroid/graphics/SurfaceTexture;


# direct methods
.method public synthetic constructor <init>(Lc9/h;Landroid/graphics/SurfaceTexture;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc9/g;->k:Lc9/h;

    iput-object p2, p0, Lc9/g;->l:Landroid/graphics/SurfaceTexture;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lc9/g;->k:Lc9/h;

    iget-object v1, p0, Lc9/g;->l:Landroid/graphics/SurfaceTexture;

    invoke-static {v0, v1}, Lc9/h;->b(Lc9/h;Landroid/graphics/SurfaceTexture;)V

    return-void
.end method
