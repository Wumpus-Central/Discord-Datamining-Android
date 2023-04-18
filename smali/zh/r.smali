.class public interface abstract Lzh/r;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lzh/r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lzh/r$a;

    invoke-direct {v0}, Lzh/r$a;-><init>()V

    sput-object v0, Lzh/r;->a:Lzh/r;

    return-void
.end method


# virtual methods
.method public abstract a(Lmg/b;)V
.end method

.method public abstract b(Lmg/e;Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmg/e;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation
.end method
