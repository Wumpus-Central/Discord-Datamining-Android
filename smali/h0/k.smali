.class public final synthetic Lh0/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Landroid/media/ImageReader;


# direct methods
.method public synthetic constructor <init>(Landroid/media/ImageReader;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh0/k;->k:Landroid/media/ImageReader;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lh0/k;->k:Landroid/media/ImageReader;

    invoke-static {v0}, Lh0/l;->h(Landroid/media/ImageReader;)V

    return-void
.end method
