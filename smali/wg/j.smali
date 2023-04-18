.class public interface abstract Lwg/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwg/j$b;
    }
.end annotation


# static fields
.field public static final a:Lwg/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lwg/j$a;

    invoke-direct {v0}, Lwg/j$a;-><init>()V

    sput-object v0, Lwg/j;->a:Lwg/j;

    return-void
.end method


# virtual methods
.method public abstract a(Lch/r;Lmg/e;Ldi/g0;Ldi/g0;Ljava/util/List;Ljava/util/List;)Lwg/j$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lch/r;",
            "Lmg/e;",
            "Ldi/g0;",
            "Ldi/g0;",
            "Ljava/util/List<",
            "Lmg/j1;",
            ">;",
            "Ljava/util/List<",
            "Lmg/f1;",
            ">;)",
            "Lwg/j$b;"
        }
    .end annotation
.end method

.method public abstract b(Lmg/b;Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmg/b;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation
.end method
