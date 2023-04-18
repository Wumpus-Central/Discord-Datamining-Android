.class public final synthetic Landroidx/camera/video/internal/encoder/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lfc/b;


# direct methods
.method public synthetic constructor <init>(Lfc/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/video/internal/encoder/j0;->k:Lfc/b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Landroidx/camera/video/internal/encoder/j0;->k:Lfc/b;

    invoke-static {v0}, Landroidx/camera/video/internal/encoder/a0$d;->m(Lfc/b;)V

    return-void
.end method
