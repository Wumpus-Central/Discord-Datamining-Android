.class public interface abstract Lw/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/m;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw/b0$b;,
        Lw/b0$c;
    }
.end annotation


# static fields
.field public static final a:Lw/b0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw/b0$a;

    invoke-direct {v0}, Lw/b0$a;-><init>()V

    sput-object v0, Lw/b0;->a:Lw/b0;

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/util/List;II)Lfc/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lw/n0;",
            ">;II)",
            "Lfc/b<",
            "Ljava/util/List<",
            "Ljava/lang/Void;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract b(Lw/r0;)V
.end method

.method public abstract d()Landroid/graphics/Rect;
.end method

.method public abstract e(I)V
.end method

.method public abstract g()Lw/r0;
.end method

.method public abstract h()V
.end method
