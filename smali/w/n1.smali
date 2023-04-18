.class public final Lw/n1;
.super Lw/w0;
.source "SourceFile"


# instance fields
.field private final m:Landroid/view/Surface;


# direct methods
.method public constructor <init>(Landroid/view/Surface;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Lw/w0;-><init>()V

    .line 4
    iput-object p1, p0, Lw/n1;->m:Landroid/view/Surface;

    return-void
.end method

.method public constructor <init>(Landroid/view/Surface;Landroid/util/Size;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p2, p3}, Lw/w0;-><init>(Landroid/util/Size;I)V

    .line 2
    iput-object p1, p0, Lw/n1;->m:Landroid/view/Surface;

    return-void
.end method


# virtual methods
.method public n()Lfc/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfc/b<",
            "Landroid/view/Surface;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lw/n1;->m:Landroid/view/Surface;

    invoke-static {v0}, Ly/f;->h(Ljava/lang/Object;)Lfc/b;

    move-result-object v0

    return-object v0
.end method
