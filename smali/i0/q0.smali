.class public final synthetic Li0/q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li0/o0$i$a;


# instance fields
.field public final synthetic a:Li0/s;

.field public final synthetic b:Landroid/os/ParcelFileDescriptor;


# direct methods
.method public synthetic constructor <init>(Li0/s;Landroid/os/ParcelFileDescriptor;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li0/q0;->a:Li0/s;

    iput-object p2, p0, Li0/q0;->b:Landroid/os/ParcelFileDescriptor;

    return-void
.end method


# virtual methods
.method public final a(ILandroidx/core/util/b;)Landroid/media/MediaMuxer;
    .locals 2

    iget-object v0, p0, Li0/q0;->a:Li0/s;

    iget-object v1, p0, Li0/q0;->b:Landroid/os/ParcelFileDescriptor;

    invoke-static {v0, v1, p1, p2}, Li0/o0$i;->k(Li0/s;Landroid/os/ParcelFileDescriptor;ILandroidx/core/util/b;)Landroid/media/MediaMuxer;

    move-result-object p1

    return-object p1
.end method
