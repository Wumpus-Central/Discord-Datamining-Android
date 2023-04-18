.class Lbc/l1$e$a;
.super Lbc/l1$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbc/l1$e;->b(I)Lbc/l1$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lbc/l1$d<",
        "TK0;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lbc/l1$e;


# direct methods
.method constructor <init>(Lbc/l1$e;I)V
    .locals 0

    iput-object p1, p0, Lbc/l1$e$a;->b:Lbc/l1$e;

    iput p2, p0, Lbc/l1$e$a;->a:I

    invoke-direct {p0}, Lbc/l1$d;-><init>()V

    return-void
.end method


# virtual methods
.method public e()Lbc/e1;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:TK0;V:",
            "Ljava/lang/Object;",
            ">()",
            "Lbc/e1<",
            "TK;TV;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lbc/l1$e$a;->b:Lbc/l1$e;

    .line 2
    .line 3
    invoke-virtual {v0}, Lbc/l1$e;->c()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lbc/l1$c;

    .line 8
    .line 9
    iget v2, p0, Lbc/l1$e$a;->a:I

    .line 10
    .line 11
    invoke-direct {v1, v2}, Lbc/l1$c;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lbc/m1;->b(Ljava/util/Map;Lac/n;)Lbc/e1;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    return-object v0
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method
