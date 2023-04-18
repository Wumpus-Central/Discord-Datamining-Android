.class public final synthetic Lx7/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaCodec$OnFrameRenderedListener;


# instance fields
.field public final synthetic a:Lx7/c;

.field public final synthetic b:Lx7/k$b;


# direct methods
.method public synthetic constructor <init>(Lx7/c;Lx7/k$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx7/a;->a:Lx7/c;

    iput-object p2, p0, Lx7/a;->b:Lx7/k$b;

    return-void
.end method


# virtual methods
.method public final onFrameRendered(Landroid/media/MediaCodec;JJ)V
    .locals 7

    iget-object v0, p0, Lx7/a;->a:Lx7/c;

    iget-object v1, p0, Lx7/a;->b:Lx7/k$b;

    move-object v2, p1

    move-wide v3, p2

    move-wide v5, p4

    invoke-static/range {v0 .. v6}, Lx7/c;->j(Lx7/c;Lx7/k$b;Landroid/media/MediaCodec;JJ)V

    return-void
.end method
