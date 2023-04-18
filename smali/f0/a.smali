.class public Lf0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lw/g2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lw/g2;

    invoke-static {}, Lf0/b;->a()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Lw/g2;-><init>(Ljava/util/List;)V

    sput-object v0, Lf0/a;->a:Lw/g2;

    return-void
.end method

.method public static a(Ljava/lang/Class;)Lw/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lw/f2;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    sget-object v0, Lf0/a;->a:Lw/g2;

    invoke-virtual {v0, p0}, Lw/g2;->b(Ljava/lang/Class;)Lw/f2;

    move-result-object p0

    return-object p0
.end method
