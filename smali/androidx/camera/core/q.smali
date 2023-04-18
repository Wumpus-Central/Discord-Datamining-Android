.class public interface abstract Landroidx/camera/core/q;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lw/d1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0}, Lw/d1;->a(Ljava/lang/Object;)Lw/d1;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/q;->a:Lw/d1;

    return-void
.end method


# virtual methods
.method public abstract a()Lw/d1;
.end method

.method public abstract b(Ljava/util/List;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/camera/core/r;",
            ">;)",
            "Ljava/util/List<",
            "Landroidx/camera/core/r;",
            ">;"
        }
    .end annotation
.end method
