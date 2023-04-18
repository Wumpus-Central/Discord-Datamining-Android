.class public final synthetic Lj7/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaDrm$OnEventListener;


# instance fields
.field public final synthetic a:Lj7/g0;

.field public final synthetic b:Lj7/c0$c;


# direct methods
.method public synthetic constructor <init>(Lj7/g0;Lj7/c0$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj7/f0;->a:Lj7/g0;

    iput-object p2, p0, Lj7/f0;->b:Lj7/c0$c;

    return-void
.end method


# virtual methods
.method public final onEvent(Landroid/media/MediaDrm;[BII[B)V
    .locals 7

    iget-object v0, p0, Lj7/f0;->a:Lj7/g0;

    iget-object v1, p0, Lj7/f0;->b:Lj7/c0$c;

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    invoke-static/range {v0 .. v6}, Lj7/g0;->m(Lj7/g0;Lj7/c0$c;Landroid/media/MediaDrm;[BII[B)V

    return-void
.end method
