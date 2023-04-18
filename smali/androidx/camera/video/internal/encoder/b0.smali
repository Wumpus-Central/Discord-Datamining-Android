.class public final synthetic Landroidx/camera/video/internal/encoder/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Ljava/util/Map$Entry;

.field public final synthetic l:Lk0/j$a;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Map$Entry;Lk0/j$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/video/internal/encoder/b0;->k:Ljava/util/Map$Entry;

    iput-object p2, p0, Landroidx/camera/video/internal/encoder/b0;->l:Lk0/j$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Landroidx/camera/video/internal/encoder/b0;->k:Ljava/util/Map$Entry;

    iget-object v1, p0, Landroidx/camera/video/internal/encoder/b0;->l:Lk0/j$a;

    invoke-static {v0, v1}, Landroidx/camera/video/internal/encoder/a0$d;->i(Ljava/util/Map$Entry;Lk0/j$a;)V

    return-void
.end method
